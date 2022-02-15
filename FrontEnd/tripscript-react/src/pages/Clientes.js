import React, { useState, useEffect } from 'react';
import { Paper } from '@mui/material';
import axios from 'axios';
import '../styles/global.css'
import '../styles/Cliente.css'

const Clientes = () => {

    const [nome, setNome] = useState('');
    const [nasc, setNasc] = useState('');
    const [celular, setCelular] = useState('');

    const [clientes, setClientes] = useState([]);

    // Ao clicar no botão de 'CADASTRAR', esta função realiza um POST via HTTP/S no FrontEnd para realizar um CREATE pelo BackEnd do Spring Boot Java, adicionando um novo cadastro de cliente no Banco de Dados.
    const handleClick = (event) => {
        event.preventDefault()
        const cliente = { nome, nasc, celular };
        console.log(cliente);

        // fetch( 'url do método HTTP', 'ResponseBody' ) --> Realiza a busca de um recurso de rede
        fetch("http://localhost:8080/cliente/add", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(cliente)
        }).then(() => {
            console.log("Um novo Cliente foi cadastrado no sistema.")
        })
    };

    // const axiosPOST = () => {
    //     axios.post("http://localhost:8080/cliente/add", {
    //         setNome,
    //         setNasc,
    //         setCelular
    //     })

    //     console.log(`${nome}, ${nasc} e ${celular}`);
    // };

    // Hook da API do React que aceita uma função que contém código imperativo, e possivelmente eficaz.
    // Neste caso realiza um 'fetch' que busca na URL todos os clientes cadastrados no banco de dados.
    useEffect(() => {
        fetch("http://localhost:8080/cliente/getAll")
            .then(response => response.json())
            .then((result) => {
                setClientes(result);
            })
    }, []);

    return (
        <div>
            <div id="cliente">
                <div className="cliente-title">
                    <h1>Cadastro e Consulta de Clientes</h1>
                </div>
                <div className="cliente-container">
                    <form className="cliente-form" >
                        <label>Nome </label>
                        <input type="text" id="nome" name="nome" onChange={(event) => { setNome(event.target.value) }} placeholder="Digite seu nome..." />

                        <label>Data de Nascimento</label>
                        <input type="date" id="nasc" name="nasc" onChange={(event) => { setNasc(event.target.value) }} />

                        <label>Celular </label>
                        <input type="text" id="celular" name="celular" onChange={(event) => { setCelular(event.target.value) }} placeholder="Ex.: +5521967924539" />

                        <button id="cliente-button" type="submit" onClick={handleClick} >Cadastrar</button>
                    </form>
                </div>
            </div>
            <div>
                <h1>Clientes da Tabela</h1>
                <Paper elevation={3}>

                    {clientes.map(cliente => (
                        <Paper elevation={6} style={{ margin: "10px", padding: "15px", textAlign: "left" }} key={cliente.idcliente}>
                            Id: {cliente.idcliente} <br />
                            Nome: {cliente.nome} <br />
                            Data Nascimento: {cliente.nasc} <br />
                            Contato: {cliente.celular} <br />
                        </Paper>
                    ))}

                </Paper>
            </div>
        </div >
    );
}

export default Clientes;