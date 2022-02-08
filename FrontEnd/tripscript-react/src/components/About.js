import * as React from 'react';
import '../styles/global.css'
import '../styles/About.css'

const Home = () => {

    return (
        <div>
            <div id="home">
                <img class="home-logo" src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/dc41b307bb886fb030b63c64571ca212db18edb6/images/TripScript%20Logo%20Alt.svg" alt="TripScript Logo" />
                <section class="home-intro">
                    <h1>Seja Bem Vindo à TripScript</h1>
                    <p>Uma empresa de serviços com um time de profissionais que têm como missão serem os(as) protagonistas
                        na
                        realização do seu sonho em viajar.Estamos à mais de 5 anos no mercado e estamos comprometido(a)s em
                        melhorar nossos serviços a cada ano para proporcionar viagens únicas para nossos clientes.</p>
                </section>
                <section class="home-intro2">
                    <h1>Por quê viajar com a TripScript ?</h1>
                    <p>Permitimos várias formas de pagamentos: Pix, Débito Online, Crédito (até 12x s/ juros) e Boleto
                        Bancário.
                        O viajante não precisa realizar qualquer pagamento no balcão do estabelecimento. Tudo é
                        resolvido online. Se pintar algum imprevisto, o viajante não precisa se preocupar: o cancelamento é grátis até a
                        véspera do check-in. E em caso de pacote promocional, quando a viagem for agendada.Disponibilizamos um canal de dúvidas via Whatsapp, Telegram e/ou Signal no horário de 8h às 22h.</p>
                </section>
            </div>
        </div >
    );
}

export default Home;


