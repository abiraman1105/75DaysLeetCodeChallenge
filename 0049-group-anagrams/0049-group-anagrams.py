class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = defaultdict(list)

        for word in strs:
            count = [0] * 26
            for i in word:
                count[ord(i) - ord('a')] += 1

            key = tuple(count)
            anagram[key] = anagram.get(key, []) + [word]

        return [value for value in anagram.values()]
            