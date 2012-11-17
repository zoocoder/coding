#Given array arr of length N, find an a[i], a[j], a[k] such that i<j<k
#and runs in O(N).

def findIJK(arr):
    n = len(arr)
    #if the array is smaller than 3, obviously there is no ijk possible
    if (len < 3):
        return 0
    candidates1 = [0]
    candidates2 = [0]
    #go through backwards finding all elements with an element greater than it to the right
    currMax = arr[n-1]
    i = n-2
    while i >= 0:
        curr = arr[i]
        if (curr < currMax):
            candidates1.insert(0, 1) 
        if (curr > currMax):
            currMax = curr
            candidates1.insert(0, 0)
        i-=1
    currMin = arr[0]
    #find elements with a smaller element to its left
    i = 1
    while i <= n-1:
        curr = arr[i]
        if (curr > currMin):
            candidates2.append(1)
        if (curr < currMin):
            currMin = curr
            candidates2.append(0)
        i+=1
    #find the elements in common between candidates1 and candidates2
    jPos = 0
    for i in range(n-1):
        if candidates1[i] & candidates2[i]:
            jPos = i
    if jPos == 0:
        return 0 #no elements found
    jElem = arr[jPos]
    iElem = 0
    kElem = 0
    result = []
    for i in range(n):
        if (arr[i] < jElem and i < jPos):
            iElem = arr[i]
        if (arr[i] > jElem and i > jPos):
            kElem = arr[i]
    result.append(iElem)
    result.append(jElem)
    result.append(kElem)
    return result
