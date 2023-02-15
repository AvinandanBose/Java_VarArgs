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
