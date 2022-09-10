package ja.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val btnStart : Button = findViewById(R.id.btn_start)
		val etName : AppCompatEditText = findViewById(R.id.et_name)
		btnStart.setOnClickListener{
			if(etName.text.toString().isEmpty()){
				Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
			}else{
				val intent = Intent(this@MainActivity, QuizQuestoionActivity::class.java)
				intent.putExtra(Constants.USER_NAME, etName.text.toString())
				startActivity(intent)
				finish()
			}
		}
	}
}