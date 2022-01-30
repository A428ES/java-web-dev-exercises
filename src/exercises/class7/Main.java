package exercises.class7;

public class Main {
    public static void main(String args[]){
        SmartPhone elijahPhone = new SmartPhone(800, 900, "999-999-9999");
        SmartPhone melissaPhone = new SmartPhone(1000, 1000, "888-888-8888");
        Laptop elijahLaptop = new Laptop(800, 900);
        Laptop melissaLaptop = new Laptop(8000, 9000);

        System.out.println(elijahPhone.getId());
        System.out.println(elijahLaptop.getId());
        System.out.println(melissaPhone.getId());
        System.out.println(melissaLaptop.getId());


        // close lid
        elijahLaptop.changeLidStatus();
        System.out.print(elijahLaptop.getStatus());
    }
}
