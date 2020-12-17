package cn.onekit.js

/*
fun Any.got(memberName:Any?):Any? {
    when (this) {
        is Array<*> -> {
            val array = this
            return if (memberName is Number) {
                if(array.size<=0){
                    Undefined()
                }else {
                    val index = memberName.toInt()
                    if (index >= 0 || index < array.size) {
                        array[index]
                    } else {
                        Undefined()
                    }
                }
            } else {
                Undefined()
            }
        }
        is Map<*, *> -> {
            val map = this
            return if (memberName is String) {
                val key = memberName.toString()
                if (map.containsKey(key)) {
                    map[key]
                } else {
                    Undefined()
                }
            } else {
                Undefined()
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
            return Undefined()
        }
    }
}*/
/////////////////////////////
fun fullequals(x:Any?,y: Any?) :Boolean {
    if (x == null && y == null) {
        return true;
    }
    if (x != null && y == null) {
        return false;
    }
    if (x == null && y != null) {
        return false;
    }
    return x!!.javaClass.name.equals(y!!.javaClass.name)
            && x.equals(y)
}
fun equals(x:Any?,y: Any?) :Boolean {
    if (x == null && y == null) {
        return true;
    }
    if (x != null && y == null) {
        return false;
    }
    if (x == null && y != null) {
        return false;
    }
    return x!!.equals(y)
}
 fun plus(x:Any?,y: Any?) :Any{
    return (x as Number).toDouble()+(y as Number).toDouble()
}
 fun minus(x:Any?,y: Any?): Any {
     return (x as Number).toDouble()-(y as Number).toDouble()
}
 fun times(x:Any?,y: Any?): Any {
     return (x as Number).toDouble()*(y as Number).toDouble()
}
 fun div(x:Any?,y: Any?): Any {
     return (x as Number).toDouble()/(y as Number).toDouble()
}