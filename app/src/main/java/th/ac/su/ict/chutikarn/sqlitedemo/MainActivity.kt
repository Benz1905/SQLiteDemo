package th.ac.su.ict.chutikarn.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.su.ict.chutikarn.sqlitedemo.adapter.ListStudentAdapter
import th.ac.su.ict.chutikarn.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    var listStudent = ArrayList<Student>()

    lateinit var listViewStudent:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student1 = Student(1234 ,"chutikarn","chutikarn@gmail.com")
        var student2 = Student(5678 ,"chuti","chuti@gmail.com")
        var student3 = Student(9876 ,"karn","karn@gmail.com")
        var student4 = Student(966 ,"wuti","susice@gmail.com")
        var student5 = Student(9644 ,"porn","sussice@gmail.com")
        var student6 = Student(9663 ,"ta","suse@gmail.com")
        var student7 = Student(96445 ,"ttt","sussfice@gmail.com")
        var student8 = Student(96635 ,"fff","susef@gmail.com")





        listStudent.add(student1)
        listStudent.add(student2)
        listStudent.add(student3)
        listStudent.add(student4)
        listStudent.add(student5)
        listStudent.add(student6)
        listStudent.add(student7)
        listStudent.add(student8)

         listViewStudent = findViewById<ListView>(R.id.listSt)
        reloadData()

    }

    fun reloadData(){

        val adapter = ListStudentAdapter(this@MainActivity,listStudent)
        listViewStudent.adapter = adapter
    }





    }

