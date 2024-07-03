//linear: anything
for (int i = 0; i < arr.length; i++){
    if(arr[i].length() == key){
        System.out.println(arr[i]);
        return;
    }
}

//binary:integers
int mid, low, high;
keyindex = -1;
low = 0;
high = numList.length-1;
while(high>= low){
    mid = (high +low )/2;
    if (numList[mid] <  key){
        low = mid+1;
    } else if (numList[mid]> key){
        high = mid-1;
    }else {
        keyindex = mid;
        break;
    }
}

//binary: strings
int mid, low, high;
keyindex = -1;
low = 0;
high = numList.length-1;
while (high>=low){
    mid = (high+low)/2;
    if (numList[mid].comparTo(key)<0){
        low = mid+1;
    }else if(numList[mid].compareTo(key)>0){
        high= mid-1;
    }else{
        keyindex = mid;
        break;
    }
}