import React, { useEffect, useState } from 'react'
import axios from 'axios'
import LoginForm from './LogInForm'

export default function AccountPage() {
    return (
        <div className="acccontainer">
            <LoginForm />
        </div>
    )
}
