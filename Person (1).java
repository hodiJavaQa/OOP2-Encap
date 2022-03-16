public class Person {
    //data
    String name="hodi";
    int id=1;
    double height=3.0;
    boolean isMarried=false;

    //functionality
    void sleep(){
        System.out.println("wake me up in 8 hours");
    }


    @Override
    public String toString(){
        return "Person"+this.name+" "+this.id+" "+this.height;
    }
}
