public class JavaProgram {
    public static void main(String []args) {
        vehicle voiture1 = new vehicle("Volkswagen", "Scirocco", 2008);
        car voiture2 = new car("Ferrari", "Testarossa", 1984, 1656, 4);
        truck voiture3 = new truck("Scania", "Frostfire", 2022, 6000, 6);
        motorcycle voiture4 = new motorcycle("Kawazaki", "Ninja", 2013, 170, 2);
        
        System.out.println("--------------------------------");
        System.out.println("Exercice 1 Output\n");

        voiture1.Describe();
        voiture1.Accelerate();

        System.out.println("\n--------------------------------\n");
        
        voiture2.Describe();
        System.out.println();

        voiture3.Describe();
        System.out.println();

        voiture4.Describe();
    }
}