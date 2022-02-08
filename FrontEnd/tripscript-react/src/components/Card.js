import React from 'react';
import '../styles/Card.css'

const Card = (props) => {

    const { cardTitle, cardTimeText, imgSrc, imgAlt, text1, text2, text3, text4, cardSmallPrice, cardStrongPrice } = props;

    return (
        <div id="promoçoes-container">
            <div class="promoçoes-card">
                <a href="#" style="text-decoration: none; color: black;">
                    <img src={imgSrc}
                        class="card-img-top" alt={imgAlt} />
                    <div class="card-body">
                        <h3 class="card-title">{cardTitle}</h3>
                        <div class="card-info">
                            <p class="card-text"><i class="fas fa-calendar-week"></i>{cardTimeText}
                            </p>
                            <div>
                                <p class="card-text"><i class="fas fa-check"></i>{text1}</p>
                                <p class="card-text"><i class="fas fa-check"></i>{text2}</p>
                                <p class="card-text"><i class="fas fa-check"></i>{text3}</p>
                                <p class="card-text"><i class="fas fa-check"></i>{text4}</p>
                            </div>
                            <p class="card-text">
                                <small>À partir de</small>
                                <small><del>{cardSmallPrice}</del></small>
                                <strong>{cardStrongPrice}</strong>
                            </p>
                            <p class="card-text"><small>em até 12x s/ juros</small></p>
                        </div>
                    </div>
                </a>
            </div>
        </div >
    );
};

export default Card;