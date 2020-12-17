package cn.onekit.js

public fun equals(x:Any?,y: Any?): Boolean {
        if (x == null && y == null) {
            return true;
        }
        if (x != null && y == null) {
            return false;
        }
        if (x == null && y != null) {
            return false;
        }
        return  x!!.equals(y)
    }
public fun fullequals(x:Any?,y: Any?): Boolean {
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
            && x!!.equals(y)
}
public fun plus(x:Any?,y: Any?) :Any{
    return (x as Number).toDouble()+(y as Number).toDouble()
}
public fun minus(x:Any?,y: Any?): Any {
     return (x as Number).toDouble()-(y as Number).toDouble()
}
public fun times(x:Any?,y: Any?): Any {
     return (x as Number).toDouble()*(y as Number).toDouble()
}
public fun div(x:Any?,y: Any?): Any {
     return (x as Number).toDouble()/(y as Number).toDouble()
}