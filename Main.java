import java.util.*;

import java.io.*;

/*/
 * Date: 15/12/2021
 * 
 * Data types: primitive and non primitive types - DONE
 * Operators- Done
 * Code for Operators - Done
 * 
 * 
 *  Date: 16/12/2021
 * 
 * Print Arrays - DONE
 * Loops - For, While, Do While- DONE
 * If, Else, Switch Case
 * Questions on Arrays - max and min, sum of all values, multiplication of all values - DONE
 * 
 * 
 * */


public class Main 
{

static int linearSearch(int[] arr, int key)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==key)
            return i; 
    }
    return -1;
}

static void printArray(int[] arr)
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

static int binarySearch(int[] arr, int key)
{
/*
    [1,2,3,4,5]

    middle element= 3
    low = 0, high = n-1= 4
    middle index = 2 = (0+4)/2
    arr[mid] = 3
    Right: No need for left and middle, search in mid+1 to high
    Left: No need for right and middle, search in low to mid-1
*/

    int low = 0;
    int high = arr.length-1;
    int mid;

//    -2 Bn to +2 Bn
//    low = 1.5 Bn, high = 1.5 Bn
//    low = 15000000000000, high = 15000000000000

    while(low<=high)
    {
        mid=(low+high)/2; // 2- Can Cause Overflow
        mid = low + (high-low)/2; // - No Overflow

        if(arr[mid]==key) // key = 3, return 2
            return mid;

        else if(arr[mid] < key) // key = 5, 3<5, Right
            low = mid+1; // Focus: [4 5]

        else // key = 1, 3>1, Left
            high = mid-1; // Focus: [1 2]

    }

    return -1;
}

static int sum_of_digits(int num)
{
int sum = 0;
int rem =0;

while (num>0) 
{
rem = num % 10;
sum = sum + rem; 
num = num / 10; 
}

return sum;
}

static int factorial(int n)
{
int fact = 1;

for (int i =2; i<=n; i++) // Bottom Up Approach
fact = fact*i;

//for (int i =n; i>=2; i--) // Top Down approach
//fact = fact*i;

return fact;
}

static int sumofArray(int[] arr, int n)
{
int i=0;
int sum =0;
for (i=0; i<n; i++)
{
//    sum = sum + arr[i]; // O(sum)- Creating a copy of sum every time
    sum += arr[i]; // O(1) - No Copy Created
//    0 + a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9]
}

return sum;
}

public static void main(String[] args)
{

char a = 'a';
float c = 12.5f;
double d = 32.5;
long e = 1000L;
byte f = 20;
Boolean g = true;
short h = 5;



int p = 10;
int q = 7;

//System.out.println("Values are: " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
//System.out.println(str);
//System.out.println(p+q + " " + (p-q) + " " + p*q + " " + p/q + " " + p%q);
//System.out.println(str + str2);
//System.out.println((p>q) + " " + (p<q) + " " + (p>=q) + " " + (p<=q) + " " + (p==q) + " " + (p!=q));

++p;
--q;
//System.out.println(p + " " + q);

p--;
q++;
//System.out.println(p + " " + q);




int arr[] = {1,2,3,4,5,6,7,8,9,10};
//a[i]: i = 0 to n-1

int n = arr.length;
int i = 1;
for (i = 0; i < n; i++)
{ 
  //System.out.print(arr[i] + " ");
}

///ystem.out.println(" ");

//System.out.println("Sum is:" +  sumofArray(arr, n));


//System.out.println(a[0] + a[1] + a[2] + a[3] + a[4] .....+ a[n-1]);

int mul = 1;

for (i=0; i<n; i++)
{
    mul *= arr[i];
    // mul = mul * arr[i];
}

//System.out.println("Mul is:" +  mul);



//System.out.println(factorial(5));
//System.out.println(factorial(6));

//System.out.println("Sum of Digits: " + sum_of_digits(12345));
//System.out.println("Sum of Digits: " + sum_of_digits(8724282));
//System.out.println("Sum of Digits: " + sum_of_digits(1));


// Unsorted Array
int arr2[] = {5,2,-1,-6,4,3,8,9};
int key = -6;
//System.out.println(linearSearch(arr2, key));



// Sorted Array
int arr3[] = {1,2,3,4,5};
key = 7;

//System.out.println(binarySearch(arr3, key));


i = 1;
do
{
    ++i;
   // System.out.print(i + " ");
} while (i<=10);


i = 1;
while(i<10)
{
    //System.out.print(i + " ");
    ++i;
}



int [][]mat = {{1,2}, {3,4}, {5,6}}; // Initialization
int row = mat.length;
int col = mat[0].length;

/*
1 2 3: mat[0]
4 5 6: mat[1]

mat.length = no of rows = 2
mat[0].length or mat[1].length = no of cols = 3
*/

int j=1;

for (i=0; i<row; i++) // m = rows
{
    for (j=0; j<col; j++) // n = columns
    {
       // System.out.print(mat[i][j] + " ");
    }
   // System.out.println();
}

int sumofMatrix = 0;

for(i=0; i<row; i++)
{
    for(j=0; j<col; j++)
    {
        sumofMatrix += mat[i][j];
    }
}

//System.out.println("Sum of Matrix: " + sumofMatrix);


String str = "devang sharma";

// Indexing: 0-d, 1-e, 2-v, 3-a, 4-n, 5-g, 6-"", 7-s

System.out.println(str);

// str.length() = 6
System.out.println(str.length());

// () - function, [] - array

// str.charAt(idx)
//System.out.println(str.charAt(0));

// String s = sc.next();  From  One Line
// String s = sc.nextLine(); next Line

// str.contains("seq") - True or False

//System.out.println(str.contains("dev"));

// .concat() - Concatenation
//str.concat(" Java");
//System.out.println(str);

//System.out.println(str.concat(" Java"));
//System.out.println(str + " Java");

// str.equals("Java") - True or False

//System.out.println(str.equals("Java"));
//System.out.println(str == "Java");

//"JAVA", "java" : OP - True

//System.out.println(str.equalsIgnoreCase("DEvAnG ShARmA"));

//"devang" - "DEVANG"
System.out.println(str.toUpperCase());


// char: 'a'-'z', 0-9, 'A'-'Z', Special Character

//String str2 = "DevA%*^5678@@*(*@(*@ ShAr";
//System.out.println(str2.toUpperCase());
//System.out.println(str2.toLowerCase());



//str = "devang sharma";
System.out.println(str.indexOf("a"));
System.out.println(str.indexOf("dev"));
System.out.println(str.indexOf("van"));
System.out.println(str.indexOf("k"));
System.out.println(str.indexOf("deo"));


// 3 Methods for Search in a String
// indexOf(), contains() - O(1) Operations
// Travel the String and compare char by char - O(N)

String str2 = "  devang sharma ";
System.out.println(str2.trim());

System.out.println(str2.replace("devang", "Newton"));

}
}











----------------------------------------------------------------

Date: 14/12/2021

Java: Compiled Language

Installed: JDK (Java Development Kit)

JDK = JVM + JRE

JVM = Java Virtual Machine - Compiler
JRE = Java Run Time Environment

"Write Once, Run Everywhere"

javac Main.java: Compile - Empty Line- Successful
Prints Error if any Error

java Main.java: RUN



Variables: Changes value (Roll No.)

Constants: Can't change value (Name)

int a = 10;
System.out.println("Value of a is: " + a);

// System - Class in Java: Console (Environment)
//- IDE, Online Editor 

// out -> Output

// println -> Print on Next Line

// print -> Print on same line

a = 20;
System.out.println("New Value of a is: " + a);

// const int a = 25; - CPP, Py, Go, Perl

final int p = 10; // Java
System.out.println("Value of p is: " + p);

//p = 20;
//System.out.println("New Value of p is: " + p);


DATA TYPE:
Data Type is Identity of any variable or constant


Date: 15/12/2021

2 Types:

(1) Primitive Data Types:

Number, Decimal, Boolean, Char

- char: a-z, A-Z, 0-9: 2 Bytes


char: 'a'-'z', 'A'-'Z', '0'-'9', ',', ;, !: 2 Bytes


char: ASCII: 0-127, 128-255
a: 97
z: 97+25= 

A: 
Z: 

All Programming Language -> Ascii Code -> 1 byte of data: char-> 1 Byte

Java -> UTF-8 (Unicode Values) -> 2 Bytes -> char: 2 Bytes

- char: a-z, A-Z, 0-9: 2 Bytes

'0'- char, 0- int

- byte: 1 Byte (-128 to 127)

- short: 2 Bytes (-2^15 to 2^15-1) = (-32768 to 32767)

- int: 4 Bytes (-2^31 to 2^31-1)

- long: 8 Bytes (-2^63 to 2^63-1)

- float: 4 Bytes (Decimals: 242.65)

- double: 8 Bytes (Decimals: 242.65)

- Boolean: true/false- 1 Bit (0/1) - 0: FALSE, 1: TRUE

int a = 15;


float 223.25 = 223.2500 (4 Digits Precision)
double 223.25 = 223.25000000 (8 Digits Precision)




(2) Non Primitive Data Types:

- String
- Array
- Interfaces





Computer: 0 or 1 (Binary/Bits)

0/1: 1 Bit of data
1 Byte = 8 bits (11111111)
1 KB = 1024 bytes
1 MB = 1024 KB
1 GB = 1024 MB
1 TB = 1024 GB (Terrabye)
1 PB = 1024 TB (PentaByte)
1 ZB = 1024 PB (ZettaByte)



OPERATORS:

(1) Mathematical Operators:

+: Addition
-: Subtraction
*: Multiplication
/: Division (Quotient)
%: Modulus (Remainder)

12 = 7*1 + 5

D = d*q + r

12: Dividend
7: Divisor
1: Quotient
5: Remainder

12 % 7 = 5 

Operator Overloading: 

One Operator behaves differently with different data types. For
Eg: 

+ : 

int: Add the Numbers
String: Concatenate the Strings

5 + 2 = 7 : Add
"dev" + "ang" = "devang" : Concatenate/Merge


(2) Relational Operators: true/false

<: Less Than
>: Greater Than
<=: Less Than or Equal To
>=: Greater Than or Equal To
==: Equal To
!=: Not Equal To


Note:
In Programming,
= : Assignment
==: Equality
!=: Inequality


int a = 10
int b = 20

10 < 20: true
10 > 20: false

if (a == b): false
if (a != b): true


(3) Unary Operators:

One Operand

int a = 10;

--a; // 9

Pre-increment/decrement: ++, --

Increases/Decreases the value by 1 before and then use it

a = 10;

++a; //11
--a; //10

Post-increment/decrement: a++, a--

Use it and then increment/decrement the value

a++; //11
a--; //10


(4) Logical Operators:


&&: AND
||: OR
! : NOT


AND:

1 && 1 = 1
1 && 0 = 0
0 && 1 = 0
0 && 0 = 0

OR:

1 || 1 = 1
1 || 0 = 1
0 || 1 = 1
0 || 0 = 0

NOT:

!0 = 1
!1 = 0


DSA: Data Structure and Algorithms


20 Litres of Water


5 Buckets, Capacity: 10 L



1st Way:
B1- 10L, B2-10L, Rest Empty

2nd Way:
B1-4L, B2-4L, B3-4L, B4-4L, B5-4L

Bucket: Storing Water

Ways: Ways to Store Water

Water: Data
Bucket: Data Structure
Ways: Algorithms




(1) Data Structures:
- Used to Store Data

Array, Linked List, Stacks, Queues, Graphs, Trees, RBT, BST


(2) Algorithms:
- Step by Step Process to Solve the question using Data Structures

Dynamic Programming, Binary Search, Backtracking, Greedy, Recursion 



ARRAY:

10 integers

int a,b,c,d,e,f,g,h,i,j;

1000 integers

Collection of "similar type of data types" stored in a "contiguous location"

[1 2 3 4 5] - YES- Array of Integers

[1 2 p 3 4 q 5] - NO

['a' 'b' 'c' 'd'] - Array of Characters

["devang" "sharma" "newton" "school"]  - Array of Strings

3 Gifts: 

1 Bear: 1 Ft
2 Bear: 2 Ft
3 Bear: 5 Ft

Pack in 1 Package - Height of package ?
= Max(5,2,1) = 5


type name[size];

int a[5];
char a[5];
String a[10];
float a[10];





int a[] = {1,2,3,4,5};
System.out.println(a.length); //5

Size = 5
Indexing: 0 to size-1 : 0 to 4

0 Index: 1, a[0] = 1 
1 Index: 2, a[1] = 2
2 Index: 3, a[2] = 3
3 Index: 4, a[3] = 4
4 Index: 5, a[4] = 5

a[5] = ?- Error- Out of Bound Index

Contiguous/Continuous Location:

int a[] = {1,2,3,4,5};
Index: 0 to 4

int: 4 Bytes

Address of a[0] = 1- Base Address of Array: 1000: ASSUME
Address of a[1] = 1000 + 1*4 = 1004
Address of a[2] = 1000 + 2*4 = 1008
Address of a[3] = 1000 + 3*4 = 1012

................................................................

Address of a[k] = Base Address + k*4


----- 1 ----------- -------- 2 -------- ---- 3 --------
1000 1001 1002 1003 1004 1005 1006 1007 1008



Date: 16/12/2021

(1) Array: DONE
(2) Loops:


Q: WAP to Print Numbers from 1 to 10 in Java

int a[] = {1,2,3,4,5...10}; - 40 Bytes in Memory

System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
....



System.out.println("1");
System.out.println("2");
System.out.println("3");
....


LOOP: 
Same Thing on Repetition

Movie: Inception, Edge of Tomorrow

(1) For Loop 

for (initialisation ; condition ; increment/decrement)
{
    //Code to be executed
}


for (int i=0; i<10; i++)
{
    System.out.println(i);
}

System.out.println(i); //10

Dry Run:

0 1 2 3 4 5 6 7 8 9


for (int i=0; i<=10; i++)
{
    System.out.print(i + " ");
}

System.out.println(i); //11

OP: 

0 1 2 3 4 5 6 7 8 9 10


for (int i=1; ;++i)
{
    System.out.println(i);
}

OP: 
1 2 3 4 5 6 7 8 9 10.........................


int i = 1;
for (; i<10; i++)
{
    System.out.println(i);
}

OP: 1-9


for (int i = 1; i<10; )
{
    System.out.println(i);
}


OP: 
1 1 1 1 1 1 1 1......infinite

int i =5;
for (; ;)
{
    System.out.println(i);
} 

OP: 
5 5 5 5 5 5 5.....infinite

for (int i=0; i<=10; i++)
{
    System.out.print(i + "");
}

OP: 0-10

System.out.println(" ");

for(int i=10;i>=0;i--)
{
    System.out.print(i + " ");
}

OP: 10 -0




WHILE LOOP:


while (condition)
{
    Code to be executed/ Body
    increment/decrement
}

int i =1;
while (i<10)
{
    System.out.println(i);
    i++;
}


OP: 
1 2 3 4 5 6 7 8 9

int i =1;
while ()
{
    System.out.println(i);
    i++;
}

OP: 
1 2 3 4 5 6 7 8 9 10.....infinite

int i =1;
while ()
{
    System.out.println(i);
}

OP: 
1 1 1 1 1 1.......infinite


for, while - Entry Based Loop

DO - WHILE LOOP: Exit Based Loop

do 
{
    body
    increment/decrement
} while (condition);


int i = 1;
do
{
    i++;
    System.out.println(i);   
} while (i<10);


OP: 
2 3 4 5 6 7 8 9 10


int i = 1;
do
{
    i= 1000;
    System.out.println(i);   
} while (i<10); // 1000 < 10: False -> EXIT

OP: 
1000



Q: Print Sum of All Values in an Array


a[] = {1,2,3,4,5}

OP: 15



Q: WAP to Multiply All Values in an Array

a[] = {1,2,3,4,5}

OP: 1*2* 3*4*5 = 60






Date : 20th December 2021 
Mentor: DEVANG SHARMA
Batch: November Batch - 5 
Agenda : Assignment and Coding Questions


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".


Functions:


A Piece of Code which is used to perform a SPECIFIC TASK

Why ?

- Better Modularity: Modules
- Easier Implementation
- Single Point of Failure

Syntax:

[return type] name (parameters)
{
    body

    return value;
}


()- Functions
[]- Arrays




Floor: Bottom
Ceil: TOP


Programming -- English


-5 -4.5 -4 -3 -2 -1 0 1 2 3 4  4.5 4.9 5


-4 < -3
4 > 3

Floor: below: Nearest Left on Number Line

floor(4.5) = 4
floor (4.9) = 4
floor(4.1) = 4
floor(4) = 4

floor(-4.5)= -5
floor (-4.9) = -5
floor (-4.1) = -5

Ceil -> Ceiling: top: Nearest Right on the Number Line

ceil (4.5) = 5
ceil (4.9) = 5
ceil (4.1) = 5
ceil (4) = 4

ceil(-4.5)= -4
ceil (-4.9) = -4
ceil (-4.1) = -4



int n = 9;
int p = n/2; -> 4.5

p = 4

4: integer part, 5: decimal part

floor(9/2) = floor(4.5) = 4 
floor(n/2) = n/2, n>0

p ==  Math.floor(n/2)




int n = -9

int p = n/2; -> -4.5

p = -4

floor(-9/2) = floor(-4.5) = -5
floor(n/2) = -(p +1), n<0



int n = -12
int p = n/2 = -12/62 = -6

floor(-6) = -6



static int focal_length(int  R, char Mirror) 
{
int f = R/2;

if (R%2 ==1 && Mirror == ')')
{
    f = f + 1;
}

if (Mirror == '(')
{
    f = -f;
}

return f;
}


Pseudo Code:

- Convex: f is +ve

ans = n/2

- Concave: f is -ve

if n%2!=0, ans = -(n/2+1)
else ans = -n/2





Question- "FizzBuzz"


for (i=1; i<=N; i++)
{
if (i%3 == 0)
print("Newton");

else if (i%5 == 0)
print("School");

else if (i%15 == 0)
print("NewtonSchool");

else
print(i);
}

N = 15
OP: NewtonSchool

Trick:
Always go from Highest to Smallest

Highest on Top, Smallest on Bottom


Solution:



for (i=1; i<=N; i++)
{

if (i%15 == 0)
    print("NewtonSchool");

else if (i%5 == 0)
print("School");

else if (i%3 == 0)
print("Newton");


else
print(i);
}






Date : 21st December 2021 
Mentor: DEVANG SHARMA
Batch: November Batch - 5 
Agenda : 

- Assignment and Coding Questions- DONE
- Taking Input from user (Scanner Class)- DONE
- Printing Output to user (Print Class)- DONE
- Arrays as Input from User - DONE
- Factorial of a Number- DONE



"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




How to Take Input from User?

static int func(int a, int b)
{
    return (a+b);
}


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework



java

- io (input output)
    - bufferedreader
    - scanner- FOCUS
    - customreader


- util (utility)
    - apiexception
    - collections
    - collectionsframework
    - comparator
    - list
    - map
    - math

- exceptions
    - Arithmetic
    - nullpointer


package    
    - modules
        - classes/interfaces



Take Input from user:


IP: 5

OP: 10

IP: n
OP: 2*n


Scanner Class:


Scanner sc = new Scanner(System.in);


int n = sc.nextInt();
long m = sc.nextLong();
float f = sc.nextFloat();
double d = sc.nextDouble();
String s = sc.next();


System.out.println("")



Scanner sc = new Scanner(System.in);

//int a = sc.nextInt();
//int b = sc.nextInt();
//int c = sc.nextInt();

//System.out.println(a);
//System.out.println(b);
//System.out.println(c);

//System.out.println(a+b+c);

// Take Input of Array



int n = sc.nextInt(); // n = 5
int arr[] = new int[n]; // arr[5]
int i=0;

System.out.println(n);

for (i=0; i<n; i++)
{
    arr[i] = sc.nextInt();
    System.out.print(arr[i] + " ");
    // arr[0] = 1, arr[1] = 2.....
}

System.out.println("");
System.out.println("Sum is: " + sumofArray(arr,n));

String s = sc.next();
char c = s.charAt(0);
char d = s.charAt(1);
char e = s.charAt(2);


System.out.println(c + " " + d + " " + e);



Maximum of K numbers

1, 2, 3, 4, 5,6......k

Max Number = Number greater than other k-1 numbers

?: if
:else


Modification for Max of 3 numbers:

ans = max(c, max(a,b))- Correct

ans = max(a,b,c)- Incorrect

//Max Number = Number greater than other two numbers
int max =0;

if (a>=b && a>=c)
{
max = a;
}

else if (b>=a && b>=c)
{
max = b;
}

else
{
max = c;
}

//System.out.println("Maximum is: " + max);





Two Nos: a, b
int max;

if (a > b)
    max = a;
else    
    max = b;

OR

int max = Math.max(a,b);





Factorial of a Number:

5! = 5*4*3*2*1 = 120
6! = 6*5*4*3*2*1 = 720
7! = 7*6*5*4*3*2*1 = 5040

4! = 4*3*2*1 = 24

n!= n*(n-1)*(n-2)*(n-3)*(n-4)....1

0!= 1


static int factorial(int n)
{
int fact = 1;

for (int i =2; i<=n; i++) // Bottom Up Approach
fact = fact*i;

for (int i =n; i>=2; i--) // Top Down approach
fact = fact*i;

return fact;
}



Outer Loop:

Row: 1 ,2 ,3,4,5: for (i=0; i<5; i++)
i = 0,1,2,3,4

Inner Loop:
Column: 5,4,3,2,1 for (j=n-i; j>=1; j--)

j = 5-0 = 5 = 5-i
j = 5-1 = 4 = 5-i
j = 5-2 = 3 = 5-i
j = 5-3 = 2 = 5-i
j = 5-4 = 1 = 5-i


static void Triangle()
{
int n = 5;

int i=0, j=0;

for (i=0; i<n; i++)
{
    for (j=n-i; j>=1; j--)
    {
        System.out.print("*");
    }
    System.out.println("");
}

}






Q: Calculate Sum of Digits of a number

n = 12345
OP: 1+2+3+4+5 = 15


Approach:
Find Every digit and take the sum


int n = 12345;
int sum = 0;

12345 % 10 = 5 
12345 / 10 = 1234
1234 % 10 = 4 + 5
1234 / 10 = 123
123 % 10 = 3 + 4 + 5
123 / 10 = 12
12 % 10 = 2 + 3 + 4 + 5
12 / 10 = 1
1 % 10 = 1 + 2 + 3 + 4 + 5= 15


num = 12345

int sum_of_digits(int num)
{
int sum = 0;
int rem =0;

while (num) // 12345, 1234, 123, 12, 1
{
rem = num % 10; //5,4, 3, 2, 1
sum = sum + rem; // 5, 9, 12, 14, 15: ANS
num = num / 10; //1234, 123, 12, 1, 0: No Entry in Loop
}

return sum;
}




Date : 23rd December 2021 
Mentor: DEVANG SHARMA
Batch: November Batch - 5 
Agenda : 

- Linear Search - Done
- Binary Search- Done
- Time and Space Complexity- Partial
- CP Trick to Pass All Test Cases (EXTRA)
- Modulo Arithmetic
- Bit Manipulation

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".


Q: Sum of Numbers in Array
Q: Product of Numbers in Array


Q: Average of All Values in an Array
average = sum/arr.length;

Types of Arrays: 

a = [2 5 1 4 3]: Unsorted Array

b = [1 2 3 4 5]: Sorted Array


Searching in Unsorted Array: Linear Search

Q: Return the index of key in array if it exists, else return -1

n elements in an array: 
indices: 0 to n-1


a = [5 2 1 3 4 6 -2]

key = 5
OP: 0

key = 6
OP: 5 

key = -2
OP: 6

key = 8
OP: -1

Approach:

Traverse each value in the array one by one and 
check if arr[i] == key
return i;
else return -1;


Best Case: O(1), key = arr[0]
Worst Case: O(N), key = arr[n-1] or key not present in arr

O(N): Traverse N values in the array- Linear Time 
O(1): No Traversal or Constant Number of Traversals - Constant Time


