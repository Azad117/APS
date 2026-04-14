import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = newScanner(System.in);
String[] p1 = sc.nextLine().split(" ");
int n = p1.length;
int[] pushed = new int[n];
for (int i = 0; i < n; i++) {
pushed[i] = Integer.parseInt(p1[i]);
}
String[] p2 = sc.nextLine().split(" ");
int[] popped = new int[n];
for (int i = 0; i < n; i++) {
popped[i] = Integer.parseInt(p2[i]);
}
Stack<Integer> stack = new Stack<>();
int j = 0;
for (int i = 0; i < n; i++) {
stack.push(pushed[i]);
while (!stack.isEmpty() && j < n &&
stack.peek() == popped[j]) {
stack.pop();
j++;
}
}
System.out.println(stack.isEmpty());
}
