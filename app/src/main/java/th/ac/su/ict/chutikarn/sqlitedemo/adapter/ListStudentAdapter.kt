package th.ac.su.ict.chutikarn.sqlitedemo.adapter

import android.provider.ContactsContract
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import kotlinx.android.synthetic.main.row_layoput.view.*
import th.ac.su.ict.chutikarn.sqlitedemo.R
import th.ac.su.ict.chutikarn.sqlitedemo.model.Student



class ListStudentAdapter(internal var activity:Activity,
                         internal var listStudent:List<Student>
                        ) : BaseAdapter(){


    lateinit var inflater:LayoutInflater

    init {
        inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE)  as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val rowView:View

        rowView = inflater.inflate(R.layout.row_layoput,null)

        rowView.tvRowId.text = listStudent[position].id.toString()
        rowView.tvName.text = listStudent[position].name.toString()
        rowView.tvEmail.text = listStudent[position].email.toString()

        return rowView

    }

    override fun getItem(position: Int): Any {

        return listStudent[position]
    }

    override fun getItemId(position: Int): Long {

        return listStudent[position].id.toLong()

    }

    override fun getCount(): Int {

        return  listStudent.size
    }





}