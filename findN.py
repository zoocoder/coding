#Find n in sorted array in O(logn), binary search.

def findNHelp(arr, minpos, maxpos, goal):
    while (minpos <= maxpos):
        mid = (minpos+maxpos)/2
        if (arr[mid] == goal):
            return True
        if (arr[mid] < goal):
            minpos = mid+1
        else:
            maxpos = mid-1
    return False

def findN(arr, goal):
    return findNHelp(arr, 0, len(arr)-1, goal)
