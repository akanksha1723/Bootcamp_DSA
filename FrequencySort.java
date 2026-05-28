import java.util.*;
public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(list, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA; // Sort by frequency in descending order
            } else {
                return a - b; // If frequencies are the same, sort by value in ascending order
            }
        });
        System.out.print("Sorted array based on frequency: ");
        for (int num : list) {
            int totalCount = frequencyMap.get(num);
            for (int i = 0; i < totalCount; i++) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
