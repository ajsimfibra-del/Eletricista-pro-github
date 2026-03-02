# 🔌 Funcionalidades Detalhadas - Eletricista Pro – Nível 1

## 📋 Visão Geral

O aplicativo possui 4 telas principais acessíveis via menu inferior (BottomNavigationView):

1. **Calculadoras Elétricas** 🔌
2. **Gerador de Orçamento** 💰
3. **Curso Interativo** 🎓
4. **Prova de Múltipla Escolha** 📝

---

## 🔌 Tela 1: Calculadoras Elétricas

### Descrição
Três calculadoras especializadas para cálculos elétricos comuns em instalações residenciais.

### Calculadora 1: Consumo em kWh

**Objetivo**: Calcular o consumo mensal de energia de um equipamento.

**Fórmula**: 
```
Consumo (kWh) = (Potência (W) × Horas/Dia × Dias/Mês) ÷ 1000
```

**Campos de Entrada**:
- Potência (W) - Exemplo: 100
- Horas por Dia - Exemplo: 8
- Dias por Mês - Exemplo: 30

**Resultado**: Consumo Mensal em kWh

**Exemplo Prático**:
- Potência: 100W
- Horas: 8h/dia
- Dias: 30 dias
- Resultado: 24 kWh/mês

---

### Calculadora 2: Disjuntor Recomendado

**Objetivo**: Determinar o disjuntor apropriado para um circuito.

**Fórmula**:
```
Disjuntor = Corrente × 1.25 (arredondado para padrão)
```

**Campos de Entrada**:
- Tensão (V) - Exemplo: 220
- Corrente (A) - Exemplo: 10

**Resultado**: Disjuntor Recomendado em Amperes

**Valores Padrão de Disjuntores**:
- 10A, 16A, 20A, 25A, 32A, 40A, 50A, 63A

**Exemplo Prático**:
- Tensão: 220V
- Corrente: 10A
- Cálculo: 10 × 1.25 = 12.5A
- Resultado: Disjuntor de 16A (padrão mais próximo)

---

### Calculadora 3: Bitola do Cabo

**Objetivo**: Calcular a seção (bitola) recomendada do cabo elétrico.

**Fórmula**:
```
Bitola (mm²) = (2 × ρ × L × I) / (V × e)

Onde:
- ρ (rho) = 0.0175 (resistividade do cobre)
- L = comprimento do cabo em metros
- I = corrente em amperes
- V = tensão em volts
- e = queda de tensão permitida em volts
```

**Campos de Entrada**:
- Potência (W) - Exemplo: 2200
- Comprimento do Cabo (m) - Exemplo: 50
- Queda de Tensão Máxima (%) - Exemplo: 3

**Resultado**: Bitola Recomendada em mm²

**Bitolas Padrão**:
- 1.5mm², 2.5mm², 4.0mm², 6.0mm², 10mm², 16mm², 25mm², 35mm²

**Exemplo Prático**:
- Potência: 2200W
- Comprimento: 50m
- Queda: 3%
- Resultado: Bitola de 10mm²

---

### Navegação

- **Botão "Anterior"**: Volta para a calculadora anterior (desativado na primeira)
- **Botão "Próximo"**: Avança para a próxima calculadora (desativado na última)
- **Botão "Calcular"**: Executa o cálculo com os valores inseridos
- **Botão "Limpar"**: Apaga todos os campos e o resultado

---

## 💰 Tela 2: Gerador de Orçamento

### Descrição
Ferramenta para criar orçamentos profissionais e compartilhá-los via WhatsApp.

### Campos do Orçamento

1. **Nome do Cliente** (obrigatório)
   - Tipo: Texto
   - Exemplo: "João Silva"

2. **Tipo de Serviço** (obrigatório)
   - Tipo: Texto
   - Exemplo: "Instalação de 4 pontos"

3. **Quantidade de Pontos**
   - Tipo: Número
   - Exemplo: 4

4. **Valor da Mão de Obra** (obrigatório)
   - Tipo: Decimal
   - Exemplo: 200.00

