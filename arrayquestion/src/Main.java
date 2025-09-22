//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class arrayquestion {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int l = a[0];
        int length = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > l) {
                l = a[i];

            }
        }
        System.out.println("the largest number is " + l);
    }
}
