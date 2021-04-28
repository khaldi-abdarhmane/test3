package com.example.test3

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)







        var textView1 = TextView(this)
       // var l:Array<TextView> = arrayOf()




        textView1.setText("kkkk")

        textView1.layoutParams = RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 60f)
        textView1.setTextColor(Color.BLUE)



        val textViewCount = 7

        val textViewArray = arrayOfNulls<TextView>(textViewCount)

        for (i in 0 until textViewCount) {
            textViewArray[i] = TextView(this)
            textViewArray[i]?.setText("")
        }


   //     l[1]=textView1
        //    l.add(textView1)
        //layout?.addView(l.get(1))


        var layout = findViewById<LinearLayout>(R.id.root)

            // Create TextView programmatically.


            var textView = TextView(this)
            // setting height and width
            textView.layoutParams= RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
            // setting text
            textView.setText("GEEKSFORGEEKS")
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            textView.setTextColor(Color.MAGENTA)
            // onClick the text a message will be displayed "HELLO GEEK"

             var i=0
            var b=false;
            textView.setOnClickListener()
            {

                b=!b
                Toast.makeText(this@MainActivity, "HELLO $b GEEK",
                        Toast.LENGTH_LONG).show()
                 if( b==true) textView.setTextColor(Color.RED)
                  else textView.setTextColor(Color.GREEN)

              if (i<10) {
                  textView1= textViewArray[i]!!

                  layout?.addView(textView1)
                  i++

              }


            }
            // Add TextView to LinearLayout

            layout?.addView(textView)


        }

  }


