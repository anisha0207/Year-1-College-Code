public abstract class Animal{
    private String name;
    private double weight;
    private int age;
    private static int numAnimals = 0;

    protected Animal(String name, int age, double weight){
        this.name = name;
        this.weight = weight;
        this.age = age;
        numAnimals++;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public static int getNumAnimals(){
        return numAnimals;
    }
    public void eat(){
        System.out.println("meal time!");
    }
    public void sleep(){
        System.out.println("ZzzzZzzz");
    }
    @Override
    public boolean equals (Object o){
        if(o instanceof Animal){ 
            Animal temp = (Animal) o;
            boolean comp1 = this.name.equals(temp.name);
            boolean comp2 = age == temp.age;
            return comp1 && comp2;
         }
         return false;
    }
    @Override
    public String toString(){
        return "Name: " + name+ "; Age: " + age + ", Weight: " + weight;
    }
}