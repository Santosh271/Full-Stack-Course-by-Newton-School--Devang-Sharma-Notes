Date : 1st March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React


TODO:
- What is React
- Compnonents
- State
- Render

Installing React
- NPM
- React

Project: 
- Basic Shopping Cart
- Spotify Demo

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



TODO:

- Netflix Clone
- Portfolio Website (All Projects in 1 Page)


- Google Form: Response Till Sunday



Vue, Angular: Framework

REACT:

- Javascript Library
- Used for Building Fast and Interactive User Interfaces
- Facebook (Meta) developed in 2011

Library vs Framework:


Framework:
- Library: UI Components
- Routes
- DB Routes



React:
Library: UI Components, Render(Display)

- Interactive UI
- Fast




Routes: HTTP/HTTPS/SOAP/GRPC
Database Routes: Cassandra/MongoDB/Postgres





Practical Example:



Room:

Hall:
Kitchen:
Washroom:
Washing Machine:



1 BHK = Room + Utilities

BHK : Framework
Room: Library
Utilities: Routes


Framework = Library + Utility







Routes: HTTP/HTTPS/SOAP/GRPC

Practical Example:

Net Banking:


Check Balance:

Click Button --> API Call ---> Bank Server --> Fetch the Latest Balance --> Render in UI

Response:

{
    amount: 10M,
    timestamp: 2022-03-01-04:12PM --> 202203010412,
}


Screen:

Amount: 10M






User:

(1) Search: Jacket

Code ?

(2) Search: Black Jacket

Code?


OP of 2 == Subset of OP 1

Solution:

Filtering


OP:1

{
jac-1: {white}
jac-2: {black}
jac-3: {green}
}



OP:2

{
jac-2: {black}
}


SELECT JACKETS FROM CLOTH WHERE COLOR='BLACK';




- React
- Framework vs Library
- Routes
- FrontEnd/Client
- Backend/Server
- API
- Tech Stack for Web
- Tech Stack for Mobile Devices







---> React Components:


React Application is combination of Components

Component: Piece of UI which will be independent, resuable and isloated in React Application

Combined Components --> React Application


Note:
React Application has atleast 1 Component --> Root
(App.js)

All Other Components are Child Components




Hierarchy:

                              Root
                 Component-1     Component-2   Component-3 
                Component-1_1        




Practical Example:

Twitter:


Home Page: Root
- Profile
- Feed
 - Tweet
 - Likes
 - Comments
 - Retweets


- Trending
- HashTags
- News



Hierarchy:

                                Home Page - Root
                    Profile         Feed        Trending            
                                  Tweet Likes  



---> Install React




-> Install Node and Npm (Node Package Manager) in your System - DONE
(nodejs.org/en/download)

-> Check With: node -v and npm -v

-> Diff between npm create and npx create

-> Steps:

(1) npm install -g create-react-app
(2) npx create-react-app first-app-devang
(3) cd first-app-devang
(4) npm start












Date : 2nd March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React


TODO:
- State
- Render

-> Deep Dive Into First React Application: DONE
-> JSX: DONE
-> SPA and Inspect Element

Installing React
- NPM
- React

Project: 
- Todo List App Using Bootstrap
- Basic Shopping Cart
- Spotify Demo

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





(1) 
  Local:            http://localhost:3000
  On Your Network:  http://192.168.1.217:3000


  Local: LocalHost --> PC
  Network: Any Device Connected Over Same Network - Mobile/Tab/Watch/Screen



(2) Public:
Details Available to Public

- Favicon
- Index.html


(3) Why No Refresh after Change ?

Running a Live Development Server


(4) Remove Comments from HTML and See Page Source

Complete Page is supported by Small Piece of Code, 2 Things:
- div: root --> Complete Code on Body

Index.js --> root--> App.js

Delete this --> Body will be Empty



(5) logo 192:
192x192 px

(6) logo 512
512x512 px









JSX:


Javascript Extension

JSX = JS + HTML


HTML, class="c1"

JSX, className="c1"




Both HTML and JS Supported

 <p>Hey, Its My React App</p> - HTML
 <div>{20+20}</div> - JS


let pname="Devang";
 <div>{pname}</div> - JS




ERROR:

return (
    <h2>React App</h2>
  );



