package com.e.aula20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intanciando a toolbar
        setSupportActionBar(toolbar)

        //Evento de click no navigationIcon
        toolbar.setNavigationOnClickListener {
            Log.i("MainActivity", "Clicando no navigation")
        }

    }

    //incluindo o menu que criamos na toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    //criando evento de click no menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemView = item.itemId
        when (itemView) {
            R.id.menu_add -> Log.i("MainActivity", "adicionando")
            R.id.menu_notification -> showSnakbar("notificação em snack")
        }
        return false
    }

    //criando snackbar com evento de click nela
    fun showSnakbar(msg: String) {

        var snack = Snackbar.make(snack_layout, msg, Snackbar.LENGTH_SHORT)
        snack.setDuration(10000)

        snack.setAction("clicar", View.OnClickListener {
            Log.i("Main SnackBar", "showSnakbar: ")
        })

        snack.show()

    }


}





