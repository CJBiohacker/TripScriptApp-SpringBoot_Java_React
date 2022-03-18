import axios from 'axios';

const formURL = "http://localhost:8080/formulario/add";

class FormService {

    createForm = (form) => {
        return axios.post(formURL, form);
    }
}

export default new FormService();