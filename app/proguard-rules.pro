# Regras ProGuard para o projeto EletricistaPro

# Manter classes do Android
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Fragment
-keep public class * extends androidx.fragment.app.Fragment
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.Service
-keep public class * extends android.view.View

# Manter classes de dados
-keep class com.eletricistapro.data.** { *; }
-keep class com.eletricistapro.models.** { *; }

# Manter métodos nativos
-keepclasseswithmembernames class * {
    native <methods>;
}

# Manter enums
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Manter Parcelable
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Google Mobile Ads
-keep class com.google.android.gms.ads.** { *; }
-keep class com.google.ads.** { *; }

# Manter nomes de métodos públicos
-keepclassmembers class * {
    public <methods>;
}

# Remover logs em produção
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
}