float ans = 3.14159
System.out.println("%.2f" , ans); // 3.14



Searching in Sorted Array: Binary Search


Q: Return the index of key in array if it exists, else return -1

n elements in an array: 
indices: 0 to n-1


a = [1 2 3 4 5]

key = 1
OP: 0

key = 5
OP: 4 

key = -2
OP: -1

key = 8
OP: -1

Approach:

a, b

a == b
a > b
a < b 

mid = 3

key = a[mid]: Return Mid: 3
key > a[mid]: Search in the right half of the array: 5 > 3: RIGHT, Ignore Left 
key < a[mid]: Search in the left half of the array: 1 < 3: LEFT, Ignore Right



TC and SC:

Time Complexity of Binary Search 
= O(N/2) + O(N/4) + O(N/8) + O(N/16) + O(N/32) + O(N/64) + O(N/128) + .......O(N/2^k-1)

r = 1/2
GP Series
Sum = a(1-r^n)/(1-r)
r < 1

TC = Sum = O(log (base 2) N)

Theoretical:
Master Theorem: Recurrence Relation

T(N) = T(N/2) + C
T(N) = O(log N)

SC: O(1)

Code: DONE




Production Example:

Object_id in E-Commerce: Amazon/Flipkart
Search Bar: "Iphone"

N = 1024
1 search = 1 sec

(1) Object_id in Unsorted Array - Linear Search
O(N) Searches = 1024 seconds = 17 Mins, 4 Sec

(2) Object_id in Sorted Array - Binary Search
O(log N) Searches = O(log (base 2) 1024)= 10 seconds

100 Times Faster

1024/10 = 102.4

2^val = 1024

2^x = 8
x = 3

log(base 2) 8 = 3




Date : 24th December 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 5
Agenda :
 - Compilation: Done
 - Excecution: Done
 - Order of Complexity: Done
 - Time and Space Complexity- Practical Understanding and Meaning, Code - DONE
 - CP Trick to Pass All Test Cases (EXTRA)

 - Modulo Arithmetic
 - Bit Manipulation

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



File- Main.java
- System.out.println("Hello World");

javac Main.java: Compiles and throws error if error, else nothing
java Main.java: Execute/RUNS the program

Time and Space Complexity: Big O Notation



Compiled Languages: 
- Compilation before Execution

Eg: C, C++, Java, Golang, Perl, PHP, C#

Interpreted Languages: 
- Directly Executes the code line by line

Eg: Python, Javascript


Compile:
javac Main.java

Convert Java Code to Byte Code/Machine Code

- Check for Syntax Errors
- Check for Compile Errors
- Allocate Memory to array
- Check for Memory Errors
- Check for Div by 0 Error

int func()
{
    int n = 50;
    int arr[n]; // 200 Bytes of contiguous memory to arr
......
    return arr[0];
}


int : 4 Bytes
Size: 50*4 Bytes
Size: n*4 Bytes of Memory - Main Memory (RAM)

RAM: 4 GB, 8 GB, 12 GB, 16 GB

N = 10000000000
Size =  4*10^10 Bytes = 40 GB of Contiguous Memory: Stack Overflow Error



- Compilation: DONE
- Execution: DONE
- Compiled Languages and examples: DONE
- Interpreted Languages and examples: DONE





Time Complexity: 
Time taken to run a program
/ Execution time for program

Space Complexity:
Memory occupied during program execution


Big O Notation:
Used to define Time and Space Complexity


Order:

O(1) < O(log N) < O(N) < O(N*logN) < O(N^2) < O(N^3) < O(2^N) < O(N!) < O(N^N)

BEST ------------------------------------------------------------------ WORST

Ramesh: O(N)
Suresh: O(NlogN)

Better/Optimised ?

Ramesh - Faster- Better 
Suresh - Slower


Ramesh: O(N)
Suresh: O(logN)

Optimised : Suresh


O(log N), O(N), O(N2)







More than one operations in a single program:

int f1() - Printing an Array
{
    O(N)
}

int f2() - Binary Search
{
    O(log N)
}

Total TC of Program : ?

Ans: Always Highest Complexity (Slowest in Execution) will be the Answer.


O(log N) + O(N^2) = O(N^2)
O(N!) + O(2^N) + O(N) + O(log N) = O(N!)

O(N*logN) + O(N) = O(NlogN)


Eg: Compartments of Train

10 Compartments, Each Compartment is running with a different speed

Speed: 1-10 km/hr

Speed of Train ?

- 1: ANS
- 10
- 5
- Median of 1-10
- None





Eg:

Chain Game:

Free: 6
Team: 1-2-3-4-5

Who will determine the speed of the team ?
1,2,3,4,5 ?

- Slowest Person will determine speed of team


Limiting Reagent: Class 11th Chemistry
Slowest Element Determines the rate of the reaction





How to Find Time Complexity from Code ?


Theoretical Way:
Master Theorem- Recurrence Relation


Practical Way: 

4 Students in Class
Pen is lost
Task: Search for Pen

(1) Make everyone stand in line and search one by one

S1 S2 S3 S4
= 4 Iterations/Traversal

O(N): Linear Complexity: One by one traverse each value
Code: Done

for (i=0; i<n; i++) // O(N)


(2) Ask each person to search for each person

        S1: S1 S2 S3 S4
        S2: S1 S2 S3 S4
        S3: S1 S2 S3 S4
        S4: S1 S2 S3 S4

        Total traversal = 4*4 = 16

        4->N : Searches: O(N*N) = O(N^2):

        Code:

        for (i=0; i<n; i++) // n
        {
            for (j=0; j<n; j++) // n
        }

        TC: O(N^2)


        (3) Cubic:
        All Value will check for all value will check for all value

        for (i=0; i<n; i++) // O(n)
        {
            for (j=0; j<n; j++) // O(n)
        {
            for (k=0; k<n; k++) // O(n)
        }
        }

        TC: O(n*n*n) = O(N^3)

(4) Logarithmic Time

Approach:
Make all stand in one line, search half of them each time

           S1 S2 S3 S4
        [S1 S2]  [S3 S4]
        [S1] [S2] [S3] [S4]

At every point -> divide into half

TC: O(Log N) - Logarithmic Time

Best Approach of 4: 4

BEST: O(log N ) < O(N) < O(N^2) < O(N^3): WORST





CP Trick to Pass All Test Cases (EXTRA)


Constraints:
The Upper Limit/Threshold which will be used to test your code

"Time and Space Complexity required to pass all test cases"

Time Limit:

1 <= arr[i] <= 10000000
1 <= n <= 100000

10 TC : 

1-2 TC: arr[i] = 10000000


Time Limit: 1 sec per TC

1 sec = 10^8 Computations: CONSTANT



1 <= n <= 10^4   O(N^2) = 10^4 * 10^4 = 10^8 Computations: All TC Passed

1 <= n <= 10^5   O(N^2) = 10^5 * 10^5 = 10^10 Computations > 10^8 Computations: Not All TC Passed, TLE (Time Limit Exceed)
7 Passed, 3 TLE

1 <= n <= 10^5   O(N) = 10^5 Computations < 10^8 : All TC Passed




Hiring Contest:
3 Ques: 60 Mins- 90 Mins 


Hackerrank, Hackerearth: 10-15 Vacancies

1000 Candidates

300- Solved All Questions with all TC passed

50-60 : Interview

Select 50 from 300:
- Quicker you solve, Better your rank

CP: Useful






Date: 26th December 2021
Mentor: DEVANG SHARMA

Extra Class: 9-11 PM Sunday IST: 
Agenda: Assignment Questions/DCS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Assignments:





Sample Input:
3

5
1 4 2 4 5

6
1 3 5 7 9 8

7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1: 
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4

How to take t test cases as input ?- DONE

Solution-1 :

int t = s.nextInt();
while (t>0)
{
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i=0; i<n; i++)
    {
        arr[i] = s.nextInt();
    }

    // Code



    t--;
}


Solution-2: 

int t = s.nextInt();
for (i=0; i<t; i++)
{
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i=0; i<n; i++)
    {
        arr[i] = s.nextInt();
    }

    // Code

}





Max 3 Values in Array:

Solutions:

(1) Sort the Array, Take last 3 Values

1 4 2 4 5 -> Sort -> 1 2 4 4 5

Last 3 Values: 5 4 4 : OP

Code: 

Arrays.sort(arr);// O(NlogN)
for (int i = N-1; i>= N-3; i--)
{
    System.out.print(arr[i] + " ");
}

OR

System.out.println(arr[N-1] + " " + arr[N-2] + " " + arr[N-3]);

TC: O(N*log N)

(2) O(N) Approach

Approach: Traversing the Array

Code:

int first, second, third;

for (i=0; i<size; i++) - O(N)
{
    if (arr[i] > first)
    {
        third = second;
        second = first;
        first = arr[i];
    }
    else if (arr[i] > second)
    {
        third = second;
        second = arr[i];
    }
    else if (arr[i] > third)
    {
        third = arr[i];
    }
}

int a = 10; //Left to Right - Incorrect, Right to Left- Correct 
// 10 is assigned to a: CORRECT

O(N) * O(1) = O(N)


Max- New first
first - New second
second - New third
third

first - first
Max - New  second
second- New third
third



DRY RUN:

1 3 5 7 9 8

first=0, second=0, third=0


1>0
first =1, second =0, third = 0

3>1
first = 3, second = 1, third = 0

5>3
first = 5, second = 3, third = 1

7>5
first = 7, second = 5, third = 3

9>7
first = 9, second = 7, third = 5

8<9
first = 9, second = 8, third = 7


Final OP: 9 8 7




TC: arr[] = {0,0,1,8,0,5}

first =0, second =0, third = 0

1>0: 
first = 1, second = 0, third = 0

8>1:
first = 8, second = 1, third = 0

5<8: first will not change
5>1: second and third change

first = 8, second =5, third = 1

Final OP: 8 5 1







Date: 27th December 2021
Mentor: DEVANG SHARMA
Agenda: 
- 1-D Array Assignment Questions (In Class)
- 1-D Array Assignment Questions (Post Class)
- 2-D Array Assignment Questions (In Class)
- 2-D Array Assignment Questions (Post Class)
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



Q: Simple Arrangement

A[i] --> A[A[i]]

Take A[i] = x

A[i] -> val at index "i" in Array = x
A[A[i]] -> Take val of A[i] and use that as index = A[x]

Sample Input
5
4 2 3 0 1 

A[] = [4 2 3 0 1]

i = 0 to 4
A[0] --> A[A[0]] --> A[4]  -> 1 
A[1] --> A[A[1]] --> A[2]  -> 3



Sample Output
1 3 0 4 2





Sample Input
10
9 5 1 4 7 8 0 6 3 2

Solution:

Approach-1: Actually change the array

for (i=0; i<n; i++)
{
    A[i] = A[A[i]];
}

Print the Array


Approach-2: Just Output the values 

for (i=0; i<n; i++)
{
    System.out.print(A[A[i]] + " ");
}


Q: Even and Odd

num % 2 == 0 - EVEN
num % 2 == 1 - ODD


i: index

i % 2 == 0 - EVEN Index
i % 2 == 1 - ODD Index



Q: 1-D Array - [Post Class] - Replace element by Devang Sharma


current element = A[i]
previous element = A[i-1]
next element = A[i+1]

ans = A[i-1] * A[i+1]

if (i == 0)
    ans = A[0] * A[1]

else if (i == n-1)
    ans = A[n-2] * A[n-1]

else
    ans = A[i-1] * A[i+1]










Sample Input :-
5
2 3 4 5 6

Sample Output:-
6 8 15 24 30

Explanation:-
{2*3, 2*4, 3*5, 4*6, 5*6}

Sample Input:-
2
3 4

Sample Output:-
12 12






Q: Buildings

There are N buildings in a row with different heights(H[i]).
You are viewing the buildings from the left and can see the roof of a building, 
if no building to the left of that building has height greater than equal to height of that building.

You are asked the number of buildings whose roofs you can see.

Sample input: 
5
1 2 2 4 3

"Count the Number of values in array such that all values to its left are smaller than iy"


            | 
            | |
        | | | |  
Eye:  | | | | | 
      A B C D E

A: [] - YES
B: [1] - YES, 1<2 (Max)
C: [1 2]- NO, 2==2 (Max)
D: [1 2 3] - YES, 4>2 (Max)
E: [1 2 3 4]- NO, 3<4 (Max)


Total YES = 3 (A, B, D)


Sample output:
3



"First Building Roof Will ALWAYS be visible" - CORRECT
Min Ans = 1


Approach:

(1) Arr Type - LONG
(2) Arr Size - Int
(3) define a current max, count= 0
(4) Traverse Left to Right 
- if current element > current max, count++
- update current max, current max = arr[i]
(5) return count


Q: Increasing array

Increasing Array: [1 2 2 3 3 4 5]
arr[i] >= arr[i-1]


Strictly Increasing Array: [1 2 3 4 5]
arr[i] > arr[i-1]

Sample Input:-
5
1 2 16 16 16 


16: 1, 2, 4, 8, 16

Changed Array:
1 2 4 8 16 - Strictly Increasing

Sample Output:-
YES



Sample Input:-
4
1 3 8 4

8: 1,2,4,8
4: 1,2,4

Changed Array:

1 3 4 4 - Not Strictly Increasing

Sample Output:-
NO



Approach/Trick:

- count number of factors of the number (minimum  = 2)
- if count > a[i], OP: "NO"
- else, OP: "YES"










Date: 28th December 2021
Mentor: DEVANG SHARMA
Agenda: 

- Intro With Batch 4
- 2-D Array Assignment Questions (In Class)
- 2-D Array Assignment Questions (Post Class)
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



Intro to Java: Done
JVM, JRE, Java
Declare Environment Variables
File.java, 
Install Java - Windows, Mac, ubuntu


Data Types: DONE  
int, char, float, double, boolean, String, Long, Short, Byte,

Variables and Constants: DONE




Functions: Not Done

Loops: DONE
for loop
while loop
do while loop

Conditional Statements: DONE
if else
switch case

Take User input using Scanner: Yes
Take Array as input using Scanner : Yes- Revision

Time and Space Complexity:
- How to Calculate Time and Space Complexity
- Compare Complexity with different algos
- Competitive Programming Trick to pass all TC


1- D Array: 

To Do:
2- D Array:
Recursion:

OOPS:





Date: 29th December 2021
Mentor: DEVANG SHARMA
Agenda: 

- Revision for Batch 4 and 5
- 2-D Array Assignment Questions (In Class)
- 2-D Array Assignment Questions (Post Class)
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"








Date: 30th December 2021
Mentor: DEVANG SHARMA
Agenda: 

- Revision for Batch 4 and 5
- 2-D Array Assignment Questions (In Class)
- 2-D Array Assignment Questions (Post Class)
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"








Date: 31st December 2021
Mentor: DEVANG SHARMA
Agenda: 

- Revision for Batch 4 and 5
- 2-D Array Assignment Questions (In Class)
- 2-D Array Assignment Questions (Post Class)
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"








Date: 3rd January 2022
Mentor: DEVANG SHARMA
Agenda: 

- 2-D Array Assignment Questions (In Class)
- 2-D Array Assignment Questions (Post Class)
- Strings and its functions
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




1 D Array:

- What is 1 D Array?
- How to declare 1 D Array
- How to declare 1 D Array with size
- How to declare 1 D Array with size and type
- How to take input
- Questions on 1 D Array- 5, 4 : Not Done


2 D Array:

- 1D, 2D, 3D, 4D, 5D: Dimensions

1D: Line: Only one direction: Horizontal: Left to Right/R to L (Pencil)
2D: Plane: Two Directions: X and Y axis: L to R, U to D (A4 Sheet)
3D: Space: Three Directions: X, Y and Z axis: L to R, U to D, F to B (3D Cube)

1D Array: [1 2 3 4 5]
L to R, R to L


2D Array/Matrix:

[
    [1 2 3 4 5]
    [6 7 8 9 10]
    [11 12 13 14 15]
    [16 17 18 19 20]
    [21 22 23 24 25]
]

L to R, R to L, U to D, D to U

Rows: Horizontal
Columns: Vertical

Size of Matrix: rows * columns

This Matrix: 5x5 Matrix

Matrix: mxn
m = rows
n = columns


Java Code:

Indexing:
Array: 1D: 1 Dimension- 1 Index: 0 to n-1

Matrix: 2D: 2 Dimensions- 2 Index: 
Row: 0 to m-1
Column: 0 to n-1


Rectangular Matrix:
No of rows!= No of Columns
Size = m*n

Square Matrix:
No of rows == No of Columns
size = n*n


int mat[][] = new int[2][3];


int arr[] = new int[5]; // Declaration
arr[] = {1,2,3,4,5}; // Initialization


int a; // Declaration - Blueprint
a = 5; //Definition- Giving Value/Initialization

int a = 5; // Declaration and Definition


int mat[][] = new int[3][2]; // Declaration
mat[][] = {{1,2}, {3,4}, {5,6}}; // Initialization


Syntax: {{}, {}, {}}
Internal {}- m times
{.....n times}- Inside each bracket

Print the Matrix:

m = 3, n = 2


for (i=0; i<m; i++) // m = rows
{
    for (j=0; j<n; j++) // n = columns
    {
        System.out.print(mat[i][j] + " ");
    }
    System.out.println();
}

OP:

1 2
3 4
5 6



[1 2 3 4 5]
arr[0]: 1
arr[1]: 2

...
arr[4]: 5


[[1 2]
 [3 4]
 [5 6]]

 mat[3][3] = Error

Both Row and Col are Mandatory to UNIQUELY Identify an element

mat[0][0]: 1
mat[0][1]: 2
mat[1][0]: 3

First Cell: mat[0][0]
Last Cell: mat[m-1][n-1]



- What is Matrix
- How to declare Matrix
- How to define Matrix
- Traverse a Matrix
- Indexing in Matrix



Address in 2D Array

int mat[row][col];

mat[][] = {{1,2},{3,4}};

total no ints = row * col
total size = (4 * row * col) Bytes in RAM


Memory diagram:


-----1------------- --2----------- ---3---------- -----4-------
1000 1001 1002 1003 1004 1004 1005 







Date: 4th January 2022
Mentor: DEVANG SHARMA
Agenda: 

- Strings and its functions
- Recursion
- Questions on Recursion

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






Transpose of a Matrix:

[1 2 3]
[4 5 6]
[7 8 9]

Indices:

[00 01 02]
[10 11 12]
[20 21 22]

Size = 3x3 matrix 

Transpose of Matrix:

A'[i][j] = A[j][i]


1 4 7 
2 5 8 
3 6 9


Eg: 3

Index of 3 in Original Matrix: mat[0][2]
Index of 3 in Transpose Matrix: mat[2][0]


Properties:
(1) Element at i,j-> j,i
(2) Primary Diagonal Elements remains same




Q: Given a Matrix, Find the Transpose of the Matrix


IP:


[1 2 3]
[4 5 6]
[7 8 9]

OP:

1 4 7 
2 5 8 
3 6 9



Two Ways:

(1) Using Extra Memory

- Create another matrix[col][row]
- mat[i][j] = orig[j][i]

TC: O(m*n)
SC: O(n*m)- Extra Matrix

(2) Without Using Extra Memory

- Print the Original Matrix without modifying it

Transpose:
for (i=0; i<m; i++)
{
    for (j=0; j<n; j++)
    {
        System.out.print(orig[j][i] + " ");
    }
    System.out.println();
}










"Strings"


String: Array of characters

char[] ch = {'d','e','v','a','n','g'};
String s = new String(ch);

OR

String s = "devang";



Date: 5th January 2022
Mentor: DEVANG SHARMA
Agenda: 

- Assignment Questions: 

2 D Arrays (In Class)- DONE
- Max sum column
- Diagonal Sum

2 D Arrays (Post Class)- DONE
- Good cells
- A Boolean Matrix Problem
- Row with maximum 1's

'\0' - Null Character

- Recursion
- Questions on Recursion
- Factorial - Recursion
Power function


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Q: Given two strings a and b, check if a is substring of b?


a = "dev"
b = "devang"

OP: True

a = "dvg"
b = "devang"

OP: False


Solutions:

(1) Brute Force:

a = "dev": 3
b = "devang": 6
Total: 18 Time

b: d-0, e-1, v-2
a: d-0, e-1, v-2

a[0] == b[0], a[1] == b[1], a[idx]= b[idx]


CODE:

boolean checkSubstring(String a,String b)
{
for (i=0; i<b.length(); i++)
{
    for (j=0; j<a.length(); j++)
    {
        if (a.charAt(j) != b.charAt(i+j))
        {
            break;
        }
    }
    if (j == a.length())
    {
        return true;
    }
}

return false;
}




TC: O(n*m)
SC: O(1)

n: length of a
m: length of b



for (i=0; i<3; i++)
{
    for (j=0; j<4; j++)
    {
        System.out.println(i + " " + j);
    }
}

0: 0,1,2,3
1: 0,1,2,3
2: 0,1,2,3




(2) b.contains(a)

TC: O(1)

(3) 

if (b.indexOf(a)!=-1)
{
    return true;
}
else
{
    return false;
}

TC: O(1)





NOTE: Substring vs Subsequence vs Subset


Substring: String
Subarray: Array

(1) Smaller Part of a String
(2) MUST BE Contiguous 
(3) Order Must be Maintained


"devang"

- "dev": YES
- "ang": YES
- "eva": YES
- "dvg": NO 
- "devang": YES
- "ved": NO
- "dve": NO
- "d", "e", "v", "a", "n", "g": YES

Subsequence:
(1) Smaller Part of a String
(2) NEED NOT BE Contiguous
(No issues if contiguous)
(3) Order Must be Maintained


"devang"

- "dvg": YES
- "dev": YES- Also a substring
- "devang": YES
- "ved": NO
- "dve": NO
- "d", "e", "v", "a", "n", "g": YES




Subset:
"ANY COMBINATION OF STRING"

(1) Smaller Part of a String
(2) NEED NOT BE Contiguous
(3) Order Need Not be Maintained

"devang"

- "dev": YES
- "dvg": YES
- "dgv": YES
- "ved": YES



Subset: Universal Set
- Subsequence: Superset
    - Substrings: Subsets

"All Substrings are Subsequences and All Subsequences are Subsets"




2D Array Questions

- In Class
- Post Class









// 3 Methods for Search in a String
// indexOf(), contains() - O(1) Operations
// Travel the String and compare char by char - O(N)






Given a boolean matrix of size N*M in which each row is "sorted" your task is to print the index of the row containing maximum 1's. 
If multiple answer exist print the smallest one.

Input
First line contains two space separated integers denoting values of N and M. Next N lines contains M space separated integers depicting the values of the matrix.

Constraints:-
1 < = M, N < = 1000
0 < = Matrix[][] < = 1


Output
Print the smallest index (0 indexing) of a row containing the maximum number of 1's



Sample Input:-
3 5
0 1 1 1 1
0 0 0 1 1
0 0 0 1 1


Row index ---- No of 1
0: 4
1: 2
2: 2

Max = 0


Sample Output:-
0




Sample Input:-
4 4
0 1 1 1
1 1 1 1
0 0 1 1
1 1 1 1




Row index ---- No of 1

0: 3
1: 4
2: 2
3: 4

Max = 1,3, Min of 1,3 = 1- Ans


Sample Output:-
1





Solutions:


(1) Brute Force:

- Travel All Cells.
- Keep track of number of 1's in each row.
- Find the row with maximum 1's.
- Print the row index.

TC: O(N*M)


(2) Optimized One

- calculate no of 1 in each row

"No of 1 in row = No of Column- First Occurences of 1"



No of Column = 5

No of 1 in row 0 = 5 - 1 = 4
No of 1 in row 1 = 5 - 3 = 2
No of 1 in row 2 = 5 - 3 = 2

0 1 1 1 1: O(log N)
0 0 0 1 1: O(log N)
0 0 0 1 1: O(log N)

TC: M* O(log N)

M = Rows
N = Cols

M*O(log N) <  O(M*N)
Better       Brute Force

Row index ---- No of 1
0: 4
1: 2
2: 2

