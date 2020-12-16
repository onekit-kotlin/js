package cn.onekit.js

fun Any.got(memberName:Any?):Any? {
    when (this) {
        is Array<*> -> {
            val array = this
            return if (memberName is Number) {
                if(array.size<=0){
                    undefined()
                }else {
                    val index = memberName.toInt()
                    if (index >= 0 || index < array.size) {
                        array[index]
                    } else {
                        undefined()
                    }
                }
            } else {
                undefined()
            }
        }
        is Map<*, *> -> {
            val map = this
            return if (memberName is String) {
                val key = memberName.toString()
                if (map.containsKey(key)) {
                    map[key]
                } else {
                    undefined()
                }
            } else {
                undefined()
            }
        }
        else -> {
            val name = memberName.toString()
            for(field in this.javaClass.fields){
                if(field.name==name){
                    return field
                }
            }
            for(method in this.javaClass.methods){
                if(method.name==name){
                    return method
                }
            }
            return undefined()
        }
    }
}