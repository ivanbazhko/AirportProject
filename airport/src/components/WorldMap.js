import "leaflet/dist/leaflet.css"
import { MapContainer, TileLayer } from "react-leaflet"

export default function WorldMap() {
  return (
    <MapContainer center={[20.0000, 0.0000]} zoom={2}>
      <TileLayer
      attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
      url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />
    </MapContainer>
  )
}