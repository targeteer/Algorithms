#include <stdio.h>

int ISearch(int ar[], int first, int last, int target)
{
    int mid;

    // if(first > last)
    //     return -1;
    // 하지만 이 탈출조건은 탐색대상이 존재하지 않는 경우, ISearch 함수가 재귀적으로 호출되어 target값이 first, last가 가리키는 값보다
    // 작거나 크게 됨. 그래서 다음과 같이 탈출 조건을 구성해야 함.
    if(ar[first]>target || ar[last]<target)
        return -1;
    
    mid = ((double)(target-ar[first]) / (ar[last]-ar[first]) * (last-first)) + first;
    // Recursive Binary Search의 mid값을 변경(이진 탐색과의 차이점을 반영)

    if(ar[mid] == target)
        return mid;
    else if(target < ar[mid])
        return ISearch(ar, first, mid-1, target);
    else   
        return ISearch(ar, mid+1, last, target);
        
}

int main(void)
{
    int arr[] = {1,3,5,7,9};
    int idx;

    idx = ISearch(arr, 0, sizeof(arr)/sizeof(int)-1, 7);
    if(idx == -1)
        printf("탐색 실패 \n");
    else
        printf("타겟 저장 인덱스: %d \n", idx);

    idx = ISearch(arr, 0, sizeof(arr)/sizeof(int)-1, 10);
    if(idx == -1)
        printf("탐색 실패 \n");
    else
        printf("타겟 저장 인덱스: %d \n", idx);
}