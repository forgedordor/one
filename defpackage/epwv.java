package defpackage;

import com.sun.jna.JNIEnv;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwv {
    public static final Pointer a(Object obj) {
        epwx epwxVar = epww.a;
        JNIEnv jNIEnv = JNIEnv.CURRENT;
        jNIEnv.getClass();
        return epwxVar.create_rust_jvm_cookie(jNIEnv, obj);
    }

    public static final void b(Pointer pointer) {
        epww.a.destroy_rust_jvm_cookie(pointer);
    }
}
