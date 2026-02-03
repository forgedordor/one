package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esb implements eni {
    private final etv a;
    private final int b;

    public esb(etv etvVar, int i) {
        this.a = etvVar;
        this.b = i;
    }

    @Override // defpackage.eni
    public final int a() {
        return Math.max(0, this.a.f - this.b);
    }

    @Override // defpackage.eni
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.eni
    public final int c() {
        return Math.min(b() - 1, ((erx) fcva.S(this.a.x().a)).a + this.b);
    }

    @Override // defpackage.eni
    public final int d() {
        etv etvVar = this.a;
        if (etvVar.x().a.size() == 0) {
            return 0;
        }
        int iA = esq.a(etvVar.x());
        int i = etvVar.x().b + etvVar.x().c;
        if (i == 0) {
            return 1;
        }
        return fddu.f(iA / i, 1);
    }

    @Override // defpackage.eni
    public final boolean e() {
        return !this.a.x().a.isEmpty();
    }
}
