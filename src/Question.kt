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



fun main(){
    val question1 = Question(questionText =  "Речка спрятана"  , "Водопровод" ,Difficulty.MEDIUM)
    val question2 = Question(questionText =  "Небо зеленная"  , false ,Difficulty.EASY)
    val question3 = Question(questionText =  "Сколько дней между полнолуниями"  , "28" ,Difficulty.HARD)
    println(question1.anserw)
    println(question2.anserw)
    println(question3.anserw)
}