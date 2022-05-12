// 3. Write a Program that take 5 numbers into array and print square value of each number.

class arr{
public static void main(String[] args){
int[] temp ={5,6,7,8,9};
for(int i=0; i<temp.length; i++){
System.out.println(temp[i]+ "\t"+(int)Math.pow(temp[i],2));
}
}
}