
// var display = document.getElementById("display");

// function show(value) {
//     display.value = display.value + value;
// }

// function clearDisplay() {
//     display.value = "";
// }

// function deleteLast() {
//     display.value = display.value.slice(0, -1);
// }

// function calculate() {
//     var value = display.value;
//     var answer = eval(value);
//     display.value = answer;

//     }


// const mystring='bat ball'
// let result = mystring.replace('b','c')
// document.write(result);

// const mystring='bat ball'
// let result = mystring.replace(/b/g/ 'c')
// document.write(result);

// console.log(Math.round(4.6)); // 5
// console.log(Math.floor(4.9)); // 4
// console.log(Math.ceil(4.1));  // 5
// console.log(Math.abs(-25)); // 25
// console.log(Math.abs(25));  // 25
// console.log(Math.random());
// console.log(Math.min(10, 5, 20, 3)); // 3
// console.log(Math.max(10, 5, 20, 3)); // 20

// var text = "hello, let s do the coding";
// var newText = "";

// for (var i = 0; i < text.length; i++) {
//     if (i == 0 || text[i - 1] == " ") {
//         newText += text[i].toUpperCase();
//     } else {
//         newText += text[i];
//     }
// }

// console.log(newText);


// let div =document.createElement('div');
// div.id='content';
// div.innerHTML=<p>Create Element Example</p>
// document.body.appendChild(div);
// let div = document.createElement('div');
// div.id = 'content';
// div.innerHTML = '<p>Create Element example</p>';
// document.body.appendChild(div);

// let div = document.createElement('div');
// div.id = 'content';
// let span = document.createTextNode('Create Textnode example');
// span.appendChild(text);
// div.appendChild(span);
// document.body.appendChild(div);


// let div1 = document.createElement('div');
// div1.id = 'div1';

// let div1h2 = document.createElement('h2');
// div1h2.id = 'div1h2';
// div1h2.textContent = 'First DIV element';


// let div2 = document.createElement('div');
// div2.id = 'div2';

// let div2h2 = document.createElement('h2');
// div2h2.id = 'div2h2';
// div2h2.textContent = 'Second DIV element';


// div1.appendChild(div1h2);
// div2.appendChild(div2h2);

// document.body.appendChild(div1);
// document.body.appendChild(div2);
    

// let div = document.createElement("div");
// div.id = "mainDiv";

// let h2 = document.createElement("h2");
// h2.textContent = "Created through JavaScript";

// let marquee = document.createElement("marquee");
// marquee.textContent = "Running Text";

// div.appendChild(h2);
// div.appendChild(marquee);
// document.body.appendChild(div);