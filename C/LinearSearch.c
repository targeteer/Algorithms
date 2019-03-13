#include <stdio.h>

int LSearch(int ar[], int len, int target)
{
    int i;
    for(i = 0; i < len; i++)
    {
        if(ar[i] == target)
            return i;
    }
    return -1;
}

int main(void){
    int arr[] = {1, 2, 3, 4, 5};
    int idx;

    idx = LSearch(arr, sizeof(arr)/sizeof(int), 3);

    printf("%d ", idx);
}