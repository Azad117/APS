import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine().trim();
if (input.length() <= 2) {
return;
}
input = input.substring(1, input.length()- 1);
PriorityQueue<Integer> pq = new PriorityQueue<>();
StringBuilder num = new StringBuilder();
for (int i = 0; i < input.length(); i++) {
char c = input.charAt(i);
if (c == '-' || Character.isDigit(c)) {
num.append(c);
} else {
if (num.length() > 0) {
pq.add(Integer.parseInt(num.toString()));
num.setLength(0);
}
}
}
if (num.length() > 0) {
pq.add(Integer.parseInt(num.toString()));
}
System.out.print("[");
boolean first = true;
while (!pq.isEmpty()) {
if (!first) System.out.print(",");
System.out.print(pq.poll());
first = false;
}
System.out.print("]");
}}
