class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long minimum = Long.MAX_VALUE;
        for(int i = 0, j = m-1; i <= n - m; i++){
            long diff = a.get(j)-a.get(i);
            minimum = Math.min(minimum, diff);
            j++;
        }
        return minimum;
    }
}
