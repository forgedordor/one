package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzt extends ejzv {
    volatile long a;
    ekal b;
    ekal c;

    public ejzt(Object obj, int i, ekal ekalVar) {
        super(obj, i, ekalVar);
        this.a = Long.MAX_VALUE;
        int i2 = ekak.x;
        ejzp ejzpVar = ejzp.a;
        this.b = ejzpVar;
        this.c = ejzpVar;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final ekal f() {
        return this.b;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final ekal h() {
        return this.c;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void l(ekal ekalVar) {
        this.b = ekalVar;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void n(ekal ekalVar) {
        this.c = ekalVar;
    }
}
