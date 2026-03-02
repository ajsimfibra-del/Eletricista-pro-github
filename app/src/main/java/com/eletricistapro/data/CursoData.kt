package com.eletricistapro.data

/**
 * Modelo de dados para um módulo do curso
 */
data class Modulo(
    val titulo: String,
    val conteudo: String
)

/**
 * CursoData - Conteúdo do curso Eletricista Nível 1
 */
object CursoData {

    private val modulos = listOf(
        Modulo(
            titulo = "1. Segurança Básica (NR10)",
            conteudo = """
                A NR10 (Norma Regulamentadora 10) é essencial para trabalhar com eletricidade.
                
                ⚠️ PRINCIPAIS CUIDADOS:
                
                • Sempre desligue a energia antes de trabalhar
                • Use equipamento de proteção individual (EPI):
                  - Luvas isolantes
                  - Óculos de proteção
                  - Capacete
                  - Calçado com solado isolante
                
                • Nunca trabalhe sozinho em instalações de alta tensão
                • Verifique o estado dos fios antes de tocar
                • Mantenha distância de linhas de alta tensão
                • Não trabalhe em dias chuvosos ou com as mãos molhadas
                
                🚨 EM CASO DE CHOQUE:
                1. Desligue a energia imediatamente
                2. Afaste a vítima do contato
                3. Chame emergência (192)
                4. Faça primeiros socorros se capacitado
                
                Lembre-se: Segurança em primeiro lugar!
            """.trimIndent()
        ),
        Modulo(
            titulo = "2. Conceitos Elétricos Fundamentais",
            conteudo = """
                Entenda os conceitos básicos da eletricidade:
                
                ⚡ TENSÃO (Voltagem - V):
                É a "pressão" da energia elétrica. Medida em Volts (V).
                • Baixa tensão: até 1.000V
                • Alta tensão: acima de 1.000V
                
                🔌 CORRENTE (Amperagem - A):
                É o "fluxo" de energia elétrica. Medida em Amperes (A).
                • Corrente contínua (CC): fluxo em uma direção
                • Corrente alternada (CA): fluxo alternado
                
                💡 POTÊNCIA (Watts - W):
                É a "quantidade" de energia consumida. Medida em Watts (W).
                Fórmula: P = V × I (Potência = Tensão × Corrente)
                
                🔋 RESISTÊNCIA (Ohms - Ω):
                É a "oposição" ao fluxo de energia. Medida em Ohms (Ω).
                Lei de Ohm: V = R × I
                
                ⚙️ FREQUÊNCIA (Hz):
                No Brasil, a frequência é 60 Hz (ciclos por segundo).
                
                Exemplo prático:
                Uma lâmpada de 100W em 220V consome:
                I = P ÷ V = 100 ÷ 220 ≈ 0,45A
            """.trimIndent()
        ),
        Modulo(
            titulo = "3. Diferença entre 110V e 220V",
            conteudo = """
                Entenda as diferenças entre as tensões mais comuns:
                
                🔴 TENSÃO 110V (Monofásica):
                • Menor tensão
                • Menor potência disponível
                • Mais segura para uso residencial
                • Usada em: tomadas simples, ventiladores, TVs
                • Corrente maior para mesma potência
                • Fio mais grosso necessário
                
                🔵 TENSÃO 220V (Monofásica/Trifásica):
                • Maior tensão
                • Maior potência disponível
                • Mais eficiente para grandes cargas
                • Usada em: chuveiros, ar-condicionado, máquinas
                • Corrente menor para mesma potência
                • Fio mais fino possível
                
                📊 COMPARAÇÃO:
                Para um equipamento de 2.200W:
                • Em 110V: I = 2.200 ÷ 110 = 20A (fio muito grosso)
                • Em 220V: I = 2.200 ÷ 220 = 10A (fio mais fino)
                
                ✅ VANTAGENS DO 220V:
                • Menor consumo de fio
                • Menor perda de energia
                • Mais econômico para grandes cargas
                • Melhor eficiência
                
                ⚠️ IMPORTANTE:
                Sempre respeite a tensão nominal do equipamento!
                Não conecte um equipamento de 110V em 220V.
            """.trimIndent()
        ),
        Modulo(
            titulo = "4. Prática: Instalação de Tomada",
            conteudo = """
                Guia prasso a passo para instalar uma tomada:
                
                🛠️ MATERIAIS NECESSÁRIOS:
                • Tomada nova
                • Fios elétricos (fase, neutro, terra)
                • Chave de fenda
                • Testador de tensão
                • Alicate descascador
                • Fita isolante
                • EPI (luvas, óculos)
                
                📋 PASSO A PASSO:
                
                1️⃣ PREPARAÇÃO:
                   • Desligue a energia no disjuntor
                   • Verifique com testador se não há tensão
                   • Reúna todos os materiais
                
                2️⃣ REMOVER A TOMADA ANTIGA:
                   • Desparafuse a tomada velha
                   • Desconecte os fios (fase, neutro, terra)
                   • Anote as cores dos fios
                
                3️⃣ PREPARAR OS FIOS:
                   • Descasque 5-8mm das pontas dos fios
                   • Torça bem as fibras de cobre
                   • Limpe com um pano seco
                
                4️⃣ CONECTAR OS FIOS:
                   • FASE (Vermelho/Preto): terminal direito
                   • NEUTRO (Azul): terminal esquerdo
                   • TERRA (Verde/Amarelo): terminal redondo
                
                5️⃣ FIXAR A TOMADA:
                   • Aperte bem os parafusos
                   • Não deixe fios soltos
                   • Certifique-se que está firme
                
                6️⃣ TESTAR:
                   • Ligue a energia
                   • Teste com um aparelho
                   • Verifique se funciona
                
                ⚠️ DICAS IMPORTANTES:
                • Nunca trabalhe com energia ligada
                • Se não tiver certeza, chame um profissional
                • Respeite as cores dos fios
                • Aperte bem os parafusos
                • Use sempre EPI
            """.trimIndent()
        )
    )

    fun getModulo(indice: Int): Modulo {
        return if (indice in modulos.indices) modulos[indice] else modulos[0]
    }

    fun getTotalModulos(): Int = modulos.size
}
