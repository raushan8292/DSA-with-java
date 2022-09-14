package inheritance;

public class UseManger {

    public static void main(String[] args) {

        Manger boss;
        boss = new Manger();

        boss.setData("Ram", 555);
        boss.setBouns(55.5);

        System.out.println("your Name "+  boss.getName());
        System.out.println("your sal "+  boss.getSal());
        System.out.println("Total income " + boss.getincome());
    }
}