Max = 0









Interview Tactics:

- Sorted Values: Binary Search and Two pointer
- Largest/Smallest/Maximum/Minimum: Dp
- Check all possible Paths: Backtracking
- Reverse: Stack, if space allowed
- Reverse: Use DFS, if space not allowed




Adjacent Cells and Direction




1 2 3
4 5 6
7 8 9

Size: 3x3


Standing at 5: [1][1]
Adjacent: 2,8,4,6

Up: 5->2: [1][1]-->[0][1]
Row is decreased by and column is same

mat[i][j] ---> mat[i-1][j]

Down:

mat[i][j] ---> mat[i+1][j]


Left:

mat[i][j] ---> mat[i][j-1]


Right:

mat[i][j] ---> mat[i][j+1]


Adjacent of mat[i][j]

- mat[i-1][j]
- mat[i+1][j]
- mat[i][j-1]
- mat[i][j+1]







Date: 6th January 2022
Mentor: DEVANG SHARMA
Agenda: 

- Assignment Questions: 


- Recursion
- Questions on Recursion:

- Fibonacci
- Sum of Product of Digits of a given number
- Sum of digits of a number
- Factorial - Recursion
- Power function


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





RECURSION:

Inception, Edge of Tomorrow

Dream -> Dreamer -> Dream.......

Wake - Die - Repeat



Factorial of a Number

n! = n * (n-1) * (n-2) * ... * 1

6! = 6 * 5 * 4 * 3 * 2 * 1 = 720 = 6 * 5!
5! = 5 * 4 * 3 * 2 * 1 = 120 = 5 * 4!
4! = 4 * 3 * 2 * 1 = 24 = 4 * 3!
3! = 3 * 2 * 1 = 6 = 3* 2!
2! = 2 * 1 = 2
1! = 1 = 1

n! = n * (n-1)!
fact(n) = n * fact(n-1)


Recursion:

A Function which calls itself inside its definition

_ func()
{
    func();
}



void printName(string name)
{
    System.out.println(name);
}

public static void main(String[] args)
{
    printName("Devang");
}

- Not A Recursion


main()
{
    printName();
}


void printName(string name)
{
    System.out.println(name);
    printName();
}

- Yes, Recursion

printName()
{
    printName();
}




Eg:


fact(n) = n* fact(n-1)

int factorial(int n)
{
        return n * factorial(n-1);
}

for (i=1; ; i++)
{
    factorial(i);
}

N = 5
factorial(5);


factorial(5) = 
5 * factorial(4) =
 5 * 4 * factorial(3) = 
 5 * 4 * 3 * factorial(2) = 
 5 * 4 * 3 * 2 * factorial(1) =
    5 * 4 * 3 * 2 * 1 * factorial(0) = 
    5 * 4 * 3 * 2 * 1 * 0 * factorial(-1) .....infinite times


Base Condition:
Condition to stop the recursion



CORRECT CODE:

0!= 1
1!= 1

int factorial(int n)
{
    if(n == 0 || n == 1)
    {
        return 1; // Base Condition
    }
    else
        return n * factorial(n-1);
}

N = 5
factorial(5);

N = 0
factorial(0);

Constraints:

0<= N <=100
1<= N <=100

factorial(5) = 
5 * factorial(4) =
 5 * 4 * factorial(3) = 
 5 * 4 * 3 * factorial(2) = 
 5 * 4 * 3 * 2 * factorial(1) = 5*4*3*2*1 = 120




 Memory Diagram:


 javac Main.java: Compile: No Error, Moves to the Next Line
 Any Error - Print the Error
 java Main.java: Execution/Run


 Compile:

 Check for Syntax Error
 All Values are declared
 Allocates Memory to Static data structures

Main.java --> Main.class (Byte Code)



Execution/Running:
- Runs the Program and Gives Output







int factorial(int n)
{
    if(n == 0 || n == 1)
    {
        return 1; // Base Condition
    }
    else
        return n * factorial(n-1);
}

When does the Compiler Knows that its a recursion ?
- Compile Time
- Run Time: YES

int arr[10]; // Stack
int arr[] = new int[10]; // Heap


Memory:

Compile Time: STATIC: Stack- Arrays: In Memory

Run Time: DYNAMIC : Heap- Recursion: Auxiliary Memory


int arr[10];// 40 Bytes- STACK
Compile: Allocate 40 Bytes of Memory to arr

int arr[100000000000] //4*10^10 Bytes = 40 Gb


RAM = STACK + HEAP
    200 MB   200 MB

RAM: 4 Gb/8 Gb



int factorial(int n)
{
    if(n == 0 || n == 1)
    {
        return 1; // Base Condition
    }
    else
        return n * factorial(n-1);
}

New Value/Operation are stored on the top

N= 5
Recursion Stack:

factorial(1)
factorial(2)
factorial(3)
factorial(4)
factorial(5)


Recursion Stack > Allocated heap Memory:
-- STACK OVERFLOW

Eg: Without Base Condition

SC: In memory

SC of Recursion Code : 
O(1) In memory
O(N) Auxiliary Memory - Recursion Stack

for (i=0; ; i++) - TLE
{
Memory - No Impact
}

func()- (recursion) Stack Overflow occupied in Heap
{
    func()- Memory Will be Out
}





FIBONACCI SERIES

0 1 1 2 3 5 8 13 21....

3rd = 1st + 2nd
4th = 3rd + 2nd
5th = 4th + 3rd

nth term = (n-1)th term + (n-2)th term

func(n) = func(n-1) + func(n-2)

int fibbo(int n)
{
    if (n==0)
    return 0;

    if (n==1)
    return 1;

    if (n<=1)
    return n;

    return fibbo(n-1) + fibbo(n-2);
}



Sum of Digits:

int sum =0;
while (n>=0)
{
    sum+= n%10;
    n/=10;
}

"Same Operation happened on n will happen on n/10": else part
"Base Condition- n becomes 0": if part- Base Condition

RECURSION:

int sum(int n)
{
    if (n==0)
    return 0;

    return n%10 + sum(n/10);
}



N = 12345
Sum = 15

12345 = 5*10^0 + 4 * 10^1 + 3 * 10^2 + 2 * 10^3 + 1 * 10^4


1+2+3+4+5 = 15: NO

5+4+3+2+1 = 15: YES


N = 12345

To Extract 1?
1, 2345
2, 345, 
3, 45


"12345" -> "1" + "2345"
"1"-1

val*10^n




12345 = 1234 , 5

12345 % 10 = 5
12345/10 = 1234



Q: Sum of Products of Digit

06, 34

Sum = (0*3) + (6*4) = 24


6*4
0*3


int solve(int n1,int n2)
{
    if (n1<10 && n2<10)
    return n1*n2;

    return (n1%10)*(n2/10) + solve(n1/10, n2/10);
}




Date: 7th January 2022
Mentor: DEVANG SHARMA
Agenda: 

- Assignment Questions: 


- Recursion and Search
- Questions on Recursion:

- Searching an element in a sorted array: DONE
- Minimum Element in Sorted and Rotated Array: DONE
- Square Root Of an Integer: DONE

- Stacks And Queues

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"


Iteration 
Recursion

Can All Iterative Code be converted to Recursion ?

- All: YES
- Only

Can All Recursive Code be converted to Iterative ?

- All: YES
- Only




Square Root:


x*x = n

3*3 = 9

n = 9
OP =  3

n = 8 = 2.768
Expected OP: 2 since floor(2.768) = 2
Actual OP: -1

int squareRoot(int n)
{
for (i=1; i<n;i++) // O(N)
{
    if (i*i == n) 
    return i;
}
return -1;
}

TC: O(N)
SC: O(1)

N = 8
OP: 2

int squareRoot(int n)
{
int res=0;
for (i=1; i<n;i++) // O(N)
{
    if (i*i <= n) //1,2
    res = i; //2
}
return res; //2
}

TC: O(N)
SC: O(1)



N = 8
OP: 2

int squareRoot(int n)
{
int res=0, i=0;
for (i=1; i*i<=n;i++) // O(sqrt(N))
{
    res = i; //1,2
}

//i = 3, res = 2

return res; - CORRECT
return i; - INCORRECT
}

TC: O(sqrt(N))
SC: O(1)
 


BINARY SEARCH


n = 8

Numbers less than equal N:


Using Binary Search:

N = 8

int squareRoot(int n)
{
    int start = 1;
    int end = n;

    while(start<=end)
    {
        int mid = (start+end)/2;

        if(mid*mid == n)
        return mid; // perfect square

        if(mid*mid < n)
        start = mid+1;

        if(mid*mid > n) // 3*3>8
        end = mid-1; //3-1 = 2
    }

    return end; // res = i-1 after for loop
}

TC: O(log N)
Sc: O(1)




What ? (Problem)
Why ? (NEED/Application)
How ?(Coding/Implementation)


Stacks And Queues



STACK:


Use Case: Most Recent Use Element in O(1) Time
LIFO Order: 
LIFO: Last in First Out

OPEN

__5__: PICK: TOP 
__4__
__3__
__2__
__1__



Real Life Example:
Packet of Bread


Breads are placed one above the other in a stack.

First Bread: Top of Packet

5 Breads: 1 to 5
5th bread on top - Open the packet- Access the 5th Bread First
(Last in First Out)

O(1): Constant Time Complexity

N = 100
N = 10^9 - No Difference













Date : 9th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda :

 - Compilation: DONE
 - Execution: DONE
 - Order of Complexity: DONE
 - Time and Space Complexity- Practical Understanding and Meaning, Code - DONE
 - CP Trick to Pass All Test Cases (EXTRA)- DONE


 - Modulo Arithmetic
 - Bit Manipulation

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




File - Main.java
- System.out.println("Hello World");

javac Main.java: Compiles and throws error, if error
                    else nothing
java Main.java: Runs the program



Compilation:

javac Main.java


Convert Java Code to Byte Code/Machine Code:
Main.java -> Main.class

- Check for Syntax Error
- Check for Compilation Error
- Allocate Memory to the Array
- Check for Memory Overflow
- Check for Stack Overflow
- Check for Div by 0 Error


int func()
{
    int n = 50;
    int a[n]; // 200 Bytes of Contiguous Memory: RAM 
}


Problem:

int func()
{
    int n = 10000000;
    int a[n]; // 4*10^7 Bytes of Contiguous Memory: RAM~= 400 MB
}
Stack Overflow Error


RAM: 4 GB/8 GB

Memory Diagram:

4 GB
 

          200 MB                   200 MB
     1 GB       200 MB       500 MB           1 GB
....XXXXXX.....XXXXXX........XXXXXX.........XXXXXX.......
     Chrome      Spotify       VLC           Visual Studio

.: FREE
X: Occupied


Linked List: Non Contiguous Memory

Execution:
Runs the Program, Takes the Byte Code and Executes it






Compiled Languages:
- Compilation before Execution

Eg: C, C++, Java, Golang, Perl, PHP, C#

Test your code before running


Interpreted Languages:
- Directly Executes the Code line by line

Eg: Python, Javascript

Directly run your code on production



int func()
{
    System.out.println("Hello World");
    int a = 5/0;
}



Time and Space Complexity:


Time Complexity:
Time Taken to run a program/
Execution Time for Program


Space Complexity:
Memory Occupied during Program Execution


Same Java Code:

M1 MAC Pentium 5: 100 ms
Windows Quad P4: 100 ms ?- NO
Ubuntu Quad Core P5 : 100 ms- NO

Memory during Execution Time:

M1 MAC Pentium 5: 100 Bytes
Windows Quad P4: 100 Bytes ?- NO
Ubuntu Quad Core P5 : 100 Bytes- NO


Problem:

No specific time (ms/microseconds) and space(bytes) defined for piece of code.


Solution:

Something Standard/Notation is Required which Every Developer will follow to 
setup a common standard.


BIG O Notation:
Every Developer Knows and Follows the Big O notation.
Used to define the Time and Space Complexity


TODO:

(1) Compare different algos based upon order- DONE
(2) Arrange Algos in Order - DONE
(3) Final Complexity of code with different complexities in functions- DONE
(4) How to find complexity of code in O Notation - DONE


ORDER:

O(1) < O(log N) < O(N) < O(N*log N) < O(N^2) < O(N^3) < O(2^N) < O(N!) < O(N^N)

BEST ------------------------------------------------------------------- WORST
FAST -------------------------------------------------------------------- SLOW

Trick to Remember: N = 8

Ramesh: O(N)
Suresh: O(NlogN)

Faster ?

Ramesh- Faster/Optimised/Better


Ramesh: O(N)
Suresh: O(logN)

Optimised: Suresh


BEST:O(log N) < O(N) < O(N^3): WORST
     FASTEST       SLOWEST




More than One Operations in a Single Program with Different Complexities:


int f1() - Linear Search
{
    O(N)
}

int f2() - Binary Search
{
    O(log N)
}

Total TC of Program ?

TC = O(N) + O(log N) = O(N) since O(N) >>>>>> O(logN)

N = 1024
O(N) = 1024
O(log N)= 10

1024 + 10 ~= 1024


Ans: ALWAYS Highest Complexity (Slowest in Execution) will be the Answer



O(logN) + O(N^2) = O(N^2)
O(N!) + O(2^N) + O(N) + O(logN) + O(N^2) = O(N!)





IMP:
How to Find Time Complexity from Code?


"Always Find Complexity from Approach, Not from Code"



Theoretical Way:
Master Theorem- Recurrence Relation


Practical Way:

4 Students in Class
Pen is Lost

Task: Search for Pen

(1) Pen found in My Pocket

O(1) Notation: Constant Time

CODE:
key = arr[0]


(2) Make everyone stand in line and search one by one

S1 S2 S3 S4
= 4 Iterations/Traversal

O(N): Linear Time Complexity: One by One traverse each value

CODE:
for (i=0; i<n; i++) // O(N)

(3) Ask Each Person to search for each other person

S1: S1 S2 S3 S4
S2: S1 S2 S3 S4
S3: S1 S2 S3 S4
S4: S1 S2 S3 S4


Total Traversal = 4*4 = 16

4->N: Searches = O(N*N) = O(N^2)

CODE:

for (i=0; i<n; i++)  // O(N)
{
    for (j=0; j<n; j++) // O(N)
    {
        // 
    }
}

TC: O(N^2)

Pattern Printing, Triangle


(4) Cubic:

All value will check for all values will check for all values


for (i=0; i<n; i++) // O(n)
{
    for (j=0; j<n; j++)  // O(n)
    {
        for (k=0; k<n; k++) . // O(n)
        {
            // 
        }
    }
}


TC: O(N*N*N) = O(N^3)

for (i=0; i<n;i++)
O(N)

for (i=0; i<n/2; i++)
O(N/2)

for (i=0; i<n; i+=2)
O(N/2)

[1 2 3 4 5 6]
index: 0 to 5

for (i=0; i<5; i+=2)

0, 2, 4: 3 Times




(5) Logarithmic Time: 

Approach:

Make All Stand in One Line, Search Half of them each time

                S1 S2 S3 S4
             [S1 S2]   [S3 S4]
            [S1] [S2] [S3] [S4] 

At Every Point --> Divide into Half

TC: O(log N) - Logarithmic Time






BEST: O(1) < O(log N) < O(N) < O(N^2) < O(N^3)


Space Complexity Trick:
- Array
- Stack
- Queue
- Map
- Set

O(N) Space in In Memory

Recursion: O(N) Space in Auxiliary Space





CP Trick to Pass All Test Cases (EXTRA)


CP: Competitive Programming


Constraints:

The Upper Limit /Threshold which will be used to test your code

"Time and Space Complexity Required to Pass all test cases"


1 <= arr[i] <= 1e8
1 <= n <= 1e5

arr[i] = 1e3;

arr[i] = 1e9; // No

10 TC:

1-2 TC: arr[i] = 1e8



Time Limit: 1 sec per TC

1 sec = 10^8 Computations: CONSTANT
(Irrespective of Platform)


1 <= N <= 10^4   O(N^2) = 10^4*10^4 = 10^8 Computations: All TC Passed

1 <= N <= 10^5   O(N^2) = 10^5*10^5 = 10^10 Computations> 10^7 Computations
                                    = Not All TC Passed, TLE (Time Limit Exceed)
                                    Eg: 7 Passed, 3 TLE


1 <= N <= 10^5   O(N) = 10^5 Computations: All TC Passed




Hiring Contest:

3 Ques: 60-90 Mins

Hackerrank, Hackerearth : 10-15 Vacancies

1000 Candidates

300 - Solved All Questions with All TC Passed

50-60 : Interviews


Select 50 from 300 :
- Quicker you solve, Better you rank


CP: Useful









Date : 10th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda :

 - Compilation: DONE
 - Execution: DONE
 - Order of Complexity: DONE
 - Time and Space Complexity- Practical Understanding and Meaning, Code - DONE
 - CP Trick to Pass All Test Cases (EXTRA)- DONE

- Stacks- DONE
- Queues- DONE

- Mock Interviews


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Applications of Stack:

(1) Ctrl + Z: Undo
Ctrl + Y: Redo

"devang"
"sharma"

Operations in Stack

Real Life Example:
"bahubali" in keyboard, Press Ctrl + Z and then Ctrl + Y to see.

Use of Storing to temp value after popping from stack -- Restore


1
2
3
4
5- Recent

Stack:

5- Top- Delete: Ctrl + Z . ---> 4 ---> redo: Ctrl + Y -->  5
4       (temp)                  3    stack.push(temp)      4
3                               2                          3
2                               1                          2
1                                                          1                                                               


5: variable-temp

Ctrl + Z:
stack.pop()

Ctrl + Y:
stack.push(temp)



(2) Browser History

Github: 6:30 AM
Linkedin: 6:35 AM
Medium: 6:40 AM

History:

Medium
Linked
Github

Stack

(3) Recursion:

void add(c)
{
    add(c+1);
}

Recursion Stack

(4) Memory management techniques
(5) Graphs Algo:

DFS- Stacks
BFS- Queues


HOW ?


JAVA:

Stack<Integer> stack = new Stack<Integer>();
// Insert
stack.push(1);
stack.push(2);
stack.push(3);

System.out.println(stack);
System.out.println(stack.pop());
System.out.println(stack.top());

int size = stack.size();



Complexity of Operations:

Insertion: TOP
Deletion: TOP

(1) Push - Add Item
Stack == Full
"OVERFLOW"

- Stack Overflow

(2) Pop - Remove Item
Stack == Empty
"Underflow"

(3) Top - Get Top Item
Gives you Top Element  

(5) s.empty()- true/false
Empty or Not

bool empty()
{
    if (s.peek() == null)
    {
        return true;
    }
    else
    {
        return false;
    }
}





(1) Push: O(1)
(2) Pop: O(1)
(3) Top: O(1)
(4) Size: O(1)
(5) IsEmpty: O(1)
(6) IsFull: O(1)
        System.out.println("Size: " + queue.size());





What, Why, How?        

QUEUES:

Use Case: Get Least Recently Used Element in O(1) Time

First In First Out
FIFO

First Inserted == First Deleted
FCFS: First Come First Serve


   New R...............S.F: SBI Counter

   Insertion: Rear             Deletion: Front  
   (ENQUEUE)                       (DEQUEUE)



F.........R = First In First Out



Operations:

(1) Enqueue: Insertion
- At Rear

If Queue == FULL
"OVERFLOW"

TC: O(1)

(2) Dequeue: Deletion
- At Front

If Queue == EMPTY
"UNDERFLOW"

TC: O(1)

(3) Front: Get Front Element
(4) Rear: Get Rear Element

(5) q.empty()- true/false
Empty or Not

Check if q.front() == null
return true;
else
return false;

(6) q.size()- Size of Queue



Complexity:

    
    (1) Enqueue: O(1)
    (2) Dequeue: O(1)
    (3) Front: O(1)
    (4) Rear: O(1)
    (5) IsEmpty: O(1)
    (6) IsFull: O(1)



    Space Complexity of Queue: O(N)



Applications:


(1) LRU Cache

[F:1 2 3 4 5: R]

(2) OS: Threads
CPU Scheduling


CPU: Threads -> Queues(FIFO)

Why Queue, Not Stack?

Login to your PC:

5 Operations: [Chrome, VLC, Spotify, VSC]

Queue: [Chrome, VLC, Spotify, VSC]: ANS
Stack: [VSC, Spotify, VLC, Chrome]













Date : 11th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : OOPs in JAVA

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".


- Intro to Java
- Loops and Conditional Statements
- Data Types and Operators
- Arrays: 1 D  
- Arrays: 2 D
- Stacks
- Queues
- Time and Space Complexity
- CP Trick
- Strings
- Recursion
- Functions
- Searching Algos (Linear and Binary Search)


- OOPs
- Sorting Algos



OOPs


Object Oriented Programming

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction


Classes
Objects


Object:
Any Single Entity

Eg: BMW 500s, Trimax


Class: (Blueprint of Objects)
Collection of Objects


Eg: BMW Bikes, Pen


CODE:

Scanner sc = new Scanner(System.in);

Scanner = Class
sc = Object


System: Class: Environment: 
            IDE/Online Editor

.in: Input
.out: Output





- Encapsulation

Capsule: Mixing of Ingredients

Data Members: data to work on

int a = 10;
String name = "devang";


Data Functions/Methods: Used to perform operations on data

String printName(name)
{
    return name;
}



{
    data + function
}
= CLASS


Definition:
Binding(or Wrapping) Functions and Data Together into single unit (class) is called Encapsulation.





1st Gen- 5th Gen


Assembly Languages:
Assembly Language is a low level programming language.
Assembly Code

Programming Languages:
FORTRAN, C, MATLAB, COBOL (before 1980)


C++: C with Classes
OOPs: Object Oriented Programming

1995: Python
1997: Java







Q: Calculate sum of array


Approach-1:

psvm()
{
    int[] arr = {1,2,3,4,5};
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
        sum = sum + arr[i];
    }
    System.out.println(sum);

}


Approach -2

int sumofarray(arr, size)
{
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
        sum = sum + arr[i];
    }
    return sum;
}

psvm ()
{
    sumofarray(arr, size);
}

Reusability:
Modularity:
Debugging is easier:
Multiple Points of Failure:
Less Heavy Applications




- Abstraction


Eg: ATM Machine

Customer: 
- Insert Card
- Enter Pin
- Withdraw Money

HIDDEN: Backend: Login to Server, fetch your account details, update transaction


Eg: Metro Card

Scanner: RFID Card

Definition:

Hiding Internal Details and Showing Functionality is called Abstraction.
Show What, dont show How.






- Polymorphism

"Poly" + "Morph"

Poly: Many 
Morph: Forms



One Task is performed in different Ways


Achieve Polymorphism in Java: Method Overloading and Method Overriding

Operator Overloading:

+:

5+2 = 7
"dev"+"ang" = "devang"


Method Overloading:


int sumofNumbers(int a, int b)
{
    return a+b;
}



public class Test
{
    int sumofNumbers(int a, int b)
{
    return a+b;
}

    public static void main(String[] args)
    {
        int a = 5;
        int b = 2;
        int sum = sumofNumbers(a,b);
        System.out.println(sum);
    }
}



Method Overloading:

Same Name of Function
Different Arguments Size
Different Arguments Type 





Inheritance:

Child inherits the features of Parents

Class A
{

}

Class B extends A
{
// All features of A

+ 

New Features
}



Bike 1:


Bike 2:
Bike 1 + New Features




B: Child Class/Subclass/Derived Class
A: Parent Class/Superclass/ Base Class




Types of Inheritance:

(1) Single Inheritance (A-> B)

A: Parent
B: Child


(2) Multiple Inheritance (A, B-> C) . -- NOT SUPPORTED IN JAVA (N:1)

A, B: Parents
C: Child

Eg: One Child can have properties of Both Mother and Father

(3) Multi-Level Inheritance (A-> B-> C)

A: Parent
B: Child + Parent of C
C: Child of B


Eg: Grandfather -> Father -> Son

(4) Hierarchical Inheritance (A-> B, C) .  (1:N)

A: Parent
B,C: Children

Eg: Both Brother and Sister can have properties of Father
    
