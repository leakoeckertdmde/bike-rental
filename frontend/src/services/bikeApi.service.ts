import axios from 'axios';
import {Bike} from "../models/Bike.ts";

export async function getAllBikes(): Promise<Bike[]> {
    try {
        const response = await axios.get('http://localhost:8089/bikerental/bikes');
        return response.data;
    } catch (error) {
        console.error(error);
        return [];
    }
}