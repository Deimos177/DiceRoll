import React, { useState } from "react";
import Button from "./Button";
import "../css/Dice.css";


const Dice = ({ handleDiceRoll, dice }) => {
  const [inputData, setInputData] = useState(0);

  const handleDiceFaceChange = (event) => {
    setInputData(event.target.value)
  }

  const handleRollClick = () => {
    handleDiceRoll(inputData)
  }

  return (
    <>
      <div className="container">
        <header>
          <h1>Dice Roller</h1>
        </header>
        <div className="roller">
          <p>
            { dice }
          </p>
        </div>
        <footer className="footer">
          <label>Dice Faces: </label>
          <select onChange={handleDiceFaceChange}>
            <option value="0">0</option>
            <option value="4">4</option>
            <option value="6">6</option>
            <option value="8">8</option>
            <option value="10">10</option>
            <option value="12">12</option>
            <option value="20">20</option>
          </select>
          <Button onClick={handleRollClick}> Roll </Button>
        </footer>
      </div>
    </>
  );
};

export default Dice;
