public class stringbuffer {
    public static void main(String[] var0) {
        StringBuffer var1 = new StringBuffer("Hello");
        var1.append(" World!");
        System.out.println(var1);
        System.out.println("After append:" + String.valueOf(var1));
        System.out.println("Length: " + var1.length());
        System.out.println("Capacity:" + var1.capacity());
        System.out.println("Character at index 1:" +var1.charAt(1));
        var1.delete(5,11);
        System.out.println("After delete(5, 11):" + String.valueOf(var1));
        var1.deleteCharAt(5);
        System.out.println("After deletecharAt :" + String.valueOf(var1));
        var1.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50):" + var1.capacity());
        var1.insert(5, ",");
        System.out.println("After insert(5, \",\"): " + String.valueOf(var1));
        var1.reverse();
        System.out.println("After reverse:" + String.valueOf(var1));
        var1.replace(0, 1, "Hi");
        System.out.println("After replace(8, 1, \"H\"):" + String.valueOf(var1));
    }
}











