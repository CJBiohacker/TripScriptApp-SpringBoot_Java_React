import React from 'react';
import { Link } from 'react-router-dom';
import '../styles/Card.css'

const Card = (props) => {

    const { imgSrc, imgAlt, cardTitle, cardTimeText, text1, text2, text3, text4, cardSmallPrice, cardStrongPrice } = props;

    return (
        <div className="destinos-card">
            <Link to='/viagens' id='Link-Style'>
                <img src={imgSrc} className="card-img-top" alt={imgAlt} />
                <div className="card-body">
                    <h3 className="card-title">{cardTitle}</h3>
                    <div className="card-info">
                        <p className="card-text"><i className="fas fa-calendar-week"></i>{cardTimeText}
                        </p>
                        <div>
                            <p className="card-text"><i className="fas fa-check"></i>{text1}</p>
                            <p className="card-text"><i className="fas fa-check"></i>{text2}</p>
                            <p className="card-text"><i className="fas fa-check"></i>{text3}</p>
                            <p className="card-text"><i className="fas fa-check"></i>{text4}</p>
                        </div>
                        <p className="card-text">
                            <small>À partir de</small>
                            <small><del>{cardSmallPrice}</del></small>
                            <strong>{cardStrongPrice}</strong>
                        </p>
                        <p className="card-text"><small>em até 12x s/ juros</small></p>
                    </div>
                </div>
            </Link>
        </div>
    );
};

export default Card;