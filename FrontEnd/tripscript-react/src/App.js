import React from 'react';
import { Home, Clientes, Viagens, Contato } from './pages'
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './styles/global.css';

function App() {

  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/clientes" exact component={Clientes} />
          <Route path="/viagens" exact component={Viagens} />
          <Route path="/contato" exact component={Contato} />
        </Switch>
      </BrowserRouter>
    </div>
  );

}

export default App;