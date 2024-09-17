package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Gyoza", "Japanese style pan fried pot sticker", 5.95, "appetizer");
        MenuItem item2 = new MenuItem("Harumaki", "Japanese spring roll", 4.95, "appetizer");
        MenuItem item3 = new MenuItem("Shrimp teriyaki bento box", "Served with california roll, vegetable tempura, shumai, crab rangoon, spring roll, white rice, salad and miso soup", 17.95, "main course");
        MenuItem item4 = new MenuItem("Hamachi tataki", "Ponzu sauce topped with yellowtail and garnished with jalapeno. served with miso soup and house salad", 15.95, "main course");
        MenuItem item5 = new MenuItem("Cheese cake tempura", "A deep fried cheesecake. Crunchy on the outside and melted sweetness inside", 4.95, "dessert");

        System.out.println(item1);

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        menu.removeItem(item2);
        System.out.println(menu);

        System.out.println(item1.equals(item5));
    }
}
