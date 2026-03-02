package com.eletricistapro.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.eletricistapro.databinding.FragmentProvaBinding
import com.eletricistapro.data.ProvaData

/**
 * ProvaFragment - Tela da prova com 10 perguntas de múltipla escolha
 * Aprovação: 70% ou mais de acertos
 */
class ProvaFragment : Fragment() {

    private var _binding: FragmentProvaBinding? = null
    private val binding get() = _binding!!

    private var perguntaAtual = 0
    private var respostas = mutableMapOf<Int, Int>() // pergunta -> resposta selecionada

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProvaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configurarListeners()
        mostrarPergunta(0)
    }

    private fun configurarListeners() {
        binding.btnProximo.setOnClickListener {
            salvarResposta()
            if (perguntaAtual < 9) {
                perguntaAtual++
                mostrarPergunta(perguntaAtual)
            }
        }

        binding.btnAnterior.setOnClickListener {
            salvarResposta()
            if (perguntaAtual > 0) {
                perguntaAtual--
                mostrarPergunta(perguntaAtual)
            }
        }

        binding.btnFinalizar.setOnClickListener {
            salvarResposta()
            finalizarProva()
        }
    }

    private fun mostrarPergunta(indice: Int) {
        val pergunta = ProvaData.getPergunta(indice)

        binding.tvProgresso.text = "Pergunta ${indice + 1} de 10"
        binding.tvPergunta.text = pergunta.pergunta

        // Limpar opções anteriores
        binding.rgOpcoes.removeAllViews()

        // Adicionar opções
        pergunta.opcoes.forEachIndexed { index, opcao ->
            val radioButton = RadioButton(requireContext()).apply {
                text = opcao
                tag = index
                setTextColor(resources.getColor(com.eletricistapro.R.color.text_primary, null))
            }
            binding.rgOpcoes.addView(radioButton)
        }

        // Restaurar resposta anterior se existir
        val respostaSalva = respostas[indice]
        if (respostaSalva != null && respostaSalva < binding.rgOpcoes.childCount) {
            val radioButton = binding.rgOpcoes.getChildAt(respostaSalva) as RadioButton
            radioButton.isChecked = true
        }

        // Atualizar visibilidade dos botões
        binding.btnAnterior.isEnabled = indice > 0
        binding.btnProximo.isEnabled = indice < 9
        binding.btnFinalizar.visibility = if (indice == 9) View.VISIBLE else View.GONE
        binding.btnProximo.visibility = if (indice == 9) View.GONE else View.VISIBLE

        // Scroll para o topo
        binding.svConteudo.scrollTo(0, 0)
    }

    private fun salvarResposta() {
        val respostaSelecionada = binding.rgOpcoes.checkedRadioButtonId
        if (respostaSelecionada != -1) {
            val radioButton = binding.root.findViewById<RadioButton>(respostaSelecionada)
            val indiceResposta = binding.rgOpcoes.indexOfChild(radioButton)
            respostas[perguntaAtual] = indiceResposta
        }
    }

    private fun finalizarProva() {
        salvarResposta()

        // Calcular pontuação
        var acertos = 0
        for (i in 0 until 10) {
            val pergunta = ProvaData.getPergunta(i)
            val respostaSelecionada = respostas[i]
            if (respostaSelecionada == pergunta.respostaCorreta) {
                acertos++
            }
        }

        val percentual = (acertos * 10)
        val aprovado = percentual >= 70

        // Mostrar resultado
        mostrarResultado(acertos, percentual, aprovado)
    }

    private fun mostrarResultado(acertos: Int, percentual: Int, aprovado: Boolean) {
        binding.svConteudo.visibility = View.GONE
        binding.llNavegacao.visibility = View.GONE
        binding.llResultado.visibility = View.VISIBLE

        binding.tvResultadoTitulo.text = if (aprovado) "Parabéns!" else "Resultado"
        binding.tvResultadoMensagem.text = if (aprovado) {
            "Você foi aprovado com $percentual% de acertos!"
        } else {
            "Você não foi aprovado. Estude mais e tente novamente!\nAcertos: $acertos de 10 ($percentual%)"
        }

        binding.tvResultadoMensagem.setTextColor(
            resources.getColor(
                if (aprovado) com.eletricistapro.R.color.success else com.eletricistapro.R.color.error,
                null
            )
        )

        binding.btnReiniciar.setOnClickListener {
            reiniciarProva()
        }
    }

    private fun reiniciarProva() {
        perguntaAtual = 0
        respostas.clear()

        binding.svConteudo.visibility = View.VISIBLE
        binding.llNavegacao.visibility = View.VISIBLE
        binding.llResultado.visibility = View.GONE

        mostrarPergunta(0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
