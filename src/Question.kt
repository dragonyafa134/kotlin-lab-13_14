enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}

data class Question<T>(
    val questionText : String,
    val anserw : T,
    val difficulrt : Difficulty
)
class Quiz{
    val question1 = Question(questionText =  "Речка спрятана"  , "Водопровод" ,Difficulty.MEDIUM)
    val question2 = Question(questionText =  "Небо зеленная"  , false ,Difficulty.EASY)
    val question3 = Question(questionText =  "Сколько дней между полнолуниями"  , "28" ,Difficulty.HARD)

    companion object StudentProgress {
        var total : Int = 10
        var answered : Int = 3
    }
}


fun main(){

    //println("${StudentProgress.answered} of ${StudentProgress.total} anserwed")
    println("${Quiz.answered} of ${Quiz.total} anserwed")
}