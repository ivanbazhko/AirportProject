import React, { useEffect, useState } from 'react'
import axios from 'axios'
import "leaflet/dist/leaflet.css"
import { MapContainer, Marker, TileLayer, Popup } from "react-leaflet"
import { Icon } from "leaflet"

export default function WorldMap() {

  const [coords, setCoords] = useState([]);
  var coords_n

  const getCoords = () => {
    axios
      .get('http://localhost:8080/api/alpinomini/getairportssample')
      .then(response => {
        coords_n = response.data.map(item => item);
        setCoords(response.data)
      })
      .catch(error => {
        console.error(error);
      });
  };

  const home = {
    coord1: 15.0,
    coord2: 15.0,
    name: "ABC Airport",
    country: "None"
  }

  const checkState = () => {
    console.log(coords);
  }

  useEffect(() => {
    getCoords();
  }, []);

  useEffect(() => {
    checkState();
  }, [coords]);

  const homeIcon = new Icon({
    iconUrl: "https://www.iconpacks.net/icons/2/free-airport-location-icon-2959-thumb.png",
    iconSize: [50, 50]
  })

  const customIcon = new Icon({
    iconUrl: "https://cdn-icons-png.flaticon.com/512/6618/6618280.png",
    iconSize: [33, 33]
  })

  return (
    <MapContainer center={[20.0000, 0.0000]} zoom={2}>
      <TileLayer
        attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />

      <Marker position={[home.coord1, home.coord2]} icon={homeIcon}>
        <Popup className="mapPopUp">{home.name},{home.country}</Popup>
      </Marker>

      {coords.map(coord => (
        <Marker position={[coord.coord1, coord.coord2]} icon={customIcon}>
          <Popup className="mapPopUp">{coord.name},{coord.country}</Popup>
        </Marker>
      ))}

    </MapContainer>
  )
}