/**
��һ�⣺
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
*/
public class Solution {
    public boolean Find(int target, int [][] array) {
        int row=array.length-1;// ��
        int col=0;// ��
        while(row>=0 && col<=array[0].length-1){
            if(target>array[row][col]){
                col++;
            }else if(target<array[row][col]){
                row--;
            }else return true;
        }
        return false;
    }
}