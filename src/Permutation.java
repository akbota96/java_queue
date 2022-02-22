public class Permutation{
    public static void main(String[] args){
        RandomizedQueue<String> obj = new RandomizedQueue<>();

        for (int i=0; i< args.length; i++) {
            obj.enqueue(args[i]);
        }

        for (String x: obj) {
            System.out.println(x);
        }

    }
}