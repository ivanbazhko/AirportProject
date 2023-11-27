import React, {useState} from 'react'
import axios from 'axios'

export default function Header() {

  const [flights, setFlights] = useState([]);

  const handleOurFlightsClick = () => {
    axios.get('http://localhost:8080/api/alpinomini/viewhistorywithtime')
      .then(response => {
        setFlights(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  };

  return (
    <header>
        <div>
            <span className='logo'>
                Airport
            </span>
            <ul className='nav'>
              <li>Account</li>
              <li onClick={handleOurFlightsClick}>Our Flights</li>
              <li>About</li>
            </ul>
        </div>
        <div className='mainlogo'>
        </div>
        {flights.map(flight => (
           <div>
             <p>{flight.year}</p>
           </div>
         ))}
    </header>
  )
}
