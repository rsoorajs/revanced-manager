package app.revanced.manager.ui.components

import android.os.Build
import app.revanced.manager.BuildConfig

fun DebugInfo(): String {
    return """
            Application version: ${BuildConfig.VERSION_NAME}
            Version Type = ${BuildConfig.VERSION_TYPE} ${BuildConfig.BUILD_TYPE}
            Android Version: ${Build.VERSION.RELEASE}
            SDK: ${Build.VERSION.SDK_INT}
            Device Brand: ${Build.BRAND}
            Device Model: ${Build.MODEL}
        """.trimIndent()
}