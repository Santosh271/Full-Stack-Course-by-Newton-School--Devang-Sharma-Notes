// RFC

import React from 'react'

export default function devang() {
  return (
    <div>devang</div>
  )
}

// RFAC
import React from 'react'

export const devang = () => {
  return (
    <div>devang</div>
  )
}


// RCC
import React, { Component } from 'react';

export default class componentName extends Component {
  render() {
    return (
      <div> textInComponent </div>
    );
  }
}
