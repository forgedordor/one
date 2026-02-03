package defpackage;

import java.security.AccessController;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffkq {
    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new ffkp(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
