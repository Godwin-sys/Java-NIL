// fields to calculate area
//create area Class
class Area {
//declaring variables
    int length;
    int breadth;
    
    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // method to calculate area
    public void getArea() {
        //area= lenth 8*breadth
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
    }
    
    class Main {
    public static void main(String[] args) {

    // creating an obj
        Area rectangle = new Area(2, 16);
        //calling class in an obj
        rectangle.getArea();
    }
    }
    