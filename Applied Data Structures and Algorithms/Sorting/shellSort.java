package Sorting;

/**
 * 插入排序
 * 时间复杂度: O(n^2)
 * 希尔排序的原理:根据需求，如果你想要结果从大到小排列，它会首先将数组进行分组，然后将较大值移到前面，较小值
 * 移到后面，最后将整个数组进行插入排序，这样比起一开始就用插入排序减少了数据交换和移动的次数，可以说希尔排序是加强
 * 版的插入排序
 * 拿数组5, 2, 8, 9, 1, 3，4来说，数组长度为7，当increment为3时，数组分为两个序列
 * 5，2，8和9，1，3，4，第一次排序，9和5比较，1和2比较，3和8比较，4和比其下标值小increment的数组值相比较
 * 此例子是按照从大到小排列，所以大的会排在前面，第一次排序后数组为9, 2, 8, 5, 1, 3，4
 * 第一次后increment的值变为3/2=1,此时对数组进行插入排序，
 *实现数组从大到小排
 */
public class shellSort {
    public static void shellSort(int[] numbers) {
        int j = 0;
        int temp = 0;
        //每次将步长缩短为原来的一半
        for (int increment = numbers.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < numbers.length; i++) {
                temp = numbers[i];
                for (j = i; j >= increment; j -= increment) {
                    if(temp > numbers[j - increment]) { //如想从小到大排只需修改这里   
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
