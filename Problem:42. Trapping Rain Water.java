JAVA(Hard)
class Solution {
    public int trap(int[] h) {
        if (h.length==0)
            return 0;
        int c=0;
        for(int i=1;i<h.length-1;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++) 
                l= Math.max(l,h[j]);
            for(int j=i+1;j<h.length;j++) 
                r= Math.max(r,h[j]);
            int res= Math.min(l, r);
            if (res>h[i]) 
                c+=res-h[i];
        }
        return c;
    }
}
