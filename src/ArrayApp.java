public class ArrayApp {
    public static void main(String[] args) {

//        We use long to make it clearer that this is data; type int is used for index values
      long[] arr=new long[100];//reference to array and maje array
        int nElems=0;   //no of items
        int j;  //loop counter
        long searchKey;     //key of item to search for

        arr[0] = 77;    // insert 10 items
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;

     /*   for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       System.out.println("length of the array " + arr.length); //use this when specific length of array*/

        nElems = 10; // now 10 items in array

        for (j = 0; j < nElems; j++) {
            System.out.println(arr[j] + " ");   //display items

        }

        //--------------------------------------------------------------


       /* To search for an item, we
        step through the array, comparing searchKey with each element. If the loop variable
        j reaches the last occupied cell with no match being found, the value isn’t in the
        array.*/

        System.out.println("SEARCHING FOR ELEMENT 66");

        searchKey = 66;     // find item with key 66
        for(j=0; j<nElems; j++)     // for each element,
            if(arr[j] == searchKey)     // found item?
                break;      // yes, exit before end
        if(j == nElems)         // at the end? no,not found
            System.out.println("Can’t find " + searchKey); // yes
        else
        System.out.println("Found " + searchKey);   // no
//--------------------------------------------------------------

       /* Deletion begins with a search for the specified item. For simplicity, we assume
                (perhaps rashly) that the item is present. When we find it, we move all the items
        with higher index values down one element to fill in the “hole” left by the deleted
        element, and we decrement nElems*/

        System.out.println("\nDELETING ITEM 55");
        searchKey = 55;         // delete item with key 55
        for(j=0; j<nElems; j++)     // look for it
            if(arr[j] == searchKey)
                break;
        for(int k=j; k<nElems-1; k++)       // move higher ones down
            arr[k] = arr[k+1];
        nElems--;                   // decrement size

        //display

        for(j=0;j<nElems;j++){
            System.out.println(arr[j]);
        }

        System.out.println("new array");
arr[1]=123;  //why is it overiding?
        for(j=0;j<nElems;j++){
            System.out.println(arr[j]);
        }
    /*    Insertion
        Inserting an item into the array is easy; we use the normal array syntax:
        arr[0] = 77;*/



    }
}
