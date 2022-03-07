package ru.tnt_nolik.jctodolistmvvm.ui.todo_list

import ru.tnt_nolik.jctodolistmvvm.data.TodoEntity

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todoEntity: TodoEntity): TodoListEvent()
    data class OnDoneChange(val todoEntity: TodoEntity, val isDone:Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todoEntity: TodoEntity): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}