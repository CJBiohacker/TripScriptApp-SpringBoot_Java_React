import React from 'react';
import Home from './pages/Home'
import Clientes from './pages/Clientes'
import Viagens from './pages/Viagens'
import Contato from './pages/Contato'
import NavBar from './components/NavBar';
import Footer from './components/Footer';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './styles/global.css';

function App() {

  return (
    <div className="App">
      <Router>
        <NavBar />
        <Routes>
          <Route path='/' exact element={<Home />} />
          <Route path='/clientes' exact element={<Clientes />} />
          <Route path='/viagens' exact element={<Viagens />} />
          <Route path='/contato' exact element={<Contato />} />
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;