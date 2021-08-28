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

        ResultTextView.text=hesapMakinesi.addnumber("0",it)


        }
        number1.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("1",it)


        }
        number2.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("2",it)
        }
        number3.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("3",it)

        }
        number4.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("4",it)
        }
        number5.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("5",it)
        }
        number6.setOnClickListener {


            ResultTextView.text=hesapMakinesi.addnumber("6",it)
        }
        number7.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("7",it)
        }
        number8.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("8",it)

        }
        number9.setOnClickListener {

            ResultTextView.text=hesapMakinesi.addnumber("9",it)

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