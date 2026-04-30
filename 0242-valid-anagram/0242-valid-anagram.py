class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        
        countS, countT = {}, {}
        for i in s:
            countS[i] = countS.get(i, 0) + 1

        for j in t:
            countT[j] = countT.get(j, 0) + 1

        for k in countS:
            if k not in countT:return False
            if countS[k] != countT[k]: return False

        return True