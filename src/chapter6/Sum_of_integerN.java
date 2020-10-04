package chapter6;

public class Sum_of_integerN {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0;i<a.length;i++){
            ans += a[i];
        }
        return ans;
    }
}
