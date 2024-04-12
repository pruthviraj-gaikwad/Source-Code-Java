public class trythrow {
    public static void main(String... args) {
        int arr[] = { 1, 2, 3, 4 };
        try {
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getClass()+":"+e.getMessage());
            System.out.println();
            System.out.println(e.getMessage());
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
                System.out.println(element.getClassName() + "." + element.getMethodName() + "(" + element.getFileName()
                        + ":" + element.getLineNumber() + ")");
            }
        }
    }
}
