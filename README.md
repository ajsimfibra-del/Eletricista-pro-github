# Eletricista Pro – Nível 1

Um aplicativo móvel Android nativo desenvolvido em Kotlin para ajudar eletricistas e iniciantes com cálculos elétricos, geração de orçamentos e um curso básico interativo.

## 📱 Funcionalidades

### 🔌 Tela 1 – Calculadoras Elétricas
- **Cálculo de Consumo (kWh)**: Calcula o consumo mensal de energia
- **Cálculo de Disjuntor**: Determina o disjuntor recomendado
- **Cálculo de Bitola do Cabo**: Calcula a bitola recomendada do cabo

### 💰 Tela 2 – Gerador de Orçamento
- Preenchimento de dados do cliente
- Cálculo automático do total
- Compartilhamento via WhatsApp
- Formatação profissional do orçamento

### 🎓 Tela 3 – Curso Eletricista Nível 1
- **Módulo 1**: Segurança Básica (NR10)
- **Módulo 2**: Conceitos Elétricos Fundamentais
- **Módulo 3**: Diferença entre 110V e 220V
- **Módulo 4**: Prática - Instalação de Tomada

### 📝 Tela 4 – Prova
- 10 perguntas de múltipla escolha
- Pontuação automática
- Aprovação com 70% ou mais de acertos
- Possibilidade de refazer a prova

### 💵 Monetização
- Banner do Google AdMob na parte inferior

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Kotlin
- **Android SDK**: API 24 (Android 7.0) a API 34 (Android 14)
- **Arquitetura**: MVVM com Fragments
- **UI**: Material Design 3
- **Navegação**: Android Navigation Component
- **Publicidade**: Google Mobile Ads SDK

## 📋 Estrutura do Projeto

```
EletricistaPro/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/eletricistapro/
│   │       │   ├── MainActivity.kt
│   │       │   ├── ui/
│   │       │   │   ├── CalculadorasFragment.kt
│   │       │   │   ├── OrcamentoFragment.kt
│   │       │   │   ├── CursoFragment.kt
│   │       │   │   └── ProvaFragment.kt
│   │       │   └── data/
│   │       │       ├── CursoData.kt
│   │       │       └── ProvaData.kt
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   ├── values/
│   │       │   ├── menu/
│   │       │   └── navigation/
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🚀 Como Compilar e Executar

### Pré-requisitos
- Android Studio Flamingo ou superior
- SDK Android 34 instalado
- JDK 11 ou superior

### Passos

1. **Abrir o projeto no Android Studio**
   ```bash
   # Abra o Android Studio e selecione "Open"
   # Navegue até a pasta EletricistaPro
   ```

2. **Sincronizar Gradle**
   - O Android Studio sincronizará automaticamente
   - Aguarde a conclusão

3. **Configurar Google AdMob** (opcional)
   - Abra `AndroidManifest.xml`
   - Substitua `ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy` pelo seu ID de aplicativo do AdMob

4. **Compilar o APK**
   ```
   Build → Build Bundle(s) / APK(s) → Build APK(s)
   ```

5. **Executar no Emulador ou Dispositivo**
   ```
   Run → Run 'app'
   ```

## 📱 Requisitos do Sistema

- **Versão Mínima**: Android 7.0 (API 24)
- **Versão Alvo**: Android 14 (API 34)
- **Permissões**:
  - `android.permission.INTERNET` (para Google Ads e WhatsApp)
  - `android.permission.ACCESS_NETWORK_STATE`

## 🎨 Design e UI

- **Cores Primárias**: Laranja (#FF6B35) e Azul Marinho (#004E89)
- **Fonte**: Roboto (padrão do Material Design)
- **Tema**: Material Design 3
- **Linguagem**: Português (Brasil)

## 📦 Dependências Principais

```gradle
// Core Android
androidx.core:core-ktx:1.12.0
androidx.appcompat:appcompat:1.6.1
com.google.android.material:material:1.10.0
androidx.constraintlayout:constraintlayout:2.1.4

// Navigation
androidx.navigation:navigation-fragment-ktx:2.7.5
androidx.navigation:navigation-ui-ktx:2.7.5

// Google Mobile Ads
com.google.android.gms:play-services-ads:22.6.0

// Lifecycle
androidx.lifecycle:lifecycle-runtime-ktx:2.6.2
androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2
```

## 🔐 Segurança

- Código comentado e organizado
- Validação de entrada em todos os campos
- Tratamento de exceções
- ProGuard habilitado para release

## 📄 Licença

Este projeto é fornecido como está para fins educacionais.

## 👨‍💻 Desenvolvimento

### Estrutura de Código

- **Fragments**: Cada tela é um Fragment para melhor modularização
- **Data Classes**: Dados organizados em classes específicas
- **View Binding**: Usado para acesso seguro às views
- **Comentários**: Código bem documentado em português

### Padrões Utilizados

- **MVVM**: Model-View-ViewModel
- **Single Activity**: Uma atividade com múltiplos fragments
- **Navigation Component**: Navegação entre fragmentos

## 🐛 Troubleshooting

### Erro ao sincronizar Gradle
- Verifique a versão do Android Studio
- Limpe o cache: `File → Invalidate Caches`

### App fecha ao abrir
- Verifique o logcat para erros
- Certifique-se de que todas as dependências foram instaladas

### Google Ads não aparecem
- Verifique se o ID do AdMob está correto
- Certifique-se de que o dispositivo tem conexão com a internet

## 📞 Suporte

Para dúvidas ou sugestões, consulte a documentação do Android:
- [Android Developers](https://developer.android.com/)
- [Material Design](https://material.io/)
- [Google Mobile Ads](https://developers.google.com/admob)

---

**Desenvolvido com ❤️ para eletricistas e iniciantes**
