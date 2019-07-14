#include<stdio.h>
int main(){
int target_value,arr[5],i;
printf("Enter the elements of an array :");
for(i=0;i<5;i++){
scanf("%d",&arr[i]);}
printf("Enter the elements to be searched :");
scanf("%d",&target_value);
int index=Linear_Search(arr,5,target_value);
if(index==0)
    printf("Entered Number is not present");
else
    printf("The number %d is present at index %d",arr[index],index);
}

int Linear_Search(int *a,int size,int target){
    for(int i=0;i<size;i++){
        if(a[i]==target)
            return i;
    }
return 0;
}
