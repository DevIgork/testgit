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
            return true;
        }
        public int max(int[] arr){
            return 1;
        }

    }
    public static class Viktor{
        public int sumpar(int [] arr){
            return 1;
        }
        public char[] thesar(char[] arr){
            return arr;
        }
    }
}

