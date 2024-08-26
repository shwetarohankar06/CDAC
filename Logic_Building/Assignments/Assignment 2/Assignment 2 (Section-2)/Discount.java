class Discount {
public static void main(String[] args) { 
int price = 200;
double total;
boolean membership = false;
if (price >= 1000) { 
if (membership) {
total = price * 0.25;
} else {
total = price * 0.2;
}
} else if (price >= 500 && price <= 999) { 
if (membership) {
total = price * 0.15;
} else {
total = price * 0.1;
}
} else { // price < 500 
if (membership) {
total = price * 0.1;
} else {
total = price * 0.05;
}
}
System.out.println("Total : " + total);
}
}
