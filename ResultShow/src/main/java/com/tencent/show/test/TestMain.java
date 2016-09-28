package com.tencent.show.test;

import java.util.Stack;

/**
 * Created by v_jdqi on 2016/9/20 0020.
 */
public class TestMain {
    public int bigHomes(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int area = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 & (grid[i+1][j] != 0 | grid[i-1][j] != 0 | grid[i][j+1] != 0 | grid[i][j-1] != 0)) {
                    if (i==0){
                        if(grid[i+1][j] != 0 | grid[i-1][j] != 0){

                        }
                    }
                    area = area + 1;
                }
            }
        return area;
    }
    public int isMatch(String input){
        Stack<Character> st= new Stack<Character>();
        char temp;
        int num=0;
        int number=0;
        for (int i=0;i<input.length();i++){
            temp =input.charAt(i);
            if(temp=='('){
                num=num+1;
            }else if(temp==')'){
                num=num-1;
                number=number+1;
            }
        }
        if(num==0){
            return number;
        }else return 0;
    }

    public static void main(String[] args) {
        int[][] grid={{1,0,0,0},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
        String input="(()())()";
        int i=new TestMain().isMatch(input);
        System.out.println("111111111"+"   "+i);
    }
}
