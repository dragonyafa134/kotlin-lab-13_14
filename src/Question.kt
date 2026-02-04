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

interface ProgressPrintable{
    val progressText : String
}
class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answerd"

    fun printProgressBar(){
        repeat(Quiz.answered) {println("▓")}
        repeat(Quiz.total - Quiz.answered) {println("▒")}
        println()
        println(progressText)
    }

    val question1 = Question(questionText =  "Речка спрятана"  , "Водопровод" ,Difficulty.MEDIUM)
    val question2 = Question(questionText =  "Небо зеленная"  , false ,Difficulty.EASY)
    val question3 = Question(questionText =  "Сколько дней между полнолуниями"  , "28" ,Difficulty.HARD)

    companion object StudentProgress {
        var total : Int = 10
        var answered : Int = 3
    }

    fun printQuiz(){
//        println(question1.questionText)
//        println(question1.anserw)
//        println(question1.difficulrt)
//        println()
//
//        println(question2.questionText)
//        println(question2.anserw)
//        println(question2.difficulrt)
//        println()
//
//        println(question3.questionText)
//        println(question3.anserw)
//        println(question3.difficulrt)
//        println()

        question1.let {
            println(it.questionText)
            println(it.anserw)
            println(it.difficulrt)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.anserw)
            println(it.difficulrt)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.anserw)
            println(it.difficulrt)
        }
        println()

    }
}

//val Quiz.StudentProgress.progressText : String
//    get() = "${answered} of ${total} anserwd"

//fun Quiz.StudentProgress.printProgressBar(){
//    repeat(Quiz.answered) {println("▓")}
//    repeat(Quiz.total - Quiz.answered) {println("▒")}
//    println()
//    println(Quiz.progressText)

//}

fun main(){

    //println("${StudentProgress.answered} of ${StudentProgress.total} anserwed")
//    println("${Quiz.answered} of ${Quiz.total} anserwed")
//    println(Quiz.progressText)
//    Quiz.printProgressBar()
//    Quiz().printProgressBar()

//    val quiz = Quiz()
//    quiz.printQuiz()

//    val quiz = Quiz().apply { printQuiz() }

    Quiz().apply { printQuiz() }
}