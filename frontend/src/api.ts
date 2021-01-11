import axios from "axios";

const API_URL = 'https://project-dsdelivery.herokuapp.com';

export function fetchProducts()
{
    return axios(`${API_URL}/products`)
}