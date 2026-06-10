class Solution:

    def encode(self, strs: List[str]) -> str:
        rese=""

        for s in strs:
            rese+=str(len(s))+'#'+s

        return  rese


    def decode(self, s: str) -> List[str]:
        resd=[]
        i=0
        while i<len(s):
            j=i
            while s[j]!='#':
                j+=1

            length=int(s[i:j])

            

            word=s[j+1:j+1+length]
            resd.append(word)
            
            i=j+1+length
        return resd