# Java_VarArgs


<h1 align="Center"> Introduction </h1>

<h3>Beginning with JDK 5 , Java has included a feature that simplifies the creation of methods that need to take variable number of arguments. This feature is called <i>varargs</i> and it is short for <i>variable-length arguments.</i> A method that takes a variable number of arguments is called a variable-arity method , or simply a varargs methods .</h3> 


<h3> Prior to JDK5 , variable -length arguments could be handled in two ways:</h3>

<ul>
<ul>

<h3> <li> 1. First, if the  maximum number of arguments was small and known , they we could create overloaded versions of the method, one for each way the method could be called. </li> </ul>


<h3 align=left>

```Syntax

//Method Overloading 

public class varargs1 {
    

    //Increasing the number of arguments in the method signature
    public void add(int a , int b){}
    public void add(int a , int b , int c){}
	

    //Interchanging the method signature 
    public void sub(int a , float b){}
    public void sub(float b , int a ){}

    //Changing the type of the arguments
    public void div(int a, float b) {}
    public void div(String  a, String b) {}

   public static void main(String[] args){
        varargs1 a = new varargs1();
        varargs1 b = new varargs1();
        varargs1 c = new varargs1();
        // .....etc.

        a.add(1, 2);
        b.add(1, 2, 3);
        c.sub(1, 2.9f);
        a.sub(2.9f, 1);
        b.div(1, 2);
        c.div("1", "2");
   }
    


    
}


```

</h3>
</ul>
</ul>

<ul>
<ul>

<h3> <li> 2. Second Aproach is used in which the arguments were put into an array and then the array was passed to the method. </li> </ul>


<h3 align=left>

```Syntax

public class varargs1 {
    

   static void vaTest(int v[]){ 
         System.out.println("Number of args: " + v.length);
         System.out.println("Contents: ");
         for(int i = 0; i < v.length; i++)
              System.out.println("  arg " + i + ": " + v[i]);
         System.out.println();
   }

   public static void main(String args[]){
         int n1[] = {10};
         int n2[] = {1, 2, 3};
         int n3[] = {};
         vaTest(n1); // 1 arg
         vaTest(n2); // 3 args
         vaTest(n3); // no args
   }


    
}


```
</h3>


<h3> In the program, the method <i> vaTest() </i> is passed its agruments through the array <i> v </i> . This old-style approach to variable-length arguments does enable <i>vaTest()</i> to take an arbitrary number of arguments .However, it requires that these arguments be manually packaged into an array prior to calling vaTest(), as shown below :</h3>

<h3 align=left>

```Syntax

//Arbitratry Number of Arguments

Say In Above Example:

int n[] = {10};

No. of Arguments = 1.
Elements of Array n[] = 10.

Similarly ,
 
 int n2[] = {1, 2, 3};
 No. of Arguments = 3
 Elements of Array n2[] = 1,2,3 .
 
 int n3[] = {};
 
 No. of Arguments = 0
 
 And They are manually packaged into Arrays:
 
 n[] , n2[] and n3[] and passed into Method:
 
 vaTest().


```
</h3>

<h3> <i></ins>Note</ins> There are two problems :</i></h3>
<ul>
<h3> <li>1. It is tedious to construct an array each time vaTest() is called. </li></h3>
<h3> <li>2. It is potentially error prone.</li></h3>
</ul>
</ul>
</ul>


<h1 align="Center"> VarArgs </h1>
<h3> Java introduced a <i>Three Peroid Operator (...) </i> to specify variable length argument . </h3>
<h3> Note now the way that <i>vaTest</i> is written is : </h3>
<ul>

<h3 align=left>
	
```Syntax

static void vaTest(int ...v){}
	
```

</h3>

<h3> <a href="https://github.com/AvinandanBose/Java_VarArgs/blob/main/varargs1.java"> Demonstration of VarArgs In Java </h3>

<h3 align=left>
	
```Syntax

static void vaTest(int... v) {

System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x : v){
            System.out.print(x + " ");
        }
        //OR

        // for (int i = 0; i < v.length; i++) {
        //     System.out.print(v[i] + " ");
        // }

        System.out.println();
}

public static void main(String args[]){

vaTest(10);  //1 args
vaTest(1,12,3); // 3 args 
vaTest(); // no args
}
	
```

</h3>

<h3> <i><ins>Explanation:</ins></i> Here <i> vaTest() </i> is the function , where <i> v</i> is an array. The ... syntax simply tells the compiler that a variable number of argument will be used ,  and that these arguments will be stored in the array by <i>v</i> . Secondly, in main() function, vaTest() is called with different numbers of arguments, including no arguments at all. The arguments are automatically put in an array and passed to <i>v</i>. In case of no arguments, the length of the array is zero. </h3>


<h3> <i> <li> 1 . A method can have "normal" parameters along  wiht a variable-length parameter. However the variable-length parameter must be declared by the method. </li></i></h3>

<h3> <a href="https://github.com/AvinandanBose/Java_VarArgs/blob/main/varargs2.java"> Example -1 </h3>

<h3 align=left>
	
```Syntax

int doIt(int a, int b, double c,  int ... vals){}

Here first three arguments are matched according to their types.
Then any remaining arguments are assumed to belongs to vals.
	
```

</h3>

<h3> <i> <li> 2 . The varargs parameter must be last. </li></i></h3>

<h3 align=left>
	
```Syntax

int doIt(int a, int b, double c,  int ... vals, boolean stopFlag){
	
//Error
	
}
	
```
</h3>
	
<h3> <i> <li> 3 . There must be only one varargs parameter. </li></i></h3>

<h3 align=left>
	
```Syntax

int doIt(int a, int b, double c,  int ... vals, double ...morevals){
	
//Error
	
}
	
Attempt to declare the second varargs parameter is illegal.
	
```
</h3>


</ul>

<h1 align="Center"> Overloading Vararg Methods </h1>
<ul>
<h3> <i> We can overload a method that takes a variable-length argument. </i></h3>

<h3> <a href="https://github.com/AvinandanBose/Java_VarArgs/blob/main/varargs3.java"> Example -2 </h3>

<h3 align="Center">

```Syntax

 static void vaTest(int ... v) {}
 
 static void vaTest(boolean ... v) {}
 
 static void vaTest(String msg, int ... v) {}

```
</h3>

<h3> <i> The above  program illustrates both ways that a varargs method can be overloaded .There are two types :</i> </h3>

<ul>
<h3> <i> <li> 1. First the types of its vararg parameter can differ . This is the case for vaTest(int..) and vaTest(boolean...). ` ...`  "The Triple Period Operator" causes the parameter to be treated as an array of the specified type.  As we can overload methods by using different of array parameters , here also we can overload vararg methods by using different types of varargs . In this case , Java uses the type difference to determine which overloaded method to call.</li></i></h3>

<h3> <i> <li> 2. The second way to overload a varargs method is to add one or more normal parameters. This is what was done with vaTest(String, int...). In this case, Java uses both the number of arguments and the type of the arguments to determine which method to call.</li></i></h3>


</ul>
</ul>

