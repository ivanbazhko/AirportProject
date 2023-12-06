import React, { useEffect, useState } from 'react'
import axios from 'axios'
import WorldMap from './WorldMap.js'

export default function FlightsPage() {

  const [flights, setFlights] = useState([]);

  const getFlights = () => {
    axios
      .get('http://localhost:8080/api/alpinomini/viewhistory')
      .then(response => {
        console.log("qwertyuiopasdfghjklzxcvbnm")
        const years = response.data.map(item => item.year);
        console.log(years);
        setFlights(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  };

  return (
    <div className="flcontainer">
      <div className="flleft-div">
        <WorldMap />
      </div>
      <div className="flright-div">
        This is the content of the right div.
      </div>
    </div>
  )
}
