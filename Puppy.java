public class Puppy {
    int puppyAge;
    public Puppy(String name) {
        System.out.println("name of dog: " + name);
    }
    public void setAge(int age) {
        puppyAge = age;
    }
    public int getAge() {
        System.out.println("age of dog: " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tom");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("value: " + myPuppy.puppyAge);
    }
}
