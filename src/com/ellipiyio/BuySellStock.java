package com.ellipiyio;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int n=prices.length;
        int[] maxi= new int[n];
        int[] mini= new int[n];
        maxi[n-1]=prices[n-1];
        mini[0]=prices[0];
        for (int i =1; i<n;i++){
            maxi[n-i-1]=Math.max(maxi[n-i],prices[n-1-i]);
            mini[i]=Math.min(mini[i-1],prices[i]);
        }
        int maxdif=0;
        for (int i=0; i<n;i++){
            maxdif=Math.max(maxdif,(maxi[i]-mini[i]));
        }
        return maxdif;
    }
}