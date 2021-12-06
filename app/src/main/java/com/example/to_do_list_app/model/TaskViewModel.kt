package com.example.to_do_list_app.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.example.to_do_list_app.data.DataTask
import com.example.to_do_list_app.data.TaskitemSource
import com.example.to_do_list_app.data.tasklist
import javax.sql.DataSource


class TaskViewModel : ViewModel(){

    val  taskTittel = MutableLiveData<String>("")
    val  categoryDISCRIPTION = MutableLiveData<String>("")
    val  Location = MutableLiveData<String>("")
    val Description= MutableLiveData<String>("")
    val time = MutableLiveData<String>("")
    val data = MutableLiveData<String>("")


////add function 3

    fun get_task(title:String){
        var item= tasklist.find {it.taskTittel.equals(title, ignoreCase = true)}
        Location.value= item?.taskTittel
        Description.value= item?.description

    }

fun addtask(){

var task =TaskitemSource()
    task.addTask(DataTask(taskTittel.value.toString(),
        categoryDISCRIPTION.value.toString(),
        Location.value.toString(),
        data.value.toString(),
        time.value.toString()
    ))
}

}

