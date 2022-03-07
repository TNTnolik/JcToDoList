package ru.tnt_nolik.jctodolistmvvm.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.tnt_nolik.jctodolistmvvm.data.TodoDatabase
import ru.tnt_nolik.jctodolistmvvm.data.TodoRepository
import ru.tnt_nolik.jctodolistmvvm.data.TodoRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideTodoDatabase(app:Application):TodoDatabase{
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase):TodoRepository{
        return TodoRepositoryImpl(db.todoDao())
    }
}