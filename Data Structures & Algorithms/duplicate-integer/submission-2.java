class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>frequency=new HashMap<>();

        for(int num:nums)
        {
            frequency.put(num,frequency.getOrDefault(num,0)+1);

            if(frequency.get(num)>1){
                return true;
            }
        }
        return false;
    }
}