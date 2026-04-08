class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n))
        {
            set.add(n);
            n = SumofSquares(n);
        }        
        return n == 1;
    }

    public int SumofSquares(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int d = n % 10;
            sum = sum + (d * d);
            n = n / 10;
        }
        return sum;
    }
}
