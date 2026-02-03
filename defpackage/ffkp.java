package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkp implements PrivilegedAction {
    final /* synthetic */ String a;

    public ffkp(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return ClassLoader.getSystemClassLoader().loadClass(this.a);
        } catch (Exception unused) {
            return null;
        }
    }
}