(5) Hybrid Inheritance (A-> B, C-> D)

Combination of Any Inheritance Type










Why Java does'nt support Multiple Inheritance?
(Diamond Problem) - DONE





Date : 12th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Sorting Algos in JAVA

DONE:
- Intro to Java
- Loops and Conditional Statements
- Data Types and Operators
- Arrays: 1 D  
- Arrays: 2 D
- Stacks
- Queues
- Time and Space Complexity
- CP Trick
- Strings
- Recursion
- Functions
- Searching Algos (Linear and Binary Search)
- OOPs

TODO:
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Sorting Algorithms:
Unsorted Array --> Sorted Array

[3 1 6 8 9 2] --> [1 2 3 4 5 6]

- Insertion Sort
- Bubble Sort- DONE
- Selection Sort- DONE
- Merge Sort- DONE
- Quick Sort: IMP

- Heap Sort
- Radix Sort




Bubble Sort:
Simplest Sorting Algorithm

Approach:
- Swap Adjacent Elements if they are not in ascending order


Example:

a = [5 1 4 2 8]
OP: 1 2 4 5 8

First Iteration/Pass:

5 1 4 2 8 --> 1 5 4 2 8, 5 > 1 : SWAP
1 5 4 2 8 --> 1 4 5 2 8, 5 > 4 : SWAP
1 4 5 2 8 --> 1 4 2 5 8, 5 > 2 : SWAP
1 4 2 5 8 --> 1 4 2 5 8, 5 < 8 : NO SWAP

Second Iteration/Pass:

1 4 2 5 8 --> 1 4 2 5 8, 1 < 4 : NO SWAP
1 4 2 5 8 --> 1 2 4 5 8, 4 > 2 : SWAP
1 2 4 5 8 --> 1 2 4 5 8, 4 < 5 : NO SWAP
1 2 4 5 8 --> 1 2 4 5 8, 5 < 8 : NO SWAP


Third Iteration/Pass:

1 2 4 5 8 --> 1 2 4 5 8, 1 < 2 : NO SWAP
1 2 4 5 8 --> 1 2 4 5 8, 2 < 4 : NO SWAP
1 2 4 5 8 --> 1 2 4 5 8, 4 < 5 : NO SWAP
1 2 4 5 8 --> 1 2 4 5 8, 5 < 8 : NO SWAP



[1 2 4 5 8]: YES
1 < 2 < 4 < 5 < 8

Take i = 2
arr[i] = 4

arr[i+1]: RIGHT, 5
arr[i-1]: LEFT, 2

curr < RIGHT, curr > LEFT

arr[i]: CURR, arr[i-1]: LEFT, arr[i+1]: RIGHT

arr[i] < arr[i+1] OR arr[i] > arr[i-1]


for (i=1; i<n; i++)
{
    if (arr[i] < arr[i-1]) // 1<0, 2<1, 3<2, 4<3
    return false;
}
return true;



Why Name Bubble Sort: 
Large Values Are Bubbled towards the end of the array

Code:

void BubbleSort(int arr[], int n)
{
    for (int i = 0; i < n-1; i++) // O(N)
    {
        for (int j = 0; j < n-i-1; j++) // O(N) Times- Worst Case
        {
            if (arr[j] > arr[j+1]) // Adjacent Values, 8 5: Not Sorted, Sw
            {
                swap(arr[j], arr[j+1]); // 5 8 : After Swap
            }
        }
    }
}


TC: O(N^2), Worst case: Descending Order
SC: O(1)




i + j = n-1
j = n-i-1



for (i=0; i<3; i++)
{
for (j=0; j<3; j++)
}

00 01 02
10 11 12
20 21 22 




SWAP:

int a = 5;
int b = 10;

After Swap:

a = 10, b = 5


Using Third variable

void swap(int a, int b)
{
    int temp = a; // 5
    a = b; // a = 10
    b = temp; // b = 5
}

int a,b,c;// 12 Bytes - Constant Space: O(1)
int arr[n]; //n*4 Bytes - O(N) Space


Without Using Third Variable:

void swap(int a, int b)
{
    a = a+b; // a = 15
    b = a-b; // b = 5
    a = a-b; // a = 10
}

Using * and /

void swap(int a, int b)
{
    a = a*b; // a = 50
    b = a/b; // b = 5
    a = a/b; // a = 10
}






SELECTION SORT:


Approach:
- Sort Array by finding the smallest element and swapping it with the first element
- Repeat the process for the arr[0...n], arr[1...n], arr[2...n]...



Example:

a = [64 25 12 22 11]
OP: 11 12 22 25 64

Indexing: 0 to 4

Find Smallest Element in arr[0...4]= 11,
Place it at the beginning of the array

64 25 12 22 11 --> 11 64 25 12 22 // Swap 64 and 11


Find Smallest Element in arr[1...4]= 12,
Place it at the beginning of the array

11 64 25 12 22 --> 11 12 25 64 22 // Swap 12 and 64


Find Smallest Element in arr[2...4]= 22,
Place it at the beginning of the array

11 12 25 64 22 --> 11 12 22 64 25 // Swap 25 and 22

Find Smallest Element in arr[3...4]= 25,
Place it at the beginning of the array

11 12 22 64 25 --> 11 12 22 25 64 // Swap 64 and 25



arr[0..n], arr[1..n], arr[2..n]......arr[n-1..n]


CODE:

//64 25 12 22 11

void selectionSort(int arr[], int n)
{
    for (int i = 0; i < n-1; i++) // O(N)
    {
        int min = i; // 0
        for (int j = i+1; j < n; j++) // O(N), j=1 to 4
        {
            if (arr[j] < arr[min]) // 25 < 64
            {
                min = j; // min = 1
            }
        }
        swap(arr[i], arr[min]); // Swap 11 and 64 - O(1)
    }
}


TC: O(N^2)
SC: O(1)


IMP:
Merge Sort:


Algo: Divide And Conquer

Steps:

- Divides the Array into two halves
- Recursively calls the function for the two halves
- Until it becomes single unit/element
- Sort the Two Halves Individually
- Merge the Two Sorted Halves back together in an array



Example:

a[] = {38,27,43,3,9,82,10}

index: 0 to 6
mid = (0+6)/2 = 3

First Half: a[0] to a[3] = {38,27,43,3} = a[0] to a[mid]
Second Half: a[4] to a[6] = {9,82,10} = a[mid+1] to a[n-1]

DIVIDE:
                38 27 43 3 9 82 10
           [38 27 43 3]       [9 82 10]    
        [38 27] [43 3]        [9] [82 10]
       [38] [27] [43] [3]     [9] [82] [10]

Conquer:
        [27 38] [3 43]       [9 82] [10]
            [3 27 38 43]     [9 10 82]
               [3 9 10 27 38 43 82]


How Conquer Works ?

[38] [27] --> [27 38]

Create array of size: 1 + 1 = 2
Compare 27 and 38
27 < 38
Ans = [27 38]

left[m], right[n] --> Ans[m+n]
[27 38] [3 43] --> [27 38 3 43]


Create array of size: m + n
Compare each values of the array and select the smallest (m:n Comparison)
Ans = arr[m+n]



Pseudo Code:

l = 0, r = n-1;

mergeSort(arr[], l, r)
{
    if (l<r)
    {
        mid = (l+r)/2
        mergeSort(arr[], l, mid)// Left Part
        mergeSort(arr[], mid+1, r)// Right Part
        merge(arr[], l, mid, r) // Merge the Two Parts
    }
}




TC: O(N*LogN)
SC: O(N)




Arrays.sort(arr); // O(NlogN)

Internally uses: Tim Sort (Collection of Quick Sort and Merge Sort)



HW:
- Quick Sort
- Insertion Sort
- Which is the Best Sorting Algorithm in the World ?











Date : 13th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to HTML

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




DSA-1: Done

Web : Started

Practical:

Restaurant:

You: Customer


Client: You
Server: Chef/Cook
API: Waiter (Taken from Server, and bring to client)



Technical:

Front End: Browser Side/ Client Side
- User Interface and UX (User Experience)

Back End:
- How that data is fetched, stored and rendered/streamed


API: (Applications Programming Interface)
Fetched data from Back-End (Server) and give it to Front-End(Client)




Client-Server Architecture:

Client: Makes Request
Server: Responds to Request/Serves the Request


Practical Example:

Gmail.com (Browser) --> Enter Details ---> If Correct, Login


Client: Browser (Chrome, Safari)
Server: Gmail/Google Server - Validation - Move else rollback



Full Stack: FrontEnd + BackEnd + Deployment


Front-End: HTML, CSS, Javascript, Typescript
Frameworks: React, Angular, Vue

Back-End: Java, Python, Node.js, Go
Frameworks: Spring Boot (Java), Django (Python), Express (Node)

Database: 
SQL DB: MySQL, Redis, Postgres
NoSQL DB: MongoDB, Cassandra, GraphQL

Deployment:
CI/CD and Docker- Monitoring, Notifications

SQL: DML Language: Queries the Database


EDA:

Login -> Search -> Add to Basket -> Payment




HTML:


- Hypertext Markup Language
- Markup Language: Describes the Structure of a Webpage
- Tells Browser How to Display the Content
- Client Side Languages
- Series of Elements






<!DOCTYPE html>  -- HTML 5
<html> - HTML Tag
<body>

<h1>Hello World!</h1> 
<h2>Hello World!</h2>
<h3>Hello World!</h3>
<h4>Hello World!</h4>
<h5>Hello World!</h5>
<h6>Hello World!</h6>

<p>This is a paragraph.</p>

</body>
</html>


Elements in HTML:
html, body, h1, p, br


<>: Starting tag(Brackets) Eg: <html>
</>: Ending tag  Eg: </html>

<br>: Does not contain any ending bracket: Stand Alone Element


h1 to h6: Heading tags
h1: Largest in Size------ h6: Smallest in Size

p: Paragraph




<!DOCTYPE html>
<html>

<head>
    <title>Devang's Page</title>
</head>

<body>

<h1>Hello World!</h1>
<p>This is a paragraph.</p>

</body>
</html>







Small Logo: FAVICON





Date : 14th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to HTML

DONE:
- Introduction
- Client-Server Architecture
- Front End Vs Back End vs Full Stack
- HTML Elements
- HTML Attributes
- HTML Headings h1 to h6
- HTML Paragraph
- HTML 5
- HTML Tags
- HTML Tags Attributes
- Add Images to HTML
- Add Links to HTML


TODO:
- Github Repos and Solutions: DONE
- HTML Attributes: DONE
- Relative and Absolute URL of images: DONE
- HTML Div
- HTML Lists: Ordered and Unordered
- Assignment Questions


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





HTML Element:
Tells about the content of HTML Page
Eg: html, body, br, h1, img, a, 
- Start and End with tags <>, </>


HTML Attributes
- Additional Information About HTML Elements
- Always specified in start tag

Attributes are usually key-value pairs 
name = "value"



<a href="https://www.youtube.com/" target="_blank">Go To Youtube </a>

Element: <a>
Attribute: href, target



<img src="https://m.media-amazon.com/images/M/MV5BMGMyOThiMGUtYmFmZi00YWM0LWJiM2QtZGMwM2Q2ODE4MzhhXkEyXkFqcGdeQXVyMjc2Nzg5OTQ@._V1_.jpg" alt= "DrangonBallz" width="720" height="420" > 


Element: <img>
Attribute: src, alt, width, height


src = "url"


Images: External Images, Copyright Issues- It can be easily removed

Absolute URL: External Websites Link


Relative URL: Download Image and From My PC, Show it to User

First: From Local
src = "....../D:/images/devang.jpg"

Second: From Domain Server

src = "/images/imgname.jpg"

src = "domain1/images/imgname.jpg" - Depenedent on domain1
domain1 --> domain2

src = "domain2/images/imgname.jpg" 


Website: Domain: "Google.com", "Google.in"

2006: "Google.com" --> Get Back: 1.6 Mn Dollars


Domain- A, Expires
B - Buy: Payment
Domain- B
A: Get Back- Pay B


1999:
Amazon.com

Hackers:

Amazon.in
Amazon.uk
Amazon.us
Amazon.sg








HTML Div:


Division Tag
- Section in HTML Page


HTML Page:

About Us:

Team:

Contact Us: 



Section for Courses:
<div id="courses">Courses</div>


Section for About Us:
<div id="about-us">About Us</div>








LIST in HTML

(1) Unordered
(2) Ordered
(3) Description Lists


Unordered List:

. coffee
. maggie
. pizza


Ordered List:

1. coffee
2. maggie
3. pizza


<ul>
<li>Devang</li>
<li>Sharma</li>
<li>Mentor</li>
</ul>

<ol>
<li>Devang</li>
<li>Sharma</li>
<li>Mentor</li>
</ol>



<dl>
<dt>Devang</dt>
<dd>- He is Mentor</dd>
<dt>Sharma</dt>
<dd>- He is Student</dd>
</dl>




Date : 17th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to HTML

DONE:
- Introduction
- Client-Server Architecture
- Front End Vs Back End vs Full Stack
- HTML Elements
- HTML Attributes
- HTML Headings h1 to h6
- HTML Paragraph
- HTML 5
- HTML Tags
- HTML Tags Attributes
- Add Images to HTML
- Add Links to HTML
- Github Repos and Solutions: DONE
- HTML Attributes: DONE
- Relative and Absolute URL of images: DONE
- HTML Div: DONE
- HTML Lists: Ordered and Unordered: DONE
- Assignment Questions: DONE


TODO:
- Assignment Questions: DONE
- Tables: DONE
- Forms: DONE
- Emojis
- Audio and Video: DONE

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




- Assignment Questions: DONE




Audio Tags

-- Without Autoplay (You Click something to play)

<audio controls loop>

<source src = "....mp3/.m4a" type = "audio/mp3">

</audio>


-- With Autoplay (It automatically starts playing in Background)


<audio controls loop autoplay>

<source src = "" type = "audio/mp3">

</audio>





Video Tags


<video controls loop>

<source src = "....mp4/mkv" type = "video/mp4">

</video>













Date : 18th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to CSS

DONE:
- Introduction
- Client-Server Architecture
- Front End Vs Back End vs Full Stack
- HTML Elements
- HTML Attributes
- HTML Headings h1 to h6
- HTML Paragraph
- HTML 5
- HTML Tags
- HTML Tags Attributes
- Add Images to HTML
- Add Links to HTML
- Github Repos and Solutions: DONE
- HTML Attributes: DONE
- Relative and Absolute URL of images: DONE
- HTML Div: DONE
- HTML Lists: Ordered and Unordered: DONE
- Assignment Questions: DONE
- Tables: DONE
- Forms: DONE
- Audio and Video: DONE


TODO:
- Emojis
- Intro to CSS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"


- Assignment: DONE
- Intro to CSS: DONE
- Why CSS?: DONE
- Types of CSS: DONE
- Priority of different CSS: DONE
- CSS Syntax: DONE
- CSS Selectors: DONE


Introduction:

- CSS: Cascading Style Sheets
- Describes how HTML Elements are to be displayed
- External Stylesheets are stored in .CSS or .less files



- Why CSS ?


<style>

table,th,td{
    border: 1px solid red;
    text-align: center;
}

body{
    background-color: lightblue;
}

h2{
    text-align: center;
}

</style>



HTML1 -> HTML2-> HTML3-> HTML4-> HTML5


HTML3.2:

<font>, <color> etc...


Problem: Everywhere add this tags

Eg: Without CSS, HTML 3.2


<color: lightblue><h2>Devang</h2></color>
<color: lightblue><h2>Devang</h2></color>
<color: lightblue><h2>Devang</h2></color>
<color: lightblue><h2>Devang</h2></color>
<color: lightblue><h2>Devang</h2></color>


Eg: With CSS


h2{
    text-align: center;
    background-color: lightblue;
}



<h2>Devang</h2>
<h2>Devang</h2>
<h2>Devang</h2>
<h2>Devang</h2>
<h2>Devang</h2>






Types of CSS/Ways to Insert CSS:


- External CSS
- Internal CSS
- Inline CSS




(1) External CSS (Useful When CSS is very large)

Change the layout of Entire Website by using External Style Sheet

- Just include reference to that .css file in your HTML Code



<html>
<head>
<link rel ="stylesheet" href = "devang.css">
_____
</head>
</html>





devang.css

table,th,td{
    border: 10px solid red;
    text-align: center;
}

body{
    background-color: lightblue;
}

h2{
    text-align: center;
}


Note:
CSS Files are Cases-sensitive and Space Sensitive.
No Extra Space between value and unit.


border: 10px;   CORRECT
border: 10 px;  INCORRECT




(2) Internal CSS (Useful when All Elements of same tag follow SAME STYLE)


- One Single HTML page has unique Style
- Defined Inside the <style> element, inside the head section.
- All Elements of same tag follow SAME STYLE



<html>
<head>

<style>

table,th,td{
    border: 1px solid red;
    text-align: center;
}

body{
    background-color: lightblue;
}

h2{
    text-align: center;
}

</style>


<h2> Devang</h2>: CENTRE
<h2> Sharma</h2>: LEFT

</head>
<html>


OP:

        Devang
        Sharma



(3) Inline CSS (Useful when customised to each element)


- Apply a Unique Style for Single Element
- use style attribute to the relevant element




<html>
<head>



<h2 style="text-align: center;"> Devang</h2>: CENTRE
<h2 style="text-align: left;"> Sharma</h2>: LEFT

</head>
<html>




OP:

            Devang
Sharma





Q: Can 1 Webpage/HTML File contain more than 1 CSS ?
Ans: YES,. It can contain all 3.


CODE:

<html>
<head>

<style>


h2{
    text-align: center;
}

</style>


<h2 style="text-align: left;"> Sharma</h2>: LEFT

</head>
<html>


OP:

            Sharma
Sharma: OP




Priority of CSS:

Inline > Internal > External
Highest  ------------ Least







CSS Syntax:


Selector: HTML Element you want to style

Declaration: 
One or More Declarations separated by ;

Each Declaration has format: 
name:value


h2{
    color:red;
    text-align:center;
}


Selector:
h2 is a selector, it points to HTML Element you want to style



Declaration:

color:red;
text-align:center;


Declaration 1:

name- color, value: red


Declaration 2:

name: text-align, value: center






- CSS Selectors:


CSS Selectors are used to SELECT the HTML Elements you want to style.



(1) CSS Element Selector



p{
    color:red;
    text-align:center;
}

Apply Style to ALL p elements in HTML


(2) CSS ID Selector


Uses the ID Attribute of HTML Element to select a specific element




#p1{
    color:red;
    text-align:center;
}



<p id="p1"> Hi </p>
<p> World</p>




(3) CSS Class Selector

Uses the Class Attribute of HTML Element to select a specific element



.name{
    color:red;
    text-align:center;
}


<h1 class="name"> Devang</h1>
<h1>Sharma</h1>

<p class="name"> Hi There </p>


ID: specific to one element
Class: Across elements




Multiple Classes can be used in CSS Selectors


CORRECT
<p class="center large"> Hey, World! </p>

Class 1: center
Class 2: large


<p id="1 2"> Hey, World! </p>

INCORRECT 









Date : 19th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to CSS

DONE:
- Assignment: DONE
- Intro to CSS: DONE
- Why CSS?: DONE
- Types of CSS: DONE
- Priority of different CSS: DONE
- CSS Syntax: DONE
- CSS Selectors: DONE

TODO:
- CSS Selectors: DONE
- Background
- Colors
- Background Image
- Background Colors
- Icons

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"











(4) CSS Universal Selector


SQL: SELECT * from table;
--> Selects All Rows


Universal Selector: *


*{
    text-align: center;
}



OP:

Apply Styling to All HTML Elements in Page








(5) CSS Grouping Selector

Grouping Selectors Selectes all HTML Elements with same style properties


table{
    border:10px;
}

th{
    border:10px;
}

td{
    border:10px;
}


GROUP THEM TOGETHER:



table,th,td{
    border:10px;
}






- CSS Colors:


- Background Color:

Color Shown behind the text/image

black(in sublime)


<h1 style="background-color:red;">Devang</h1>


- Color of Text:

Text Color: Blue (in sublime)



- Color of Border




<h1 style="background-color:red;">Devang</h1>
<h1 style="color:red;">Devang</h1>
<h1 style="background-color:red; color:red;">Devang</h1> -- Not Visible
<h1 style="border:2px solid Violet;">Devang</h1>





- CSS Backgrounds- Colors:


(1) Apply to Whole Body/Webpage the Same Color

body{
    background-color: yellow;
}



(2) Different Colors to Different Sections in Webpage


<h1 style="background-color:yellow";>Devang</h1>
<h1 style="background-color:green";>Sharma</h1>


Note:

Different Sections --> Different Divs with unique Id and Apply the CSS property of bg color to each of them.

RGB: Red Green Blue


(3) Transparency/Opacity in Webpage


Defines Transparency of an element.

Range of Opacity: 0.0-1.0

Lower Value --> Lower Opacity --> More Transparency


CODE:

<h1 style="background-color:green; opacity:1.0;">Sharma</h1>




- CSS Backgrounds- Images:


(1) Add Bg Image to Complete Body/Webpage

body{
    background-image: url("...");
}

(2) Add Bg Image to Specific Element


table,th,td{
    background-image: url("https://mir-s3-cdn-cf.behance.net/project_modules/1400/4d845686128681.5d909dad4ddd3.jpg");
}


(3) Repeat Bg Image


- Horizontal Repeat

body{
    background-image: url("...");
    background-repeat: repeat-x;
}




- Vertical Repeat

body{
    background-image: url("...");
    background-repeat: repeat-y;
}


(4) No Repeat Bg Image


body{
    background-image: url("...");
    background-repeat: no-repeat;
}



(5) Position of Bg Image



body{
    background-image: url("...");
    background-repeat: no-repeat;
    background-position: right-top;
}




- CSS Backgrounds- Images- Attachments:


- Fixed:

Bg Image Should not Scroll,will be fixed


body{
    background-image: url("...");
    background-repeat: no-repeat;
    background-position: right-top;
    background-attachment: fixed;
}




- Scroll:

Bg Image will scroll with the rest of the page



body{
    background-image: url("...");
    background-repeat: no-repeat;
    background-position: right-top;
    background-attachment: scroll;
}







Date : 20th January 2021
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to CSS

DONE:
- Assignment: DONE
- Intro to CSS: DONE
- Why CSS?: DONE
- Types of CSS: DONE
- Priority of different CSS: DONE
- CSS Syntax: DONE
- CSS Selectors: DONE
- CSS Selectors: DONE
- Background: DOEN
- Colors: DONE
- Background Image: DONE
- Background Colors: DONE

TODO:
- Assignment Questions
- Icons
- Intro to JS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




- CSS Fonts:


Serif, Sans Serif, Cursive


In CSS, "font-family" property to specify the font of text.



- Font Family
- Font Family from Google Fonts
- Text Decoration - Underline, Linethrough etc
- Font Style- Italic, Oblique
- Font Weight : Bold
- Font Variant: To Upper Caps

.p1{
    font-family: "Times New Roman";
    font-style: italic;
    text-decoration: underline;
}

.p2{
    font-family: "Arial";
    font-style: oblique;
    text-decoration: line-through;;
}

.p3{
    font-family: "Lucida Console";
    font-weight: bold;
    font-variant: small-caps;
}

.p4{
        font-family: "Tangerine";
}







- CSS Icons:

Usually added in Footers


<i> : Denote Icons

Ways:

(1) Font Awesome Icons

Inlcude Font Awesome icons and use icons

(2) Bootstrap Icons

Inlcude Bootstrap icons and use icons


(3) Google Icons

Inlcude Google and use icons



<h3> Icons from Google</h3>
<i class = "material-icons">cloud </i>
<i class = "material-icons">computer </i>
<i class = "material-icons">attachment </i>
<i class = "material-icons">traffic </i>
<i class = "material-icons">favorite </i>












- CSS Box Model:
- CSS Flex:
- CSS Float:














Date : 21st January 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Introduction to CSS

