package com.company;
class Box {
    int length;
    int breadth;

    public Box(int length, int breadth) {       //constructor
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){                          //finding out the area
        return length*breadth;
    }
}

class Box3d extends Box{
    int height;

    public Box3d(int length, int breadth, int height) {       //constructor
        super(length, breadth);
        this.height = height;
    }

    public Box3d(int length, int breadth) {                 //finding out the volume
        super(length, breadth);
    }

    public int volume(){
        return super.area()*height;
    }
    public static void main(String args [ ])
    {
        Box b1 = new Box(10,12);
        Box3d b2 = new Box3d(11,11,11);

        System.out.println ("The area of box1 is " + b1.area( ) );
        System.out.println ("The volume of box2 is " + b2.volume ( ));
    }
}