#include <jni.h>
#include <string.h>

JNIEXPORT jstring JNICALL
Java_com_example_andrei_myfirstapplication_MainActivity_stringFromJNI(JNIEnv *env,
                                                                      jobject instance) {

    // TODO
    jstring tmp = (*env)->NewStringUTF(env, "Hello from JNI !  Compiled with ABI ");
    return (*env)->NewStringUTF(env, "Hello from JNI !  Compiled with ABI ");
    //return (*env)->NewStringUTF(env, returnValue);
}