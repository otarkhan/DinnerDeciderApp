package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    val food = ArrayList<String>();

    fun loadFood(){
        food.add("Hamburger");
        food.add("Pizza");
        food.add("Mexican");
        food.add("American");
        food.add("Chinese");
    }

    fun getRandom():String{
        val rand: Random = Random();
        return food.get(rand.nextInt(food.size));
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFood();
        textView.text = getRandom();

//        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textView.text = getRandom();
        }

        button2.setOnClickListener {
            food.add(editText.text.toString());
        }
    }


}
