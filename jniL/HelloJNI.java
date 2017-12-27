public class HelloJNI {
    static {
        System.loadLibrary("hello"); // Load native library at runtime hello.dll (Windows) or libhello.so (Unixes)
    }
