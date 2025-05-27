package Program2;


class RectangleArea{
    double length,breadth;

    RectangleArea(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void show(){
        System.out.println("length:"+length+"breadth:"+breadth+(2*length+breadth));
    }
    public static void main(String[] args){
        RectangleArea r1=new RectangleArea(2.5,2.5);
        r1.show();
    }
}