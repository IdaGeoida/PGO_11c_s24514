package com.company;

import java.util.Arrays;

public class Matrix {
    private static int[][] preMatrix;
    int[][] matrix;
    private static int preMatrixRowsUsed = 0;

    Matrix add(Matrix m){

        if (this.getMatrix().length == m.getMatrix().length && this.getMatrix()[0].length == m.getMatrix()[0].length) {
            for (int i=0; i < m.getMatrix().length; i++){
                for (int j=0; j < m.getMatrix()[0].length; j++){
                    this.matrix[i][j]+=m.matrix[i][j];
                }
            }
        }
        return this;
    };

    public Matrix subtract(Matrix m){

        if (this.getMatrix().length == m.getMatrix().length && this.getMatrix()[0].length == m.getMatrix()[0].length) {
            for (int i=0; i < m.getMatrix().length; i++){
                for (int j=0; j < m.getMatrix()[0].length; j++){
                    this.matrix[i][j]-=m.matrix[i][j];
                }
            }
        }
        return this;
    };

    public static Matrix add(Matrix m1, Matrix m2){
        if (m1.getMatrix().length == m2.getMatrix().length && m1.getMatrix()[0].length == m2.getMatrix()[0].length) {
            int mr[][] = new int [m1.getMatrix().length][m1.getMatrix()[0].length];
            for (int i=0; i < m1.getMatrix().length; i++){
                for (int j=0; j < m1.getMatrix()[0].length; j++){
                    mr[i][j]+=m1.matrix[i][j]+m2.matrix[i][j];
                }
            }
            Matrix matrixResult = new Matrix(mr);
            return matrixResult;
        } else return null; //TODO exception
    }

    public Matrix subtract(Matrix m1, Matrix m2){
        if (m1.getMatrix().length == m2.getMatrix().length && m1.getMatrix()[0].length == m2.getMatrix()[0].length) {
            int mr[][] = new int [m1.getMatrix().length][m1.getMatrix()[0].length];
            for (int i=0; i < m1.getMatrix().length; i++){
                for (int j=0; j < m1.getMatrix()[0].length; j++){
                    mr[i][j]-=(m1.matrix[i][j]+m2.matrix[i][j]);
                }
            }
            Matrix matrixResult = new Matrix(mr);
            return matrixResult;
        } else return null; //TODO exception
    }

    public static void setUpMatrix(int rowCount, int columnCount){
        preMatrix = new int[rowCount][columnCount];
    }

    public static Matrix multiply(Matrix m1, Matrix m2){
        if (m1.getMatrix()[0].length == m2.getMatrix().length) {
            int mr[][] = new int [m1.getMatrix().length][m1.getMatrix()[0].length];
            for (int i=0; i < m1.getMatrix().length; i++){
                for (int j=0; j < m2.getMatrix()[0].length; j++){
                    mr[i][j]=0;
                    for (int k=0;k<m1.getMatrix()[0].length;k++){
                        mr[i][j]+=m1.getMatrix()[i][k]*m2.getMatrix()[k][j];
                    }
                }
            }
            Matrix matrixResult = new Matrix(mr);
            return matrixResult;
        } else return null; //TODO exception
    }

    public static void insertRow(int[] row){
        for (int x = 0; x < preMatrix[0].length; x++) {
            preMatrix[preMatrixRowsUsed][x]= row[x];
            }
        preMatrixRowsUsed++;
        }

    public void print(){
        for (int i = 0; i<this.getMatrix().length; i++){
            System.out.print("| ");
            for (int j = 0; j<this.getMatrix().length; j++){
                System.out.print(this.getMatrix()[i][j]+" ");
            }
            System.out.print("|\n");
        }
    }

    public static Matrix create(){
        Matrix matrix = new Matrix(preMatrix);
        preMatrixRowsUsed=0;
        return matrix;
    }

    private int[][] getMatrix() {
        return matrix;
    }

    private Matrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
