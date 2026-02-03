package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzx extends ejzv {
    volatile long a;
    ekal b;
    ekal c;

    public ejzx(Object obj, int i, ekal ekalVar) {
        super(obj, i, ekalVar);
        this.a = Long.MAX_VALUE;
        int i2 = ekak.x;
        ejzp ejzpVar = ejzp.a;
        this.b = ejzpVar;
        this.c = ejzpVar;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final ekal g() {
        return this.b;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final ekal i() {
        return this.c;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void m(ekal ekalVar) {
        this.b = ekalVar;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void o(ekal ekalVar) {
        this.c = ekalVar;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void q(long j) {
        this.a = j;
    }
}
