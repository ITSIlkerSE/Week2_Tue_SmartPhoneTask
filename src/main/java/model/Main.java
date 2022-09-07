package model;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend();
        friend1.setName("Ilker");
        friend1.setNickname("IlkerDosSantos");
        friend1.setPhoneNumber("2832190832190");

        Friend friend2 = new Friend();
        friend2.setName("Peter");
        friend2.setNickname("Peddr");
        friend2.setPhoneNumber("421511");

        Contact[] contacts = {friend1, friend2};

        Smartphone smartphone1 = new Smartphone();
        smartphone1.setContacts(contacts);
        smartphone1.setModel("6 plus");
        smartphone1.setManufacturer("iphone");


        System.out.println(smartphone1);

    }
}
