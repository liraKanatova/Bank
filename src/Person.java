public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phonNumer;
    private Bank bankAccount;
    private Payments payments;

    public Person(long id, String firstName, String lastName, int age, String email,String phonNumer, Bank bankAccount, Payments payments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        checkAge(age);
        checkEmail(email);
        chekphoneNumer(phonNumer);
        this.bankAccount = bankAccount;
        this.payments = payments;

    }
    private void checkAge(int age){
        if (age>0&&age<127){
            this.age=age;
        }
        else {
            System.out.println(" Жаш туура эмес берилип жатат ! ");
        }

    }
    private void checkEmail(String email){
        if (email.contains("@")){
            this.email=email;
        }
        else {
            System.out.println(" Email туура эмес !");
        }
    }
    private void chekphoneNumer(String phonNumer){
        if(phonNumer.startsWith("+996") && phonNumer.length() == 13){
            this.phonNumer=phonNumer;
        }
        else {
            System.out.println("Кыргыз мобильный номер телефонду гана алабыз деп чыксын!");
        }
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonNumer() {
        return phonNumer;
    }

    public void setPhonNumer(String phonNumer) {
        this.phonNumer = phonNumer;
    }

    public Bank getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Bank bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phonNumer=" + phonNumer +
                ", bankAccount='" + bankAccount + '\'' +
                ", payments=" + payments +
                '}';
    }
}














