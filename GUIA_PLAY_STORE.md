# 📱 Guia Completo para Publicar na Google Play Store

## 🎯 Objetivo

Este guia fornece todas as instruções necessárias para publicar o app **Eletricista Pro – Nível 1** na Google Play Store.

---

## 📋 Pré-requisitos

Antes de começar, você precisa de:

1. **Conta Google Play Developer**
   - Acesse: https://play.google.com/console
   - Taxa de registro: R$ 25,00 (uma única vez)
   - Tempo de aprovação: 2-4 horas

2. **Android Studio** (versão Flamingo ou superior)
   - Download: https://developer.android.com/studio

3. **Este projeto Android**
   - Pasta: `/home/ubuntu/EletricistaPro/`

4. **Ícone do App** (512x512 px)
   - Formato: PNG
   - Recomendação: Design moderno com cor laranja (#FF6B35)

5. **Screenshots** (mínimo 2, máximo 8)
   - Resolução: 1080x1920 px (ou similar)
   - Mostrar as 4 telas principais

---

## 🔑 Passo 1: Criar Keystore (Assinatura Digital)

A assinatura digital é obrigatória para publicar na Play Store.

### No Android Studio:

1. Abra o projeto `EletricistaPro`
2. Clique em **Build → Generate Signed Bundle / APK**
3. Selecione **APK** e clique em **Next**
4. Clique em **Create new** para criar um novo Keystore
5. Preencha os dados:

```
Key store path: /home/ubuntu/eletricista-pro.jks
Password: [escolha uma senha forte]
Confirm: [repita a senha]
Alias: eletricista-pro
Password: [mesma senha ou diferente]
Confirm: [repita]
```

**Dados do Certificado:**
```
First and Last Name: Seu Nome
Organizational Unit: Seu Nome/Empresa
Organization: Seu Nome/Empresa
City or Locality: Sua Cidade
State or Province: Seu Estado
Country Code (XX): BR
```

6. Clique em **OK** para criar o Keystore

⚠️ **IMPORTANTE**: Guarde o arquivo `.jks` e a senha em local seguro! Você precisará deles para futuras atualizações.

---

## 📦 Passo 2: Gerar APK de Release

### No Android Studio:

1. Clique em **Build → Generate Signed Bundle / APK**
2. Selecione **APK** e clique em **Next**
3. Selecione o Keystore criado e preencha a senha
4. Clique em **Next**
5. Selecione **Release** como build type
6. Clique em **Finish**
7. Aguarde a compilação (pode levar 5-10 minutos)

### Localizar o APK:

```
app/release/app-release.apk
```

**Tamanho esperado**: ~5-8 MB

---

## 🖼️ Passo 3: Preparar Assets para Play Store

### 3.1 Ícone do App (512x512 px)

Crie um ícone moderno com:
- Fundo laranja (#FF6B35) ou gradiente
- Símbolo de raio ou tomada elétrica
- Formato: PNG com fundo transparente

### 3.2 Screenshots (1080x1920 px)

Capture screenshots das 4 telas:

1. **Tela 1**: Calculadoras Elétricas
   - Mostrar a calculadora de consumo
   - Título: "Calculadoras Profissionais"

2. **Tela 2**: Gerador de Orçamento
   - Mostrar formulário preenchido
   - Título: "Orçamentos em Segundos"

3. **Tela 3**: Curso Interativo
   - Mostrar módulo de segurança
   - Título: "Aprenda com Especialistas"

4. **Tela 4**: Prova
   - Mostrar resultado de aprovação
   - Título: "Obtenha Certificação"

### 3.3 Descrição Breve (80 caracteres)

```
Eletricista Pro – Cálculos, orçamentos e curso profissional
```

### 3.4 Descrição Completa (4000 caracteres)

```
🔌 Eletricista Pro – Nível 1

Seu aplicativo completo para eletricistas profissionais e iniciantes!

✨ FUNCIONALIDADES:

🔌 CALCULADORAS ELÉTRICAS
• Cálculo de consumo em kWh
• Cálculo de disjuntor recomendado
• Cálculo de bitola do cabo
Ferramentas precisas para dimensionamento correto

💰 GERADOR DE ORÇAMENTO
• Crie orçamentos profissionais em segundos
• Compartilhe via WhatsApp
• Formatação automática com data e valores

🎓 CURSO ELETRICISTA NÍVEL 1
• Módulo 1: Segurança Básica (NR10)
• Módulo 2: Conceitos Elétricos Fundamentais
• Módulo 3: Diferença entre 110V e 220V
• Módulo 4: Prática - Instalação de Tomada
Conteúdo completo e didático

📝 PROVA DE MÚLTIPLA ESCOLHA
• 10 perguntas de múltipla escolha
• Aprovação com 70% ou mais
• Feedback imediato
• Possibilidade de refazer

🎯 BENEFÍCIOS:
✅ Interface intuitiva e moderna
✅ Cálculos precisos e confiáveis
✅ Conteúdo educativo de qualidade
✅ Totalmente em português
✅ Sem anúncios intrusivos
✅ Funciona offline

👨‍💼 PERFEITO PARA:
• Eletricistas profissionais
• Aprendizes e iniciantes
• Estudantes de cursos técnicos
• Qualquer pessoa interessada em eletricidade

📱 REQUISITOS:
• Android 7.0 ou superior
• Mínimo 100 MB de espaço

🚀 COMECE AGORA!
Baixe Eletricista Pro e leve seu conhecimento elétrico para o próximo nível!

Desenvolvido com ❤️ para profissionais e iniciantes.
```

### 3.5 Categoria

```
Educação
```

### 3.6 Classificação Etária

```
Classificado para todas as idades (PEGI 3)
```

---

## 📝 Passo 4: Criar Conta na Google Play Console

1. Acesse: https://play.google.com/console
2. Clique em **Criar aplicativo**
3. Preencha os dados:

```
Nome do app: Eletricista Pro – Nível 1
Idioma padrão: Português (Brasil)
Tipo de app: Aplicativo
Categoria: Educação
```

4. Clique em **Criar**

---

## 🔧 Passo 5: Configurar Informações do App

### 5.1 Informações do Aplicativo

1. Clique em **Aplicativo → Informações do aplicativo**
2. Preencha:
   - **Nome do app**: Eletricista Pro – Nível 1
   - **Descrição breve**: (80 caracteres)
   - **Descrição completa**: (4000 caracteres)
   - **Categoria**: Educação
   - **Classificação de conteúdo**: Todas as idades

### 5.2 Ícone e Screenshots

1. Clique em **Ícone do app**
   - Faça upload do ícone 512x512 px

2. Clique em **Screenshots**
   - Faça upload de 2-8 screenshots (1080x1920 px)

### 5.3 Descrição de Lançamento

1. Clique em **Descrição de lançamento**
2. Preencha:
   - **Título**: Eletricista Pro – Nível 1
   - **Descrição completa**: (conforme acima)

### 5.4 Contato

1. Clique em **Contato**
2. Preencha seu email e telefone (opcional)

---

## 📤 Passo 6: Fazer Upload do APK

### 6.1 Criar Release

1. Clique em **Versão → Produção**
2. Clique em **Criar versão**
3. Clique em **Carregar APK**
4. Selecione o arquivo `app-release.apk`
5. Aguarde o upload (pode levar alguns minutos)

### 6.2 Revisar Informações

1. Verifique:
   - Versão do app: 1.0
   - Código de versão: 1
   - Tamanho: ~5-8 MB
   - Arquitetura: arm64-v8a, armeabi-v7a

2. Clique em **Salvar**

---

## ✅ Passo 7: Revisar Antes de Publicar

Antes de publicar, verifique:

- [ ] Ícone do app está correto
- [ ] Screenshots mostram as 4 telas principais
- [ ] Descrição breve tem até 80 caracteres
- [ ] Descrição completa está clara e atrativa
- [ ] Categoria é "Educação"
- [ ] APK foi enviado com sucesso
- [ ] Versão é 1.0
- [ ] Nenhum aviso de compatibilidade

---

## 🚀 Passo 8: Publicar

1. Clique em **Versão → Produção**
2. Revise todos os detalhes
3. Clique em **Enviar para revisão**
4. Aguarde a aprovação (2-4 horas)

**Status de Revisão:**
- Você receberá um email quando a revisão começar
- Você receberá outro email quando for aprovado ou rejeitado

---

## 📊 Passo 9: Monitorar Após Publicação

Após a publicação, você pode:

1. **Ver Estatísticas**
   - Clique em **Estatísticas**
   - Visualize downloads, avaliações, crashes

2. **Gerenciar Avaliações**
   - Clique em **Avaliações**
   - Responda aos comentários dos usuários

3. **Atualizar o App**
   - Aumente o código de versão (2, 3, etc.)
   - Faça upload de novo APK
   - Descreva as alterações
   - Envie para revisão novamente

---

## 🐛 Troubleshooting

### Erro: "APK não foi assinado corretamente"

**Solução:**
1. Verifique se usou o Keystore correto
2. Regenere o APK com o mesmo Keystore
3. Certifique-se de que o APK é do tipo "Release"

### Erro: "Aplicativo não é compatível com nenhum dispositivo"

**Solução:**
1. Verifique se a API mínima é 24 (Android 7.0)
2. Verifique se incluiu as arquiteturas ARM

### Erro: "Descrição contém palavras proibidas"

**Solução:**
1. Remova palavras como "grátis", "premium", "compre agora"
2. Evite fazer promessas exageradas
3. Mantenha a descrição profissional

### Erro: "Ícone não atende aos requisitos"

**Solução:**
1. Certifique-se de que é 512x512 px
2. Use formato PNG
3. Evite transparência total (use fundo)
4. Certifique-se de que é legível em tamanhos pequenos

---

## 📈 Dicas para Sucesso

### 1. Qualidade do App
- ✅ Teste em vários dispositivos
- ✅ Corrija bugs antes de publicar
- ✅ Garanta que todas as funcionalidades funcionam

### 2. Descrição Atrativa
- ✅ Use emojis (com moderação)
- ✅ Destaque os benefícios principais
- ✅ Inclua palavras-chave relevantes

### 3. Screenshots Profissionais
- ✅ Use dispositivo real ou emulador
- ✅ Mostre a interface limpa
- ✅ Adicione textos explicativos

### 4. Suporte ao Usuário
- ✅ Responda aos comentários
- ✅ Corrija bugs relatados
- ✅ Lançe atualizações regularmente

### 5. Marketing
- ✅ Compartilhe em redes sociais
- ✅ Peça aos usuários para avaliar
- ✅ Considere publicidade no Google Ads

---

## 📞 Suporte

### Documentação Oficial
- Google Play Console Help: https://support.google.com/googleplay/android-developer
- Android Developers: https://developer.android.com/

### Contato
- Email de suporte: support@google.com
- Forum: https://stackoverflow.com/questions/tagged/android

---

## 🎉 Próximos Passos

Após a publicação:

1. **Monitorar Estatísticas**
   - Acompanhe downloads e avaliações
   - Identifique problemas

2. **Coletar Feedback**
   - Leia comentários dos usuários
   - Implemente sugestões

3. **Planejar Atualizações**
   - Corrija bugs
   - Adicione novas funcionalidades
   - Melhore a interface

4. **Crescer**
   - Promova o app
   - Construa comunidade
   - Monetize (se desejado)

---

**Parabéns! Seu app está pronto para a Play Store! 🎉**

**Versão**: 1.0  
**Data**: Março de 2026  
**Desenvolvido com ❤️ para profissionais**
