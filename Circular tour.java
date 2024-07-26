class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
        // Your code here
        int sum = 0, start = 0, total_gas = 0;
        for(int i = 0; i < petrol.length; i++){
            sum += (petrol[i] - distance[i]);
            total_gas += petrol[i] - distance[i];
            if(sum < 0){
                sum = 0;
                start = i + 1;
            }
        }
        if(total_gas < 0) return -1;
        return start;
    }
}
