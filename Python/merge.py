arr = [3, 41, 2, 1]


def merge_sort(arr):
    if len(arr) > 1:
        larr = arr[: len(arr) // 2]
        rarr = arr[len(arr) // 2 :]

        merge_sort(larr)
        merge_sort(rarr)

        i = j = k = 0

        while i < len(larr) and j < len(rarr):
            if larr[i] < rarr[j]:
                arr[k] = larr[i]
                i += 1
            else:
                arr[k] = rarr[j]
                j += 1
            k += 1

        while i < len(larr):
            arr[k] = larr[i]
            i += 1
            k += 1

        while j < len(rarr):
            arr[k] = rarr[j]
            j += 1
            k += 1


merge_sort(arr)
print(arr)
