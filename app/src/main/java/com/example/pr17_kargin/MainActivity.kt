package com.example.pr17_kargin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View)
    {
        fun showMessage(text: String)
        {
            val tost = Toast.makeText(this,text,Toast.LENGTH_SHORT)
            tost.show()
        }

        val intent: Intent
        when(view.id)
        {
            R.id.btnWeb ->
            {
                intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"))
                startActivity(intent)

            }
            R.id.btnCall ->
            {
                intent = Intent(Intent.ACTION_DIAL);
                intent.data = Uri.parse("tel:12345");
                startActivity(intent);

            }
            R.id.btnMap ->
            {
                intent = Intent()
                intent.action = Intent.ACTION_VIEW
                intent.data = Uri.parse("geo:55.754283,37.62002")
                startActivity(intent)

            }
            R.id.btn1 -> showMessage("Нажата кнопка 1")
            R.id.btn2 -> showMessage("Нажата кнопка 2")

        }
    }
}