package Rectangle_Area;
class area{
    float length;
    float breadth;
    void getData(float a, float b){
        length=a;
        breadth=b;
    }
}
public class RectangleArea{
    public static void main(String[] args) {
        float RectangleArea;
        area a=new area();
        a.getData(5,5);
        RectangleArea = a.length * a.breadth;
        System.out.println("Rectangle Area : "+RectangleArea);
    }
}
