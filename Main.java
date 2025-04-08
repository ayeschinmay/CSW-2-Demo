/*import java.util.*;
class Pair<T> {
    T Key, Value;
    Pair() {
        System.out.print("Performing The Required\n");
    }
    String get() {
        return " Key: " + Key + " Value: " + Value;
    }
    void set(T Key, T Value) {
        this.Key = Key;
        this.Value = Value;
    }
}
class Main {
    public static void main(String args[]) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter The Size: ");
            int Size = Sc.nextInt();
            Sc.nextLine();
            List<Pair<Integer>> Obj1 = new ArrayList<>();
            for (int i = 0; i < Size; i++) {
                Pair<Integer> obj1 = new Pair<>();
                System.out.print("Enter Data (Integer): ");
                int Key = Sc.nextInt();
                int Value = Sc.nextInt();
                Sc.nextLine();
                obj1.set(Key, Value);
                Obj1.add(obj1);
            }
            List<Pair<String>> Obj2 = new ArrayList<>();
            for (int i = 0; i < Size; i++) {
                Pair<String> obj2 = new Pair<>();
                System.out.print("Enter Data (String): ");
                String Key = Sc.nextLine();
                String Value = Sc.nextLine();
                obj2.set(Key, Value);
                Obj2.add(obj2);
            }
            System.out.println("Data Entry Set-1:");
            for (Pair<Integer> pair : Obj1) {
                System.out.println(pair.get());
            }
            System.out.println("Data Entry Set-2:");
            for (Pair<String> pair : Obj2) {
                System.out.println(pair.get());
            }
        }
    }
}*/

/*import java.util.*;

class User {
    private String name;
    private int age;

    User() {
        System.out.println("Performing Operations");
    }

    void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String get() {
        return "Name: " + name + " Age: " + age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size = sc.nextInt();
        sc.nextLine();
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            User user = new User();
            user.set(name, age);
            userList.add(user);
        }
        System.out.println("The Data Arranged According To Age: ");
        TreeMap<Integer, String> userMap = new TreeMap<>();
        for (User user : userList) {
            userMap.put(user.getAge(), user.getName());
        }
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println("Name: " + entry.getValue() + ", Age: " + entry.getKey());
        }
        sc.close();
    }
}*/

import java.util.*;
class Car implements Comparable<Car> {
    private int modelNo;
    private String name;
    private int stock;
    Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
        System.out.println("Performing Tests");
    }
    public int getModelNo() {
        return modelNo;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.modelNo, other.modelNo);
    }
    @Override
    public String toString() {
        return "Car [modelNo=" + modelNo + ", name=" + name + ", stock=" + stock + "]";
    }
}
class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(101, "Toyota", 5));
        carList.add(new Car(203, "Honda", 8));
        carList.add(new Car(150, "Ford", 3));
        System.out.println("Before Sorting:");
        for (Car car : carList) {
            System.out.println(car);
        }
        Collections.sort(carList);
        System.out.println("\nAfter Sorting:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
