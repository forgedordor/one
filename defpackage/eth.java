package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eth implements epo, dwy {
    final /* synthetic */ etv a;
    private final /* synthetic */ dwy b;

    public eth(dwy dwyVar, etv etvVar) {
        this.a = etvVar;
        this.b = dwyVar;
    }

    @Override // defpackage.dwy
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.epo
    public final int b() {
        return this.a.f;
    }

    @Override // defpackage.epo
    public final int c() {
        throw null;
    }

    @Override // defpackage.epo
    public final int d() {
        return ((erx) fcva.S(this.a.x().a)).a;
    }

    @Override // defpackage.epo
    public final void e(int i, int i2) {
        throw null;
    }

    @Override // defpackage.epo
    public final int f(int i) {
        etv etvVar = this.a;
        return (int) (fddu.m(etg.a(etvVar) + fdcu.b((((i - etvVar.j()) * etvVar.l()) - (etvVar.c() * etvVar.l())) + 0.0f), etvVar.i, etvVar.h) - etg.a(etvVar));
    }
}
