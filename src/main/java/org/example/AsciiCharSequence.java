package org.example;

public class AsciiCharSequence  implements CharSequence/* extends/implements */ {

    private byte[] arr;
    public AsciiCharSequence(byte[] arr){
        this.arr = arr;
    }

    @Override
    public int length() {
        return this.arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char)this.arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        CharSequence count = "";
        String str = "";
        for (int i = start; i < end; i++){
            str += (char)this.arr[i];
        }
        count = str;
        return count;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < arr.length; i++){
            str += (char)this.arr[i];
        }
        return str;
    }
}
