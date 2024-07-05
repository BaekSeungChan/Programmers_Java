def solution(array, commands):
    answer = []
    for x in commands:
        i, j, k = x
        slice_sorted_array = sorted(array[i-1 : j])
        
        answer.append(slice_sorted_array[k-1])
        
    return answer