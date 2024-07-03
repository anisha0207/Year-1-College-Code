public class Cat extends Animal{
    private String breed;
    private static int numCats = 0;

    public Cat (String name, int age, double weight, String breed){
        super(name, age, weight);
        this.breed = breed;
        numCats++;
    }
    public static int getNumCats(){
        return numCats;
    }
    public String getBreed(){
        return breed;
    }
    public void bat(){
        System.out.println("don't touch me!");
    }
    public void purr(){
        System.out.println("meow");
    }
    
    @Override
    public String toString(){
        return "Cat " + super.toString() + "; Breed: " + breed;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Cat){ 
            Cat temp1 = (Cat) o;
            boolean comp3 = super.getName().equals(temp1.getName()) && super.getAge() == temp1.getAge();
            boolean comp4 = this.breed.equals(temp1.breed);
            return comp3 && comp4;
         }
         return false;
    }
}
