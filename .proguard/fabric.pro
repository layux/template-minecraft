# General directives
-dontoptimize
-dontshrink

# Keep your main class
-keep public class * extends net.fabricmc.api.ModInitializer {
    public void onInitialize();
}

-keep public class * extends net.fabricmc.api.ClientModInitializer {
    public void onInitializeClient();
}

-keep public class * extends net.fabricmc.api.DedicatedServerModInitializer {
    public void onInitializeServer();
}

# Keep the public API
-keep class io.layux.**.api.** { *; }
-keepclassmembers class io.layux.**.api.**

# Don't warn about missing classes
-dontwarn net.minecraft.**

# Some attributes that you'll need to keep (to be honest I'm not sure which ones really need to be kept here, but this is what works for me)
-keepattributes !LocalVariableTable,!LocalVariableTypeTable,Exceptions,InnerClasses,Signature,Deprecated,LineNumberTable,*Annotation*,EnclosingMethod
