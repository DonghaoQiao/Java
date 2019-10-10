package T14Searching;
import java.util.Random;

public class FibonacciSearch {
    public static void main(String[] args) {
        int[] table = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0;i<table.length;i++) {
            System.out.println("���м�¼Ϊ"+table[i]+",��ѯ���Ϊ"+FibonacciSearch.fibonacciSearch(table, table[i]));
        }
        System.out.println("");
        for(int i = 0;i<5;i++) {
            int ran = new Random().nextInt(30);
            System.out.println("�ؼ���Ϊ: "+ran+"��ѯ���Ϊ"+FibonacciSearch.fibonacciSearch(table, ran));
        }
    }

    public static boolean fibonacciSearch(int[] table,int keyWord) {
        //ȷ����Ҫ��쳲�������
        int i = 0;
        while(getFibonacci(i)-1 == table.length) {
            i++;
        }
        System.out.println(i);
        //��ʼ����
        int low = 0;
        int height = table.length-1;
        while(low <= height) {
            int mid = low + getFibonacci(i-1);
            if(table[mid] == keyWord) {
                return true;
            }
            else if(table[mid]>keyWord) {
                height = mid-1;
                i--;
            }
            else if(table[mid]<keyWord) {
                low = mid+1;
                i-=2;
            }
        }
        return false;
    }

    /**
     * �õ���n��쳲�������
     * @return
     */
    public static int getFibonacci(int n) {
        int res = 0;
        if(n == 1 || n==0) {
            res = 1;
        }
        else {
            int first = 1;
            int second = 1;
            for(int i = 2;i<=n;i++) {
                res = first+second;
                first = second;
                second = res;
            }
        }
        return res;
    }
}




