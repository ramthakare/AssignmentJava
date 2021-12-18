import logo from "./logo.svg";
import "./App.css";
import Header from "./Header";
import NavBar from "./NavBar";
import UserLogin from "./UserLogin";
import { Routes, Route } from "react-router-dom";
import Footer from "./Footer";
import Hello from "./Hello";

function App() {
  return (
    <div className="App">
      <Header />
      <NavBar />
      <Routes>
        <Route path="/Login" element={<UserLogin />} />
      </Routes>

      <Footer />
    </div>
  );
}

export default App;
