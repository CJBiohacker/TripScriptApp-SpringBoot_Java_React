import * as React from 'react';
import SlideShow from '../components/SlideShow';
import ResponsiveAppBar from '../components/ResponsiveAppBar';
import Footer from '../components/Footer';
import About from '../components/About';
import '../styles/global.css'

const Home = () => {

    return (
        <div>
            <ResponsiveAppBar />
            <SlideShow />
            <About />
            <Footer />
        </div>
    );
}

export default Home;