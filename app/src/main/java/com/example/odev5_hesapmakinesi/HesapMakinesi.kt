package com.example.odev5_hesapmakinesi

import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import java.lang.NumberFormatException

class HesapMakinesi
{
     var numberarray:ArrayList<Int> = ArrayList<Int>()
     var result:Int=0
     var mainstring:String=""
     var number:String=""
     var controlplus:Boolean=true;



    fun addnumber(numberstring:String,it:View):String {


        /*var ıntvalue:Int=0
        try{
            var value:String=number
            value+=numberstring
            ıntvalue=value.toIntOrNull() ?:0

        }
        catch (e:NumberFormatException)
        {

            Log.e("Range Error","Deger Aşımı Yapıldı")
            number=Int.MAX_VALUE.toString()
            mainstring+=number
            return mainstring

        }*/



        if (number.length != 6) {
            if (numberstring == "0") {
                if (number == "0") {
                    return mainstring
                } else {
                    controlplus = false
                    number += numberstring
                    mainstring += numberstring
                    return mainstring
                }

            } else {

                controlplus = false
                number += numberstring
                mainstring += numberstring
                return mainstring

            }
        }
        else{
            Snackbar.make(it,"Girilen Sayı 6 Basamktan fazla olamaz",Snackbar.LENGTH_SHORT).show()
            Log.e("Range Aşımı","Giriline Deger 6 Karakterden Falza olamaz")
            return mainstring
        }
    }
    fun plusnumber():String
    {

    if(controlplus)
    {
    return mainstring
    }
    else
    {
        controlplus=true
        mainstring+="+"
        numberarray.add(number.toInt())
        number=""
        return mainstring

    }
    }

    fun lastcharacter(word:String):Char
    {

    if(word.length!=1)
    {

        return word[word.lastIndex]
    }
    else
    {
        return '-'
    }

    }

    fun result():String
    {
        if(number!="" || lastcharacter(mainstring)=='+')
        {
            controlplus=false
            if(number !="") {
                numberarray.add(number.toInt())
                number = ""
            }
            for (value in numberarray) {

                result += value
                if(result >=Int.MAX_VALUE || result<0){
                    result=Int.MAX_VALUE
                    break
                }
            }
            numberarray.clear()
            mainstring = result.toString()
            number = result.toString()
            result = 0
            return mainstring
        }
        else{
            return mainstring
        }
    }

    fun reset():String{
        numberarray.clear()
        controlplus=true
        result=0
        number=""
        mainstring=""
        return mainstring

    }

}