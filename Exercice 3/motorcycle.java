public class motorcycle extends vehicle {
    int Weigh;
    int Wheels;

    public motorcycle(String brand, String model, int year, int weigh, int wheels) {
        super(brand, model, year);
        Weigh = weigh;
        Wheels = wheels;
    }

    public void Describe()  {
        System.out.print("I'm a " + Brand + " " + Model);
        System.out.println(" made in " + Year + ".");
        System.out.print("I am a motorcycle, I weight ");
        System.out.println(Weigh + " and I have " + Wheels + " Wheels.");
    }
    public void Accelerate()    {
        System.out.println("My " + Brand + " goes like this : broooooaaaaaAAAAAAARRRR !");
    }
}