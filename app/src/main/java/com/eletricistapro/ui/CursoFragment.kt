package com.eletricistapro.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eletricistapro.databinding.FragmentCursoBinding
import com.eletricistapro.data.CursoData

/**
 * CursoFragment - Tela do curso com 4 módulos
 * 1. Segurança Básica (NR10)
 * 2. Conceitos Elétricos
 * 3. 110V vs 220V
 * 4. Prática: Instalação de Tomada
 */
class CursoFragment : Fragment() {

    private var _binding: FragmentCursoBinding? = null
    private val binding get() = _binding!!

    private var moduloAtual = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCursoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configurarListeners()
        mostrarModulo(0)
    }

    private fun configurarListeners() {
        binding.btnProximo.setOnClickListener {
            if (moduloAtual < 3) {
                moduloAtual++
                mostrarModulo(moduloAtual)
            }
        }

        binding.btnAnterior.setOnClickListener {
            if (moduloAtual > 0) {
                moduloAtual--
                mostrarModulo(moduloAtual)
            }
        }
    }

    private fun mostrarModulo(indice: Int) {
        val modulo = CursoData.getModulo(indice)

        binding.tvTitulo.text = modulo.titulo
        binding.tvConteudo.text = modulo.conteudo
        binding.tvProgresso.text = "Módulo ${indice + 1} de 4"

        // Atualizar visibilidade dos botões
        binding.btnAnterior.isEnabled = indice > 0
        binding.btnProximo.isEnabled = indice < 3

        // Scroll para o topo
        binding.svConteudo.scrollTo(0, 0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
