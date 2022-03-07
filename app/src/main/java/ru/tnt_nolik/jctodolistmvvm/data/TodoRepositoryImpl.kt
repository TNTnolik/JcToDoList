package ru.tnt_nolik.jctodolistmvvm.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(private val dao: TodoDao): TodoRepository {
    override suspend fun insertTodo(todo: TodoEntity) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: TodoEntity) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodo(id: Int): TodoEntity? {
        return dao.getTodo(id)
    }

    override fun getAll(): Flow<List<TodoEntity>> {
        return dao.getAll()
    }
}