DONE:
- Assignment: DONE
- Intro to CSS: DONE
- Why CSS?: DONE
- Types of CSS: DONE
- Priority of different CSS: DONE
- CSS Syntax: DONE
- CSS Selectors: DONE
- CSS Selectors: DONE
- Background: DONE
- Colors: DONE
- Background Image: DONE
- Background Colors: DONE

- Assignment Questions
- Icons


TODO:
- Assignment Questions- DONE
- Projects- DONE
- CSS Box Property
- CSS Position
- CSS Z Index
- CSS Links: EXTRA
- CSS Round Buttons: EXTRA
- CSS Flex
- CSS Float



- Intro to JS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



- CSS Box Model




            Margin: CSS

            Border: CSS

            Padding: CSS

            Content: HTML
            


CODE:

div{
width: 200px;
margin: 100px;
border: 10px solid grey;
padding: 20px;
}











- CSS Position


position property specifies the positioning type of an element.

5 different position values:

- static
- absolute
- fixed
- relative
- sticky


CODE:

(1) static:
Not positioned in any special way

Not affected by top, left, bottom, right 


(2) relative:

<e1>  300 px  <e2>


position: relative;



position: relative; -> Positioned relative to its normal position

It will be affedted by top, left, bottom, right




Two Trains -> Same Direction with Same Speed

Person A: stand on ground
Person B: Train 1
Person C: Train 2

A sees B, C: Moving forward
B,C sees A: Moving Background

B sees C: Rest




(3) fixed:

Fixed is relative to viewport.
Viewport: Always stay in same place

"If you scroll the page, it won't move"




(4) absolute:

- Relative to Viewport.

"If you scroll the page, it will move"


(5) sticky

Toggle between relative and fixed





- CSS Round Buttons: EXTRA

CSS:

#rcorner{
border-radius: 25px;
background: url();
background: yellow;
padding: 50px;
width: 50px;
height: 20px;
}

HTML:
<p id="rcorner"> Rounded Corner</p>













Date : 24th January 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Advanced CSS

DONE:
- Assignment Questions- DONE
- Projects- DONE
- CSS Box Property - DONE
- CSS Position- DONE
- CSS Round Buttons: EXTRA- DONE

TODO:

- CSS Float- DONE
- CSS Navigation Bar
- CSS Dropdown
- CSS Z Index
- CSS Links: EXTRA
- CSS Grid Layout

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






- CSS Float


float: 
How an Element should float

clear
What Elements can float beside the cleared element


float:
positioning and formatting content


MS Word

Image

Para
....            Image
...
....


Image






Values:

left: Left
right: Right
none: No Float/Default
inherit: Float Value of its parent



DOM Model: 
Document Object Model


Every HTML Element is like a document.


            Root (parent)
          Child  Child Child  


<div class = "div1"> First </div>
<div class = "div2"> Second </div>
<div class = "div3"> Third </div>


As per DOM :

                div    - Parent        
         div1   div2  div3   - Children


float: inherit

div1: follows same position as div
Child: _____________________ Parent




Best Use:

float property is used to wrap text around images





CODE:


img{
    float:right;
    height:100px;
    width:200px;
}



<p id ="para"><img src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIdVo_UaGqUQrhmJyLbBiA8ftA6eFOpyPkCw&usqp=CAU"> 
A paragraph is a self-contained unit of discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal
</p>








Footer:

Current:
Copyright: 2022  Author:Newton School

<p id="p1">Copyright: 2022</p>
<p id="p2">Author:Newton School</p>




Output:
Copyright: 2022                                                          Author:Newton School


#p1{
    float:left;
}

#p2{
    float:right;
}

<p id="p1">Copyright: 2022</p>
<p id="p2">Author:Newton School</p>







- CSS Navigation Bar


Use:
Having easy-to-use navigation is important for any web site.

Topics:
- Simple Nav Bar
- Vertical Navbar
- Horizontal Navbar
- Show Active Selection

CODE:

HTML:

<ul>
<li><a class="active" href="url">Home</a></li>
<li><a href="#">About Us</a></li>
<li><a href="#">Careers</a></li>
</ul>

CSS:

ul{
   list-style-type:none; - Removes Bullet Points
   margin:0;  - to remove browser default settings
   padding:0; - to remove browser default settings
//   position:fixed;
  //background-color: yellow;
}



li{
    display: block; - Vertical
    display: inline; - Horizontal
    padding: 10px;
    margin: 10px;
    background-color: yellow;
}

.active{  -- OnClick() Event - Mark As Active and Change Active Element Properties
    background-color:green;
}

Concept: Visit the array element, Mark it as visited.

Use Case: Helps User to identify position in webpage.





























Date : 25th January 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Advanced CSS

DONE:
- Assignment Questions- DONE
- Projects- DONE
- CSS Box Property - DONE
- CSS Position- DONE
- CSS Round Buttons: EXTRA- DONE
- CSS Float- DONE
- CSS Navigation Bar- DONE

TODO:

- Github Setup and Commit: DONE
- CSS Dropdown
- CSS Z Index
- CSS Flexbox
- CSS Links: EXTRA
- CSS Grid Layout

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



Extension:

Github:
Repos

Folder A
- B 
 - C
    Main2.java
 - D
   - Main.java


Outline of Repo:

Octatree: Paid
Chrome Extension: Free

Beta Version  -> Prod

Github Desktop: Commit

Push- Commit



----> CSS Dropdown



Button
 - 1
 - 2
 - 3




Topics:
- Make Dropdown
- Horizontal and Vertical Dropdown
- Hover Using CSS
- Button Is Better than Hover For Dropdown
- Dropdown Items SHould Contain href -->  Any Link/ Email


CODE:

HTML:

<h2> Drop Down Model </h2>

<div class="dropdown">
    <span>Hover Over Me</span>
    <div class="dropdown-content">
       <p>Hey, I am inside</p>
    </div>
</div>


DOM:

Parent: dropdown
Chiild: dropdown-content
    
CSS:

.dropdown{
position: relative;
}

.dropdown-content{
display:none;
background-color: green;
padding: 5px 5px;
position: absolute;
}

/*
src:hover dest

Class: .
Id: #

.A:hover .B
#A:hover #B
*/

.dropdown:hover .dropdown-content{
display:block;
}






(1) Button Is Better than Hover For Dropdown
(2) Dropdown Items SHould Contain href -->  Any Link/ Email


Button:

HTML: Without Links

<h2> Drop Down Model </h2>

<div class="dropdown">
    <button class="dropbtn">Button</button>
    <div class="dropdown-content">
       <p>Hey, I am inside</p>
    </div>
</div>

HTML: With Links

<div class="dropdown">
    <button class="dropbtn">Hover Over Me</button>
    <div class="dropdown-content">
    <a href="#.">Linkedin</a>
    <a href="#.">Github</a>
    <a href="#.">Medium</a>
    </div>
</div>
    

DOM Model:


Parent: dropdown
    Child: dropbtn
        Child: dropdown-content
            Child: a



CSS:

.dropbtn{
    border-radius: 25px;
    background-color: Dodgerblue;
    color:white;
    padding: 10px;
    font-size: 15px;
    border:none;
    cursor:pointer; 
}


.dropdown{
position: relative;
}

.dropdown-content{
display:none;
padding: 5px 5px 5px 5px;
position: absolute;
}




.dropdown-content a{
    color: black;
    text-decoration: none;
    display:block;
}

.dropdown-content a:hover{
background-color: yellow;
}

.dropdown:hover .dropdown-content{
display:block;
}

.dropdown:hover .dropbtn{
background-color: Dodgerblue;
}








Date : 27th January 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Advanced CSS

DONE:
- Assignment Questions- DONE
- Projects- DONE
- CSS Box Property - DONE
- CSS Position- DONE
- CSS Round Buttons: EXTRA- DONE
- CSS Float- DONE
- CSS Navigation Bar- DONE
- Github Setup and Commit: DONE
- CSS Dropdown- DONE

TODO:

- CSS Flexbox
- CSS Flex Container (Parent)
- CSS Flex Container Properties
- CSS Flex Items (Children)
- CSS Flex Items Properties
- CSS Flex Responsive

- Intro to JS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



--> CSS Flexbox


Before Flexbox, 4 Layout Models:

(1) Block: Sections in a webpage
(2) Inline: Text
(3) Table: 2D Table
(4) Position: Explicitly Setting the position of an HTML Element


Problem:
Adjust Position 4 Times for text, element, table and section

Use of Flexbox:
Made it easier to design flexible responsive layout without using float or position

Latest Browser:
- Chrome
- Safari
- Duck Duck Go
- Mozilla
- Edge
- Opera
- IE11


Google.com
Facebook.com




Flexbox made Layout Very Simple:


parent: Container
     child: Item







HTML Code:


<div class="flex-container">
    <div>1</div>
    <div>2</div>
    <div>3</div>
    <div>4</div>
</div>


CSS Code:


.flex-container{
display:flex;
background-color: Dodgerblue;
}

.flex-container > div{
background-color: white;
margin: 10px;
padding: 20px;
font-size: 30px;
}



----> Properties of Container (Parent):

- flex-direction
- flex-wrap
- flex-flow
- justify-content
- align-content


(1) flex-direction

Property defines in which direction the container wants to flex items


flex-direction: row;
flex-direction: column;
flex-direction: row-reverse;
flex-direction: column-reverse;


(2) flex-wrap: Used for Responsiveness

Wrapping the Gift

Whether the items should wrap or not.

flex-wrap:wrap;
flex-wrap:nowrap;
flex-wrap:wrap-reverse;

(3) flex-flow = flex-direction + flex-wrap

flex-flow: row wrap;

(4) justify-content  -- Justify Items position in Container.
- No need of float.


justify-content: flex-start;
justify-content: flex-end;
justify-content: center;




(5) align-content -- Aligning the Items in Container


align-content: center;
align-content: stretch;









----> Properties of Item (Child):
- order
- flex-grow
- flex-shrink
- flex-basis
- flex
- align-self


(1) order



<div class="flex-container">
    <div>1</div>
    <div>2</div>
    <div>3</div>
    <div>4</div>
</div>


OP: 1 2 3 4

row-reverse: 4 3 2 1

I want OP:

4 2 1 3

<div class="flex-container">
    <div style="order:3">1</div>
    <div style="order:2">2</div>
    <div style="order:4">3</div>
    <div style="order:1">4</div>
</div>


OP: 

4 2 1 3


flex-grow: Increase in Size

<div class="flex-container">
    <div style="flex-grow: 1">1</div>
    <div style="flex-grow: 1">2</div>
    <div style="flex-grow: 8">3</div>
    <div style="flex-grow: 1">4</div>
</div>


OP:
[1] [2] [_____ 3_____] [4]




flex-shrink: Decrease in Size









Interview FE:

Outer Square of N*N and Inner Sqaure of N/2 * N/2 in the middle of Page.

Output:
                    ___________
                    |    _     | 
                    |   |_|    |     
                    |          | 
                    |__________| 

Ans:

justify-content:center;
align-content:center;








Date : 28th January 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- Assignment Questions- DONE
- Projects- DONE
- CSS Box Property - DONE
- CSS Position- DONE
- CSS Round Buttons: EXTRA- DONE
- CSS Float- DONE
- CSS Navigation Bar- DONE
- Github Setup and Commit: DONE
- CSS Dropdown- DONE
- CSS Flexbox
- CSS Flex Container (Parent)
- CSS Flex Container Properties
- CSS Flex Items (Children)
- CSS Flex Items Properties
- CSS Flex Responsive

TODO:
- Intro to JS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



HTML: Markup Language
- Content Of Web Pages

CSS: Style
- Layout of Web Page

JS: Programming Language
- Behaviour of Web Page



Javascript ES

ES: ECMAScript
Standard - Interoperability of Web Pages Across Different Web Browsers

Document: ECMA-262- Internatinally Adopted

Chrome, Safari etc



Version:
ES1, ES2, ES3: 1999
ES5

ES6: 2015- Most Commonly

ES2017, ES2019, ES2021




--> What Can JS Do ?


(1) In A Browser, No Need to Install JS or JS Compiler.
- Directly Run in a Browser.


(2) VVI: It Can Change the HTML Content

<p>Hello</p>
Button

Click Button -> World


CSS BoxModel:

Margin

Border

Padding

Content- HTML



Cannot change Content

Change the Inner Content of HTML:

CODE:

document.getElementById("demo").innerHTML = "Final"'
<p id="demo">Initial</p>

How It Works ?

document.getElementById("demo") --> Return Line 7379

Line 7379.innerHTML - "Initial"

Line 7373.innerHTML= "Final" --> Initial -> Final

int a= 10;
a = 20;

(3) Can Also Change the Attribute

<img src="">
<a href="">

img: Element
src: Attribute

Attribute:
- name:"value"
- Always in starting Tag


<p>Devang</p>

p: Element
Devang: Content -> p.innerHTML

        p
    id   innerHTML


CODE:

<img id="image" src="link1">

<p id="demo">HI</p>  - innerHTML = "HI"

document.getElementById("image") -> Return Line 7416

Line 7416.innerHTML: Null

Line 7416.src = "link1"

Line 7416.src = "link2"    link1-->link2


Complete Code:

document.getElementById("image").src="link2"

HW:

document.getElementById("image").id="image2"
document.getElementById("image").id="image2"- Null



Hello

HELLO, __Hello__: CSS

Bold, Underline, Overline, Strong, Change Size: CSS



(4) Can Also Change the CSS


document.getElementById("demo").style.fontSize="40px"'
<p id="demo">Initial 1</p>


(5) Can Also Hide the Element

document.getElementById("demo").style.display="none"'

<p id="demo">Initial 1</p>



(6) Can Also Un-Hide the Element

document.getElementById("demo").style.display="block"'

<p id="demo" style="display:none">Initial 1</p>


Eg: Coupon Scratch Cards/Cash Rewards




---> Where to Include Javascript in My WebPage Code


(1) Inline JS:

<button type="button" onclick='document.getElementById("demo").style.display="block"'>
Click Me
</button>

- use Javascript with HTML Code as Event Attribute


(2) Internal JS similar to Internal CSS

<script>
JS Code
</script>


2 Ways:

(A) Can be Used in head

 <head>

<script>
JS Code
</script>

</head>


(B) Can be used in Body

 <body>

<script>
JS Code
</script>


</body>


Note: Placing script in Body Improves Display Speed
Script -> Interpreted

(3) External JS



Create a File,
Write JS Code
and Save as file.js file

<script src="file.js"></script>



Which one is Better?

Fastest -> Inline


Large Code: External is Better

- Separate HTML and JS Code
- Easier to read and maintain


Cache: 
Use Very Frequently-> Save Cache: Get from cache-> Fast












Date : 31st January 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- HTML vs CSS vs JS
- ECMAScript
- What can JS Do - Change Content, Change Attributes, Change CSS
- Inline, Internal and External JS

TODO:
- JS Output- DONE
- JS Statements- DONE
- JS Syntax- DONE
- JS Functions
- var vs let vs const - Interview Question - IMP

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





JS Output:

(1) Using innerHTML

<p id="print"></p>

<script>
document.getElementById("print").innerHTML = "Devang";
</script>

(2) Using document.write() - s.o.p in Java - Testing Purposes

<script>
document.write("Sharma");
let a = 20;
document.write(a);
</script>



(3) Using window.alert()

<script>
window.alert(10+15);
</script>




(4) console.log()


<script>
console.log(10+15);
</script>


(5) Javascript Print

<button onclick="window.print()"> Print This Page</button>






----> JS Statements



Everything is object

let a = 10; // int

a="devang"; // String

var b,c;
b = 5;
c = a+b;
console.log(c);

const e=10;
e=20; -> Error

console.log(e);


//int a = 10;
//a = "devang";
//a = 50;



Interview Question:

 TRICK:
When a number is writen in quotes (""), All Numbers AFTER IT
are treated as Strings and Concatenated


let x = 5+2+3; - 10
let x = "5"+2+3; - 523
let x = 5+"2"+3; - 523
let x = 5+2+"3"; - 73
let x = 5+2+"3"+4; - 734

console.log(x);



----> var vs let vs const - Interview Question - IMP
- Hoisting: Concpet - IMP


var

(1) Before ES6 (2015), variables were declared with var

Scope -> Where the variable can be used.

(2) Scope:

- var Scope is global or local


Eg:

var a = "Hey"; // Global

function newFunction()
{
    var b = "hello"; // Local/Function
}

console.log(a);
console.log(b); // Error- b is not defined



(3) var can be re-declared and updated


Re-declaration

var a = "Hey";
var a = "Hello";
var a = 20;
console.log(a); - No Error

OP: 20

Updation

var a = "Hey";
a = 10;
console.log(a);

OP: 10


(4) Hoisting of var

Flag Hoisting: Take Flag to the Top

Hoisting -> Variables and Functions "declarations" are moved to TOP of their scope(global/local) before running program.


Original Code:

console.log(a);
var a = "Hey";

Due to Hoisting, This will be interpreted as:

var a;
console.log(a); 
a = "Hey";


OP: 
undefined


Declare:

int a;

Define/Assign:

a = 10;




Original Code:

var a = "Hey";
console.log(a);

Due to Hoisting, This will be interpreted as:

var a;
a = "Hey";
console.log(a);


OP: Hey





Cache:

Quickly fetch the Frequent Items


Google.com -> Load Balancer -> Server -> Response -> Client


Browser -> Website: Google.com (10 Times a Day)

Google.com -> 
if (Cache)
return cache; 
else
-> Load Balancer -> Server -> Response -> Client









----> Problem With var


var a = "hey";
var k = 4;

if (k>=4)
{
    a = "hello";
}

console.log(a);


OP: 
hello





var a = "hey";
console.log(typeof a);

var k = 4;
console.log(typeof k);

if (k>=4)
{
  var a = "hello";  -----> PROBLEM, Re Declaration
}

console.log(a); ----> SHOULD HAVE BEEN "Hey"

OP: 
hello




Problem:

When you declare a variable unknowingly that it has been declared before, and you change the value
No Error is thrown, No Warning is thrown.











let

(1) Introduced in ES6 (2015)

(2) Used to declare variable


(3) Scope:

- Block Scoped


Block:
{
    // Blocks
}



(4) let variables can be updated but CANNOT be Redeclared


Updation:

let a = "Hey";
a = "Hi";
console.log(a);


Re-Declaration:

let a = "Hey";
let a = "Hi"; ---> ERROR
console.log(a);


Note: Re-Declaration means Re-Declaration in SAME SCOPE.

"Global and Local are DIFFERENT INSTANCES"


Solved Problem Due to var:


let a = "hey";
console.log(typeof a);

let k = 4;
console.log(typeof k);

if (k>=4)
{
  let a = "hello"; 
}

console.log(a); 


OP: 

hey



(5) Hoisiting - Same as var








const

(1) Used to Declare Constant


(2) Const CANNOT be REDECLARED, CANNOT be Updated


const a = "Hey";
a = "Hi"; ---> ERROR


const a = "Hey";
const a = "Hi"; ---> ERROR


NOTE:

const must be defined/initialised at the time of declartion.


Summary:

(1) Scope:
var -> Global or Local
let -> Block
const -> Block


(2) Updated and Re-Declaration

var: Both
let: Update Only
const: None

(3) Hoisting:
Same-> Moved to Top

var: undefined
let, const: Not initialised




console.log(a);
var a = "Hey";

After Hoisting, It will be Interpreted as:

var a; // undefined
console.log(a);
a = "Hey";



console.log(a);
let a = "Hey";

After Hoisting, It will be Interpreted as:

let a; // uninitialised/ Not Initialised
console.log(a);
a = "Hey";




(4) var and let can be declared without initialisation
const must be initialised during declartion



var a;
a= "Hi" - CORRECT

let a;
a= "Hi" - CORRECT

const a;
a= "Hi" - INCORRECT

const a="Hi";- CORRECT







Date : 1st February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- HTML vs CSS vs JS
- ECMAScript
- What can JS Do - Change Content, Change Attributes, Change CSS
- Inline, Internal and External JS
- JS Output- DONE
- JS Statements- DONE
- JS Syntax- DONE

TODO:
- var vs let vs const - Interview Question - IMP- DONE
- JS Data Types- DONE
- Loosely Typed vs Strongy Typed- DONE

Tom:
- JS Functions
- Assignment Questions- In Class and Post Class
- JS Arrays


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






---- Loosely Typed vs Strongly Typed


(1) Strongly Typed Languages:

Explicitly Specify Data Type of Variables and functions


Eg: Java, C++, C#, Go, Perl, PHP, C


int a=10; -> Correct
a = 10 -> Incorrect


function() -> ERROR
{

}

int/void function() -> CORRECT
{

}




(2) Loosely Typed Languages:



No Need to Explicitly Specify Data Type of Variables and functions, 
Interpreter is smart enough.

Eg: Javascript and Python

int a=10; -> InCorrect
a = 10 -> Correct


function() -> NO ERROR
{

}

int/void function() -> ERROR
{

}




Typescript was created -> Compiled Language



Arithmetic Operations:
+, -, *, /, %


let x = 10;
x %= 5;

OP: 0




JS Data Types:


let a = 16;
console.log(typeof a);

OP: number

a = "Dev";
console.log(typeof a);

OP: String


a = {fname:"Devang", lname:"Sharma"};

OP:
object




let a = 16;
console.log(typeof a);

a = 16.55;
console.log(typeof a);

a = "Dev";
console.log(typeof a);

a = {fname:"Devang", lname:"Sharma"};
console.log(typeof a);

a = true;
console.log(typeof a);

let b;
console.log(typeof b);

b = "";
console.log(typeof b);



OP:
number
number
string
object
boolean
undefined
string


Data Types:

number (Integer, Float, Double, Long)- All Ranges
string ('' and " ")
undefined
boolean
object










Assignment Ques:


CI:


Amount

A = P(1 + (R/100))^T

CI = A-P = P *[(1 + R/100)^T-1]



JS Code:

let interest = P * (1 + Math.pow(1 + R/100,T)-1);









Date : 2nd February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- HTML vs CSS vs JS
- ECMAScript
- What can JS Do - Change Content, Change Attributes, Change CSS
- Inline, Internal and External JS
- JS Output- DONE
- JS Statements- DONE
- JS Syntax- DONE
- var vs let vs const - Interview Question - IMP- DONE
- JS Data Types- DONE
- Loosely Typed vs Strongy Typed- DONE

TODO:
- JS Functions- DONE
- JS STRINGS- DONE

    - Definition
    - Length
    - Loose vs Strictly Check
    - Slice

- JS Arrays
- JS Sort
- Assignment Questions- In Class and Post Class



"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




-----> JS Functions

Use Case of Functions:



- Reusability:
- Modularity:
- Debugging is easier:
- Multiple Points of Failure:
- Less Heavy Applications


Q: Calculate sum of array


Approach-1:

psvm()
{
    int[] arr = {1,2,3,4,5};
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
        sum = sum + arr[i];
    }
    System.out.println(sum);

    // Linear Search
    // Binary Search

}


Approach -2

int sumofarray(arr, size)
{
    int sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
        sum = sum + arr[i];
    }
    return sum;
}

psvm ()
{
    sumofarray(arr, size);
    linearSearch(arr,size);
    binarySearch(arr,size);
}








Syntax of Functions:

JAVA:

[return type] name (parameters)
{

}

Eg:

int linearSearch(int arr[], int key)
{

}


Javascript:


function name(parameters)
{

} 


function linearSearch(arr, key)
{

}



Parameters/Arguments:
Passed to the function



CODE:


function add(a,b)
{
    return a+b;
}

let x = add(5,6);
console.log(x);


OP: 
11


CODE:

let x = add(5,6);
console.log(x);

function add(a,b)
{
    return a+b;
}


OP:

11




CODE:


let x;
console.log(x);

x = add(7,5);
console.log(x);

function add(a,b)
{
    return a+b;
}

x = add(5,6); // 12->11
console.log(x);


Output:

undefined
12
11




SCOPE:
Global Vs Local/Block


CODE-1:

let name;
console.log(name); // undefined





CODE-2:


function print()
{
    let name="Devang";
}

console.log(name); // Error

CODE-3:

let a = "Hey";

function print()
{
    let name="Devang";
    console.log(name); 
}

