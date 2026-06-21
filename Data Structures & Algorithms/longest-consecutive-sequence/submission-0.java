class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> seen=new HashSet<>();

        for(int num:nums){
            seen.add(num);
        }

        for(int num:nums){
            if(!seen.contains(num-1)){
            int streak=0,curr=num;
            while(seen.contains(curr)){
                streak++;
                curr++;
            }
            res=Math.max(res,streak);
            }
        }
        return res;

    }
}
