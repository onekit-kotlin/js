package cn.onekit.js

import java.lang.reflect.Method

 open interface function {
   /* private lateinit var _method: Method
    private lateinit var _obj: Any

    constructor() {
    }

    constructor(obj: Any, methodName: String) :
            this(obj.javaClass, methodName) {
        _obj = obj
    }

    constructor(type: Class<Any>, methodName: String) {
        _method = type.getMethod(methodName)
    }
*/
    fun invoke(vararg arguments: Any?): Any?
/*
    open fun invoke(vararg arguments: Any): Any? {
        return _method.invoke(arguments)
    }*/
}