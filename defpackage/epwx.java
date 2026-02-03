package defpackage;

import com.sun.jna.JNIEnv;
import com.sun.jna.Library;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface epwx extends Library {
    Pointer create_rust_jvm_cookie(JNIEnv jNIEnv, Object obj);

    void destroy_rust_jvm_cookie(Pointer pointer);
}
