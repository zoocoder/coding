#In an array of n elements, return element that occurs n/2 times in O(n) time.
#This is a "voting algorithm"

def mostCommonN(arr):
    best = arr[0]
    count = 0
    for i in range(len(arr)):
        if count == 0:
            best = arr[i]
            count = 1
        else:
            if (best == arr[i]):
                count += 1
            else:
                count -= 1
    return best
