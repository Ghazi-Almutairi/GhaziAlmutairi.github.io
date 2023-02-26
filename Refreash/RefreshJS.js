console.log(document.getElementById("Zero").innerText);
var historyJS=document.getElementById("history");
// historyJS.innerText=document.addEventListener("Zero").innerText;
let firstNumber=0;
let secondNumber=0;
let sign=0;
let firstButton=false;
const button = document.querySelector('.buttons');
button.addEventListener('click',function (event) {
    if (firstButton){
        secondNumber= event.target.innerHTML;
        console.log(`secondNumber: ${secondNumber}`);
    }})

button.addEventListener('click',function (event) {
    if (!firstNumber){
        firstNumber= event.target.innerHTML;
        console.log(`firstNumber: ${firstNumber}`);
        firstButton=true;
}})
