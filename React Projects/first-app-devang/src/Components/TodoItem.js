import React from 'react'

export const TodoItem = (props) => {
  return (
      <>
    <h4>{props.todo.title}</h4>
    <p>{props.todo.desc}</p>
    <button className="btn btn-sm btn-danger"> Delete</button>
    </>
  )
}
