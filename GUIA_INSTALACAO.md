# 📱 Guia de Instalação - Eletricista Pro – Nível 1

Este guia detalha como abrir e compilar o projeto no Android Studio.

## ✅ Pré-requisitos

Antes de começar, certifique-se de ter instalado:

1. **Android Studio** (versão Flamingo ou superior)
   - Download: [developer.android.com/studio](https://developer.android.com/studio)

2. **Android SDK** (API 34)
   - Abra Android Studio → SDK Manager
   - Instale: Android 14 (API 34)

3. **JDK 11 ou superior**
   - Geralmente vem com Android Studio

4. **Mínimo 4GB de RAM** disponível

## 🚀 Passo a Passo

### Passo 1: Preparar o Projeto

1. Copie a pasta `EletricistaPro` para um local seguro no seu computador
   ```
   Exemplo: C:\Projetos\EletricistaPro (Windows)
   Exemplo: ~/Projetos/EletricistaPro (Mac/Linux)
   ```

### Passo 2: Abrir no Android Studio

1. Abra o **Android Studio**
2. Clique em **File → Open**
3. Navegue até a pasta `EletricistaPro` e selecione-a
4. Clique em **OK**

### Passo 3: Sincronizar Gradle

1. Android Studio detectará o projeto automaticamente
2. Uma mensagem aparecerá: **"Gradle files have changed since the last sync"**
3. Clique em **Sync Now**
4. Aguarde a conclusão (pode levar 2-5 minutos na primeira vez)

### Passo 4: Configurar Google AdMob (Opcional)

Se você deseja usar Google Ads:

1. Abra o arquivo `app/src/main/AndroidManifest.xml`
2. Localize a linha:
   ```xml
   <meta-data
       android:name="com.google.android.gms.ads.APPLICATION_ID"
       android:value="ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy" />
   ```
3. Substitua `ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy` pelo seu ID de aplicativo do AdMob
4. Se não tiver um ID, deixe como está (os ads não aparecerão, mas o app funcionará normalmente)

### Passo 5: Compilar o APK

#### Opção A: APK de Debug (para testes)

1. Clique em **Build → Build Bundle(s) / APK(s) → Build APK(s)**
2. Aguarde a compilação
3. Uma notificação aparecerá quando terminar
4. Clique em **Locate** para encontrar o arquivo

#### Opção B: APK de Release (para publicação)

1. Clique em **Build → Generate Signed Bundle / APK**
2. Selecione **APK** e clique em **Next**
3. Crie um novo Keystore ou use um existente
4. Preencha as informações de assinatura
5. Selecione **Release** como build type
6. Clique em **Finish**

### Passo 6: Testar no Emulador

1. Clique em **AVD Manager** (ícone de telefone com Android)
2. Crie um novo emulador ou use um existente
3. Clique em **Run → Run 'app'**
4. Selecione o emulador
5. Aguarde o app iniciar

### Passo 7: Testar em Dispositivo Real

1. Conecte seu smartphone Android via USB
2. Ative **Modo de Desenvolvedor** no telefone:
   - Vá para **Configurações → Sobre o Telefone**
   - Toque 7 vezes em **Número da Compilação**
   - Volte e abra **Opções de Desenvolvedor**
   - Ative **Depuração USB**

3. No Android Studio, clique em **Run → Run 'app'**
4. Selecione seu dispositivo
5. Aguarde a instalação

## 📁 Estrutura de Arquivos Gerados

```
EletricistaPro/
├── app/
│   ├── build/                    # Arquivos compilados (gerado)
│   │   └── outputs/
│   │       └── apk/
│   │           ├── debug/        # APK de debug
│   │           └── release/      # APK de release
│   ├── src/main/
│   │   ├── java/                 # Código Kotlin
│   │   ├── res/                  # Recursos (layouts, strings, cores)
│   │   └── AndroidManifest.xml   # Configuração do app
│   ├── build.gradle.kts          # Configuração do módulo
│   └── proguard-rules.pro        # Regras de otimização
├── build.gradle.kts              # Configuração do projeto
├── settings.gradle.kts           # Configuração de módulos
└── gradle.properties             # Propriedades do Gradle
```

## 🔧 Solução de Problemas

### Problema: "Gradle sync failed"

**Solução:**
1. Clique em **File → Invalidate Caches / Restart**
2. Selecione **Invalidate and Restart**
3. Aguarde o reinício
4. Sincronize novamente

### Problema: "SDK not found"

**Solução:**
1. Abra **Tools → SDK Manager**
2. Verifique se Android 14 (API 34) está instalado
3. Se não, clique em **Show Package Details** e instale

### Problema: "Emulator not starting"

**Solução:**
1. Abra **AVD Manager**
2. Clique em **Edit** no emulador
3. Aumente a RAM para 2GB
4. Clique em **Finish** e tente novamente

### Problema: "Device not recognized"

**Solução:**
1. Desconecte e reconecte o USB
2. Verifique se o modo de depuração está ativado
3. Instale os drivers USB do seu dispositivo
4. Reinicie o Android Studio

## 📱 Gerar APK Final

### Para Publicação na Google Play Store

1. **Criar Keystore:**
   ```
   Build → Generate Signed Bundle / APK
   → Create new → Preencha os dados
   ```

2. **Compilar Release:**
   ```
   Build → Generate Signed Bundle / APK
   → Selecione Release
   ```

3. **Arquivo gerado:**
   ```
   app/release/app-release.apk
   ```

4. **Upload na Google Play:**
   - Acesse [play.google.com/console](https://play.google.com/console)
   - Crie um novo app
   - Faça upload do APK
   - Preencha as informações obrigatórias
   - Publique

## 📊 Informações do Projeto

| Informação | Valor |
|-----------|-------|
| **Nome do App** | Eletricista Pro – Nível 1 |
| **Package Name** | com.eletricistapro |
| **Versão** | 1.0 |
| **API Mínima** | 24 (Android 7.0) |
| **API Alvo** | 34 (Android 14) |
| **Linguagem** | Kotlin |
| **Arquitetura** | MVVM com Fragments |

## 🎨 Customizações Possíveis

### Mudar Cores

1. Abra `app/src/main/res/values/colors.xml`
2. Modifique os valores HEX das cores

### Mudar Textos

1. Abra `app/src/main/res/values/strings.xml`
2. Edite os textos em português

### Adicionar Novos Módulos de Curso

1. Abra `app/src/main/java/com/eletricistapro/data/CursoData.kt`
2. Adicione novos `Modulo` à lista `modulos`

### Adicionar Novas Perguntas

1. Abra `app/src/main/java/com/eletricistapro/data/ProvaData.kt`
2. Adicione novas `Pergunta` à lista `perguntas`

## 📞 Suporte

Para dúvidas sobre Android development:
- [Android Developers](https://developer.android.com/)
- [Kotlin Documentation](https://kotlinlang.org/docs/)
- [Material Design](https://material.io/)

## ✨ Próximos Passos

1. **Testar todas as funcionalidades** no emulador ou dispositivo
2. **Configurar Google AdMob** para monetização
3. **Publicar na Google Play Store**
4. **Coletar feedback** dos usuários
5. **Melhorar e atualizar** conforme necessário

---

**Parabéns! Seu app está pronto para ser compilado e testado! 🎉**
