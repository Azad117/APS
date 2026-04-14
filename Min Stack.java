import java.util.*;
class MinStack {
Stack<Integer> stack;
Stack<Integer> minStack;
public MinStack() {
stack = new Stack<>();
minStack = new Stack<>();
}
public void push(int val) {
stack.push(val);
if (minStack.isEmpty() || val <=
minStack.peek()) {
minStack.push(val);
} else {
minStack.push(minStack.peek());
}
}
public void pop() {
if (!stack.isEmpty()) {
stack.pop();
minStack.pop();
}
}
public int top() {
return stack.peek();
}
public int getMin() {
return minStack.peek();
}
}
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String opsLine = sc.nextLine();
String valsLine = sc.nextLine();
opsLine = opsLine.replaceAll("[\\[\\]\"]", "");
valsLine = valsLine.replaceAll("\\[\\[",
"").replaceAll("\\]\\]", "");
String[] ops = opsLine.split(",");
String[] vals = valsLine.split("\\],\\[");
MinStack obj = new MinStack();
List<String> result = new ArrayList<>();
for (int i = 0; i < ops.length; i++) {
String op = ops[i].trim();
if (op.equals("MinStack")) {
obj = new MinStack();
result.add("null");
}
else if (op.equals("push")) {
String v = vals[i].replaceAll("\\[|\\]",
"").trim();
int val = Integer.parseInt(v);
obj.push(val);
result.add("null");
}
else if (op.equals("pop")) {
obj.pop();
result.add("null");
}
else if (op.equals("top")) {
result.add(String.valueOf(obj.top()));
}
else if (op.equals("getMin")) {
result.add(String.valueOf(obj.getMin()));
}
}
System.out.print("[");
for (int i = 0; i < result.size(); i++) {
System.out.print(result.get(i));
if (i != result.size()- 1)
System.out.print(",");
}
System.out.print("]");
}
}
