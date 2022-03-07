package ru.tnt_nolik.jctodolistmvvm.data

import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun insertTodo(todo: TodoEntity)
    suspend fun deleteTodo(todo: TodoEntity)
    suspend fun getTodo(id: Int) : TodoEntity?
    fun getAll(): Flow<List<TodoEntity>>
}