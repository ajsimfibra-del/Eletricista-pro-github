package com.eletricistapro.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.eletricistapro.databinding.FragmentOrcamentoBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * OrcamentoFragment - Tela para gerar orçamentos
 * Permite criar orçamentos e compartilhar via WhatsApp
 */
class OrcamentoFragment : Fragment() {

    private var _binding: FragmentOrcamentoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOrcamentoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configurarListeners()
    }

    private fun configurarListeners() {
        binding.btnCalcularTotal.setOnClickListener {
            calcularTotal()
        }

        binding.btnCompartilharWhatsapp.setOnClickListener {
            compartilharWhatsapp()
        }

        binding.btnLimpar.setOnClickListener {
            limparCampos()
        }

        // Atualizar total quando os valores mudam
        binding.etMaoObra.setOnFocusChangeListener { _, _ -> calcularTotal() }
        binding.etMaterial.setOnFocusChangeListener { _, _ -> calcularTotal() }
    }

    private fun calcularTotal() {
        try {
            val maoObra = binding.etMaoObra.text.toString().toDoubleOrNull() ?: 0.0
            val material = binding.etMaterial.text.toString().toDoubleOrNull() ?: 0.0
            val total = maoObra + material

            binding.tvTotal.text = "Total: R$ %.2f".format(total)
        } catch (e: Exception) {
            Toast.makeText(
                requireContext(),
                "Erro ao calcular total",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun compartilharWhatsapp() {
        try {
            val cliente = binding.etCliente.text.toString()
            val servico = binding.etServico.text.toString()
            val pontos = binding.etPontos.text.toString()
            val maoObra = binding.etMaoObra.text.toString().toDoubleOrNull() ?: 0.0
            val material = binding.etMaterial.text.toString().toDoubleOrNull() ?: 0.0
            val total = maoObra + material

            if (cliente.isEmpty() || servico.isEmpty()) {
                Toast.makeText(
                    requireContext(),
                    "Preencha cliente e tipo de serviço",
                    Toast.LENGTH_SHORT
                ).show()
                return
            }

            // Formatar mensagem
            val dataAtual = SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR")).format(Date())
            val mensagem = """
                *ORÇAMENTO ELÉTRICO*
                
                📅 Data: $dataAtual
                👤 Cliente: $cliente
                🔧 Serviço: $servico
                📍 Quantidade de Pontos: $pontos
                
                💰 Valores:
                • Mão de Obra: R$ %.2f
                • Material: R$ %.2f
                
                *Total: R$ %.2f*
                
                ---
                Eletricista Pro – Nível 1
            """.trimIndent().format(maoObra, material, total)

            // Abrir WhatsApp
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://wa.me/?text=${Uri.encode(mensagem)}")
            }

            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(
                requireContext(),
                "Erro ao compartilhar: ${e.message}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun limparCampos() {
        binding.etCliente.text.clear()
        binding.etServico.text.clear()
        binding.etPontos.text.clear()
        binding.etMaoObra.text.clear()
        binding.etMaterial.text.clear()
        binding.tvTotal.text = "Total: R$ 0,00"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
