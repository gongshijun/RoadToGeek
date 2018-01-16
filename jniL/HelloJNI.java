public class HelloJNI {
    static {
        System.loadLibrary("hello"); // Load native library at runtime hello.dll (Windows) or libhello.so (Unixes)
    }
    private native void sayHello(); // Declare a native method sayHello() that receives nothing and returns void
    
    // Test Driver
    public static void main(String[] args) {
        new HelloJNI().sayHello(); // invoke the native method
    }
}
