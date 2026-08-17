// // document.write("THis is coming from external js")
// let a;
// let x=50;
// // let y=40;
// // let sum=x+y;
// console.log(a);  
// document.write(typeof(a)); 

// // const person ={
// //     name:"jas",
// //     age:20

// // };
// // console.log(person);
// // console.table(person);



// let x=31;
// let y=15;

// x=x+y;
// y=x-y;
// x=x-y;

// const x=12;
// x=11;
// console.log(x);
// console.log(y);


// let x=confirm("continue");
// console.log(x);
// console.log(typeof(x));


// let i=20;

// let x=null;
// console.log(typeof(x));

// let i=10;
// switch (i) {
//     case 0:
//         console.log("zero");
//         break;
//     case 1:
//         console.log("one")
//     case 2: 
//             console.log("Two")
//     default:
//         console.log("i is greater then 2");
// }
// let num = Number(prompt("Enter a number"));

// if (num % 2 === 0) {
//     document.getElementById("result").innerText = "Even";
// } else {
//     document.getElementById("result").innerText = "Odd";
//     }

// let i1=Number(prompt("number1"));
// let i2=Number(prompt("number2"));
// let i3=Number(prompt("number3"));
// if(i1>i2&&i1>i3){
//     console.log("i1 is largest");
// }
// else if(i2>i1&&i2>i3){
//     console.log("i2 is largest")
// }
// else {
//     console.log("i3 is largest");
// }

// let num=Number(prompt("number"));
// let start=Number(prompt("start"));
// let end=Number(prompt("end"));


// if (num >= start && num <= end) {
//     console.log("Number is between start and end");
// } else {
//     console.log("Number is not between start and end");
// }

// let num1 = Number(prompt("Enter first number:"));
// let operator = prompt("Enter operator (+, -, *, /):");
// let num2 = Number(prompt("Enter second number:"));
// let result;
// switch (operator) {
//     case "+":
//         result = num1 + num2;
//         break;
//     case "-":
//         result = num1 - num2;
//         break;
//     case "*":
//         result = num1 * num2;
//         break;
//     case "/":
//         if (num2 === 0) {
//             result = "Cannot divide by zero";
//         } else {
//             result = num1 / num2;
//         }
//         break;
// }
// console.log("Result:", result);
// let name = prompt("Enter your name");
// let email = prompt("Enter your email");
// let city = prompt("Enter your city");

// document.getElementById("data").innerHTML =
//     "<td>" + name + "</td>" +
//     "<td>" + email + "</td>" +
//     "<td>" + city + "</td>";
// let result = "";
// for (let i = 1; i <= 20; i++) {
//     if (i % 2 == 0) {
//         result += "<span style='color: blue; font-size: 22px;'>" + i + "</span> ";
//     }
//     else {
//         result += "<span style='color: red; font-size: 22px;'>" + i + "</span> ";
//     }
// }
// document.getElementById("output").innerHTML = result;
let n = Number(prompt("Enter n:"));

for (let i = 1; i <= n; i++) {
    let row = "";

    for (let j = 1; j <= n; j++) {
        row += j + " ";
    }

    console.log(row);
}