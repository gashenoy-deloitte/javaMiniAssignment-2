package com.company;

interface Test{
    public int square();
}

class arithmetic implements Test{
    int x;

    arithmetic(int a){
        x = a;
    }

    public int square(){
        return (x*x);
    }

}
class ToTestInt
{
    public int return_ans(int a)
    {
        arithmetic b=new arithmetic(a);
        return b.square();
    }
}
class Main{
    public static void main(String []args){
        ToTestInt x= new ToTestInt();
        System.out.println("The square of 11 is "+x.return_ans(11));
    }
}