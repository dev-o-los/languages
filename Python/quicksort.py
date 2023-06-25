def quicksort(arr,left,right):
    if left < right:
        par_pos = partition(arr,left,right)
        quicksort(arr, left, par_pos-1)
        quicksort(arr, par_pos+1, right)


def partition(arr,left,right):
    i = left
    j = right
    pivot = arr[right]

    while i < j:
        while i < right and arr[i] < pivot:
            i = i + 1
        while j > left and arr[j] >= pivot:
            j = j - 1
        
        if i < j:
            arr[i] , arr[j] = arr[j] , arr[i]
    
    if arr[i] > pivot:
        arr[i] , arr[right] = arr[right] , arr[i]
    
    return i


arr = [11,4,1,55,7]
quicksort(arr, 0, len(arr)-1)
print(arr)