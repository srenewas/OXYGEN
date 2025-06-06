package com.naya;

public class seenupractice {
    public static void main(String[] args) {
        String s = "Seenuu";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[j]);
                }
            }
        }





        /*String s = "Seenusss";
        char[] ch = s.toCharArray();
        int count =0;
        for (int i=0;i<ch.length;i++){
            if(ch.length!=' '){
                count++;
            }
        }
        System.out.println(count);*/

/*        int[] a ={1,2,3,4,5};
        int target = 6;
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==target){
                    //System.out.println(i+"---"+j);
                    System.out.println(a[i]+"------"+a[j]);
                }
            }
        }*/
    }

}
