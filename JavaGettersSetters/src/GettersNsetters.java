public class GettersNsetters {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {

        GettersNsetters getSetters = new GettersNsetters();
        getSetters.setName("Anik");
        getSetters.setAge(29);

        System.out.println(getSetters.getName());
        System.out.println(getSetters.getAge());
    }
}