public class FourSumCountII {
    public int fourSumCountII(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = C[i] + D[j];
                if (map.containsKey(-sum)) {
                    res += map.get(-sum);
                }
            }
        }
        return res;
    }
}
