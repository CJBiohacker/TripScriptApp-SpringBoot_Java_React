import React from 'react';

const Carousel = () => {

    return (
        <figure>
            <div className="glide" id="options-type">
                <div className="glide__track" data-glide-el="track">
                    <ul className="glide__slides" id="slide-container">
                        <li className="glide__slide"><img src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/dc41b307bb886fb030b63c64571ca212db18edb6/images/fernando-de-noronha.svg" alt="" /></li>
                        <li className="glide__slide"><img src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/dc41b307bb886fb030b63c64571ca212db18edb6/images/gruta-lagoazul.svg" alt="" /></li>
                        <li className="glide__slide"><img src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/dc41b307bb886fb030b63c64571ca212db18edb6/images/penedo.svg" alt="" /></li>
                        <li className="glide__slide"><img src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/dc41b307bb886fb030b63c64571ca212db18edb6/images/porto-de-galinhas.svg" alt="" /></li>
                        <li className="glide__slide"><img src="https://raw.githubusercontent.com/CJBiohacker/TripScript-Viagens/dc41b307bb886fb030b63c64571ca212db18edb6/images/praia-camburi-vitoriaes.svg" alt="" /></li>
                    </ul>
                    <div className="glide__arrows" data-glide-el="controls">
                        <button className="glide__arrow glide__arrow--left" data-glide-dir="<">prev</button>
                        <button className="glide__arrow glide__arrow--right" data-glide-dir=">">next</button>
                    </div>
                </div>
            </div>
        </figure>
    );
};

export default Carousel;