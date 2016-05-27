#include "jni.h"

jint Java_com_clibdemo_Http_add(JNIEnv *env, jclass cls, jint a, jint b) {
    return a + b;
}