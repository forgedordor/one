package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ejzv extends ejyu {
    final Object g;
    final int h;
    final ekal i;
    volatile ejzz j = ekak.b;

    public ejzv(Object obj, int i, ekal ekalVar) {
        this.g = obj;
        this.h = i;
        this.i = ekalVar;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final int a() {
        return this.h;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final ejzz d() {
        return this.j;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final ekal e() {
        return this.i;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.ejyu, defpackage.ekal
    public final void p(ejzz ejzzVar) {
        this.j = ejzzVar;
    }
}
