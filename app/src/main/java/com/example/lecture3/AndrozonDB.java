package com.example.lecture3;
import java.util.ArrayList;
import java.util.List;
public class AndrozonDB {
        private List<SmartPhone> mobiles;
        private List<Laptop> laptops;
        private List<Headphone> headphones;

        public AndrozonDB() {
            // Initialize the lists
            mobiles = new ArrayList<>();
            laptops = new ArrayList<>();
            headphones = new ArrayList<>();

            // Add some pre-defined mobiles
            mobiles.add(new SmartPhone("Samsung", "Galaxy S21", 799.99, 128));
            mobiles.add(new SmartPhone("Apple", "iPhone 13", 999.99, 256));
            mobiles.add(new SmartPhone("Google", "Pixel 6", 699.99, 128));

            // Add some pre-defined laptops
            laptops.add(new Laptop("Dell", "XPS 13", 1299.99, 16));
            laptops.add(new Laptop("HP", "Spectre x360", 1199.99, 8));
            laptops.add(new Laptop("Apple", "MacBook Air", 999.99, 8));

            // Add some pre-defined headphones
            headphones.add(new Headphone("Sony", "WH-1000XM4", 349.99, "Over-ear"));
            headphones.add(new Headphone("Bose", "QuietComfort 35 II", 299.99, "Over-ear"));
            headphones.add(new Headphone("AirPods", "Pro", 249.99, "In-ear"));
        }

        public List<SmartPhone> getMobiles() {
            return mobiles;
        }

        public List<Laptop> getLaptops() {
            return laptops;
        }

        public List<Headphone> getHeadphones() {
            return headphones;
        }
    public String[] getHeadphonesAsStringArray() {
        String[] headphoneArray = new String[headphones.size()];
        for (int i = 0; i < headphones.size(); i++) {
            headphoneArray[i] = headphones.get(i).toString();
        }
        return headphoneArray;
    }
    public String[] getMobilesAsStringArray() {
        String[] mobilesArray = new String[mobiles.size()];
        for (int i = 0; i < mobiles.size(); i++) {
            mobilesArray[i] = mobiles.get(i).toString();
        }
        return mobilesArray;
    }
    public String[] getLaptopsAsStringArray() {
        String[] laptopsArray = new String[laptops.size()];
        for (int i = 0; i < laptops.size(); i++) {
            laptopsArray[i] = laptops.get(i).toString();
        }
        return laptopsArray;
    }


}