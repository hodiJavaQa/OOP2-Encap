public class Circle {
   //data
    double radius;

//fun
    double clacArea(double r){
        return r*r*3.14;
    }

    double calcHekef(double r){
        return  2*r*3.14;
    }

    @Override
    public String toString(){
        return "radius "+this.radius;
    }

}
