import { Header } from '../components/Header/Header';
import './App.css'
import './components/Header/Header.css'
import './components/SearchBar/SearchBar.css'

import { Routes, Route } from 'react-router-dom'; //

function RoutesConfig() {
  return (
    <div>
      <Header />
      <Routes>
        <Route path="/" element={<div>Home</div>} />
      </Routes>
    </div>
  )
}

export default RoutesConfig
