import org.junit.Test;

/**
 * @author lorem
 */
public class SuicidalGameTest {
    @Test
    public void test() {
        System.out.println(survivor(41, 3));
        System.out.println(survivor(3L, 3));
    }

    private long survivor(int n, int m) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (sum + m) % i;
        }
        return ++sum;
    }

    private long survivor(long n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return (survivor(n - 1, m) + m - 1) % n + 1;
    }
}
