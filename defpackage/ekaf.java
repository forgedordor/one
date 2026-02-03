package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekaf extends ekad {
    volatile long a;
    ekal b;
    ekal c;

    public ekaf(ReferenceQueue referenceQueue, Object obj, int i, ekal ekalVar) {
        super(referenceQueue, obj, i, ekalVar);
        this.a = Long.MAX_VALUE;
        int i2 = ekak.x;
        ejzp ejzpVar = ejzp.a;
        this.b = ejzpVar;
        this.c = ejzpVar;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final ekal g() {
        return this.b;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final ekal i() {
        return this.c;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final void m(ekal ekalVar) {
        this.b = ekalVar;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final void o(ekal ekalVar) {
        this.c = ekalVar;
    }

    @Override // defpackage.ekad, defpackage.ekal
    public final void q(long j) {
        this.a = j;
    }
}
