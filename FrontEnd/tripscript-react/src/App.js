import React from 'react';
import ResponsiveAppBar from './components/ResponsiveAppBar'
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './styles/global.css';

function App() {
  return (
    <div className="App">
      <ResponsiveAppBar />
      <BrowserRouter>
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/rooms/new" exact component={NewRoom} />
          <Route path="/rooms/:id" exact component={Room}
          />
          <Route path="/admin/rooms/:id" exact component={AdminRoom} />
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;