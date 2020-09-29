package com.codewithnico;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count*2];
            for (int i=0; i<count; i++)
                newItems[i] = items[i];
            items = newItems;
        }

        items[count++] = item;
    }

    public int atIndex(int index){
        return items[index];
    }

    public void removeAt(int index) {
        if(index<0 || index>=count)
            throw new IllegalArgumentException();
        for (int i = index; i<count; i++)
            items[i] = items[i+1];
        count--;
    }

    public int indexOf(int item) {
        for (int i=0;i<count;i++)
            if (items[i] == item)
                return i;
            return -1;
    }

    public int max(){
        int max = 0;
        for (int i=0;i<count;i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
    }

    public Array intersect(Array list) {
        Array intArr = new Array(count);
        for (int i=0;i<count;i++){
            if (list.atIndex(i) == items[i]) {
                intArr.insert(items[i]);
            }

        }
        return intArr;
    }


    public void print() {
        for (int i=0; i<count; i++){
            System.out.println(items[i]);
        }
    }
}


