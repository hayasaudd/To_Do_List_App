package com.example.to_do_list_app.data
val tasklist = mutableListOf<DataTask>(
        DataTask("Exercise", "sport", "Gyme"," moor deteals" ,"17Nov", "7:00pm"),
        DataTask("homework", "education", "library"," moor deteals" , "17Nov", "12:00pm"),
        DataTask("homework", "education", "library"," moor deteals" , "17Nov", "4:00pm"),
        DataTask("meeting", "work", "work place"," moor deteals" , "17Nov", "9:00Am"),
)



object taskitem {
        fun getAll(): List<DataTask> {
                return tasklist
        }
//
//        fun addtask(s: DataTask) {
//              tasklist.add(s)
//            val title = taskTittel.text.toString()
//            val category = categoryDISCRIPTION.text.toString()
//            val Location = Location.text.toString()
//            val Description = Description.text.toString()
//            val Time= Time.text.toString()
//            val Data = Data.text.toString()
//            tasklist = listOf(DataTask(title, category, Location, Description, Data, Time))
//        var listoftask = tasklist
//          return listoftask
//                // creat data
//        }

        fun removeitem(item: DataTask) {
              tasklist.remove(item)
        }


}
