package com.eletricistapro.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.eletricistapro.databinding.FragmentCalculadorasBinding
import kotlin.math.sqrt

/**
 * CalculadorasFragment - Tela com 3 calculadoras elétricas
 * 1. Cálculo de consumo em kWh
 * 2. Cálculo de disjuntor recomendado
 * 3. Cálculo de bitola do cabo
 */
class CalculadorasFragment : Fragment() {

    private var _binding: FragmentCalculadorasBinding? = null
    private val binding get() = _binding!!

    // Índice da calculadora atual (0, 1 ou 2)
    private var calculadoraAtual = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalculadorasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configurarListeners()
        mostrarCalculadora(0)
    }

    private fun configurarListeners() {
        binding.btnCalcular.setOnClickListener {
            calcularResultado()
        }

        binding.btnLimpar.setOnClickListener {
            limparCampos()
        }

        binding.btnProximo.setOnClickListener {
            if (calculadoraAtual < 2) {
                calculadoraAtual++
                mostrarCalculadora(calculadoraAtual)
            }
        }

        binding.btnAnterior.setOnClickListener {
            if (calculadoraAtual > 0) {
                calculadoraAtual--
                mostrarCalculadora(calculadoraAtual)
            }
        }
    }

    private fun mostrarCalculadora(indice: Int) {
        // Limpar campos
        binding.etCampo1.text.clear()
        binding.etCampo2.text.clear()
        binding.etCampo3.text.clear()
        binding.tvResultado.text = ""

        // Atualizar visibilidade dos botões
        binding.btnAnterior.isEnabled = indice > 0
        binding.btnProximo.isEnabled = indice < 2

        when (indice) {
            0 -> {
                binding.tvTitulo.text = "Cálculo de Consumo (kWh)"
                binding.tvDescricao.text = "Calcule o consumo mensal de energia em kWh"
                binding.tlCampo1.hint = "Potência (W)"
                binding.tlCampo2.hint = "Horas por Dia"
                binding.tlCampo3.hint = "Dias por Mês"
            }
            1 -> {
                binding.tvTitulo.text = "Cálculo de Disjuntor"
                binding.tvDescricao.text = "Determine o disjuntor recomendado"
                binding.tlCampo1.hint = "Tensão (V)"
                binding.tlCampo2.hint = "Corrente (A)"
                binding.tlCampo3.hint = ""
                binding.etCampo3.visibility = View.GONE
                binding.tlCampo3.visibility = View.GONE
            }
            2 -> {
                binding.tvTitulo.text = "Cálculo de Bitola do Cabo"
                binding.tvDescricao.text = "Calcule a bitola recomendada do cabo"
                binding.tlCampo1.hint = "Potência (W)"
                binding.tlCampo2.hint = "Comprimento (m)"
                binding.tlCampo3.hint = "Queda de Tensão (%)"
                binding.etCampo3.visibility = View.VISIBLE
                binding.tlCampo3.visibility = View.VISIBLE
            }
        }
    }

    private fun calcularResultado() {
        try {
            when (calculadoraAtual) {
                0 -> calcularConsumoKwh()
                1 -> calcularDisjuntor()
                2 -> calcularBitola()
            }
        } catch (e: Exception) {
            Toast.makeText(
                requireContext(),
                "Erro: Preencha todos os campos com valores válidos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun calcularConsumoKwh() {
        val potencia = binding.etCampo1.text.toString().toDouble()
        val horasDia = binding.etCampo2.text.toString().toDouble()
        val diasMes = binding.etCampo3.text.toString().toDouble()

        val consumo = (potencia * horasDia * diasMes) / 1000.0
        binding.tvResultado.text = "Consumo Mensal: %.2f kWh".format(consumo)
    }

    private fun calcularDisjuntor() {
        val tensao = binding.etCampo1.text.toString().toDouble()
        val corrente = binding.etCampo2.text.toString().toDouble()

        // Disjuntor recomendado é 1.25x a corrente
        val disjuntorRecomendado = (corrente * 1.25).toInt()

        // Arredondar para o valor padrão mais próximo
        val disjuntorPadrao = when {
            disjuntorRecomendado <= 10 -> 10
            disjuntorRecomendado <= 16 -> 16
            disjuntorRecomendado <= 20 -> 20
            disjuntorRecomendado <= 25 -> 25
            disjuntorRecomendado <= 32 -> 32
            disjuntorRecomendado <= 40 -> 40
            disjuntorRecomendado <= 50 -> 50
            else -> 63
        }

        binding.tvResultado.text = "Disjuntor Recomendado: $disjuntorPadrao A"
    }

    private fun calcularBitola() {
        val potencia = binding.etCampo1.text.toString().toDouble()
        val comprimento = binding.etCampo2.text.toString().toDouble()
        val quedaTensao = binding.etCampo3.text.toString().toDouble()

        // Fórmula: S = (2 * ρ * L * I) / (V * e)
        // ρ (resistividade do cobre) = 0.0175
        // V = 220V (tensão padrão)
        // I = P / V
        val corrente = potencia / 220.0
        val resistividade = 0.0175
        val tensao = 220.0
        val quedaTensaoVolts = (quedaTensao / 100.0) * tensao

        val bitola = (2.0 * resistividade * comprimento * corrente) / quedaTensaoVolts

        // Arredondar para bitola padrão
        val biolaPadrao = when {
            bitola <= 1.5 -> 1.5
            bitola <= 2.5 -> 2.5
            bitola <= 4.0 -> 4.0
            bitola <= 6.0 -> 6.0
            bitola <= 10.0 -> 10.0
            bitola <= 16.0 -> 16.0
            bitola <= 25.0 -> 25.0
            else -> 35.0
        }

        binding.tvResultado.text = "Bitola Recomendada: $biolaPadrao mm²"
    }

    private fun limparCampos() {
        binding.etCampo1.text.clear()
        binding.etCampo2.text.clear()
        binding.etCampo3.text.clear()
        binding.tvResultado.text = ""
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
