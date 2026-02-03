package j$.util;

import j$.nio.file.C0018i;
import java.security.AccessController;

/* loaded from: classes9.dex */
public abstract class o0 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new C0018i(2))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
