import java.util.*
import javax.swing.JOptionPane

fun main(args: Array<String>) {
    val main = Main()
    main.konsoleMenu()
}

class Main{

    var name: String? = null
    var age: Int? = null

    fun konsoleMenu(){
        val konsole = Scanner(System.`in`)

        do {
            println("Please select type of interface: \n 1 For Terminal\n 2 For GUI\n 3 For Exit ")
            val opt = konsole.nextInt()
            if(opt == 1){
                konsoleTerminal(konsole)
            }else if(opt == 2) {
                konsoleGui()
            }else if(opt == 3){
                println("Konsole is finish3")
            }else{
                println("Option not valid, please select a valid option")
            }
        }while (opt != 3)

        konsole.close()
    }

    fun konsoleTerminal(konsole: Scanner){

        println("Please insert your name:")
        name = konsole.next()
        println("Please insert you age:")
        age = konsole.nextInt()
        println("Hello $name your age is $age")

    }

    fun konsoleGui(){
        name = JOptionPane.showInputDialog(null, "Please insert you name", "Insert data", JOptionPane.QUESTION_MESSAGE)
        val sAge = JOptionPane.showInputDialog(null, "Please insert you age", "Insert data", JOptionPane.QUESTION_MESSAGE)
        age = sAge.toInt()

        JOptionPane.showMessageDialog(null, "Hello $name your age is $age", "Message", JOptionPane.INFORMATION_MESSAGE)
    }
}

