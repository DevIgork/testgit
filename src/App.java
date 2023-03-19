public class App {
    public static void main(String[] args) throws Exception {
        igor test = new igor();
        int[] arr = {1,2,2,1};
        int[] dar = {3,2,1,1};
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
    }
    public static class igor{
        public boolean polimodr(int[] arr){
            int i=0;
            int max =arr.length-1;
            while(i<arr.length){
                if(i!=max){
                    return false;
                }
                i++;
                max--;
            }
            return true;
        }
        public int[] nepar(int[] arr){
            return arr;

        }
    }
    public static class Sergiy{
        public boolean prost(int n){
            for(int i=1;i<=n;i++){
                if(i==1 || i==n)
                    continue;
                if(n%i==0)
                    return false;
            }
                return true;
            
        }
        public int max(int[] arr){

            int max=Integer.MIN_VALUE
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]>max)
                            max=arr[i];
                    }
                    return max;

        }

    }
    public static class Viktor{
        public int sumpar(int [] arr){
            sum=0;
            for(int i=0; i<arr.length;i++){
                if(arr[i]%2==0){
                    sum=sum+arr[i];
                }
            }
            return sum;
        }
        public char[] thesar(char[] arr){
            int size=arr.length;
            char arr2 = new char [size];
            for(int i = 0; i<arr.length;i++){
                arr2[i]=arr[i]+3;
            }
            return arr2;
        }
            return 1;
        }
        public char[] thesar(char[] arr){
            return arr;
        }
    }
}

