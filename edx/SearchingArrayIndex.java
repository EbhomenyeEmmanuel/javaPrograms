package edx;

class SearchingArrayIndex {

  public static void main(String[] args) {
int [] arr = { 77, 99, 44, 55, 22, 88, 11, 00, 66, 33, 10
};
int searchKey = 76; // find item with key 66
int nElems = arr.length;
for(int j=0; j< nElems; j++) {
// found item?
 // yes, exit before end
if(arr[j] == searchKey) {
System.out.println("Found " + searchKey + " in index " + j);
  break;
}
else{
  System.out.println("Can’t find " + searchKey + " at index " + j);
} 
    }
  }

}
