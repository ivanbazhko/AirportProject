import Header from "./components/Header"
import Footer from "./components/Footer"
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import FlightsPage from './components/Flights';
import MainPage from './components/MainPage';

function App() {
  return (
    <BrowserRouter>
      <div className="wrapper">
        <Header />
        <Routes>
          <Route path="/" element={<MainPage />} />
          <Route path="/flights" element={<FlightsPage />} />
        </Routes>
        <Footer />
      </div>
    </BrowserRouter>
  );
  return (
    <div className="wrapper">
      <Header />
      <MainPage />
      <Footer />
    </div>
  );
}

export default App;
