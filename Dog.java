public class Dog extends Animal{
    private String breed;
    private static int numDogs = 0;

    public Dog (String name, int age, double weight, String breed){
        super(name, age, weight);
        this.breed = breed;
        numDogs++;
    }
    public String getBreed(){
        return breed;
    }
    public static int getNumDogs(){
        return numDogs;
    }
    public void growl(){
        System.out.println("grrr");
    }
    public void play(){
        System.out.println("throw me a bone!");

    }
    @Override
    public String toString(){
        return super.toString()+ "; Breed: " + breed;

    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Dog){ 
            Dog temp2 = (Dog) o;
            boolean comp5 = super.getName().equals(temp2.getName()) && super.getAge() == temp2.getAge();
            boolean comp6 = this.breed.equals(temp2.breed);
            return comp5 && comp6;
         }
         return false;
    }
}

