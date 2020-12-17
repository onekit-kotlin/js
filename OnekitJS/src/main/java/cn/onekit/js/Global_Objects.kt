package cn.onekit.js

import java.io.UnsupportedEncodingException
import java.net.URLDecoder
import java.net.URLEncoder

val Infinity = Double.POSITIVE_INFINITY
val NaN = Double.NaN
 class Undefined{
    override fun toString(): String {
        return "undefined"
    }
}
val undefined = Undefined();
///////////////////////
fun eval(exp:String):Any?{
    return null //js(exp)
}

fun isFinite(testValue:Any?):Boolean{
    return testValue is Number && testValue.toDouble()== Infinity
}

fun isNaN(value:Any?):Boolean {
    if (value is Number){
        return false
    }
    val result = value.toString().toDoubleOrNull() ?: return true
    return result== NaN
}
fun parseFloat(value:Any?):Any?{
    return value as Double?
}
fun parseInt(value:Any?):Any?{
    return value as Long?
}
fun decodeURI(url: String): String {
    return URLDecoder.decode(url)
}

fun decodeURIComponent(url: String): String {
    return URLDecoder.decode(url)
}

fun encodeURI(url: String): String {
    try {
        return URLEncoder.encode(url, "utf-8")
    } catch (e: UnsupportedEncodingException) {
        throw URIError("Uncaught URIError: URI malformed")
    }

}

fun encodeURIComponent(url: String): String {

    try {
        return URLEncoder.encode(url, "UTF-8")
            .replace("\\+".toRegex(), "%20")
            .replace("\\%21".toRegex(), "!")
            .replace("\\%27".toRegex(), "'")
            .replace("\\%28".toRegex(), "(")
            .replace("\\%29".toRegex(), ")")
            .replace("\\%7E".toRegex(), "~")
    } catch (e: UnsupportedEncodingException) {
        throw URIError("Uncaught URIError: URI malformed")
    }
}
//////////////////////////////////
fun typeOf(value:Any?):String {
    if (value == null) {
        return "null";
    }
    return value.javaClass.simpleName
}