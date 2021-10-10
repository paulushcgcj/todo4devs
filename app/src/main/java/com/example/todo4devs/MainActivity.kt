package com.example.todo4devs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo4devs.adapters.TodoAdapter
import com.example.todo4devs.models.Todo
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(this)

        btAddTodo.setOnClickListener {
            if(etTodoTitle.text.toString().isNotEmpty()){
                todoAdapter.addTodo(Todo(UUID.randomUUID(),etTodoTitle.text.toString()))
                etTodoTitle.text.clear()
            }
        }

        btDeleteDoneTodos.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }

    }
}