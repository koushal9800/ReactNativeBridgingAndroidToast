package com.nativemodulesforandroid

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class ToastModule: ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
//        val modules: ArrayList<NativeModule>()
//        modules.add(ToastService(reactContext))
//        return modules
        return  listOf(ToastService(reactContext))
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<in Nothing, in Nothing>> {
        return emptyList()
    }
}