No ERROR
    
    return (
    <>
    <h2>React App</h2>
    </>
  );



Note:
Expected a Wrapper Around Returned Root Component.

Plain HTML/JS Return --> Error







HTML/CSS/JS:

(1) YT Clone
(2) Reddit Clone
(3) Counter App
(4) Netflix Clone
(5) Portfolio - Caraousel of All Projects



Github -> Repo -> Deployed

Repo --> Change --> Live





-> SPA and Inspect Element


Single Page Application

Home: Root
Other Components: Child

Home ---> Footer --> Nav


Page Will Not Be Refreshed After Moving to Other Page

Root -> Child

(1) No Cursor Moving
(2) Right Click --> Page Source Will Not Change After Clicking to Another Nav Bar


Example:

Gmail Application


(1) Open Gmail: Reload

(2) Enter Gmail: 
Inbox -> Primary: No Refresh

Right Click --> Page Source Will Not Change After Clicking to Another Nav Bar



















Date : 4th March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React


-> Deep Dive Into First React Application: DONE
-> JSX: DONE
-> SPA and Inspect Element: DONE

Installing React: DONE
- NPM: DONE
- React: DONE

Project: 

- Todo List App Using Bootstrap
- Bootstrap
- VS Code Extensions
- React Bootstrap
- Named Export Vs Default Export

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Definition of Bootstrap:

Use Cases of Bootstrap:

Installing Bootstrap

Website: https://getbootstrap.com/
Command: npm install bootstrap




Use Bootstrap Nav Bar in React Project

HTML, JS ---> JSX

class --> className
For Non Closing Tags, Add "/" to End









Date : 7th March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React


-> Deep Dive Into First React Application: DONE
-> JSX: DONE
-> SPA and Inspect Element: DONE

Installing React: DONE
- NPM: DONE
- React: DONE

Project: 

- Todo List App Using Bootstrap
- Bootstrap - DONE
- VS Code Extensions - DONE
- React Bootstrap - DONE
- Named Export Vs Default Export

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Component Hierarchy:

                Root
       Header    Footer     Body            
                            Todoitem ListofTodoitem  



Components:


2 Types:

(1) Functional Components

- Used for Passing Values

Command:
rfc


(2) Class Components

- Used for States, Web Hooks and Storing Values

Command:
rcc





Function

void function(paramter)
{
    ....
}


Class

class Main
{
        fun1()
        fun2()
        fun3()
}



Class Component MAY Include Multiple Functional Components


Functional Component:
- Perform a Specific Task


Class Components:
- Perform Multiple tasks
- Storing
- States
- Web Hooks 



Website: Amazon / Flipkart

Home: Root Component
Profile: Component-1
Cart: Component-2


Profile:
- Display Profile of User

Single Task ---> Functional Component



Cart:
- Add Items
- Remove Items
- Keep Track of Items
- Move to Payment Page

Multiple Tasks --> Class Component






----> Functional Components:

(1) RFC: React Functional Component 

- Default Export


CORRECT: import devang from './Components/devang'

