class TimeMap:

    def __init__(self):
        self.map = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.map:
            self.map[key] = []

        temp = self.map[key]
        temp.append([value, timestamp])
        self.map.update({key: temp}) 

    def get(self, key: str, timestamp: int) -> str:
        ans = ""
        if key not in self.map:
            return ans

        low = 0
        high = len(self.map[key]) - 1

        while low <= high:
            mid = low + (high - low) // 2
            curr_timestamp = self.map[key][mid][1]
            if curr_timestamp <= timestamp:
                low = mid + 1
                ans = self.map[key][mid][0]
            else:
                high = mid - 1

        return ans


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set("foo","bar",1)
# param_2 = obj.get("foo",3)