import React from 'react';
import Card from '../components/Card';
import '../styles/Viagens.css';
import '../styles/global.css';

const Viagens = () => {

    return (
        <div>
            <div id='destinos'>
                <div className='destinos-title'>
                    <h1>Aproveite os pacotes e cadastre sua próxima Viagem aqui na TripScript</h1>
                </div>
                <div className='destinos-container'>
                    <Card onClick='#' imgSrc='https://thumbcdn-2.hotelurbano.net/7IAyNj-1hM4sKB2ESFHqbyGye98=/fit-in/x562/filters:strip_icc():max_bytes(102400)/http%3A//s3.amazonaws.com/legado-prod/prod/ofertas/imagens/2021/12/10/12/00/1_shutterstock_1363425368.jpg' imgAlt='Paraty RJ' cardTitle='Paraty - Rio de Janeiro' cardTimeText='&nbsp;&nbsp;5-7 diárias' text1='&nbsp;&nbsp;Hotel' text2='&nbsp;&nbsp;Café da Manhã' text3='&nbsp;&nbsp;Almoço' text4='Souvenir' cardSmallPrice='R$3160,00' cardStrongPrice='R$1650,00' />

                    <Card onClick='#' imgSrc='https://www.ilhagrande.com.br/wp-content/uploads/2015/03/enseada-de-aracatiba-ilha-grande-7.jpg' imgAlt='Ilha Grande RJ' cardTitle='Ilha Grande - Rio de Janeiro' cardTimeText='&nbsp;&nbsp;2-3 diárias' text1='&nbsp;&nbsp;Hotel' text2='&nbsp;&nbsp;Café da Manhã' text3='&nbsp;&nbsp;Almoço' text4='Souvenir' cardSmallPrice='R$899,00' cardStrongPrice='R$599,00' />

                    <Card onClick='#' imgSrc='https://www.ilhagrande.com.br/wp-content/uploads/2015/03/enseada-de-aracatiba-ilha-grande-7.jpg' imgAlt='Ilha Grande RJ' cardTitle='Ilha Grande - Rio de Janeiro' cardTimeText='&nbsp;&nbsp;2-3 diárias' text1='&nbsp;&nbsp;Hotel' text2='&nbsp;&nbsp;Café da Manhã' text3='&nbsp;&nbsp;Almoço' text4='Souvenir' cardSmallPrice='R$899,00' cardStrongPrice='R$599,00' />

                    <Card onClick='#' imgSrc='https://www.ilhagrande.com.br/wp-content/uploads/2015/03/enseada-de-aracatiba-ilha-grande-7.jpg' imgAlt='Ilha Grande RJ' cardTitle='Ilha Grande - Rio de Janeiro' cardTimeText='&nbsp;&nbsp;2-3 diárias' text1='&nbsp;&nbsp;Hotel' text2='&nbsp;&nbsp;Café da Manhã' text3='&nbsp;&nbsp;Almoço' text4='Souvenir' cardSmallPrice='R$899,00' cardStrongPrice='R$599,00' />
                </div>
            </div>
        </div>
    );
};

export default Viagens;