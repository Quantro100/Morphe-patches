package app.morphe.patches.aliexpress.utils

import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

internal object Constants {
    val COMPATIBILITY_ALIEXPRESS = Compatibility(
        packageName = "com.alibaba.aliexpresshd",
        name = "AliExpress",
        description = null,
        apkFileType = null,
        appIconColor = null,
        signatures = null,
        targets = listOf(AppTarget(version = "8.162.8")),
    )
    const val PREF_DESCRIPTOR = "Lapp/morphe/extension/aliexpress/patches/PreferencesPatch;"
}
