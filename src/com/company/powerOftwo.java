package com.company;

/**
 * Created by hongruzh on 5/29/16.
 */

/**
 * 位运算，逐位比较 先要了解位运算的方式
 *
 * &  与    两个位都为1的时候 结果才为1
 * |  或    两个位都为0的时候 结果才为0
 * ^  异或   两个位相同为0，相异为1
 * ~  取反   0变1，1变0
 * << 左移
 * >> 右移
 *
 * 小技巧:  只要根据最末位是0还是1来决定，0就是偶数，因此可以用if((a&1)==0) 来代替if(a%2==0) 来判断a是不是偶数
 *
 *
 *
 *
 */
public class powerOftwo {
    /**
     * 判断power of two的方法 一个数是2的幂必然满足一定条件
     *
     * 2   010
     * 4   0100
     * 8   1000
     * 16  100000
     */
    public boolean powerOftwo(int n){
        if(n==0)return false;
        if(n<0) return false;

        return ((n & (n-1))==0)?true:false;

    }
}
