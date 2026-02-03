package j$.util.stream;

import j$.nio.file.C0018i;
import java.security.AccessController;

/* loaded from: classes9.dex */
public abstract class T3 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new C0018i(4))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
