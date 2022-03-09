import React from 'react'
import {TodoItem} from "./TodoItem"


export const Todo = (props) => {
  return (
      <>
    <h2 className="text-center">Todo List</h2>

    <h2>{props.todolist.length}</h2>

    {props.todolist.map((todo)=>{
      console.log(todo.sno);
        return (<TodoItem todo={todo}/>
        )})}

    </>
  )
}

