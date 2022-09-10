package ja.tutorials.quizapp

object Constants {

	const val USER_NAME: String = "user_name"
	const val CORRECT_ANS: String = "correct_ans"
	const val TOTAL_QUESTIONS: String = "total_questions"

	fun getQuestions():ArrayList<Question>{
		val questionsList = ArrayList<Question>()

		val que1 = Question(
			1,"キャラクター名を言え",
			R.drawable.slime,
			"スライム","スラぼう","スライミー","スラちゃん",1
		)
		questionsList.add(que1)

		val que2 = Question(
			2,"キャラクター名を言え",
			R.drawable.shellslime,
			"スライム","シェルスライム","スライムつむり","グリーンスライム",3
		)
		questionsList.add(que2)

		val que3 = Question(
			3,"キャラクター名を言え",
			R.drawable.slimetower,
			"スライム三兄弟","スラぼうス","スライム","スライムタワー",4
		)
		questionsList.add(que3)

		val que4 = Question(
			4,"キャラクター名を言え",
			R.drawable.metalking,
			"メタル大王","キングスライム","はぐれメタル","メタルキング",4
		)
		questionsList.add(que4)

		return questionsList
	}
}