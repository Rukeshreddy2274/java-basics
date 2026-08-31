public class GenericCodeDemo {
    public static void main(String[] args) {
        
        GenericPair<String, Integer> stringIntPair = new GenericPair<>("Hello", 42);

        stringIntPair.setFirst("Another String");
        stringIntPair.setSecond(2274);

        String myString = stringIntPair.getFirst();
        int myInt = stringIntPair.getSecond();
        System.out.println(myString);
        System.out.println(myInt);

        //generic method
        String[] stringArray = {"Hello", "WOrld"};
        printArray(stringArray);

        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
    }

    //Generic Methods Demo
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }
}


