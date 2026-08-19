import { useState } from 'react'
import './App.css'
import { Routes, Route } from 'react-router-dom'; //

function App() {
  return (
    <Routes>
      <Route path="/" element={<div>Home</div>} />
    </Routes>
  )
}

export default App
