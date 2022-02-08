import React from 'react';
import SlideShow from '../components/SlideShow';
import About from '../components/About';
import '../styles/global.css'

const Home = () => {

    return (
        <div>
            <SlideShow />
            <About />
        </div>
    );
}

export default Home;