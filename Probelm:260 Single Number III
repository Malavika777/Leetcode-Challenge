JAVA(Medium)

class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i:nums){
            if(hash.contains(i))
                hash.remove(i);
            else
                hash.add(i);
        }
        int[] res=new int[2];
        int i=0;
        for(int n:hash)
            res[i++]=n;
        return res;
    }
}
