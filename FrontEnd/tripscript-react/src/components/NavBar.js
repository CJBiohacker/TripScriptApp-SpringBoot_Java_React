import React from 'react';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/NavBar';
import Container from 'react-bootstrap/Container';

const NavBar = () => {

    return (
        <div>
            <Navbar bg="primary" variant="dark">
                <Container>
                    <Navbar.Brand href="/">
                        <img src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/main/images/TripScript.svg" alt="" />
                    </Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="/clientes">Clientes</Nav.Link>
                        <Nav.Link href="/viagens">Viagens</Nav.Link>
                        <Nav.Link href="/contato">Contato</Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
        </div >
    );
};

export default NavBar;