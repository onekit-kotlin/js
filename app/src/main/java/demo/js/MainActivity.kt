package demo.js

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.onekit.js.*
import cn.onekit.js.console



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////////////////////
        val test = object : function { override operator fun invoke(vararg arguments:Any?): Any? {
            val t = arguments[0]
            if(fullequals(t,undefined)){
                return "Undefined value!"
            }
            return t
        }}
        val x = undefined
        console.log(test(x))



    }
}


