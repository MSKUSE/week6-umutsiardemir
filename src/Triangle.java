public class Triangle {

    private Point topLeft;
    private int sideA,sideB,sideC;

    public Point getTopLeft() {return topLeft;}
    public int getSideB() {return sideB;}


    public Triangle(Point topLeft, int sideA, int sideB, int sideC) {
        this.topLeft = topLeft;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    public void setSideA(int sideA) {
        if(sideA < 0){
            this.sideA = sideA;
            System.out.println("sideA cant be negative");
        }else
            this.sideA = sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public Triangle(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public Triangle(int sideA) {
        this.sideA = sideA;
    }

    public int area() {
        return (this.sideA*this.sideB)/2;
    }























}