5. **Valor do Material** (obrigatório)
   - Tipo: Decimal
   - Exemplo: 150.00

### Cálculo Automático

```
Total = Mão de Obra + Material
```

O total é atualizado automaticamente quando você sai dos campos de valor.

### Formato do Orçamento Compartilhado

```
*ORÇAMENTO ELÉTRICO*

📅 Data: 01/03/2026
👤 Cliente: João Silva
🔧 Serviço: Instalação de 4 pontos
📍 Quantidade de Pontos: 4

💰 Valores:
• Mão de Obra: R$ 200.00
• Material: R$ 150.00

*Total: R$ 350.00*

---
Eletricista Pro – Nível 1
```

### Funcionalidades

- **Calcular Total**: Calcula e exibe o total
- **Compartilhar no WhatsApp**: Abre o WhatsApp com o orçamento formatado
- **Limpar**: Apaga todos os campos

### Validações

- Campos obrigatórios devem ser preenchidos
- Valores devem ser numéricos válidos
- Mensagem de erro se dados forem inválidos

---

## 🎓 Tela 3: Curso Eletricista Nível 1

### Descrição
Curso interativo com 4 módulos de conteúdo educacional.

### Módulo 1: Segurança Básica (NR10)

**Conteúdo**:
- Introdução à NR10
- Equipamentos de Proteção Individual (EPI)
- Procedimentos de segurança
- Primeiros socorros em caso de choque

**Tópicos Cobertos**:
- Sempre desligar a energia
- Usar EPI apropriado
- Nunca trabalhar sozinho em alta tensão
- Verificar estado dos fios
- Manter distância de linhas de alta tensão
- Não trabalhar em dias chuvosos
- Procedimento em caso de choque

---

### Módulo 2: Conceitos Elétricos Fundamentais

**Conteúdo**:
- Definição de Tensão (V)
- Definição de Corrente (A)
- Definição de Potência (W)
- Definição de Resistência (Ω)
- Frequência (Hz)
- Lei de Ohm

**Fórmulas Apresentadas**:
- P = V × I (Potência)
- V = R × I (Lei de Ohm)

**Exemplos Práticos**:
- Cálculo de corrente para uma lâmpada
- Relação entre tensão e corrente

---

### Módulo 3: Diferença entre 110V e 220V

**Conteúdo**:
- Características do 110V
- Características do 220V
- Comparação prática
- Vantagens e desvantagens
- Aplicações comuns

**Comparação Tabular**:
| Aspecto | 110V | 220V |
|--------|------|------|
| Tensão | Menor | Maior |
| Potência | Menor | Maior |
| Segurança | Mais seguro | Menos seguro |
| Corrente | Maior | Menor |
| Fio | Mais grosso | Mais fino |
| Eficiência | Menor | Maior |

---

### Módulo 4: Prática - Instalação de Tomada

**Conteúdo**:
- Materiais necessários
- Passo a passo da instalação
- Identificação de fios (cores)
- Dicas importantes
- Segurança durante a instalação

**Passo a Passo**:
1. Preparação (desligar energia, verificar tensão)
2. Remover tomada antiga
3. Preparar os fios (descascar)
4. Conectar os fios (fase, neutro, terra)
5. Fixar a tomada
6. Testar

**Cores dos Fios**:
- **Fase**: Vermelho ou Preto
- **Neutro**: Azul
- **Terra**: Verde ou Amarelo

---

### Navegação

- **Botão "Anterior"**: Volta para o módulo anterior (desativado no primeiro)
- **Botão "Próximo"**: Avança para o próximo módulo (desativado no último)
- **Indicador de Progresso**: Mostra "Módulo X de 4"

---

## 📝 Tela 4: Prova de Múltipla Escolha

### Descrição
Prova com 10 perguntas para avaliar o conhecimento adquirido no curso.

### Características

