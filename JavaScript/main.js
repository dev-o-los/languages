const prompt = require("prompt-sync")({ sigint: true });

console.log("Add Numbers");

let number1 = parseFloat(prompt("Number 1: "));
let number2 = parseFloat(prompt("Number 2: "));

console.log(add(number1, number2));

function add(a, b) {
  return a + b;
}
