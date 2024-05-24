import {Bike} from "../models/Bike.ts";
import {useEffect, useState} from "react";
import {getAllBikes} from "../services/bikeApi.service.ts";

export function Content() {
  const [bikes, setBikes] = useState<Bike[]>([])

  useEffect(() => {
    getAllBikes().then((bikes) => setBikes(bikes));
  }, []);

  return (
    <table>
      <thead>
      <tr>
        <th>Manufacturer</th>
        <th>Rim Size</th>
        <th>Frame Size</th>
        <th>Color</th>
        <th>Rented</th>
      </tr>
      </thead>
      <tbody>
      {bikes.map((bike) => (
        <tr key={bike.id}>
          <td>{bike.manufacturer}</td>
          <td>{bike.rimSize}</td>
          <td>{bike.frameSize}</td>
          <td>{bike.color}</td>
          <td>{bike.rented ? 'Rented' : 'Available'}</td>
        </tr>
      ))}
      </tbody>
    </table>
  )
}