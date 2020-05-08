package jp.ac.titech.itpro.sdl.helloandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var outputView: TextView? = null
    private var inputName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        outputView = findViewById(R.id.output_view)
        inputName = findViewById(R.id.input_name)
    }

    @SuppressLint("SetTextI18n")
    fun greet(@Suppress("UNUSED_PARAMETER") v: View) {
        val name = inputName!!.text.toString().trim()
        if (name.isNotEmpty()) {
            outputView!!.text = """
                |Hello $name!
                |Nice to see you!
                """.trimMargin()
        }
    }
}