export default function devang() {

(2) RAFC: React Functional Arrow Component

- Named Export

CORRECT: import {devang} from './Components/devang'

export const devang = () => {








---> Structure of Project:


(1) Root Component - HOME

(2) Child Components:
- Header
- Footer
- Body
    -- ItemList
    -- Items








JAVA:

void fun1(int a, int b)
{
    
}

main()
{
    fun1(int a, int b);
}

Arguments/Data: int a, int b


REACT:

Functional Component(props)
{
    
}

Root Component()
{
    Functional Component(props);
}

props: Properties

props: Used to Pass Data from One Component to Another Components
      
- Component: Can be Functional/Class Component


Multiple Props: YES

Eg:

<Header title="Devang Todos" alt="abc" img="pqr"/>


Inside Header.js:

{props.title}
{props.alt}
{props.img}




REACT:
      <Header title="Devang Todos"/>
      <Footer/>

JAVA:
      fun1(a)
      fun1()




Need of Prop?

Pass Value from One Component from Second Component

Example:
Buy Now(Black Jacket) ---> Payment Gateway (Black Jacket)



No Prop:

Buy Now(Black Jacket) ---> Payment Gateway 








Date : 8th March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React

Installing React: DONE
- NPM: DONE
- React: DONE

-> Deep Dive Into First React Application: DONE
-> JSX: DONE
-> SPA and Inspect Element: DONE
- Bootstrap - DONE
- VS Code Extensions - DONE
- React Bootstrap - DONE
- Named Export Vs Default Export- DONE

- Destructuring Without Props: DONE
- Strict Checking Using PropTypes: DONE
- Making a Value as Required: DONE
- Default Props and Its Use: DONE

Project: 
- Todo List App Using Bootstrap

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"










Multiple Props: YES

Eg:

<Header title="Devang Todos" alt="abc" img="pqr"/>


Inside Header.js:

{props.title}
{props.alt}
{props.img}



----> Destructuring Without Props

props.title ---> title


props:
- title
- alt
- img



Directly Use title ---> Destructuring


CODE:

export default function Header({title}) -- CORRECT
export default function Header({img}) -- CORRECT
export default function Header({alt}) -- CORRECT


export default function Header(title) -- INCORRECT






----->  Strict Checking/Validation Checking Using PropTypes



Error Handling

String: "Server Error"

Number: 502



Animation:
Youtube with Mobile data off: Monkey



Note:

For a Production Website, 
Its Important to Use Strict Checking so that NO INVALID Values can be passed to My Code.


In React Project, 
If a prop (parameter) is being passed, 
There must be a check for Valid Value.



JAVA Analogy:

int fun(int a)
{
    if (a == null)
     return -1;
    else 
    return a;
}

main()
{
    fun("hi");
}

Compile Time Error: 

Expected int but received String



REACT:

import PropTypes from 'prop-types'

// Strict Checking that Title Must be a String
Header.propTypes = {
  title: PropTypes.string
}


OP:

Warning: Failed prop type: Invalid prop `title` of type `number` supplied to `Header`, expected `string`.
    at Header (http://localhost:3000/main.886c36ab643fbd9806a9.hot-update.js:33:25)
    at App





REACT: Check that Value Passed in Required/ No Empty Value Passed


import PropTypes from 'prop-types'

// Strict Checking that Title Must be a String
Header.propTypes = {
  title: PropTypes.string.isRequired
}


Warning: Failed prop type: The prop `title` is marked as required in `Header`, but its value is `undefined`.






Undefined vs Not Defined

let a;
console.log(a); // Undefined


console.log(c); // Not Defined




----> Default Props and Its Use


JAVA:


switch(char ch)
{
    case '1': ___;
            break;

    case '2': ___;
            break;

    case '3': ___;
            break;

    case '4': ___;
            break;

    default: ___;            
}

ch = 'a';


REACT:

Header.defaultProps = {
    title: "Default Title"
}


If No Value is Passed or Incorrect Value is Passed,
Default Value will be printed.













Date : 9th March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React

Installing React: DONE
- NPM: DONE
- React: DONE

-> Deep Dive Into First React Application: DONE
-> JSX: DONE
-> SPA and Inspect Element: DONE
- Bootstrap - DONE
- VS Code Extensions - DONE
- React Bootstrap - DONE
- Named Export Vs Default Export- DONE

- Destructuring Without Props: DONE
- Strict Checking Using PropTypes: DONE
- Making a Value as Required: DONE
- Default Props and Its Use: DONE

Project: 
- Todo List App Using Bootstrap

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"


Project:

Components
Events
Map
Filter

Hooks
LocalStorage



Theory: (2-3 Days)

State
Hooks





(1) Today: Complete FrontEnd

(2) Tomorrow --> Theory: (2-3 Days)

(3) Projects




App.js: Root

    Todos: (Todos List) Parent

        - Item of Todos: Child
            Each Item: title, desc, Delete



                        Root
          Header  About   Todo   Footer      
                          - TodoItem  








Structuring:

export const Todo = (props) => {
Use as {props.todolist}

Destructuring

export const Todo = ({todolist}) => {



      <Todo todolist={todolist}/>
Passing Array to Todo









                        Root
          Header  About   Todo   Footer      
                          - TodoItem  




Root ----> Todo (Array)  ------> TodoItem (Element of that Array)
main        f1                  f2

JAVA:

int f1(int[] arr)
{
    for (int i:arr)
        f2(i);
}

int f2(int i)
{
return i;
}

main()
{
    int []arr = new int[];
    f1(arr);
}




Warning: Each child in a list should have a unique "key" prop.

Solution: key = {prop.todolist.sno} 



IMP:

Never Use the Passed Value from parent as a Function in Child,
Just Use it as a Value.


onClick={props.onDelete} - Render On Click of Button: CORRECT

onClick={props.onDelete()} - Render On Page Load: INCORRECT








Date : 10th March 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to React

Installing React: DONE
- NPM: DONE
- React: DONE


- Theory of React

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



React: Intro



Installation:

Install npm : One Time

node: node + npm

Create React App Command:
npx create-react-app name


npx: Locally Dependency
npm: Global Dependency

npm: Node Package Manager: List of Modules

node_modules: 1000s of folders

cd name

npm start: Output





REACT:

Library for creating Reusable UI Components.


React Work ?


Virtual DOM

Browser: Original DOM

React -> Virtual DOM -> Changes from Orig DOM -> Do the Changes





            Leetcode

file.py ---> Server      
             test.txt     output.txt

            AC, TLE, etc


Code Editor:
  Writing Code


rm -rf: Delete Everything


Malicious Code: File --> Server : CRASH


Solution:



Code --->     Virtual Servers-1 -->      Main Server
              Virtual Servers-2            
              Virtual Servers-3
              Virtual Servers-4   
            test.txt     output.txt


Virtual Server: Virtualisation: Docker/Kubernetes



5000 People, 1 Server: 10 Request
No of Servers: 5000/10 = 500

http:
https: https + ssl(certification)

Example:

SSL: certification that website is safe

http: Insecured Connection






(3) Creating React Application


Edit: src/App.js (Root Component)


(4) Classes

Class: Blueprint
Object: Instance of Class

Class: Car
Object: Mercedes


Code in React/JS:

class Car
{
    let name;
    constructor(val)
    {
        this.name = val; // name = Ford
    }

    print()
    {
        console.log(name); // Ford
    }

}

const myCar = new Car("Ford");
myCar.print();


class obj;










(5) Arrow Functions


function name()
{
    return "Hey";    
}

name1 = function()
{
    return "Hey1";
}

name2 = () => {
    return "Hey2";    
}

name3 = () => "Hey3";

name4 = (p) => "Hey" + p;


console.log(name()); // Hey
console.log(name1()); // Hey
console.log(name2()); // Hey
console.log(name3); // Hey
console.log(name3()); // Hey
console.log(name4("Devang")); 







OP:


Hey
Hey1
Hey2
[Function: name3]
Hey3
HeyDevang




(6) Variables:


let, var, const


(7) Array Methods


map()

--> Run Function on Each Element in Array, Returning a New Array as result


const arr = [1,2,3,4,5];
const res = arr.map(item => {return item;});

// res = [1 2 3 4 5]
console.log(res); // [1 2 3 4 5] 

// TC:

// arr.map(): O(N)
// item => {return item;} : O(1)


OP: 

[1,2,3,4,5]


For/ForEach: Return Element
Map: Return Array





(8) Destructuring


const arr = ['a', 'b', 'c']

const [p,q,r,s] = arr; // Destructuring
// Array Breaks itself into 3 Parts, Assign it to p,q,r

const first = arr[0]; 
const second = arr[1];
const third = arr[2];
// Array does not break itself

console.log(first);
console.log(p);
console.log(q);
console.log(r);
console.log(s);



React:

Instead of props.title, I use {title}

props
- title
- img
- src
- alt



props.title
props.img
props.src
props.alt



Destructuring:

{title}
{img}
{src}
{alt}





(9) MODULES:

Export

(1) Named Export

Two Options:

(A) Individual Export

export let name = "Devang";
export let age = 22;


(B) Export All At Once

let name = "Devang";
let age = 22;

export {name,age};



(2) Default Export



const msg = () =>{
    let name = "Devang";
    let age = 22;
}

export default msg;



Import:

(1) Named Import - Curly Brackets

import {name,age} from ....


(2) Default Import - No Curly Brackets

import message from .....








JAVA:

int func1()
{
    return 5; // EXPORT
}


int func2()
{
    int res = func1(); // IMPORT
    return res;
}


REACT:

Header.js -> EXPORT

Root: App.js -> Import














