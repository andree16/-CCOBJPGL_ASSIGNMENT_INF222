public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Shorkie myPet = new Shorkie();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
        System.out.println(myPet.address);
        System.out.println(myPet.nose);
    }
}