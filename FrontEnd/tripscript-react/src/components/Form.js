import React from 'react';
import { useState, useEffect } from "react";
import FormService from '../services/FormService';
import '../styles/Form.css'

const Form = () => {

    const [nome, setNome] = useState('');
    const [email, setEmail] = useState('');
    const [país, setPaís] = useState('');
    const [assunto, setAssunto] = useState('');

    const SendForm = (e) => {

        e.preventDefault();

        const form = { nome, email, país, assunto };

        FormService.createForm(form).then((response) => {
            console.log(response.data);
        })

    };

    return (

        <div id="contato">

            <div class="contato-title">
                <h1>Tem dúvidas ou perguntas?<br />Entre em Contato conosco</h1>
            </div>

            <div class="contato-container">
                <form class="contato-form" method='POST' >
                    <label for="nome">Nome</label>
                    <input type="text" id="nome" name="nome" placeholder="Digite seu nome..." value={nome} onChange={(e) => setNome(e.target.value)} />

                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" placeholder="Digite seu email..." value={email} onChange={(e) => setEmail(e.target.value)} />

                    <label for="país">País</label>
                    <select id="país" name="país" value={país} onChange={(e) => setPaís(e.target.value)}>
                        <option value="1">Brasil</option>
                        <option value="2">Canada</option>
                        <option value="3">USA</option>
                        <option value="4">Australia</option>
                        <option value="5">França</option>
                        <option value="6">Alemanha</option>
                        <option value="7">Africa do Sul</option>
                        <option value="8">Moçambique</option>
                        <option value="9">Japão</option>
                        <option value="10">Coréia do Sul</option>
                        <option value="11">China</option>
                        <option value="12">Índia</option>
                        <option value="13">Rússia</option>
                    </select>

                    <label for="assunto">Dúvida/Pergunta</label>
                    <textarea id="assunto" name="assunto"
                        placeholder="Digite suas dúvidas e/ou perguntas..." value={assunto} onChange={(e) => setAssunto(e.target.value)}></textarea>

                    <input id="contato-button" type="submit" onClick={(e) => SendForm(e)} />
                </form>
            </div>

        </div>
    );
}

export default Form;