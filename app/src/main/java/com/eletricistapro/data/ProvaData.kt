package com.eletricistapro.data

/**
 * Modelo de dados para uma pergunta da prova
 */
data class Pergunta(
    val pergunta: String,
    val opcoes: List<String>,
    val respostaCorreta: Int // índice da resposta correta (0-3)
)

/**
 * ProvaData - 10 perguntas de múltipla escolha para o curso Eletricista Nível 1
 */
object ProvaData {

    private val perguntas = listOf(
        Pergunta(
            pergunta = "1. O que é tensão elétrica?",
            opcoes = listOf(
                "A) O fluxo de energia elétrica",
                "B) A 'pressão' da energia elétrica, medida em Volts",
                "C) A resistência ao fluxo de energia",
                "D) A quantidade de energia consumida"
            ),
            respostaCorreta = 1
        ),
        Pergunta(
            pergunta = "2. Qual é a frequência da energia elétrica no Brasil?",
            opcoes = listOf(
                "A) 50 Hz",
                "B) 60 Hz",
                "C) 120 Hz",
                "D) 100 Hz"
            ),
            respostaCorreta = 1
        ),
        Pergunta(
            pergunta = "3. O que significa NR10?",
            opcoes = listOf(
                "A) Norma de Resistência 10",
                "B) Norma Regulamentadora 10 - Segurança em Eletricidade",
                "C) Norma de Risco 10",
                "D) Norma de Resistência em 10 Ohms"
            ),
            respostaCorreta = 1
        ),
        Pergunta(
            pergunta = "4. Qual é a principal diferença entre 110V e 220V?",
            opcoes = listOf(
                "A) 110V é mais seguro",
                "B) 220V consome menos energia",
                "C) 220V tem maior potência disponível",
                "D) 110V é mais eficiente"
            ),
            respostaCorreta = 2
        ),
        Pergunta(
            pergunta = "5. O que você deve fazer PRIMEIRO ao instalar uma tomada?",
            opcoes = listOf(
                "A) Remover a tomada velha",
                "B) Desligar a energia no disjuntor",
                "C) Preparar os fios",
                "D) Conectar os fios"
            ),
            respostaCorreta = 1
        ),
        Pergunta(
            pergunta = "6. Qual é a cor do fio de TERRA?",
            opcoes = listOf(
                "A) Vermelho",
                "B) Azul",
                "C) Verde ou Amarelo",
                "D) Preto"
            ),
            respostaCorreta = 2
        ),
        Pergunta(
            pergunta = "7. O que é corrente elétrica?",
            opcoes = listOf(
                "A) A pressão da energia",
                "B) O fluxo de energia elétrica, medido em Amperes",
                "C) A resistência ao fluxo",
                "D) A quantidade de energia consumida"
            ),
            respostaCorreta = 1
        ),
        Pergunta(
            pergunta = "8. Qual EPI é OBRIGATÓRIO ao trabalhar com eletricidade?",
            opcoes = listOf(
                "A) Apenas luvas",
                "B) Apenas óculos",
                "C) Luvas isolantes, óculos e capacete",
                "D) Apenas capacete"
            ),
            respostaCorreta = 2
        ),
        Pergunta(
            pergunta = "9. Como calcular a corrente usando a Lei de Ohm?",
            opcoes = listOf(
                "A) I = V × R",
                "B) I = V ÷ R",
                "C) I = R ÷ V",
                "D) I = V + R"
            ),
            respostaCorreta = 1
        ),
        Pergunta(
            pergunta = "10. O que fazer em caso de choque elétrico?",
            opcoes = listOf(
                "A) Tocar a vítima imediatamente",
                "B) Desligar a energia e chamar emergência",
                "C) Puxar a vítima com as mãos",
                "D) Esperar passar"
            ),
            respostaCorreta = 1
        )
    )

    fun getPergunta(indice: Int): Pergunta {
        return if (indice in perguntas.indices) perguntas[indice] else perguntas[0]
    }

    fun getTotalPerguntas(): Int = perguntas.size
}
