public class Main {
    public static void main(String[] args) {
        //                 מחלקה היא קובץ של קוד שמתאר ומכיל פורמט של עצמים
        //
        //                        OBJECT מופע אובייקט עצם או משתנה
        //                ClassName objectName = new ClassName();
        //

        Person p1= new Person();
        Person p2=new Person();
        p1.name="lior";
        p1.id=31111;
        p1.height=1.78;
        p1.isMarried=false;
        System.out.println(p1.name);
        System.out.println(p1.id);
        System.out.println(p1.height);
        System.out.println(p1.isMarried);

        p2.id= 315848;
        p2.height=1.84;
        p2.isMarried=true;
        System.out.println(p2.name);
        System.out.println(p2.id);
        System.out.println(p2.height);
        System.out.println(p2.isMarried);
        p1.sleep();
        p2.sleep();

        Cup es=new Cup();
        es.size='s';
        es.typeOfDrink="dark coffee";
        System.out.println(es.size);
        es.drink();

    }
}
