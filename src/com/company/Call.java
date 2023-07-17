package  com.company;
class Call {
    int num1=6;
    int num2=10;

    public int sum(int a, int b) {
        int res= a+b;
        return res;
    }

    public void add(int x, int y){
        System.out.println("Sum2= "+ (x+y));
    }
}
class CallBy{

    public static void main(String[] args) {
        Call obj1= new Call();
        int result= obj1.sum(15,5);          // call by value
        System.out.println("Sum1= " + result);     // call by reference
        obj1.add(obj1.num1, obj1.num2);
    }
}