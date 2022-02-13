import React from 'react';
import { useState, useForm } from "react";
import '../styles/Form.css'

const Form = () => {

    return (

        <div id="contato">

            <div class="contato-title">
                <h1>Tem dúvidas ou perguntas?<br />Entre em Contato conosco</h1>
            </div>

            <div class="contato-container">
                <form class="contato-form" action="#">
                    <label for="nome">Nome</label>
                    <input type="text" id="nome" name="nome" placeholder="Digite seu nome..." />

                    <label for="email">Email</label>
                    <input type="email" id="email" name="email" placeholder="Digite seu email..." />

                    <label for="país">País</label>
                    <select id="país" name="país">
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
                        placeholder="Digite suas dúvidas e/ou perguntas..."></textarea>

                    <input id="contato-button" type="submit" value="Enviar" />
                </form>
            </div>

        </div>
    );
}

export default Form;