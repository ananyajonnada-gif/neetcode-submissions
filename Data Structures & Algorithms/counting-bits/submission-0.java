class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        
        
        for(int i=0;i<=n;i++)
        {int temp=i;
        int res=0;
            while(temp>0)
            {
           temp&=temp-1;
           res+=1;
            }
            ans[i]=res;
        }
        return ans;
    }
}
