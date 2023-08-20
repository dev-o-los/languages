const prompt = require("prompt-sync")({ sigint: true });

let randomNum = Math.round(Math.random() * 100) + 1;

let guessNum = parseInt(prompt("Enter the guess number: "));

while (guessNum != randomNum) {
  if (guessNum > randomNum) {
    console.log("Guess little lower number");
  } else if (guessNum < randomNum) {
    console.log("Guess little higher number");
  }
  guessNum = parseInt(prompt("Enter the guess number: "));
}

console.log("Hurray You won!!");
