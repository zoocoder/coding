def max_dist_sum(arr, dist):
    if len(arr)<= dist:
        return 0
    max_elem = arr[0]
    max_sum = max_elem + arr[dist]
    
    for i in range(dist, len(arr)):
        #Set max_elem to maximum we've seen so far dist away from index.
        if (max_elem < arr[i-dist]):
            max_elem = arr[i-dist]
        
        if (max_sum < arr[i] + max_elem):
            max_sum = arr[i] + max_elem
    return max_sum
