package com.example.firstapplication

fun main(){
    val todo= Todo()
    val taskone = Task(101,"maha","all the tasks is completed",true)
    val tasktwo = Task(102,"aljawharah","all the tasks is not completed",false)
    val taskthree = Task(103,"mohammed","all the tasks is completed",true)
    val taskfour = Task(104,"fahad","all the tasks is not completed",false)
    todo.addtask(taskone)
    todo.addtask(tasktwo)
    todo.addtask(taskthree)
    todo.addtask(taskfour)
    todo.showallthetask()
    todo.removetask(tasktwo)
    todo.printspecifctask(105)
    todo.changetask(taskfour)
}
data class Task(val id : Int , val name: String , val note: String, var  isCompleted: Boolean=false){}

class Todo(){
    var tasks= arrayListOf<Task>()
        private set
    fun showallthetask(){
        println("This is All the tasks:")
        for (i in tasks) println(i)
        }
    fun printspecifctask(number : Int) {
        for (i in 0 until tasks.size) {
            if (number == tasks[i].id) println("Task with id :${number} is exist")
            else println("Task with id: ${number} does not exist ")
            break
        }
        }
    fun addtask( add : Task){
        tasks.add(add)
        println("This task successfully added : $add")
    }
    fun removetask( remove : Task){
        tasks.remove(remove)
        println("This task successfully removed : $remove")
    }
    fun changetask( change : Task){
        println("The task status is : ${!change.isCompleted}")
    }
    }
