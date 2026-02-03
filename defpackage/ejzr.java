package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzr extends SoftReference implements ejzz {
    final ekal a;

    public ejzr(ReferenceQueue referenceQueue, Object obj, ekal ekalVar) {
        super(obj, referenceQueue);
        this.a = ekalVar;
    }

    @Override // defpackage.ejzz
    public final int a() {
        return 1;
    }

    @Override // defpackage.ejzz
    public final ejzz b(ReferenceQueue referenceQueue, Object obj, ekal ekalVar) {
        return new ejzr(referenceQueue, obj, ekalVar);
    }

    @Override // defpackage.ejzz
    public final ekal c() {
        return this.a;
    }

    @Override // defpackage.ejzz
    public final Object d() {
        return get();
    }

    @Override // defpackage.ejzz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ejzz
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ejzz
    public final void e(Object obj) {
    }
}
