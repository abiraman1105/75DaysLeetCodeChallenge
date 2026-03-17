class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = defaultdict(int)

        for i in nums:
            count[i] += 1

        bucket = [[] for _ in range(len(nums) + 1)]

        for j in count:
            bucket[count[j]].append(j)

        res = []

        for n in range(len(bucket) - 1, -1, -1):
            for i in bucket[n]:
                res.append(i)
                if len(res) == k:
                    return res
