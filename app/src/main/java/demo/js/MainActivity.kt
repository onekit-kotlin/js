package demo.js

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.onekit.js.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////////////////////
        console.log(Infinity          ); /* cn.onekit.js.getInfinity */
        console.log(Infinity + 1      ); /* cn.onekit.js.getInfinity */
        console.log(Math.pow(10.0, 1000.0)); /* cn.onekit.js.getInfinity */
        console.log(Math.log(0.0)       ); /* -cn.onekit.js.getInfinity */
        console.log(1 / Infinity      ); /* 0 */
        //////////////////
        fun sanitise(x:Any) :Any{
            if (isNaN(x)) {
                return NaN;
            }
            return x;
        }

        console.log(sanitise("1"));
// expected output: "1"

        console.log(sanitise("NotANumber"));
// expected output: NaN

    }
}
