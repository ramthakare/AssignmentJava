import React, { Component } from "react";
import { Link } from "react-router-dom";

export default class UserLogin extends Component {
  render() {
    return (
      <>
        <h1>User Login</h1>
        <button>UserLogin</button>

        <br />
        <br />

        <h1>Admin Login</h1>
        <button>AdminLogin</button>
      </>
    );
  }
}
