import * as React from 'react';
import ResponsiveAppBar from '../components/ResponsiveAppBar';
import Footer from '../components/Footer';
import Form from '../components/Form';
import '../styles/global.css'

const Contato = () => {

    return (
        <div>
            <ResponsiveAppBar />
            <Form />
            <Footer />
        </div>
    );
}

export default Contato;