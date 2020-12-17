package cn.onekit.js

import android.util.Log
import java.lang.StringBuilder
import java.util.*

open class Console() {
        fun log(vararg args: Any?) {
            val sb = StringBuilder();
            sb.append(String.format("%d\n",Date().time ))
            for (arg in args) {
                sb.append("${arg}\t")
            }
            Log.e("[ONEKIT]===============", sb.toString())
        }

}