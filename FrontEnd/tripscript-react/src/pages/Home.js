import * as React from 'react';
import { Slider } from '../components/Slider'
import { ResponsiveAppBar } from '../components/ResponsiveAppBar'
import { Footer } from '../components/Footer'
import '../styles/global.css'

const Home = () => {

    return (
        <div>
            <ResponsiveAppBar />
            <Slider />

            <Footer />
        </div>
    );
}