public class Cup {
    char size='M';
    String typeOfDrink= "tea";


    void drink(){
        System.out.println("drinking .......");
    }
    void spell(){
        System.out.println("ohh god no the coffee is everywhere");
    }


    @Override
    public String toString() {
        return "Cup{" +
                "size=" + size +
                ", typeOfDrink='" + typeOfDrink + '\'' +
                '}';
    }
}
