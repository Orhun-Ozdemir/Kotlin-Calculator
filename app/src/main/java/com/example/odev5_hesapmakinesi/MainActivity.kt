package com.example.odev5_hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hesapMakinesi:HesapMakinesi=HesapMakinesi()


        number0.setOnClickListener {

        ResultTextView.text=hesapMakinesi.addnumber("0")


        }
        number1.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("1")


        }
        number2.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("2")
        }
        number3.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("3")

        }
        number4.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("4")
        }
        number5.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("5")
        }
        number6.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("6")
        }
        number7.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("7")
        }
        number8.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("8")

        }
        number9.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("9")

        }
        resultButton.setOnClickListener {
          ResultTextView.text=hesapMakinesi.result()

        }

        reset.setOnClickListener {
            ResultTextView.text=hesapMakinesi.reset()


        }
        plus.setOnClickListener {

            ResultTextView.text=hesapMakinesi.plusnumber()


        }

    }
}