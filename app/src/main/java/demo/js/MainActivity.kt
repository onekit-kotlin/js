package demo.js

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.onekit.js.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////////////////////
        /*
        val test = object : function {
            override fun invoke(vararg arguments: Any?): Any? {
                val a = arguments.got(0)
                console.log(typeOf(a));    // undefined
                return a;
            }
        }
        test.invoke()                       // 返回"undefined"
         */
        val div = object : function {
            override fun invoke(vararg arguments: Any?): Any? {
                val x = arguments.got(0)
                if (!isFinite(1000 .onekit_div(x))) {
                    return "Number is NOT Infinity.";
                }
                return "Number is Infinity!"
            }
        }
        console.log(div.invoke(0));
// expected output: "Number is Infinity!""

        console.log(div.invoke(1));
// expected output: "Number is NOT Infinity."

    }
}


