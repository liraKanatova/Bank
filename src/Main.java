public class Main {
    public static void main(String[] args) {
        Person person1=new Person(123,"Asan","Asanov",20,"Asan_@mail,ru","+996505505050",new Bank(12222),Payments.COMSERVICE);
        Person person2=new Person(124,"Isan","Isanov",21,"Isan_@mail,ru","+996505505050",new Bank(12222),Payments.MOBLECOMMUNICATION);
        Person person3=new Person(125,"Uson","Usonov",22,"Uson_@mail,ru","+996505505050",new Bank(12222),Payments.SERVICETAXI);
        Person person4=new Person(126,"Aslan","Aslanov",23,"Aslan_@mail,ru","+996505505050",new Bank(12222),Payments.MOBLECOMMUNICATION);
        person1.getBankAccount().transferMoney(Payments.MOBLECOMMUNICATION);
        person1.getBankAccount().transferMoney(Payments.MOBLECOMMUNICATION,person1.getPhonNumer());
    }
}