package cn.onekit.js

val Infinity = Double.POSITIVE_INFINITY
///////////////////////
val NaN = Double.NaN
fun isNaN(value:Any?):Boolean {
    if (value is Number){
        return false
    }
    val result = value.toString().toDoubleOrNull() ?: return true
    return result== NaN
}
///////////////////////
fun typeOf(value:Any?):String {
    if (value == null) {
        return "null";
    }
    return value.javaClass.simpleName
}