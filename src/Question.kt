class Question<T>(
    val questionText : String,
    val anserw : T,
    val difficulrt : String
)

fun main(){
    val question1 = Question(questionText =  "Речка спрятана"  , "Водопровод" ,"medium")
    val question2 = Question(questionText =  "Небо зеленная"  , false ,"easy")
    val question3 = Question(questionText =  "Сколько дней между полнолуниями"  , "28" ,"hard")
    println(question1.anserw)
    println(question2.anserw)
    println(question3.anserw)
}