- **Total de Perguntas**: 10
- **Tipo**: Múltipla escolha (4 opções por pergunta)
- **Aprovação**: 70% ou mais de acertos
- **Navegação**: Anterior/Próximo entre perguntas
- **Revisão**: Possibilidade de voltar e mudar respostas

### As 10 Perguntas

| # | Pergunta | Resposta Correta |
|---|----------|------------------|
| 1 | O que é tensão elétrica? | A "pressão" da energia elétrica, medida em Volts |
| 2 | Qual é a frequência no Brasil? | 60 Hz |
| 3 | O que significa NR10? | Norma Regulamentadora 10 - Segurança em Eletricidade |
| 4 | Diferença entre 110V e 220V? | 220V tem maior potência disponível |
| 5 | Primeiro ao instalar tomada? | Desligar a energia no disjuntor |
| 6 | Cor do fio de TERRA? | Verde ou Amarelo |
| 7 | O que é corrente elétrica? | O fluxo de energia elétrica, medido em Amperes |
| 8 | EPI obrigatório? | Luvas isolantes, óculos e capacete |
| 9 | Como calcular corrente (Lei de Ohm)? | I = V ÷ R |
| 10 | Em caso de choque? | Desligar a energia e chamar emergência |

### Fluxo da Prova

1. **Início**: Primeira pergunta é exibida
2. **Resposta**: Usuário seleciona uma opção
3. **Navegação**: Pode ir para próxima ou anterior
4. **Finalização**: Após a 10ª pergunta, clica em "Finalizar"
5. **Resultado**: Mostra pontuação e mensagem de aprovação/reprovação

### Resultado

**Se Aprovado (≥70%)**:
```
Parabéns!
Você foi aprovado com 80% de acertos!
```

**Se Reprovado (<70%)**:
```
Resultado
Você não foi aprovado. Estude mais e tente novamente!
Acertos: 6 de 10 (60%)
```

### Opções Após Resultado

- **Fazer Prova Novamente**: Reinicia a prova com as perguntas em ordem
- Todas as respostas anteriores são zeradas

---

## 🎨 Design e Navegação

### Menu Inferior (BottomNavigationView)

Acesso rápido às 4 telas principais:
- 🔌 Calculadoras
- 💰 Orçamento
- 🎓 Curso
- 📝 Prova

### Cores Utilizadas

- **Primária**: Laranja (#FF6B35)
- **Primária Escura**: Vermelho (#D84315)
- **Secundária**: Azul Marinho (#004E89)
- **Sucesso**: Verde (#4CAF50)
- **Erro**: Vermelho (#B3261E)
- **Fundo**: Cinza Claro (#F5F5F5)

### Componentes Material Design

- **MaterialCardView**: Cards com elevação
- **MaterialButton**: Botões com ripple effect
- **TextInputLayout**: Campos de entrada com animação
- **RadioGroup**: Seleção de opções na prova

---

## 📱 Permissões Utilizadas

- `android.permission.INTERNET` - Para Google Ads e WhatsApp
- `android.permission.ACCESS_NETWORK_STATE` - Para verificar conexão

---

## 🔐 Validações e Tratamento de Erros

### Calculadoras
- Valida se campos estão preenchidos
- Valida se valores são numéricos válidos
- Exibe mensagem de erro se dados inválidos

### Orçamento
- Valida campos obrigatórios (cliente, serviço)
- Valida se valores são numéricos
- Exibe mensagem de erro se dados inválidos
- Trata erro ao abrir WhatsApp

### Prova
- Valida se pergunta foi respondida
- Permite revisão de respostas
- Calcula pontuação corretamente
- Determina aprovação/reprovação

---

## 🚀 Funcionalidades Futuras Possíveis

- Salvar orçamentos localmente
- Exportar orçamentos em PDF
- Histórico de orçamentos
- Mais calculadoras especializadas
- Mais módulos de curso
- Certificado digital após aprovação
- Modo offline
- Sincronização na nuvem
- Notificações de atualizações

---

**Desenvolvido com ❤️ para eletricistas profissionais e iniciantes**
