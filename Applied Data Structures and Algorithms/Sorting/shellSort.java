package Sorting;

/**
 * ��������
 * ʱ�临�Ӷ�: O(n^2)
 * ϣ�������ԭ��:���������������Ҫ����Ӵ�С���У��������Ƚ�������з��飬Ȼ�󽫽ϴ�ֵ�Ƶ�ǰ�棬��Сֵ
 * �Ƶ����棬�������������в���������������һ��ʼ���ò���������������ݽ������ƶ��Ĵ���������˵ϣ�������Ǽ�ǿ
 * ��Ĳ�������
 * ������5, 2, 8, 9, 1, 3��4��˵�����鳤��Ϊ7����incrementΪ3ʱ�������Ϊ��������
 * 5��2��8��9��1��3��4����һ������9��5�Ƚϣ�1��2�Ƚϣ�3��8�Ƚϣ�4�ͱ����±�ֵСincrement������ֵ��Ƚ�
 * �������ǰ��մӴ�С���У����Դ�Ļ�����ǰ�棬��һ�����������Ϊ9, 2, 8, 5, 1, 3��4
 * ��һ�κ�increment��ֵ��Ϊ3/2=1,��ʱ��������в�������
 *ʵ������Ӵ�С��
 */
public class shellSort {
    public static void shellSort(int[] numbers) {
        int j = 0;
        int temp = 0;
        //ÿ�ν���������Ϊԭ����һ��
        for (int increment = numbers.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < numbers.length; i++) {
                temp = numbers[i];
                for (j = i; j >= increment; j -= increment) {
                    if(temp > numbers[j - increment]) { //�����С������ֻ���޸�����   
                    	numbers[j] = numbers[j - increment];
                    }
                    else {
                        break;
                    }
                } 
                numbers[j] = temp;
            }
            for(int i1=0;i1<numbers.length;i1++) {
		    	System.out.print(numbers[i1]+" ");
		    }
	        System.out.println();
        }
    }
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,55,4};
		shellSort(a);
	}
}
