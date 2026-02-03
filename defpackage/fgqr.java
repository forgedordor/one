package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqr implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ fgqs b;

    public fgqr(fgqs fgqsVar, String str) {
        this.a = str;
        this.b = fgqsVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        ClassLoader classLoader = this.b.a;
        return classLoader != null ? classLoader.getResourceAsStream(this.a) : ClassLoader.getSystemResourceAsStream(this.a);
    }
}
