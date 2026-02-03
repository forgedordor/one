package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekab extends ekad {
    volatile long a;
    ekal b;
    ekal c;

    public ekab(ReferenceQueue referenceQueue, Object obj, int i, ekal ekalVar) {
        super(referenceQueue, obj, i, ekalVar);
        this.a = Long.MAX_VALUE;
        int i2 = ekak.x;
        ejzp ejzpVar = ejzp.a;
        this.b = ejzpVar;
        this.c = ejzpVar;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final ekal f() {
        return this.b;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final ekal h() {
        return this.c;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final void l(ekal ekalVar) {
        this.b = ekalVar;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final void n(ekal ekalVar) {
        this.c = ekalVar;
    }
}
