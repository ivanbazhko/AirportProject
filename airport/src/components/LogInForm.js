import React, { useState } from 'react';

const LoginForm = () => {
    const [loginData, setLoginData] = useState({
        email: '',
        password: '',
    });

    const [errors, setErrors] = useState({
        email: '',
        password: '',
    });

    const handleChange = (event) => {
        const { name, value } = event.target;
        setLoginData({ ...loginData, [name]: value });
    };

    const handleSubmit = (event) => {
        event.preventDefault();

        const emailError = isValidEmail(loginData.email);
        const passwordError = loginData.password.length == 0 ? true : false;

        setErrors({
            email: emailError ? 'Please enter a valid email address' : '',
            password: passwordError ? 'Please enter a password' : '',
        });

        if (!emailError && !passwordError) {
            console.log('Logging in:', loginData);
        };
    };

    const isValidEmail = (email) => {
        console.log(email.length);
        if(email.length == 0) return true
        const regex = /^(([^<>()[\]\\.,;:\s@"]+)@([a-zA-Z0-9-]+).([a-zA-Z]{2,}))$/;
        return !regex.test(email);
    };

    return (
        <div className="login-form">
            <div className='login-form-header'>
                <h2 className='login-form-title'>Log In</h2>
            </div>

            <form className="login-form-body">
                <div className='login-field'>
                    <label className="login-label" htmlFor="email">Email:</label>
                    <input id="email" className="login-input" type="email" name="email" value={loginData.email}
                        onChange={handleChange} />
                    <span className="error-message">{errors.email}</span>
                </div>

                <div className='login-field'>
                    <label className="login-label" htmlFor="password">Password:</label>
                    <input id="password" className="login-input" type="password" name="password" value={loginData.password}
                        onChange={handleChange} />
                    <span className="error-message">{errors.password}</span>
                </div>

                <button className="login-button" type="submit" onClick={handleSubmit}>
                    Log In
                </button>
            </form>
        </div>
    );
};

export default LoginForm;
