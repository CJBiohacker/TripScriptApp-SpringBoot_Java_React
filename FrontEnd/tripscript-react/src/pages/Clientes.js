import * as React from 'react';
import '../styles/global.css'
import '../styles/Cliente.css'

const Clientes = () => {

    return (
        <div>
            <div id="cliente">
                <div class="cliente-title">
                    <h1>Cadastro e Consulta de Clientes</h1>
                </div>
                <div class="cliente-container">
                    <form class="cliente-form" action="#">
                        <label for="name">Nome</label>
                        <input type="text" id="nome" name="name" placeholder="Digite seu nome..." />

                        <label for="nasc">Data de Nascimento</label>
                        <input type="date" id="nasc" name="nasc" />

                        <label for="celular">Celular</label>
                        <input type="text" id="celular" name="celular" />

                        <button id="cliente-button" type="submit">Enviar</button>
                    </form>
                </div>

            </div>
        </div>
    );
}

export default Clientes;