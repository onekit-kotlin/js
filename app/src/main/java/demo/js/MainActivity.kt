package demo.js

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.onekit.js.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////////////////////
        function circumference(r) {
            return parseFloat(r) * 2.0 * Math.PI;
        }

        console.log(circumference(4.567));
// expected output: 28.695307297889173

        console.log(circumference('4.567abcdefgh'));
// expected output: 28.695307297889173

        console.log(circumference('abcdefgh'));
// expected output: NaN


    }
}


