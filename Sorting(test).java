public static void sortByPrice(Food[] cart){
            for (int i = 0; i < cart.length-1; i++){//descending order using selection sort in integers
                    int maxIndex = i;
                    Food max = cart[i];////
                    for (int j = i +1; j< cart.length; j++){
                            if (max.getPrice() < cart[j].getPrice()){/////
                                maxIndex = j;
                                max = cart[j];
                            }
                        
                    }
                    if(maxIndex != i){
                        cart[maxIndex] = cart[i];
                        cart[i] = max;
                    }
                
            
            }
        }
//selection sort in descending order for strings
public static void sortStrings(Food[] cart) {
    for (int i = 0; i < cart.length - 1; i++) {
            int index = i;
            Food max = cart[i];

            for (int j = i + 1; j < cart.length; j++) {
                if (cart[j].getPrice().compareTo(max.getPrice()) < 0) {
                    index = j;
                    max = cart[j];
                }
            }

            if (index != i) {
                cart[index] = cart[i];
                cart[i] = max;
            }
        
    }
}
//insertion sort for strings descending order
public static void sortStringsDescending(Food[] cart) {
    for (int i = 1; i < cart.length; i++) {
        Food key = cart[i];
        int j = i - 1;
        while (j >= 0 && cart[j].getPrice().compareTo(key.getPrice()) < 0) {
            cart[j + 1] = cart[j];
            j = j - 1;
        }
        cart[j + 1] = key;
    }
}
//insertion sort for integers in descending order
public static void insertionSortDescending(Food[] cart) {
    for (int i = 1; i < cart.length; i++) {
        Food key = cart[i];
        int j = i - 1;

        while (j >= 0 && cart[j].getPrice(key.getPrice())) {
            cart[j + 1] = cart[j];
            j = j - 1;
        }
        cart[j + 1] = key;
    }
}
