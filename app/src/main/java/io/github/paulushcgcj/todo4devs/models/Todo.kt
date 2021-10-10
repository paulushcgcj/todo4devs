package io.github.paulushcgcj.todo4devs.models

import java.util.*

data class Todo(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    var checked: Boolean = false
)