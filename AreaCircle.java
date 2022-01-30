class Circle {
    public double r;

    public double area() {
        return 3.14 * r * r;
    }

    public double circ() {
        return 2 * 3.14 * r;
    }

}

class AreaCircle {
    public static void main(String args[]) {

        Circle c = new Circle();
        c.r = 5;

        double are = c.area();
        double cir = c.circ();
        System.out.println("the area is :" + are);
        System.out.println("the circumference is:" + cir);
    }
}