package ru.tnt_nolik.jctodolistmvvm.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: TodoEntity)

    @Delete
    suspend fun deleteTodo(todo: TodoEntity)

    @Query("SELECT * FROM todoentity")
    fun getAll(): Flow<List<TodoEntity>>

    @Query("SELECT * FROM todoentity WHERE id = :id")
    suspend fun getTodo(id: Int) : TodoEntity?
}