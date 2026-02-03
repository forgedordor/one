package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgg extends WeakReference {
    final res a;
    final boolean b;
    rhy c;

    public rgg(res resVar, rhq rhqVar, ReferenceQueue referenceQueue) {
        super(rhqVar, referenceQueue);
        rvi.f(resVar);
        this.a = resVar;
        this.c = null;
        this.b = rhqVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