print();
console.log(name); // Error-> Reference Error

console.log(a); // Hey -> Remain in Memory Till Program Execution



Notes:

Global Scoped variables/functions can be used anywhere.
Local/Block Scoped variables/functions can be used only in thier respective scopes

Local/Block Scope Variables:

Created when a function starts and DELETED when the function is completed.

Global Variables:

Created and Remains in Memory Till Program Execution




----> Function Invocation/ Calling

(1) Based Upon Event
Eg: Clicking a button, Alert

(2) Invoked from JS

Eg:

function print()
{
    let name="Devang";
    console.log(name); 
}

print();


(3) Automatically/Self Invoking

Eg:
- Recursion


CODE:

function fact(n)
{
    return n*fact(n-1); // RECURSION/Self Invoking Function
}

console.log(fact(5));

Similar as:

for (i=5; ; i--)
{
    System.out.println(i);
}
- TLE

Recursion Stack on Heap:


........
fact(-2)
fact(-1)
fact(0)
fact(1)
fact(2)
fact(3)
fact(4)
fact(5)


STACK OVERFLOW: Max Size Exceeded





function fact(n)
{   
    if (n==1 || n==0)
    return 1;

    return n*fact(n-1); // RECURSION/Self Invoking Function
}

console.log(fact(5));



JS STRINGS:

- Definition
- Length
- Loose vs Strictly Check
- Slice


let str = "Newton";
console.log(str);
console.log(typeof str);

str = 'School';
console.log(str);
console.log(typeof str);

console.log(str.length);

let a = "5"; // string
let b = 5; // number

console.log(a==b); // Loose Checking- Without Type, Check Only Value - TRUE
console.log(a===b); // Strict Checking- Type and Value both are checked - FALSE














Date : 3rd February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- var vs let vs const - Interview Question - IMP- DONE
- JS Data Types- DONE
- Loosely Typed vs Strongy Typed- DONE
- JS Functions- DONE
- JS STRINGS- DONE
    - Definition
    - Length
    - Loose vs Strictly Check
    - Slice

TODO:
- JS String Functions
- JS Number Functions
- JS Arrays
- JS Sort
- Assignment Questions- In Class and Post Class



"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"



JS Strings Functions:

(1) Length

Extracting Strings:

(2) slice()


let str = "Devang Sharma";
console.log(str.slice(2,4));

(start,end)

(1) Indexing starts from 0
(2) start to end-1

str[2..3]= "va"




console.log(str.slice(2));

No end -> Till End of String

OP: "vang Sharma"



let str = "Devang Sharma";
console.log(str.slice(2,4)); // idx : 2 to 4-1= 2 to 3: str[2...3]
console.log(str.slice(2));
console.log(str.slice(-6)); // "Sharma" -> Last 6 Characters



(3) substring()


substring() is similar to slice()


let str = "Devang Sharma";
console.log(str.substring(2,4)); // idx : 2 to 4-1= 2 to 3: str[2...3]

OP: "va"

let str = "Devang Sharma";
console.log(str.substring(2));

OP: "vang Sharma"

Difference: (IQ):

substring() CANNOT Accept the Negative Indexes



(4) substr()

substr() is also similar to slice()

Diff: Second Parameter sepcifies the length of the extracted part


let str = "Devang Sharma";

console.log(str.substr(2,4)); // vang : (start,length)
console.log(str.substr(2));  // vang Sharma: start-> End
console.log(str.substr(2,20)); // 20 is NOT Index, Its a length

OP: vang Sharma
Length > Size: Print till End of String


console.log(str.substr(-6)); // Returns Last 6 Characters of String
// OP: Sharma
// Same as str.slice(-6)

console.log(str.substr(-6,5)); // 5 Characters of Sharma-> New String -> Sharm
console.log(str.substr(-6,10)); // 10 Characters of Sharma -> Sharma (only 6 chars available)

console.log(str.substr(-6,-10));// "Sharma"->Length can't be Negative -> No Output
console.log(str.substr(2,-4)); // Length can't be Negative -> No Output


Diff between substr(), substring(), slice()

- No Negative Values for substring()
- In substr(start, length) but substring(start, end) and slice(start,end)

Second Argument: Length


(5) replace()


Old -> New Value


let a = "Newton Newton School";
let b = a.replace("Newton", "Coding");
// Only first Instance will be replaced
console.log(b);

console.log(a);
// replace() method returns a NEW String does NOT change
//the original string


let a = "newton newton School";
let b = a.replace("Newton", "Coding");
// replace() is Case Sensitive

console.log(b);

// Make it Case Insensitive
b = a.replace(/Newton/i, "Coding");
console.log(b);

// Regex: Regular Expressions- /string/flag
// flag: i (insensitive), g: global

// Make it Change All Occurences
b = a.replace(/newton/g, "Coding");
console.log(b);

// Make it Change All Case Insensitive Occurences
b = a.replace(/newton/gi, "Coding");
console.log(b);


(6) toUpperCase()

let a = "hey";
let b = a.toUpperCase();
console.log(b);

OP: 
HEY


(7) toLowerCase()

let a = "HEY";
let b = a.toLowerCase();
console.log(b);

OP: 
hey


(8) concat: Merge Two Strings/Add Two Strings

let a = "Hey";
let b = "Coder";
console.log(a+ " "+ b);
console.log(a.concat(" ",b));

OP:
Hey Coder


(9) trim()

Removes Whitespaces from Both Ends

let a = "Hey Coder";
let b = a.trim();
console.log(b); // Hey Coder->a
console.log(a===b); // true
console.log(a==b); // true

OP:

Hey Coder
true
true

let a = "Hey Coder ";
let b = a.trim();
console.log(b); // Hey Coder
console.log(a===b); // false
console.log(a==b); // false



(10) charAt()

let a = "Hey";
let b = a.charAt(0);
console.log(b);

OP:
H

(11) charCodeAt()


let a = "abc";
let b = a.charCodeAt(0);
console.log(b);

b = a.charCodeAt(1);
console.log(b);

b = a.charCodeAt(2);
console.log(b);


OP: 
97
98
99


ASCII

a->97
....
z

A->65
....Z

Space, ,, ; -> ASCII




Sample input:-
[2, 1, 5, 1, 0]
[1, 6]

Sample output:-
true
false




CODE:

function lucky_seven(arr)
{
    if (arr.length < 3)
        return false;

    for (let i=2; i<arr.length; i++)
    {
        if (arr[i-2] + arr[i-1]+ arr[i] === 7)
            return true;
            break;// DEAD CODE
    }

    return false;
console.log("Hey"); // DEAD CODE

}


TC: O(N)
SC: O(1)





i, i+1, i+2: Continuous

for (i=0; i<arr.length-2;i++)


i-2, i-1, i: Continuous

for (i=2; i<arr.length; i++)






Date : 4th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- var vs let vs const - Interview Question - IMP- DONE
- JS Data Types- DONE
- Loosely Typed vs Strongy Typed- DONE
- JS Functions- DONE
- JS STRINGS- DONE
    - Definition
    - Length
    - Loose vs Strictly Check
    - Slice

- JS String Functions

TODO:
- String Search
- JS Number Functions
- JS Arrays
- JS Sort
- Assignment Questions- In Class and Post Class


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"


- String Search

Use Case: Check if a string is contained inside another string

(1) indexOf()

- First Occurence of the string

index-> Where does the string start from

let str = "Hi Hey Hi";
console.log(str.indexOf("Hi"));

OP:
0


What if String is Not present ?

let str = "Hi Hey Hi";
console.log(str.indexOf("Hello"));

OP: -1


Second Paramter -> Starting Position for Search

let str = "Hi Hey Hi";
console.log(str.indexOf("Hi", 3));

Treat String as:
"Hey Hi"

OP:
7




(2) lastindexOf()

- Last Occurence of the string

let str = "Hi Hey Hi";
console.log(str.lastIndexOf("Hi"));


index-> Where does the string start from

OP: 
7


What if String is Not present ?


let str = "Hi Hey Hi";
console.log(str.lastIndexOf("Hello"));

OP: -1


Second Paramter -> Starting Position for Search (Right to Left)

let str = "Hi Hey Hi";
console.log(str.lastIndexOf("H", 4));//3 -> Hi He
console.log(str.lastIndexOf("H", 5));//3 -> Hi Hey
console.log(str.lastIndexOf("H", 8));//7 -> Hi Hey Hi


Treat String as:
"Hi He"


(3) search()
- Returns index of First Occurence

let str = "Hi Hey Hi";
console.log(str.search("Hi"));

OP:
0


Diff between search() and indexOf()
-> search() does not have second Parameter

(4) match()
Return: Array Containing the Match, Null if NO Match Found

let str = "Hi Hey Hi";
console.log(str.match(/Hi/g));

OP:
[Hi Hi]


let str = "Hi Hey Hi";
console.log(str.match(/hI/gi));

OP:
[Hi Hi]


(5) includes()
Return -> boolean

Similar to .contains() in Java


let str = "Hi Hey Hi";
console.log(str.includes("hello"));

OP:
false

let str = "Hi Hey Hi";
console.log(str.includes("Hi"));

OP:
true


Second Parameter to includes()
- Where to start searching from


let str = "Hi Hey Hi";
console.log(str.includes("Hey"));


OP:
true


let str = "Hi Hey Hi";
console.log(str.includes("Hey", 7));

OP:
false















Date : 5th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : DSA Revision

- Assignment Questions- JS- DONE
- Leetcode Top Interviews- DONE
- Set in JS - DONE

- Kth Smallest Difference - Binary Search
- Birthday Paradox - Probability

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"







ARAYS in JS:

arr = [];
arr[0] = "Newton";
arr[1] = "School";

console.log(arr);
console.log(arr.length);
console.log(arr[0]); // Access First Element
console.log(arr[arr.length-1]); // Access Last Element

arr[0] = "Devang";
console.log(arr[0]); // Access First Element

// Traversing an array
let len = arr.length;
for(let i=0; i<len; i++)
{
    process.stdout.write(arr[i] + " ");
}
console.log();

// Adding Elements
arr.push("Coding");
console.log(arr);

// Deleting Elements
arr.pop();
console.log(arr);


// Sorting

arr2 = [5,4,2,32,100];
arr2.sort(); // Normal Sort
console.log(arr2);

// Numerical Sort- Ascending Order
arr2.sort(function(a,b){return a-b}); // Comparator
console.log(arr2);

/*

function(a,b){return a-b}
a > b: +ve, b is put before a
a < b: -ve, a is put before b
a == b: 0, both put at same place - chronological order

*/

// Numerical Sort- Descending Order
arr2.sort(function(a,b){return b-a}); // Comparator
console.log(arr2);







Insertion Sort in Java:



void insertionSort(int arr[], int n)
{
    int i,j,key;

    for (i=1; i<n; i++)
    {
        key = arr[i];
        j = i-1;

//        [0...i], [i+1...n]

        while(j>0 && arr[j]>key)
        {
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }
}



Q: Remove Duplicates


[1, 2, 3, 5, 1, 5, 9, 1, 2, 8]

Sample Output:-
1 2 3 5 8 9



OP:

Space Separated -> console.log(arr.join(" "));


arr1 = [1, 2, 3, 5, 1, 5, 9, 1, 2, 8]
Logic for Unique Values: Convert Arr to Set
arr2 = [1,2,3,5,9,8]

console.log(arr2);
OP: [1,2,3,5,9,8]

Need OP: 1 2 3 5 8 9
console.log(arr.join(" "));
OP: 1 2 3 5 8 9


Set:
[1,2,3,4,5,1]
set = [1,2,3,4,5]






CODE:


Arrays.from(new Set(arr).join(" "));


Approach:
(1) Convert arr to Set: Only Unique values: new Set(arr)
(2) Create Arr from Set: Arrays.from(___)
(3) Space in OP: .join(" ")






Leetcode Ques:

(1) Best Time to Buy and Sell Stock-2

(2) Rotate Array

Given an array, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]






Array: [1 2 3 4 5]

Right Shift:
[5 1 2 3 4]: 1 Time
[4 5 1 2 3]: 2 Time


Left Shift:
[2 3 4 5 1]: 1 Time
[3 4 5 1 2]: 2 Time


Size of Array = N

Right Shift N times -> Original Array

Left Shift N times -> Original Array



N = 5, K = 12

Right/Left Shift = 12%5 = 2

Total Number of Shifting Required = K % N


K = N
K > N
K < N

Solution:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

N = 7

(1) K %= N; -- 3

(2) reverse(arr.begin(), arr.end());

[7,6,5,4,3,2,1]

(3) reverse(nums.begin(), nums.begin()+k);

[5,6,7,4,3,2,1]

(4) revesrse(nums.begin()+k, nums.end())

[5,6,7,1,2,3,4]: ANS



Approach: RIGHT SHIFT

(1) Reverse arr[0...end]
(2) Reverse arr[0...k]
(3) Reverse arr[k..end]

Approach: LEFT SHIFT

(1) Reverse arr[0...end]
(2) Reverse arr[k..end]
(3) Reverse arr[0...k]




Q: Contains Duplicates: Product Based Companies



[1,2,3,1]

OP: true

(1) Brute Force:

Nested Loops

++count 


count!=1
return true;

TC: O(N^2)
SC: O(1)


(2) Using Sorting

[1 2 3 1] --> [1 1 2 3]

Check if (arr[i] == arr[i+1])

TC: O(NlogN)- Sorting
SC: O(1)


(3) Hashmap- Frequency

Frequency!=1
return true

TC: O(N)
SC: O(N)


(4) Set


arr = [ 1,2,3,1]
set = [1,2,3]


set.size() = 3
arr.size() = 4


No Duplicates- Same Set and Arr Size
Else
Set Size < Arr Size


return (arr.size() > set.size());

TC: O(N)
SC: O(N) - Set











Date : 7th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Intro to JS

DONE:
- var vs let vs const - Interview Question - IMP- DONE
- JS Data Types- DONE
- Loosely Typed vs Strongy Typed- DONE
- JS Functions- DONE
- JS STRINGS- DONE
    - Definition
    - Length
    - Loose vs Strictly Check
    - Slice
- JS String Functions
- String Search
- JS Number Functions
- JS Arrays
- JS Sort
- Assignment Questions- In Class and Post Class

TODO:
- Arrays Functions- DONE
- Sorting Arrays, Max and Min-DONE 

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




Arrays Methods/Functions:

- shift()
Delete from Beginning
Returns: Deleted Element from Beginning of Array

- unshift()
Add to Beginning
Returns: Length of New Array


- toString()
Converts Array to String
IMP: Changes the type to string


- join(" ")
Joins Array Values by the formatter
IMP: Does not change the type to string



ARAYS in JS:

arr = [];
arr[0] = "Newton";
arr[1] = "School";

console.log(arr);
console.log(arr.length);
console.log(arr[0]); // Access First Element
console.log(arr[arr.length-1]); // Access Last Element

arr[0] = "Devang";
console.log(arr[0]); // Access First Element


// Traversing an array
let len = arr.length;
for(let i=0; i<len; i++)
{
    process.stdout.write(arr[i] + " ");
}
console.log();


let ans;

// Adding Elements
arr.push("Coding"); // Add to the End
console.log(arr);

ans = arr.unshift("Hey"); // Add to the Beginning
console.log(arr);
console.log(ans); // Size of the New Array after Addition of Element



// Deleting Elements

ans = arr.shift(); // Delete Element from Beginning
console.log(arr);
console.log(ans); // Deleted Element from Beginning

arr.pop(); // Delete Element from End
console.log(arr);



console.log(arr.toString());
console.log(arr.join(" "));

arr2 = ["Hello", "World"];
console.log(arr2);

console.log(arr.concat("Hi"));
//arr.push("Hi");
console.log(arr.concat(arr2));

console.log(arr.concat(arr2,arr3,arr4....)); - Multiple Concatenation







// Sorting

arr2 = [5,4,2,32,100];
arr2.sort(); // Normal Sort
console.log(arr2);

// Numerical Sort- Ascending Order
arr2.sort(function(a,b){return a-b}); // Comparator
console.log(arr2);

/*

function(a,b){return a-b}
a > b: +ve, b is put before a
a < b: -ve, a is put before b
a == b: 0, both put at same place - chronological order

*/


// Numerical Sort- Descending Order
arr2.sort(function(a,b){return b-a}); // Comparator
console.log(arr2);





Insertion Sort in Java:



void insertionSort(int arr[], int n)
{
    int i,j,key;

    for (i=1; i<n; i++)
    {
        key = arr[i];
        j = i-1;

//        [0...i], [i+1...n]

        while(j>0 && arr[j]>key)
        {
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }
}



Q: Remove Duplicates


[1, 2, 3, 5, 1, 5, 9, 1, 2, 8]

Sample Output:-
1 2 3 5 8 9



OP:

Space Separated -> console.log(arr.join(" "));


arr1 = [1, 2, 3, 5, 1, 5, 9, 1, 2, 8]
Logic for Unique Values: Convert Arr to Set
arr2 = [1,2,3,5,9,8]

console.log(arr2);
OP: [1,2,3,5,9,8]

Need OP: 1 2 3 5 8 9
console.log(arr.join(" "));
OP: 1 2 3 5 8 9


Set:
[1,2,3,4,5,1]
set = [1,2,3,4,5]






CODE:


Arrays.from(new Set(arr).join(" "));


Approach:
(1) Convert arr to Set: Only Unique values: new Set(arr)
(2) Create Arr from Set: Arrays.from(___)
(3) Space in OP: .join(" ")




Sets in JS:

let s = new Set();
s.add("a");
s.add("b");
s.add("c");
s.add("a");
console.log(s);
console.log(s.size);

arr = []
arr.push("a");
arr.push("b");
arr.push("c");
arr.push("a");
console.log(arr);
console.log(arr.length);

(1) Duplicate Values: size(arr) > size(set)
(2) Unique Values: size(arr) == size(set)


OP:


Set { 'a', 'b', 'c' }
3
[a,b,c,a]
4




Trick:

To Check if arr has Duplicates:
(1) Convert Arr to set
(2) Size of Set == Arr- Unique Values
(3) Size of set < Arr - Duplicate Values










Splice() Function



arr = ["Hello", "World", "Coding"]
let ans = arr.splice(2,1,"Newton", "School");
console.log(arr);
console.log(ans);

// Delete Using splice()

arr.splice(2,1);
console.log(arr);





splice()

Add Any Number of Values at a particluar index in array

- Adds New Elements to the Arrays
- First Param: Position where Element should be added
- Second Param: How Many Values to be removed
- Last Param: Define the New Elements to be added

Returns:

Array of Values Deleted








Slice Function


arr = ["Hello", "World", "Coding"]
console.log(arr.slice(1,2));
console.log(arr);




slice()
- Does not Modify the Original Array
- Return a New Modified Array

Slice out portion of array starting from index

1 Parameter:
slice(idx)

Returns: [idx......end]

2 Paramters:

slice(idx,end)

Returns: [idx.....end-1]






Date : 8th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Linked Lists (DSA - 2)

Agenda:

(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE 
(3) Linked List Insertion - DONE
(4) TRAVERSAL: Printing Linked List - 
(5) Calculate Length -- Iterative - 
(6) Calculate Length -- Recursive - HW()
(7) Search in a Linked List -- Iterative, Recursive --
(8) Delete a Linked List - 
(9) Nth Node in a Linked List -- 
(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)-
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)- 


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Most Important:

- Linked Lists (F2F)
- Dynamic Programming
- BST (Binary Search Trees)



Linked Lists:

Master Any DS/Algo:

(1) What (Use Case)- DONE
(2) Why (Applications) - DONE
(3) How (Coding/Implementation) - DONE


Guy: Bholu
SDE Intern


Manager:
Write an API to take 3 numbers an input and print the sum


Sol:

int arr[1000000000];
Takes Input
long sum = arr[0] + arr[1] + arr[2];
S.O.P(sum);


(1) int c = 1000000000;- 
1000000000- Nothing to do with Range on int in int arr[1000000000];


(2) long sum : To AVoid Overflow 


Compile:

int arr[1000000000];

Space: 4*10^9 Bytes ~= 4 GB Contiguous Memory: RAM

OP: Stack Overflow



RAM:

8 Gb/16 GB




Memory Diagram:


.: FREE
X: Occupied


1 GB         1 GB            1 GB        1 GB

.....XXXXXXX.........XXXXXXX.....XXXXXXX...........XXXXXXXX
    Chrome          Spotify      VS Code            Sublime
    

YES: Linked Lists


A ------->    B    --------> C -------> D
1 GB           1 GB         1 GB        1 GB 


A -> next = B
B -> next = C
C -> next = D



In Real Life:

Linkedin/Twitter: Distributed Systems

Linked Lists --> Give rise to idea of Distributed Memory ---> Distributed Systems





Linked Lists vs Arrays:



(1) Size of Array

CORRECT
int arr[10]; // 40 Bytes


INCORRECT:
int arr[n]; // n*4 Bytes
int n = 10;

I need size before Execution of my Program




Production Example:


14th Feb: Sale


Expected: 100 Mn

Surprise: 200 Mn

Surprise: 50 Mn

Once Array is created, Its SIZE CANNOT be Increased or Decreased in Execution

I need something, which can adjust in Execution:
- If Request Increases -> Size Increases
- If Request Decreases -> Size Decreases



Linked List: Dynamic Allocation


Array: Log of Wood/ Prepaid

Linked List: Rubber Band - Stretch or Reduce/ Postpaid


(2) Rogue Memory

Bholu:


Take 3 Numbers and Print the sum


int arr[10000];
long ans = arr[0] + arr[1] + arr[2];
S.O.P(ans);

Execution: Correct
Optimal: No


10000-3 = 9997*4 Bytes: WASTED

There is NO Guarantee that All Elements of Array will be used in the Program.
There can be Rogue Memory.

Linked List: No Rogue Memory



(3) Complexity for Insertion



Arrays:

IP: [7 2 3 4 5 6]
Insert 8 before 2


OP: [7 8 2 3 4 5 6]


Steps:

(1) [7 _ 2 3 4 5 6]
Create Space by right shifting the values after 7 - O(N)

(2) arr[1] = 8- O(1)

TC: O(N)



Linked Lists:

A -> B -> C -> D


Insert E before C


OP: 

A -> B -> E -> C -> D

Given B


Steps:

(1) B.next = E // O(1) B -> E
(2) E.next = C // O(1) E -> C

TC: O(1)





Disadvantages of Linked Lists:


(1) No Random Access, Only Sequential Access


Arrays:

A[] = {1,2,3,4,5}
indexing = 0 to 5

a[3] = 4- O(1)

If I know the Index of my Element, 
I can directly reach to that element

---> No Need to start from Beginning


Linked List:

head: 1 -> 2 -> 3 -> 4 -> 5: tail

Cannot Go directly from 1 to 5 


To reach any node in LL, MUST Start with head everytime


------> Only Sequential Access





Practical Example:

4 Friends, College Reunion

A -> B -> C -> D

A: Has Contact of B
B: Has Contact of C
C: Has Contact of D


A wants to Call D?

- Need to reach C
- Need to reach B

Flow:

A will call B, B will call C, C will call D



A -> B -> C -> D



(2) No Backtracking - Single LL

a[] = {1,2,3,4,5}

L to R, R to L

idx++: L to R
idx--: R to L


Linked Lists:


head: 1 -> 2 -> 3 -> 4 -> 5: tail


1 to 2: YES
2 to 1: NO


Backtracking is NOT Allowed- Single LL







CODE:

Java: Custom Class

class Node
{
    int data;
    Node next = null; --  Self Referential Object

    Node(int d)
    {
        data = d;
    }
}


Node a = new Node(1);

1, next
null



class A{
A obj = null; -Self Referential Object

}

main()
{
A obj = null; - Not Self Referential Object
}




Structure of Node:


{
    data: int
    next: null (obj) of type same class inside which it is created
}

{
    data: int
    next: null (obj) of type same class inside which it is created
}

{
    data: int
    next: null (obj) of type same class inside which it is created
}


1, next             2, next         3, next
null                 null           null









Java STL: Collection Framework- PreWritten Code


import java.util.*;

LinkedList<type> name = new LinkedList<type>();

Eg:

LinkedList<Integer> ll == new LinkedList<Integer>();
ll.add(1);
ll.add(2);



Q: Nodes: Form a Linked List




class Node
{
    int data;
    Node next = null; --  Self Referential Object

    Node(int d)
    {
        data = d;
    }
}


class Main
{
    public static void main(String[] args)
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

    1, next      2, next    3, next
    null            null     null

    first.next = second;
    // 1 -> 2     3

    second.next = third;
    // 1 -> 2 -> 3


    }

    LL: 1->2->3->null
}




    head: 1->2->3->null


