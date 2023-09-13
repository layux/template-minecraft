# Keep your main class
-keep public class io.layux.example.ExamplePlugin {
    @com.google.inject.Inject *;
    <init>();
}

# Keep the public API
-keep class io.layux.example.api.** { *; }
-keepclassmembers class io.layux.example.api.**

# Keep event handlers
-keep,allowobfuscation class * {
    @com.velocitypowered.api.event.Subscribe <methods>;
}

# If your goal is obfuscating and making things harder to read, repackage your classes with this rule
-repackageclasses 'io.layux.example'

# Don't warn about missing classes
-dontwarn com.velocitypowered.api.**
-dontwarn net.kyori.adventure.text.**
-dontwarn org.slf4j.**

# Some attributes that you'll need to keep (to be honest I'm not sure which ones really need to be kept here, but this is what works for me)
-keepattributes !LocalVariableTable,!LocalVariableTypeTable,Exceptions,InnerClasses,Signature,Deprecated,LineNumberTable,*Annotation*,EnclosingMethod
