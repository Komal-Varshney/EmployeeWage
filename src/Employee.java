public class Employee {
    String name;
    int id;
    boolean attendance;
    int normalWorkday = 8;
    int salPerHour = 20;
    double dailySal = 0;

    public void attendance(boolean a){
        if(a){
            attendance = true;
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }

    public void calculateWage(){
        if(attendance){
            dailySal = normalWorkday*salPerHour;
        }else{
            dailySal = 0;
        }
        System.out.println(dailySal);
    }

    // constructor
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
}
