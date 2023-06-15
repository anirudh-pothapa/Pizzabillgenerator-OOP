import java.util.Scanner;

class pizzamenu {
    public void pizza() {
        System.out.println("Veg - pizzas");
        System.out.println("1.CHEESE N CORN -100");
        System.out.println("2.PEPPY PANEER -120");
        System.out.println("3.MEXICAN GREEN WAVE -150");
        System.out.println("4.DELUXE VEGGIE -180");
        System.out.println();
        System.out.println("Non-Veg - pizzas");

        System.out.println("5.CHICKEN GOLDEN DELIGHT-320");
        System.out.println("6.CHICKEN DOMINATOR-350");
        System.out.println("7.MOROCCAN SPICE PASTA PIZZA - NON VEG -480");
        System.out.println("8.KEEMA DO PYAZA -500");
        System.out.println();
        System.out.println("Potato items");
        System.out.println("9.French fries - 200");
        System.out.println("10.Hash brown - 50");

    }

    public int[] selectpizza(int x) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();

        }
        // System.out.println("Item Numners selected are: ");
        // for (int i = 0; i < x; i++) {
        // System.out.println(arr[i]);
        // }
        return arr;

    }

    public int displaytotal(int x[]) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                total = total + 100;
            } else if (x[i] == 2) {
                total = total + 120;
            } else if (x[i] == 3) {
                total = total + 150;
            } else if (x[i] == 4) {
                total = total + 180;
            } else if (x[i] == 5) {
                total = total + 320;
            } else if (x[i] == 6) {
                total = total + 350;
            } else if (x[i] == 7) {
                total = total + 480;
            } else if (x[i] == 8) {
                total = total + 500;
            } else if (x[i] == 9) {
                total = total + 200;
            } else if (x[i] == 10) {
                total = total + 50;
            } else {
                System.out.println("Please enter a number that is mentioned in the menu: ");
            }
        }
        return total;
    }

    public void itemsselected(int x[]) {
        for (int i = 0; i < x.length; i++) {

            if (x[i] == 1) {
                System.out.println("1.CHEESE N CORN -100");

            } else if (x[i] == 2) {
                System.out.println("2.Peppy Paneer -120");
            } else if (x[i] == 3) {
                System.out.println("3.MEXICAN GREEN WAVE -150");
            } else if (x[i] == 4) {
                System.out.println("4.DELUXE VEGGIE -180");
            } else if (x[i] == 5) {
                System.out.println("5.CHICKEN GOLDEN DELIGHT-320");
            } else if (x[i] == 6) {
                System.out.println("6.CHICKEN DOMINATOR-350");
            } else if (x[i] == 7) {
                System.out.println("7.MOROCCAN SPICE PASTA PIZZA - NON VEG -480");
            } else if (x[i] == 8) {
                System.out.println("8.KEEMA DO PYAZA -500");
            } else if (x[i] == 9) {
                System.out.println("9.French fries - 200");
            } else if (x[i] == 10) {
                System.out.println("10.Hash brown - 50");
            }
        }
    }

}

public class pizzabillgenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("Enter 1 to browse menu: ");
        System.out.println("*************************************");
        int input = sc.nextInt();
        pizzamenu px = new pizzamenu();
        if (input == 1) {
            px.pizza();
        }
        System.out.println("*************************************");
        System.out.println("Enter the number of Items you have selected: ");
        System.out.println("*************************************");
        int no = sc.nextInt();
        System.out.println("*************************************");
        System.out.println(
                "Now enter the Item numbers you have selected eg.1.for Cheese and corn2.Peppy Paneer etc.......: ");
        System.out.println("*************************************");
        int sel[] = px.selectpizza(no);
        for (int i = 0; i < sel.length; i++) {
            // System.out.println(sel[i]);
        }

        px.itemsselected(sel);

        int tax = px.displaytotal(sel);
        int onlytax = tax / 10;
        int moremoney = tax + onlytax;
        System.out.println("*************************************");
        System.out.println("Food bill: " + tax);
        System.out.println("Tax and Services - 10%: " + onlytax);
        System.out.println("Your total bill is: " + moremoney);
        System.out.println("*************************************");

    }

}
