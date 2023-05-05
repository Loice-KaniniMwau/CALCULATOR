package calculator.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum2:TextInputLayout
    lateinit var etNum1: TextInputEditText
//    var required1=etNum1.text.toString().toInt()
    lateinit var etNum2: TextInputEditText
//    var required2=etNum2.text.toString().toInt()
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
   private lateinit var btnMultiplication: Button
    lateinit var btnDivision: Button
    lateinit var etOutput: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       castView()

        addition()
        multiplication()
        division()
        subtraction()
//
//        btnAddition.setOnClickListener {
//
//        }


    }

   private fun castView() {
        tilNum2=findViewById(R.id.tilNum1)
        tilNum2=findViewById(R.id.tilNum2)
        etNum1 = findViewById(R.id.etNum1)

        etNum2 = findViewById(R.id.etNum2)

        btnAddition = findViewById(R.id.btnAddition)
        btnDivision = findViewById(R.id.btnDivision)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        etOutput = findViewById(R.id.etOutput)


    }
    private fun addition(){
        btnAddition.setOnClickListener {
//            var num1=etNum1.text.toString().toInt()
            var num1=etNum1.text.toString().toDouble()

            var num2=etNum2.text.toString().toDouble()
            var sum=num1+num2
            etOutput.text=sum.toString()


        }
    }
    private fun subtraction(){
        btnSubtraction.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            var subtraction=num1-num2
           etOutput.text=(subtraction.toString())

        }
    }
    private fun division(){
        btnDivision.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            var division=num1/num2
          etOutput.text=division.toString()
        }
    }
   private fun multiplication(){
        btnMultiplication.setOnClickListener {
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            var multiplication=num1*num2
           etOutput.text=multiplication.toString()
        }
    }

//

    


}