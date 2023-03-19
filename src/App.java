public class App {
    public static void main(String[] args) throws Exception {
        
    }
    public static class igor{
        public boolean polimodr(int[] arr){
            return true;
        }
        public int[] nepar(int[] arr){
            return arr;

        }
    }
    public static class Sergiy{
        public boolean prost(int n){
            return true;
        }
        public int max(int[] arr){
            return 1;
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
            size=arr.length;
            char arr2 = new char [size];
            for(int i = 0; i<arr.length;i++){
                arr2[i]=arr[i]+3;
            }
            return arr2;
        }

        }
    }
}

