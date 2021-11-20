package com.example.to_do_list_app.data


class TaskitemSource {

       fun getTasks():MutableList<DataTask>{
               return tasklist
       }

        fun addTask(task: DataTask){ tasklist.add(task) }

        fun removeitem(index: Int) { tasklist.removeAt(index) }



}
