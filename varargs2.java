public class varargs2 {

    int doIt(int a, int b, double c,  int ... vals){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        int sum = 0;
        for (int x: vals){
            sum += x;
        }
        return sum;
     
    }


    public static void main(String args[]) {
        varargs2 v = new varargs2();
        System.out.println(v.doIt(1, 2, 3.0, 4, 5, 6, 7, 8, 9, 10));
    }
    
}
