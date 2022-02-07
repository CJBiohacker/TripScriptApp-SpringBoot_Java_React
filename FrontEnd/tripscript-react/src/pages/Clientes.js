import * as React from 'react';
import SlideShow from '../components/SlideShow'
import ResponsiveAppBar from '../components/ResponsiveAppBar'
import Footer from '../components/Footer'
import '../styles/global.css'

const Home = () => {

    return (
        <div>
            <ResponsiveAppBar />

            <Footer />
        </div>
    );
}

export default Home;