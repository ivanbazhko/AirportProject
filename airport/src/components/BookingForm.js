import React, { useState } from 'react';

const BookingForm = () => {
    const [bookingData, setBookingData] = useState({
        destination: '',
        amount: '',
        date: '',
    });

    const [errors, setErrors] = useState({
        destination: '',
        amount: '',
        date: '',
    });

    const handleChange = (event) => {
        const { name, value } = event.target;
        setBookingData({ ...bookingData, [name]: value });
    };

    const handleSubmit = (event) => {
        event.preventDefault();

        const destError = bookingData.destination.length == 0 ? true : false;
        const amountError = !/^\d+$/.test(bookingData.amount) || bookingData.amount <= 0;
        const dateError = isValidDate(bookingData.date);

        setErrors({
            destination: destError ? 'Please enter destination' : '',
            amount: amountError ? 'Amount must be a positive integer' : '',
            date: dateError ? 'Invalid date' : '',
        });

        if (!amountError && !dateError && !destError) {
            console.log('Booking data:', bookingData);
        }
    };

    const isValidDate = (dateString) => {
        if (!dateString) return true;

        const today = new Date();
        const threeMonthsFromToday = new Date();
        threeMonthsFromToday.setMonth(today.getMonth() + 3);
        const yesterday = new Date();
        yesterday.setDate(today.getDate() - 1);
        const bookingDate = new Date(bookingData.date);

        if (bookingDate < yesterday) {
          return true;
        }
    
        if (bookingDate > threeMonthsFromToday) {
          return true;
        }
    };

    return (
        <div className="booking-form">
            <div className="form-header">
                <h2 className="form-title">Booking</h2>
            </div>

            <form className="booking-form-body">
                <div className="form-field">
                    <label className="form-label" htmlFor="destination">Destination:</label>
                    <input type="text" id="destination" name="destination" className='form-input' value={bookingData.destination}
                        onChange={handleChange} />
                    <span className="error-message">{errors.destination}</span>
                </div>

                <div className="form-field">
                    <label className="form-label" htmlFor="amount">Amount:</label>
                    <input type="number" id="amount" name="amount" className='form-input' value={bookingData.amount}
                        onChange={handleChange} />
                    <span className="error-message">{errors.amount}</span>
                </div>

                <div className="form-field">
                    <label className="form-label" htmlFor="date">Date:</label>
                    <input type="date" id="date" name="date" className='form-input' value={bookingData.date}
                        onChange={handleChange} />
                    <span className="error-message">{errors.date}</span>
                </div>

                <button type="submit" className="search-button" onClick={handleSubmit}>
                    Search
                </button>
            </form>
        </div>
    );
};

export default BookingForm;
