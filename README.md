# Java_VarArgs

<h3>Beginning with JDK 5 , Java has included a feature that simplifies the creation of methods that need to take variable number of arguments. This feature is called <i>varargs</i> and it is short for <i>variable-length arguments.</i> A method that takes a variable number of arguments is called a variable-arity method , or simply a varargs methods .</h3> 


<h3> Prior to JDK5 , variable -length arguments could be handled in two ways:</h3>
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
