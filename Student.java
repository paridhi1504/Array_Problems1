 class Student1 {
    protected String name;
    protected int age;
    protected String address;

    // Constructor
    public Student1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
class Student{
    public static void main(String[] args) {
            Student1 paridhi = new Student1("Paridhi", 20,"Bihar");
        System.out.println(paridhi.getName());
        System.out.println(paridhi.getAge());
        System.out.println(paridhi.getAddress());

    }
}
