public class Permutation {
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);

    }

    public void permute(String str, int k, int l) {
        if (k == l) {
            System.out.println(str);
        } else {
            for (int i = k; i <= l; i++) {
                str = swap(str, k, i);
                permute(str, k + 1, l);
                str = swap(str, k, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "123";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
    }
}