class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] result=new int[k];
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
            for(int i=0;i<k;i++){
                int maxfreq=0;
            for(int freq:mp.values()){
                maxfreq=Math.max(maxfreq,freq);
            }
            int maxkey=-1;
            for(int key:mp.keySet()){
                if(mp.get(key)==maxfreq){
                    maxkey=key;
                }
                result[i]=maxkey;
            }
            mp.remove(maxkey);

            }
            return result;
    }
}
