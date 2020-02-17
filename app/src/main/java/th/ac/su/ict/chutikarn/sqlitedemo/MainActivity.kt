package th.ac.su.ict.chutikarn.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.su.ict.chutikarn.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student1 = Student(1234 ,"chutikarn","chutikarn@gmail.com")
        var student2 = Student(5678 ,"chuti","chuti@gmail.com")
        var student3 = Student(9876 ,"karn","karn@gmail.com")

        listStudent.

    }
}