End of Linked List ?


if (node.next == null) -- End of LL

Eg:
Train End Compartment: X printed




















Date : 9th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Linked Lists (DSA - 2)

DONE:
(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE 
(3) Linked List Insertion - DONE

TODO: (9:45 to 10 PM IST- Break)
(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW() - DONE
(7) Search in a Linked List -- Iterative, Recursive -- DONE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE
(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)-
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)- 


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Pattern:
Ques, Company, Input, Output


30 Sec

Approach/Code, TC, SC





Q: [Amazon]: Traverse a Linked Lists


head: 1 -> 2 -> 3 -> 4 -> 5 -> null


OP: [1 2 3 4 5]



void printLL(Node head)
{
    Node temp = head;
    while(temp.next!=null)- 5 Does not satisfy, Last Node will NOT be printed.
    {
        System.out.print(temp.data  + " ");
        temp = temp.next;
    }
}


OP: 1 2 3 4


void printLL(Node head)
{
    Node temp = head;
    while(temp!=null)
    {
        System.out.print(temp.data  + " ");
        temp = temp.next;
    }
}

OP: 1 2 3 4 5



Q: [Adobe] Count the Number of Nodes in a Linked List/ Length of Linked List


head: 1 -> 2 -> 3 -> 4 -> 5 -> null

OP: 5


int getCount(Node head)
{
    Node temp = head;
    int count = 0;

    while(temp!=null)
    {
        count+=1;
        temp = temp.next;
    }

    return count;
}


TC: O(N)
SC: O(1)



Any Iterative Code can be CONVERTED to Recursion and Vice-Versa

HW: Recursive Version of getCount()





Q: [Paypal] Search in a Linked List 

head: 1 -> 2 -> 3 -> 4 -> 5 -> null


IP: 2
OP: true


IP: 7
OP: false



boolean search(Node head, int key)
{
    Node temp = head;

    while(temp!=null)
    {
        if (temp.data == key)
            return true;

        temp = temp.next;
    }

    return false;
}

Brownie Points:

TC: Best Case: O(1), Worst Case: O(N)
SC: O(1)




HW: Recursive version of search()





Q: [Microsoft] Print the Kth Node from Beginning in a Linked List

LL, int K

head: 10 -> 20 -> 30 -> 40 -> 50 -> null


Why Temp Node ?
head:10 -> 20 -> 30 -> 40 -> 50 :temp



K = 2
OP = 20

K = 4
OP = 40


Constraints:

1 <= K <= N

Return Kth Node Value

int KthNode(Node head, int k)
{
    Node temp = head;
    int count = 0;

    while(temp!=null)
    {
        count+=1;

        if (count == K)
            return temp.data;

        temp = temp.next;
    }

}


TC: O(K), 1 <= K <= N
SC: O(1)


Return Kth Node 

Node KthNode(Node head, int k)
{
    Node temp = head;
    int count = 0;

    while(temp!=null)
    {
        count+=1;

        if (count == K)
            return temp;

        temp = temp.next;
    }

}


TC: O(K), 1 <= K <= N
SC: O(1)























Date : 10th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Linked Lists (DSA - 2)

DONE:
(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE 
(3) Linked List Insertion - DONE
(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW() - DONE
(7) Search in a Linked List -- Iterative, Recursive -- DONE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE

TODO:
(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)-
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)- 


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






VVI:
[Google, Cisco, Apple, Adobe, Microsoft]


Q: Print the Kth Node from End in a Single Linked List

LL, int K

head: 10 -> 20 -> 30 -> 40 -> 50 -> null

K = 1
OP = 50

K = 4
OP = 20

Constraints:
1 <= K <= N



int KthNodefromEnd(Node head, int K)
{

}




Solutions:

(1) Reverse the LL
Kth Node from End in Orig == Kth from Beginning in Reverse LL

Orig:
head: 10 -> 20 -> 30 -> 40 -> 50 -> null

Reverse:
head: 50 -> 40 -> 30 -> 20 -> 10 -> null

TC: O(N)
SC: O(N)



Good Developer Approach vs Very Good Developers


Two Approaches:


(2) Good Developer Approach:


_ _ _ _ _ 
A B C D E

Total Number of People in Row = 5
B = 2nd from Beginning
B position from End ?
= 4


Kth from Beginning = Total - K +1 from End


Kth Node from End 
= (len-K+1) from Beginning


K = 1
len = 5


len- K +1 = 5-1+1 = 5th Node from Beginning




Complexity:

(1) Calculate Length - O(N)
(2) Traverse (len-K+1) and then return that Node: O(N-K+1)


Total: O(2*N-K+1)

Worst Case: O(2*N)


In Real Life Production:


N = 10^12


O(N): Single Traversal: 10^12 Iterations

O(2*N): Double Traversal: 2*10^12 Iterations



Phonepe/Paytm/Gpay:

Swipe: Do the Payment


Phonepe: 2 sec
Paytm: 2 sec


New Developer joined Paytm

Code: O(N) --> O(2*N) in Paytm Codebase


Phonepe: 2 sec
Paytm: 4 sec


Latency Increased by 2 Times

1 sec Delay in Amazon Search: USD 7 Bn Loss per year in Revenue




(3) Very Good Developer Approach


Single Traversal: O(N)

Two Pointer/ Fast and Slow/ Hare and Tortoise Approach:


Approach:

Initial:

slow: head
fast: head + K

Start Traversal:

slow = slow.next 
fast = fast.next 

fast == null
slow -> Kth Node from End: ANS

TC: O(N)
SC: O(1)



Why This Works?




Atheletic Track:
400 M


Two People: A and B


A: 40 m
B: 100 m

Diff = 100-40 = 60


A and B runs with SAME SPEED
=> (B-A) will be CONSTANT


B reaches to 400
A = 400-60 = 340 



In Linked List:

slow: head
fast : head+k

Diff = K

RUNNING WITH SAME SPEED

fast => End
slow => End - K: ANS




DRY RUN:


head: 10 -> 20 -> 30 -> 40 -> 50 -> null

K = 2
OP = 40


head = 10

Initial:

slow = 10
fast = head + K = 30


while (k!=0)
{
    fast = fast.next;
    k--;
}

Start Traversal:

slow = 10->20
fast = 30->40

slow = 20->30
fast = 40->50

slow = 30->40: ANS
fast = 50->null: STOP







head: 10 -> 20 -> 30 -> 40 -> 50 -> null

K = 2
OP = 40




CODE:


int KthNodefromEnd(Node head, int K)
{
    Node slow = head; // 10
    Node fast = head; // 10

    for (int i=0; i<K; i++)
    {
        fast = fast.next;
    }
    // fast = 30
    // slow = 10

    while (fast!=null)
    {
        slow = slow.next; // 10 -> 20 -> 30 -> 40
        fast = fast.next; // 30 -> 40 -> 50 -> null
    }

    // fast = null
    // slow = 40
    return slow.data;
}







Extra
 Cycle in a Linked List - DONE (GOOGLE)

Q: [Google]
Given a Linked List, Check whether there is a Cycle or Not.

Cycle is also called Loop in a Linked List


Cycle -> A Node is visited More than once while traversing the Linked List



Edge Cases:

head: 1 -> 2 -> NULL

OP: false


head: 1 -> 2 -> 3 -> 4 -> 5
          /|\             |
           |              |
           |______________|


OP: true

Traverse:

1 2 3 4 5 2 3 4 5 2 3 4 5 2 3 4 5...........

OP: TLE


(3) LL: 1 -> 2 -> 3 -> 4 -> 5 -> 2 -> NULL 

OP: false

(4) 2 -> 2 -> 2 -> 2 -> null

OP: No Cycle

(5) LL: 1 -> 2 -> 3 -> 4
             |_________|

OP: true






Solution:

INCORRECT:

if (node.next!=null)
    return true;
else
    return false;

OP:

1 2 3 4 2 3 4 2 3 4.......
TLE



Without Hashing:

Track: 400 M- Circular

A: 10 km/h, B: 20 Km/h


If in time 't', A covers 1 lap.
How much lap will B cover ?


Ans: 2 Laps


Circular Track:
A will meet B when B has already covered 1 lap.

Parallel Track:
A and B will never meet



Approach:

- slow, fast -> head
- slow: x, fast: 2x
- if slow == fast: CYCLE
- else, No Cycle

TC: O(N)
SC: O(1)



CODE:

    public boolean hasCycle(ListNode head) {
    
    if (head == null)
        return false;
        
     ListNode slow= head;   
     ListNode fast= head;   
        
    while (fast.next!=null && fast.next.next!=null)
    {
        slow = slow.next; // x speed
        fast = fast.next.next; //2*x speed
            
        if (slow == fast)
            return true; // There is a Cycle
        
    }
        
        return false; // No Cycle
    }


TC: O(N)
SC: O(1)







With Hashing:






Date : 11th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Linked Lists (DSA - 2)

DONE:
(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE 
(3) Linked List Insertion - DONE
(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW() - DONE
(7) Search in a Linked List -- Iterative, Recursive -- DONE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE
(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)-
(11) Cycle in a Linked List - DONE (GOOGLE)

TODO:
(12) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)- 
(13) Hashing- Set and Map

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"









Loop:

1 -> 2 -> 3 -> 4 -> 5
|___________________|

OP: Yes

Complete Loop

OP: 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 .....


1 -> 2 -> 3 -> 4 -> 5
          |_________|

OP: Yes

Middle Loop

OP: 1 2 3 4 5 3 4 5 3 4 5.......


1 -> 2 -> 3 -> 4 -> 5---
                    |___|


OP: Yes

Loop in End


1 2 3 4 5 5 5 5 5 5 5 ......







VVI:

Q: Middle of Linked List:

[Google, Microsoft..]


head: 10 -> 20 -> 30 -> 40 -> 50 -> null

Middle = 30: OP



int getMiddle(Node head)
{

}


a = [1,2,3,4,5]

middle = len/2 or (len+1)/2


TWO Solutions:

Good Developer vs Very Good Developer Approach


(1) len: Length of Linked List: O(N)
print(len/2) or print((len+1)/2): O(N/2)

Total: O(1.5*N)

(2) O(N): Single Traversal:

Two Pointer/ Fast and Slow/Hare and Tortoise Approach:


Initial:

slow = head
fast = head

Start Traversal:

slow = slow.next
fast = fast.next.next

When the fast recahes null,
slow ---> Middle of LL





Why it Works?

Track: 400 M

Two People are Running:
A: 10 km/h
B: 20 km/h

After time 't':

B covers the distance: d
A cover the distance: d/2


B reaches at End, A will be Middle




DRY RUN:

head: 10 -> 20 -> 30 -> 40 -> 50 -> null

OP: 30

head = 10

Initial:

slow = 10
fast = 10

Start Traversal:

slow = 10->20
fast = 10->20->30


slow = 20->30: Middle of Linked List
fast = 30->40->50: STOP





CODE:

int getMiddle(Node head)
{
    Node slow = head;
    Node fast = head;

    while (fast.next!=null && fast.next.next!=null)
    {
        slow = slow.next;
        fast = fast.next.next;
    }

    // After the while loop, Fast -> End, Slow -> Middle of LL


    return slow.data;
}



TC: O(N)
SC: O(1)






head: 10 -> 20 -> 30 -> 40 -> 50 -> null

OP: 30

fast.next!=null: 
50 will (break) here

head: 10 -> 20 -> 30 -> 40 -> null

OP: 20

fast.next.next!=null

OP: 20

DRY RUN:

Initial:

slow = 10
fast = 10

Traversal:

slow = 10->20: ANS
fast = 10->20->30: STOP

30.next.next==null





















Hashing- Set and Map



Set:

Find Unique Values 

s.add("a");
s.add("b");
s.add("c");
s.add("a");
s.add("A");


Set:

[a, b, c, A]



Hashcode(): Object/Reference
Equals(): Comparing Two Objects/Strings


"a" --> 97
"b" --> 98
"c" --> 99


"a" --> 97
"A" --> 65



value ---> Hash Function ---> Hash Code


Hash Code : Index in Hash Table


A = [11,12,13,14,15,22]

Hash Function = val % 10

Hash Codes = [1,2,3,4,5,2]

Hash Table:

0:
1: 11
2: 12
3: 13
4: 14
5: 15


A = [11,12,13,14,15,22]

Hash Function = val % 100

Hash Codes = [11,12,13,14,15,22]



Hash Function:

(1) Can be calculated Very Efficiely - Probably O(1)
(2) No Collisions
(3) Less Space

DB Companies:
(1) Google Search:
(2) Yandex: Google of Russia
(3) CouchDB
(4) Yugabyte


Efficient Hash Function  --> Less Latency ---> Quicker Results


Live Demo ?








Map:














Date : 13th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Arraylists and Vectors (DSA-2)

(1) Arraylists- Theory- DONE
(2) Code - DONE
(3) Array vs Arraylist: DONE
(4) Vector- Theory
(5) Code - DONE
(6) Array vs Arraylist vs Vectors - DONE
(7) Assignment Questions- DONE

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"


Weekdays: Web Development - HTML, CSS, JS, PROJECTS, Reactjs
Weekends: DSA-2(Arraylists, Vectors, Linked Lists, Maps, Sets)

DSA-3: DP, Backtracking, Trees, Graphs, CP

+ Assignment Questions


DSA-1: DONE

Arrays-1 D and 2 D
Time and Space Complexity
OOPS
Two POinters
Prefix Sums
Strings
Functions
Recursion
Stacks and Queues


DSA-2
Linked List: DONE


ArrayList in JAVA:


Arrays in Java- 1D and 2D Array


int arr[n];
int arr[] = new int[n];
int arr= {1,2,3,4,5};

Indexing: 0 to size-1

arr[0] = 1
arr[2] = 3


Limitations:

(1) Static in Nature

Cannot change the size in Run Time

int arr[100];

100 -> 200: NO
100 -> 50: NO


Static in Nature

(2) Upperlimit on Size


int arr[10000000000]; // Stack Overflow

Stored in Contiguous Memory -> Not available in RAM -> Stack Overflow



Linked List Limitation: 
(1) Only Sequential Access
(2) No Backtracking in Single LL

Really Good DS: Features of LL + Features of Arrays
                = Dynamic DS + Indexing(Random Access)
                = ArrayList (Arrays + Lists)




ArrayList:

(1) Dynamic In Nature - Increase/Decrease Size in Run Time
(2) Indexing (Random Access)
(3) Defined under java.util.*;


CODE:


import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {   
        // Create an Array List
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        
        int i=0;
        for (i=0; i<10; i++)
            arr.add(i);
        
        // Add at particular index
        // arr.add(1, 10);
        
        System.out.println(arr);
        arr.remove(6); // Removal based upon value not index
        
        // Changing Element at a Location
        arr.set(1,10);
        
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Devang");

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println("Length:" + arr.size());
        
        System.out.println();
//        System.out.println(arr.get(1));
//        arr.remove(arr.get(1)); Remove based upon index
        
        // Long Way- Iterate Over Index
        System.out.println("Print Array List Element by Element: Long Way");
        for (i=0; i<arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        
        System.out.println();
        
        // Short Way- Iterate Over Values
        System.out.println("Print Array List Element by Element: Short Way");
        for (int k:arr)
            System.out.print(k + " ");

        
    }
}








Q: How it adjusts the Dynamic Nature/Size?

    ArrayList<Integer> arr = new ArrayList<Integer>(size);




ArrayList<Integer> arr = new ArrayList<Integer>(5);

Number of value <=5: NO CHANGE

Internally:

Insert,  6th Value
Arraylist: Changes it size to 1.5x: 5*1.5 = 7.5

Insert, 8th Value:
Arraylist: Changes it size to 1.5x: 7.5*1.5 = 12.25


Before Java 8, 

Arraylist -> 2*Arraylist

After JAVA 8:

Arraylist -> 1.5*Arraylist (When More Elements Inserted)

Vector -> 2*Vector (When More Elements Inserted)








Vectors Code:

import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {   
        // Create an Array List
        Vector<Integer> v = new Vector<Integer>(5);
        Vector<String> v1 = new Vector<String>();
        
        int i=0;
        for (i=0; i<10; i++)
            v.add(i);
        
        v1.add("Devang");
        
        // Add at particular index
        // v.add(1, 10);
        
        System.out.println(v);
        System.out.println(v1);
        
        // Changing Element at a Location
        v.set(1,10);
        
        v.remove(6); // Removal based upon value not index

        System.out.println(v);
        System.out.println("Length:" + v.size());
            
        System.out.println();
//        System.out.println(v.get(1));
//        arr.remove(v.get(1)); Remove based upon index
        
        // Long Way- Iterate Over Index
        System.out.println("Print Vector Element by Element: Long Way");
        for (i=0; i<v.size(); i++)
            System.out.print(v.get(i) + " ");
        
        System.out.println();
        
        // Short Way- Iterate Over Values
        System.out.println("Print Vector Element by Element: Short Way");
        for (int k:v)
            System.out.print(k + " ");

        
    }
}




ArrayList vs Vectors:


(1) When Total Number of Elements exceed Capacity:
Arraylist -> 1.5x
Vector -> 2x


(2) ArrayList is Not Synchronised, 
Vector is Synchronised.

(3) Arraylists: Faster (Non-Sysnchronised)
Vector: Slower (Synchronised)




Synchronisation:

Multi-Threaded Environment:

ArrayList: NOT Synchronised
    Thread t1 -> add()
    Thread t2 -> remove()
    Thread t3 -> size()

- Independent Working Threads
- Multiple Operations can be performed at SAME TIME due to Multiple Threads


Vector:
    Thread t1 -> One Operation at a time

- Only 1 Thread
- Only 1 Operation at ONE TIME








ASSIGNMENT QUESTIONS:




(1) TWO SUM:


You are given an array A of size N, and you are also given a sum. 
You need to find if two numbers in A exists such that their sum is equal to the given sum. 
If yes, print 1, else print 0.


arr = [1,2,3,4,5]
a + b == target

target : 6

OP: true
[1,5], [2,4]


target: 12
OP: false


Orignal Ques: Two Sum
Variation: Three sum/ K sum etc


Solutions:

(1) Brute Force: O(N^2)
(2) Sorting and Two Pointer: O(NlogN)
(3) Hashing: O(N)



(1) Brute Force:

a + b == target


boolean twosum(int[] arr, int target)
{
for (i=0; i<n; i++) // for a
{
    for (j=i+1; j<n; j++) // for b
    {
        if (arr[i] + arr[j] == target)
            return true;
    }
}

return false;
}

TC: O(N^2), 5 Passed, Rest TLE
SC: O(1)



(2) Sorting and Two Pointer:

Sorting: O(NlogN)
Two Pointer: O(N) - Sorted Values

Final: O(NlogN)


[5,4,3,2,1], target = 6
OP: true


Approach:
(1) Sort the Array

[5,4,3,2,1] --> [1,2,3,4,5]

(2) Apply Two Pointer


[1,2,3,4,5]

left = 0 (index)
right = 4 (n-1, index)


left++;
--> Left to Right
--> Sum will increase

right--;
--> Right to Left
--> Sum will decrease


If curr_sum > target
    right--;

If curr_sum < target 
    left++;   



[1,2,3,4,5]

left =0, right = 4

arr[left] + arr[right] = 1+5 = 6 == target

left++;
left = 1

arr[left] + arr[right] = 2 +5 = 7 > target

curr_sum > target --> right--;

right--;
right = 3


arr[left] + arr[right] = 2 + 4 = 6


CODE:



boolean twosum(int[] arr, int target)
{
Arrays.sort(arr); // O(NlogN)

int left=0, right = arr.length-1;
while (left<right)
{
    if (arr[left] + arr[right] == target)
        return true;
    else if (arr[left] + arr[right] < target)
        left++;
    else
        right--;
}

return false;
}

TC: O(NlogN)
SC: O(1)



(3) Hashing: Set or Map



a + b == target


temp = b = target - a


Approach:
(1) Have "a" in hand
(2) Check for "target-a" in Set/Map
(3) If Exist, 
return true
(4) Else, 
return false

[1,2,3,4,5]
target = 6

a = 1, temp = target-a= 6-1=5

OP: true


CODE:

[1,2,3,4,5]
target = 6

boolean twosum(int[] arr, int target)
{
Map<Integer, Integer> mp = new HashMap<>();

for (i=0; i<arr.length; i++) // O(N)  i=0,1,2, 3
{
    int temp = target - arr[i]; // temp = 5 -> 4 -> 3 -> 2
    
    if (mp.containsKey(temp)) // O(1)
    return true; // [2,1] i present
    
    else
        mp.put(arr[i], i); // [1,0], [2,1], [3,2], [4,3], [5,4]
        // Dry Run: [1,0], [2,1], [3,2],  
}

return false;
}


TC: O(N)
SC: O(N) - HashMap















JS Code:

arr2.sort(function(a,b){return a-b}); // Comparator
- Ascending Order

arr2.sort(function(a,b){return b-a}); // Comparator
- Descending Order



JAVA:

class Pair
{
    int x; 
    int y;
}

First Value of pair
return p1.x-p2.x : ASCENDING
return p2.x-p1.x : DESCENDING - ANS


if (p1.x == p2.x) First value of pair are same, Descending Sort by Second Values
    return p2.y-p1.y






Date : 14th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-1: Youtube Clone Using HTML, CSS and JS

Features

- Top bar with menu button, youtube logo, search box and user settings
- Side bar menu with subscriptions list
- Hamburger icon click replace side bar menu with simple bar menu
- Main video section with most populars videos of each subscriptions channels

TODO:
- Github, Heroku/Netifly Account
- Create Responsive Website and Host on Heroku/Netifly

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"








Project-1: Youtube Clone Using HTML, CSS and JS
Project-2: Reddit Clone Using HTML, CSS and JS
Project-3: Netflix Clone Using HTML, CSS and JS

E2E Projects:
- Create a Repo on Github
- Push the Code
- Host it Live


heroku.com/devang/youtubeclone.com




Weekdays: Web Development - HTML, CSS, JS, PROJECTS, Reactjs
Weekends: DSA-2(Arraylists, Vectors, Linked Lists, Maps, Sets)

DSA-3: DP, Backtracking, Trees, Graphs, CP

+ Assignment Questions





Youtube Clone:

Features

- Top bar with menu button, youtube logo, search box and user settings
- Side bar menu with subscriptions list
- Hamburger icon click replace side bar menu with simple bar menu
- Main video section with most populars videos of each subscriptions channels

TODO:
- Github- DONE
- Heroku/Netifly Account- DONE
- Create Responsive Website and Host on Heroku/Netifly


(1) Github Account - DONE

(2) New Repo: DONE

(3) Name: Youtube Clone By [First Name]: DONE

(4) Heroku Setup






Date : 15th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-1: Youtube Clone Using HTML, CSS and JS

Features

- Top bar with menu button, youtube logo, search box and user settings
- Side bar menu with subscriptions list
- Hamburger icon click replace side bar menu with simple bar menu
- Main video section with most populars videos of each subscriptions channels

TODO:
- Github, Heroku/Netifly Account
- Create Responsive Website and Host on Heroku/Netifly

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"









TODO:
- Github- DONE
- Heroku/Netifly Account- DONE
- Create Responsive Website and Host on Heroku/Netifly


(1) Github Account - DONE

(2) New Repo: DONE

(3) Name: Youtube Clone By [First Name]: DONE

(4) Heroku Setup








Date : 17th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-2: Reddit Clone Using HTML, CSS and JS

Features

- Top bar with menu button, youtube logo, search box and user settings
- Side bar menu with subscriptions list
- Hamburger icon click replace side bar menu with simple bar menu
- Main video section with most populars videos of each subscriptions channels

TODO:
- Github, Heroku/Netifly Account
- Create Responsive Website and Host on Heroku/Netifly

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"














TODO:
- Github- DONE
- Heroku/Netifly Account- DONE
- Create Responsive Website and Host on Heroku/Netifly


(1) Github Account - DONE

(2) New Repo: DONE

(3) Name: Youtube Clone By [First Name]: DONE

(4) Heroku Setup















After Reddit:


(1) Increase and Decrease : Upvote and Downvote

- Reddit Clone

(2) Calculate Total Number of Views on a Page

On Page Load:
display()
{
    ++count;
}

display();





Steps:

(1) Create New Repo - Reddit Clone By ___

(2) Open Github Desktop, Get Repo to Local: Empty Folder

(3) Open Folder in VS Code/Sublime

(4) Create 3 Files:
- index.html
- script.js
- style.css

(5) Code





Navbar:


MY SUBREDDITS - HOME - ALL - RANDOM - USERS -

(1) All Lists 

HTML:

<ul>

<li>....
<li>

</ul>



Make It Hortizontal: CSS
    display: inline; // HORIZONTAL
    display: block // VERTICAL

Remove the Dots from li: CSS
    list-style-type: none;   
    OR 
    list-style: none;


(2) There is - between Lists

HTML:

<ul>

<li>....
<li> - </li>

<li>

</ul>


(3) MY SUBREDDITS - Bold, Rest All - Normal

<strong>__</strong>


(4) Hover - Underline



header li:hover{
    text-decoration: underline;
}


(5) Hover - Bg Color:

    background-color: cornflowerblue;





















Date : 18th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-2: Reddit Clone Using HTML, CSS and JS

Features

- Top bar with menu button, youtube logo, search box and user settings
- Side bar menu with subscriptions list
- Hamburger icon click replace side bar menu with simple bar menu
- Main video section with most populars videos of each subscriptions channels

TODO:
- Github, Heroku/Netifly Account
- Create Responsive Website and Host on Heroku/Netifly

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"





Requirements for Division

1 Div

- Image - DONE
- List 1 (Left), All Bold Items
- List 2 (Right), Some Bold Items




    <div>
        <ul> : List -1 (LEFT)

        </ul>

        <ul>: List-2 (RIGHT) 
            
        </ul>
    </div>



Task: List-1 to the Left and List-2 to the Right

Initial:
a b c   d e f


Final:
a b c                                           d e f


2 Approaches:


HTML Code:
<ul class ="l1">
<ul class ="l2">


(1) CSS:

.l1{
    float:left;
}

.l2{
    float:right;
}


(2) flex:

.l1{
    display:flex;
    justify-content: flex-start;
}

.l2{
    display:flex;
    justify-content: flex-end;
}


(3) Common Space between the items

.list{
  display: flex;
  justify-content: space-around;
}


(4) Optimised Answer


HTML:
<ul>
<ul class ="l2">


CSS:

.l2{
    float:right;
}




   <div>
        <ul> : List -1 (LEFT)
        <li>Hot</li>
        <li>New</li>
        <li>Rising</li>
        <li>Wiki</li>

        </ul>

        <ul>: List-2 (RIGHT) 
            
        </ul>
    </div>


hot new rising controversial top gilded wiki







Functionality:



(1) Arrow Up: Number Should Increase
(2) Arrow Down: Number Should Decrease
(3) A Number- Current Number





<div class = "post-upvotes">
    <div class="arrow-up">

    </div>

    <div id="votes">1000</div>

    <div class="arrow-down">
    
    </div>

</div>


(1) arrow-up> onclick() -> votes> ++count
(2) arrow-down> onclick() -> votes> --count








Project:


- A Button
- An Upvote
- A Doownvote



PAGE:




                    COUNT

                Upvote: Button (Thumbs Up)

                Donwvote: Button (Thumbs Down)




Upvote: ++count
Downvote: --count





Date : 20th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda:

Theory: 

Hashing, Hash Function and Hash Table- DONE
Real Life Applications- DONE
Collision Avoidance Techniques- DONE


Questions:

Q: Count pairs with given sum- DONE
Q: Count frequency of a character in a String- 
Q: Detecting Cycle in a Linked List, using hashing-  
Q: Detecting Cycle in a Linked List, without hashing- 
Q: Distinct Numbers in Window - 
Q: Stores with same items & different prices - 

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




--> HASHING:


Importance:

Interview: Direct Implementation, Collision Avoidance, Internal Implemenmtation

GATE/NET/JRF: 2-4 Ques on Hashing

For any DS/Algo:

- What (NEED/Use Case) 
- Why (Application)
- How (Coding/Implementation) - DONE


WHY ?

Applications:

(1) Mailing Service: Gmail/Outlook etc


username: user@gmail.com
Password: devang



{
    user: devang
}


Flow:


Browser ---PW (devang) -- HASHING (Encryption)--> Server ---- HASHING (Decryption) --> Verify ---> Log In Else Incorrect Password

Will you pass your password as "devang" to server ?
- NO, It can be Easily Hacked

Inspect -> Network -> Fetch XHR

{
username:
password:
}


Solution: 

(1) At Client Side:
Encryption/Hashing 

devang --> &e98e3hdoir4urou98u09 + KEY

(2) At Server Side:

&e98e3hdoir4urou98u09 - KEY-> devang


Hashing = Encryption + Decryption



(2) Shortening URL Services

bit.ly 
tinyurl


Long URL ---> Short URL


(3) Cryptography/ Cyber Security

Username/Password/Access Token --- Function ---> Encrypted Form


Algos:

SHA 256
SHA 512
RSA
MD 5






WHAT ?

-> Arrays:
- Similar Type of data types, Random Access
- Fixed Size

a[idx] - O(1)

-> Linked Lists:
- Dynamic Allocation
- No Fixed Size

-> Stacks 
LIFO: Most Recently Used Element in O(1)

-> Queues:
FIFO: Least Recently Used Element in O(1)





- ArrayList and Vectors:


- Strings:


"We DELIBERATELY Store Values in a PARTICULAR ORDER (Insertion/Deletion) to Solve Some Use Case"



Hashing?

Large Value ---> Hash Function ----> Small Value


Use Case:

Insertion: O(1)
Search/Retrieval : O(1)


O(1) -> NOT Dependent Upon N

Initially, N = 10 Items
Time: 10 seconds

O(1): N = 100: TC: 10 seconds
O(N): N = 100: TC: 100 seconds
O(N^2): N = 100: TC: 100^2 = 10000 seconds





Task:

Class:

500 Students
- Contact Numbers


Requirements:
(1) Insert a New Number : ASAP - O(1)
(2) Search for any given number: ASAP - O(1)


Solutions:


Arrays:

[1,2,5,4,3]

Search: O(N)

[1,2,3,4,5]

Search: O(log N)

Any Way I can do search in O(1) using Array ? - NO


Linked List:

Insertion: O(1)

Search: O(N)


Stacks:

Insertion: O(1)
Search: O(N)

Queues:

Insert: O(1)
Search: O(N)

Arraylist:

Insert: O(1)
Search: O(N)



Requirements:
(1) Insert a New Number : ASAP - O(1) - DONE
(2) Search for any given number: ASAP - O(1) - DONE

YES -- O(1)

HASHING: YES


A = [11,12,13,14,15]

IP: hash(element) ---> hash value: OP

STEPS:
(1) hash() = val
(2) Use that val as Index in Hash Table for that Element

h() = val % 10
ans = A[i] % 10 = [1,2,3,4,5]


Hash Table:

0:
1: 11
2: 12
3: 13
4: 14
5: 15


Search:

find(11)
- Calculate hash value using hash function
- Go to that hash value index in Hash Table


h() = val % 10

11 % 10 = 1    --- O(1)
HT[1] --> 11   --- O(1)

Total: O(1)



Insert:

insert(16)
- Calculate hash value using hash function
- Go to that hash value index in Hash Table and insert the element there


h() = val % 10

16 % 10 = 6 -- O(1)
HT[6] = 16  -- O(1)

Total: O(1)




----> Good Hash Function

(1) Efficiently Computable - Probably in O(1)

Eg: val % 10 -- O(1) 
val % 1000000 -- O(1)


(2) Less Space:

Eg: You have 100 Mn Values, It should NOT take Space for 100 Mn Values

(3) Uniformly Distributed:

100 Elements: Chances of getting into hash table should be equal for ALL Values



DB Company:

- Google Search
- Yandex
- Couch DB
- Yugabyte


Live Demo: DONE




---> Collision And Its Avoidance Techniques:



A = [11,12,13,14,15,22]

h() = val % 10 = 0 to 9

ans = A[i] % 10 = [1,2,3,4,5,2]

Hash Table:

0:
1: 11
2: 12
3: 13
4: 14
5: 15
6:
7:
8:
9:

Collision:
- Two Or More Elements have same hash value 


Use val % 100
ans = [11,12,13,14,15,22]

Hash Table:

0 to 99

Note: To Store 6 Values, I need array/hashtable of 100 Size


----> Collision Avoidance/Resolution Techniques:

(1) Separate Chaining/Open Addressing

[11,12,13,14,15,22]
h()= val % 10

ans = [1,2,3,4,5,2]

Hash Table:

0: LL Record 
1: LL Record 11
2: LL Record 12 -> 22 -> 32 -> 42 -> 52
3: LL Record 13
4: LL Record 14
5: LL Record 15




Adv:
- Removed Collision
- Dynamic Allocation
- No Limit in Size


Disadv:
- Search will become costly


Note:
Insertion: O(1)
Search: O(N)

Eg:

find(52)

    52 % 10 = 2   -- O(1)
    To go to 52: 12 -> 22 -> 32 -> 42 -> 52  O(N)

    Total: O(N)



(2) Linear Probing:

"Occupy the Next Available Position"


16, 26
h() = val % 10

Whatever the next place is empty/available in Hash Table, put the element there.


Hash Table:

0:
1: 11
2: 12
3: 13
4: 14
5: 15
6: 16
7: 26
8:
9:

Now, If I try to insert 27 ?

27 % 10 = 7
7 is already occupied

Next available position = 8, 
Hence, HT[8] = 27


Hash Table:

0:
1: 11
2: 12
3: 13
4: 14
5: 15
6: 16
7: 26
8: 27
9:


while()
{
    HT[idx] !=null
    idx++;
}


HT[9] = null



Adv:
- Removed Collision

Disadv:
- Changed the Order of Hash Values


search(26)

    26 % 10 = 6
    check(6) -> Not Found
    else
        checknext() --> 7,8,9........




(3) Polynomial Probing

Quadratic: h + i^2
i: Number of Collision
h: Hash Value


Polymial: h + i^n



Eg:

Quadratic: h + i^2

16, 26, 36, 96 and h() = val % 10



For 16, i = 0, h = 6, 6 + 0*0 = 6, HT[6] = 16

For 26, i = 1, h = 6, 6 + 1*1 = 7, HT[7] = 26

For 36, i = 2, h = 6, 6 + 2*2 = 10, HT[10] = 36

For 96, i = 3, h = 6, 6 + 3*3 = 15, HT[15] = 96

For 17, i = 1, h = 7, 7 + 1*1 = 8, HT[8] = 17


(4) Double Hashing:

16, 26
h() = val % 10


h1() = val % 10
h2() = h1() + val % 100


16 = 6 -> 6 + 16 = 22 (No Collision)  
26 = 6 -> 6 + 26 = 32

22 = 2 -> 2 + 22 = 24
32 = 2 -> 2 + 32 = 34



Note:

Two Values Giving Collision with 1 Hash Function: Chances: x%

Two Values Giving Collision with 2 Hash Function: Chances: 1 in a Million











Date : 21st February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-2: Reddit Clone Using HTML, CSS and JS

Features

- Top bar with menu button, youtube logo, search box and user settings
- Side bar menu with subscriptions list
- Hamburger icon click replace side bar menu with simple bar menu
- Main video section with most populars videos of each subscriptions channels

TODO:
- Github, Heroku/Netifly Account
- Create Responsive Website and Host on Heroku/Netifly

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"















Date : 23rd February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-2: Reddit Clone Using HTML, CSS and JS

Completed Projects:

(1) Youtube Clone with Home Page and Search API 
(Development —> Hosting on Heroku)

(2) Count and Display Like and Dislike Project on a Webpage
(Development —> Hosting on Heroku)

(3) Reddit Clone- TODAY - DONE

TODO:
- Netflix Clone- TODAY

 Caraousel: USE

- Create Caraousel from Scratch Using CSS: NEXT


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"


UNDERSTANDING CARAOUSEL:

Image/Video/Logo Sliding:

(1) Automatic Sliding
- Timer (Time After which image will slide)
- Loop (Repeat or Not)
- Hover: Stop

(2) User Driven Sliding
- Click (.)
- Right/Left Arrow




Using A Caraousel:

- Use an External Caraousel in CSS and JS: Netflix
- Create Caraousel from Scratch: Next











IDEAS:

(1) In Java: 
- Year is Leap Year or Not

Web Page:

User will Enter A Year: FORM

OP: Leap/Non-Leap


(2) Date Validation

(A) Date() in JS 
(B) Without Date() in JS


Web Page:
User: Enter a Date
OP: Valid/Non-Valid

Eg: 31st June - Invalid
29th Feb (In Non Leap Year) - Invalid


(3) Date to Day Converter

Web Page:

Date:
dd mm yyyy


OP:
Day of Week







Date : 24th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-3: Netflix Clone Using HTML, CSS and JS

Completed Projects:

(1) Youtube Clone with Home Page and Search API 
(Development —> Hosting on Heroku)

(2) Count and Display Like and Dislike Project on a Webpage
(Development —> Hosting on Heroku)

(3) Reddit Clone with Like and Dislike Feature and Progress Bar
(Development —> Hosting on Heroku)

TODO:
- Netflix Clone- TODAY
 Caraousel: USE

- Create Caraousel from Scratch Using CSS: NEXT


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






Date : 25th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-3: Netflix Clone Using HTML, CSS and JS

Completed Projects:

(1) Youtube Clone with Home Page and Search API 
(Development —> Hosting on Heroku)

(2) Count and Display Like and Dislike Project on a Webpage
(Development —> Hosting on Heroku)

(3) Reddit Clone with Like and Dislike Feature and Progress Bar
(Development —> Hosting on Heroku)

TODO:
- Netflix Clone- TODAY
 Caraousel: USE

- Create Caraousel from Scratch Using CSS: NEXT


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






Completed:

- Logo
- Nav Bar
- Bg Image
- Gradient to Bg Image
- Title 
- Description
- Button
- Icons in Button
- Button with Hover
- Size of Button
- BG of Button 




Responsiveness:

Behaviour of Website to Different Screen Sizes
OR
Self-Adjust

General:

0-600px: Phones/ Watches
600-750px: Notepad
750-1000px: PC/Mac
1280px and Above: Large Plasma Screens


Next: 

Caraousel








Date : 27th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda:

Theory: 

Hashing, Hash Function and Hash Table- DONE
Real Life Applications- DONE
Collision Avoidance Techniques- DONE


Questions:

Q: Count pairs with given sum- 
Q: Count frequency of a character in a String- 
Q: Detecting Cycle in a Linked List, using hashing-  
Q: Detecting Cycle in a Linked List, without hashing- 
Q: Distinct Numbers in Window - 
Q: Stores with same items & different prices - 

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"




a = "pqr"  --> 76876
b = "pqr"  --> 76876

Collision - YES


a = 16, b = 16
h() = val % 10


a = 16, b = 16
h() = ?

Collision - YES

NOTE:
If Values are Same --> Hash Value/Hash Code will be Same for Any Hash Function.



a.equals(b) : Check for Hash Code and Not String


a  ---> 97
b  ---> 98
A  ---> 65
a  ---> 97: SAME

set = [a b A]



Insert in SET:
- Take Hash Value of the Element, Check if its already present in set
2 Cases:
(1) If Not present, 
Just Insert
(2) If Already Present,
Do NOT INSERT





--> SET:

Code in JAVA:

        // Create Hash Set
        HashSet<String> set = new HashSet<String>();
        set.add("one"); // Insert- O(1)
        set.add("two");  //- OP, NO OVERWRITE
        set.add("three");
        set.add("two"); // Same HashCode as that of "two" - Not Inserted

        // Print Hash Set
        System.out.println("Hash Set: " + set); // [one two three]

        // Print Size of Hash Set
        System.out.println("Size of Hash Set: " + set.size()); //[3]

        // Remove values from Hash Set
        set.remove("three");

        // Print Hash Set
        System.out.println("Hash Set: " + set); // [one two ]

        // Check if Hash Set contains a value
        System.out.println("Contains: " + set.contains("two")); // Search- O(1)
        


Types of Set:


(1) HashSet
- ArrayList
- No Order Maintained
- O(1) - Best Case
- O(N) - Worst Case

(2) LinkedHashSet
- Linked Lists
- Order Maintained
- O(1) - Best Case
- O(N) - Worst Case


(3) TreeSet
- Red balck Trees
- Sorted Order
- O(1) - Best Case
- O(log N) - Worst Case


a[] = {1,5,3,4,2,1}

HashSet = [1 2 3 4 5] or [3 2 1 4 5] or anything

LinkedHashSet = [1 5 3 4 2]

Treeset = [1 2 3 4 5]











--> MAP


Key: Value Pair



JSON Structure

{
    Name:"Devang",
    Constact_Nos: [1,2,3,4,5....],
    ...
}






Code in JAVA:


       // Create Hash Map
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("4", "five"); // OVERWRITE
        map.put("5", "four");

        //Print Hash Map
        System.out.println("Hash Map: " + map);

        // Print Size of Hash Map
        System.out.println("Size of Hash Map: " + map.size());

        // Check if Hash Map is Empty
        System.out.println("Is Hash Map Empty? " + map.isEmpty()); // false

        // Check if Hash Map contains a Key
        System.out.println("Contains Key 1? " + map.containsKey("1")); // true

        // Check if Hash Map contains a Value
        System.out.println("Contains Value four? " + map.containsValue("four")); // true
         
        // Get Value from Hash Map
        System.out.println("Value for Key 1: " + map.get("1")); // one

        // Remove Key from Hash Map
        map.remove("1");
        
        //Print Hash Map
        System.out.println("Hash Map: " + map);




Types of HashMap:

(1) HashMap
- ArrayList
- No Order Maintained
- O(1) - Best Case
- O(N) - Worst Case

(2) LinkedHashMap
- Linked Lists
- Order Maintained
- O(1) - Best Case
- O(N) - Worst Case


(3) TreeMap
- Red balck Trees
- Sorted Order
- O(1) - Best Case
- O(log N) - Worst Case





Questions:

Q: Count pairs with given sum- DONE
Q: Count frequency of a character in a String- 
Q: Detecting Cycle in a Linked List, using hashing-  DONE
Q: Detecting Cycle in a Linked List, without hashing-  DONE
Q: Distinct Numbers in Window - 
Q: Stores with same items & different prices - 








Q: [Google]
Given a Linked List, Check whether there is a Cycle or Not.

Cycle is also called Loop in a Linked List


Cycle -> A Node is visited More than once while traversing the Linked List



Edge Cases:

head: 1 -> 2 -> NULL

OP: false


head: 1 -> 2 -> 3 -> 4 -> 5
          /|\             |
           |              |
           |______________|


OP: true

Traverse:

1 2 3 4 5 2 3 4 5 2 3 4 5 2 3 4 5...........

OP: TLE


(3) LL: 1 -> 2 -> 3 -> 4 -> 5 -> 2 -> NULL 

OP: false

(4) 2 -> 2 -> 2 -> 2 -> null

OP: No Cycle

(5) LL: 1 -> 2 -> 3 -> 4
             |_________|

OP: true






Solution:

INCORRECT:

if (node.next!=null)
    return true;
else
    return false;

OP:

1 2 3 4 2 3 4 2 3 4.......
TLE



Without Hashing:

Track: 400 M- Circular

A: 10 km/h, B: 20 Km/h


If in time 't', A covers 1 lap.
How much lap will B cover ?


Ans: 2 Laps


Circular Track:
A will meet B when B has already covered 1 lap.

Parallel Track:
A and B will never meet



Approach:

- slow, fast -> head
- slow: x, fast: 2x
- if slow == fast: CYCLE
- else, No Cycle

TC: O(N)
SC: O(1)



CODE:

    public boolean hasCycle(ListNode head) {
    
    if (head == null)
        return false;
        
     ListNode slow= head;   
     ListNode fast= head;   
        
    while (fast.next!=null && fast.next.next!=null)
    {
        slow = slow.next; // x speed
        fast = fast.next.next; //2*x speed
            
        if (slow == fast)
            return true; // There is a Cycle
        
    }
        
        return false; // No Cycle
    }


TC: O(N)
SC: O(1)







With Hashing:

Approach:
- Insert Node in Set
- Check If Node is Repeated or Not (s.contains(node))

CODE:

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        HashSet<ListNode> s = new HashSet<ListNode>();
        
        while(head!=null)
        {
        if (s.contains(head)) // Node Already Contained --> Cycle
            return true;

        s.add(head);
        head = head.next;
        }

        return false; // No Cycle
    }


(5) LL: 1 -> 2 -> 3 -> 4
             |_________|

OP: true







Q: [JPMC, GS, Paypal, Adobe] Distinct Numbers in Window 




You are given an array of N integers, A1, A2 ,…, AN and an integer K. 
Return the of count of distinct numbers in all windows of size K.

Formally, return an array of size N-K+1 where i’th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,…, Ai+k-1.

Note: If K > N, return empty array.

Input :
A = [1, 2, 1, 3, 4, 3]
K = 3

Output :
[2, 3, 3, 2]

Explanation
All windows of size K are
[1, 2, 1]
[2, 1, 3]
[1, 3, 4]
[3, 4, 3]



Solution:


N Numbers, Windows of Size K.

Total Number of Sliding Windows = N-K+1


NCK
N/K: Independet Windows
N-K


A = [1, 2, 1, 3, 4, 3]
K = 3


N = 6
K = 3

Total Sliding Windows = 6-3+1 = 4


Sliding Windows:

[1 2 1]: 2
[2 1 3]: 3
[1 3 4]: 3
[3 4 3]: 2


OP: [2 3 3 2]


[1 2 1] - Insert in Set

set = [1 2]
set.size() = 2


Approach:

(1) Create N-K+1 Sliding Windows
(2) Put Values in Sliding Windows and Print set.size()





















Date : 28th February 2022
Mentor: DEVANG SHARMA
Batch: November Batch - 4 and 5
Agenda : Project-3: Netflix Clone Using HTML, CSS and JS

Completed Projects:

(1) Youtube Clone with Home Page and Search API 
(Development —> Hosting on Heroku)

(2) Count and Display Like and Dislike Project on a Webpage
(Development —> Hosting on Heroku)

(3) Reddit Clone with Like and Dislike Feature and Progress Bar
(Development —> Hosting on Heroku)

TODO:
- Netflix Clone- TODAY
 Caraousel: USE

- Create Caraousel from Scratch Using CSS: NEXT


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
"We Will Start immediately After Every one has joined the session"






Completed:

- Logo
- Nav Bar
- Bg Image
- Gradient to Bg Image
- Title 
- Description
- Button
- Icons in Button
- Button with Hover
- Size of Button
- BG of Button 




Responsiveness:

Behaviour of Website to Different Screen Sizes
OR
Self-Adjust

General:

0-600px: Phones/ Watches
600-750px: Notepad
750-1000px: PC/Mac
1280px and Above: Large Plasma Screens


Next: 

Caraousel





Structure of Caraousel:



<div class="carousel-films">
    <div class="owl-carousel owl-theme">

    <div class="item">
    
        </div>

        <div class="item">
    
        </div>

        <div class="item">
    
        </div>

        <div class="item">
    
        </div>




    </div>
</div>





---> Structure of item:



    <div class="item">
        <img class="box-film" src="" alt=""/>

        </div>

        
























