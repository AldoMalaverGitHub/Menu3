package com.kotlin.menu3.menu3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResultado.setText("")
        rbEntradaGroup.visibility = View.INVISIBLE
        rbFondoGroup.visibility = View.INVISIBLE
    }

    fun mostrarEntrada(view: View){
        if(chkEntrada.isChecked){
            rbEntradaGroup.visibility = View.VISIBLE
        }else{
            rbEntradaGroup.visibility = View.INVISIBLE
        }

    }

    fun mostrarFondo(view: View){
        if(chkFondo.isChecked){
            rbFondoGroup.visibility = View.VISIBLE
        }else{
            rbFondoGroup.visibility = View.INVISIBLE
        }
    }

    fun ordenarMenu(view: View){
        var resultado = ""
        if(chkEntrada.isChecked){
            when{
                rbEntradaGroup.rbEntrada1.isChecked ->
                    resultado += "Entrada " + rbEntradaGroup.rbEntrada1.text.toString() + "\n"
                rbEntradaGroup.rbEntrada2.isChecked ->
                    resultado += "Entrada " + rbEntradaGroup.rbEntrada2.text.toString() + "\n"
                rbEntradaGroup.rbEntrada3.isChecked ->
                    resultado += "Entrada " + rbEntradaGroup.rbEntrada3.text.toString() + "\n"

            }
        }

        if(chkFondo.isChecked){
            when{
                rbFondoGroup.rbFondo1.isChecked ->
                    resultado += "Fondo " + rbFondoGroup.rbFondo1.text.toString()
                rbFondoGroup.rbFondo2.isChecked ->
                    resultado += "Fondo " + rbFondoGroup.rbFondo2.text.toString()
                rbFondoGroup.rbFondo3.isChecked ->
                    resultado += "Fondo " + rbFondoGroup.rbFondo3.text.toString()

            }
        }

        txtResultado.setText(resultado)
    }
}
