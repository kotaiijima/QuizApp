package ja.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_result)

		val tvName: TextView = findViewById(R.id.tv_name)
		val tvScore: TextView = findViewById(R.id.tv_score)
		val btnFinish: Button = findViewById(R.id.btn_finish)

		val userName = intent.getStringExtra(Constants.USER_NAME)
		tvName.text = userName

		val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
		val correctAns = intent.getIntExtra(Constants.CORRECT_ANS, 0)

		tvScore.text = "あなたのスコアは$totalQuestions 点中 $correctAns 点です。"

		btnFinish.setOnClickListener{
			startActivity(Intent(this, MainActivity::class.java))
		}
	}
}