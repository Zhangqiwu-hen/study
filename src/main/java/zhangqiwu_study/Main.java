package zhangqiwu_study;

import java.util.Arrays;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        Main main1 = new Main();
        int[] cost = {10,15,20};
        int daAn = main1.minCostClimbingStairs(cost);
        System.out.println(daAn);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length+1];
        minCost[0]=0;
        minCost[1]=0;
        for(int i=2; i<minCost.length; i++){
            minCost[i]=Math.min(minCost[i-1]+cost[i-1],minCost[i-2]+cost[i-2]);
        }
        return minCost[cost.length];
    }
}


