import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Animal[][] pets = new Animal[2][13];
        // The first row (pets[0]) will correspond to all of the dogs
        // The second row (pets[1]) will correspond to all of the cats

        fillDogs(pets[0]);
        fillCats(pets[1]);

        boolean loopNeeded = true;

        do {
            printMenu();
            System.out.println("Enter your menu choice (1-4)");
            int choice = getInt(scn);
            scn.nextLine();
            switch (choice) {
                case 1:
                    printAnimals(pets);
                    break;
                case 2:
                    System.out.println("Cat or Dog to search for?");
                    String type = scn.nextLine(); // assume valid
                    //scn.nextLine();
                    System.out.println("Name of Cat or Dog?");
                    String name = scn.nextLine(); // assume valid
                    //scn.nextLine();
                    System.out.println("Age?");
                    int age = getInt(scn); // Integer.parseInt(nextLine())
                    //scn.nextLine();
                    System.out.println("Weight?");
                    double weight = getDouble(scn); // Double.parseDouble(nextLine())
                    scn.nextLine();
                    System.out.println("Breed?");
                    String breed = scn.nextLine(); // assume valid

                    System.out.println("Type: " + type);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Weight: " + weight);
                    System.out.println("Breed: " + breed);

                    Animal key;
                    if (type.equals("Dog")) {
                        key = new Dog(name, age, weight, breed);
                    } else {
                        key = new Cat(name, age, weight, breed);
                    }
                    findAnimals(pets, key);
                    break;
                case 3:
                    sortAnimals(pets);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    loopNeeded = false;
                    break;
                default:
                    System.out.println("Invalid menu choice");
            }
        } while (loopNeeded);
    }

    public static void printAnimals(Animal[][] list) {
        // Be sure to display the average weight and age for all dogs, cats, and animals.
        double totalWeightDogs = 0;
        double totalWeightCats = 0;
        int totalAgeDogs = 0;
        int totalAgeCats = 0;
        int totalDogs = 0;
        int totalCats = 0;

        System.out.println("Dogs to Adopt:");
        for (int i = 0; i < list[0].length; i++) {
            //if (list[0][i] != null) {
                Dog d = (Dog) list[0][i]; // Cast to Dog
                System.out.println(d);
                totalDogs++;
                switch (i % 4) {
                    case 1:
                        d.eat();
                        break;
                    case 2:
                        d.sleep();
                        break;
                    case 3:
                        d.growl();
                        break;
                    case 4:
                        d.play();
                        break;
                }
                totalWeightDogs += d.getWeight();
                totalAgeDogs += d.getAge();
            //}
        }
        System.out.println("Average weight of all dogs: " + (totalWeightDogs / totalDogs));
        System.out.println("Average Age of all dogs: " + (totalAgeDogs / totalDogs));

        System.out.println("Cats to Adopt:");
        for (int i = 0; i < list[1].length; i++) {
            //if (list[1][i] != null) {
                Cat c = (Cat) list[1][i]; // Cast to Cat
                System.out.println(c);
                totalCats++;
                switch (i % 4) {
                    case 1:
                        c.eat();
                        break;
                    case 2:
                        c.sleep();
                        break;
                    case 3:
                        c.purr();
                        break;
                    case 4:
                        c.bat();
                        break;
                }
                totalWeightCats += c.getWeight();
                totalAgeCats += c.getAge();
            //}
        }
        System.out.println("Average weight of all cats: " + (totalWeightCats / totalCats));
        System.out.println("Average Age of all cats: " + (totalAgeCats / totalCats));
        System.out.println("\nAverage weight of all animals: " + ((totalWeightDogs + totalWeightCats) / (totalDogs + totalCats)));
        System.out.println("Average Age of all animals: " + ((totalAgeDogs + totalAgeCats) / (totalDogs + totalCats)));
    }

    public static void findAnimals(Animal[][] list, Animal key) {
        int index = -1;
        if (key instanceof Dog) {
            for (int i = 0; i < list[0].length; i++) {
                if (list[0][i].equals(key)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Dog not found");
            } else {
                System.out.println("Dog found: ");
                System.out.println(list[0][index]);
            }
        } else {
            for (int i = 0; i < list[1].length; i++) {
                if (list[1][i].equals(key)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Cat not found");
            } else {
                System.out.println("Cat found: ");
                System.out.println(list[1][index]);
            }
        }
    }

    public static void sortAnimals(Animal[][] list) {
        insertionSort(list[1]);
        selectionSort(list[0]);
    }

    public static void insertionSort(Animal[] list) {
        // insertion sort ascending order by name
        for (int i = 1; i < list.length; i++) {
            Animal key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].getName().compareTo(key.getName()) > 0) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void selectionSort(Animal[] list) {
        // selection sort descending order by weight
        for (int i = 0; i < list.length - 1; i++) {
            int index = i;
            Animal maxWeight = list[i];

            for (int j = i + 1; j < list.length; j++) {
                if (list[j].getWeight() > maxWeight.getWeight()) {
                    index = j;
                    maxWeight = list[j];
                }
            }

            if (index != i) {
                list[index] = list[i];
                list[i] = maxWeight;
            }
        }
    }

    public static int getInt(Scanner s) {
        // read an integer from input
        while (!s.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            s.next();
        }
        return s.nextInt();
    }

    public static double getDouble(Scanner s) {
        // read a double from input
        while (!s.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a double.");
            s.next();
        }
        return s.nextDouble();
    }

    public static void printMenu() {
        // print the menu options
        System.out.println("1. Display Animals to Adopt");
        System.out.println("2. Find an Animal");
        System.out.println("3. Sort Animals");
        System.out.println("4. Exit");
    }

    public static void fillDogs(Animal[] list) {
        // fill the list with dog objects
        list[0] = new Dog("amelia", 6, 34.5, "basset hound mix");
        list[1] = new Dog("doug", 3, 74.5, "goldendoodle");
        list[2] = new Dog("lady", 9, 21.5, "mutt");
        list[3] = new Dog("sam", 11, 92.4, "golden retriever");
        list[4] = new Dog("george", 4, 75.8, "dalmation");
        list[5] = new Dog("mr. ruffles", 6, 69.4, "labrador");
        list[6] = new Dog("tiny tim", 6, 104.2, "sheepadoodle");
        list[7] = new Dog("the loaf", 2, 18.3, "corgi");
        list[8] = new Dog("rider", 1, 75, "german shepherd");
        list[9] = new Dog("gemma", 7, 69.5, "husky");
        list[10] = new Dog("finn", 8, 89.5, "goldendoodle");
        list[11] = new Dog("bert", 9, 42.9, "bulldog");
        list[12] = new Dog("sophie", 14, 14.7, "dachshund");
    }

    public static void fillCats(Animal[] list) {
        // fill the list with cat objects
        list[0] = new Cat("poppy", 6, 24.5, "siamese");
        list[1] = new Cat("bella", 3, 10.5, "siamese");
        list[2] = new Cat("misty", 1, 11.5, "maine coon");
        list[3] = new Cat("lucky", 2, 12.4, "siamese");
        list[4] = new Cat("molly", 4, 15.8, "short hair");
        list[5] = new Cat("mr. ruffles", 5, 11.4, "persian");
        list[6] = new Cat("daisy", 8, 14.2, "persian");
        list[7] = new Cat("tilly", 9, 18.3, "ragdoll");
        list[8] = new Cat("luna", 10, 17.5, "short hair");
        list[9] = new Cat("lady", 11, 16.5, "chartreux");
        list[10] = new Cat("betty", 9, 9.5, "munchkin");
        list[11] = new Cat("lilly", 8, 9.9, "munchkin");
        list[12] = new Cat("cocoa", 7, 10.7, "burmese");
    }
}