package cn.onekit.js

import android.util.Log
import java.lang.StringBuilder

open class console() {
    companion object {
        fun log(vararg args: Any) {
            val sb = StringBuilder();
            for (arg in args) {
                sb.append("${arg}\t")
            }
            Log.e("[X2X]===========", sb.toString())
        }
    }
}