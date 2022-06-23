import { useState } from "react";
import "./css/App.css";
import Dice from "./components/Dice";
import axios from "axios";

function App() {
  const [dice, setDice] = useState(0);

  const handleDiceRoll = async (diceFace) => {
    if (diceFace !== 0 && diceFace < 21) {
      const { data } = await axios.get(
        `http://localhost:8080/rolldice/v1/roll?diceFaces=${diceFace}`
      );
      setDice(data);
    }else{
      alert("Invalid dice face")
    }
  };

  return (
    <>
      <Dice handleDiceRoll={handleDiceRoll} dice={dice} />
    </>
  );
}

export default App;
