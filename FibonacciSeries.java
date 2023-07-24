//  PRINT FIBBONACCI SERIES JAVA : 
//  1    2   3  5  8  13  21  34  55  89 

class Fibonacci_Series {

    public static void main(String[] args) {
        
     int T1 =0;
     int T2 =1;
     int T3;

    for (int i = 0; i < 10; i++) {
        T3=T1+T2;
        System.out.println(T3);
        T1=T2;
        T2=T3;
    }
    }
}