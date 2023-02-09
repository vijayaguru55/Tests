package org.mine.JanTestZSGS;

import java.util.Arrays;

/*Q.No.6 */
public class RotateMatrix {
    private void rotateMatrixByClockWIse3Times(int[][] matrix,int times) {
        for(int rotate=0;rotate<times;rotate++){
            for(int outer=0;outer<matrix.length-1;outer++){
                for(int inner=outer;inner<matrix[outer].length;inner++){
                    int k =matrix[outer][inner];
                    matrix[outer][inner]=matrix[inner][outer];
                    matrix[inner][outer]=k;
                }
            }
            int left=0;
            int right=matrix[0].length-1;
            while(left<(matrix.length)/2){
            for(int i=0;i<matrix.length;i++){
                int k=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=k;
            }
            right--;
            left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotateMatrixByClockWIse3Times(matrix,3);
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }
}
