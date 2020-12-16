package demo.js

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.onekit.js.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////////////////////
        val test = object : function {
            override fun invoke(vararg arguments: Any?): Any? {
                val a = arguments.got(0)
                console.log(typeOf(a));    // undefined
                return a;
            }
        }
        test.invoke()                       // 返回"undefined"

    }
}
