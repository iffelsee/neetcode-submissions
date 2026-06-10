class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        count={}

        for n in nums:
            count[n]=1+count.get(n,0)

        freq_bucket=[[] for i in range(len(nums)+1)]
        
        for n,c in count.items():
            freq_bucket[c].append(n)

        result=[]

        for i in range(len(freq_bucket)-1,0,-1):
            for n in freq_bucket[i]:
                result.append(n)
                if len(result)==k:
                    return result