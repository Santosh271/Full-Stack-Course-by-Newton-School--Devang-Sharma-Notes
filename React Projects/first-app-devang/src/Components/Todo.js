import React from 'react'
import {TodoItem} from "./TodoItem"


export const Todo = (props) => {

    let style={
      minHeight: "90vh",
      margin: "50px auto",
      marginLeft: "50px"
  }



  return (
      <div style={style}>

    <h2 className="text-center my-3">Todo List</h2>

    {props.todolist.length === 0 ? "No Todos to display" :
    props.todolist.map((todo)=>{
      console.log(todo.sno);
        return (<TodoItem todo={todo} key={todo.sno} onDelete={props.onDelete}/>
        )})}

    </div>
  )
}

