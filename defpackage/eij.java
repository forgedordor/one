package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eij implements eni {
    private final ejy a;

    public eij(ejy ejyVar) {
        this.a = ejyVar;
    }

    @Override // defpackage.eni
    public final int a() {
        return Math.max(0, this.a.b());
    }

    @Override // defpackage.eni
    public final int b() {
        return this.a.d().d();
    }

    @Override // defpackage.eni
    public final int c() {
        return Math.min(b() - 1, ((eji) fcva.S(this.a.d().i())).a);
    }

    @Override // defpackage.eni
    public final int d() {
        ejy ejyVar = this.a;
        if (ejyVar.d().i().isEmpty()) {
            return 0;
        }
        int iB = eae.b(ejyVar.d());
        int iA = ejb.a(ejyVar.d());
        if (iA == 0) {
            return 1;
        }
        return fddu.f(iB / iA, 1);
    }

    @Override // defpackage.eni
    public final boolean e() {
        return !this.a.d().i().isEmpty();
    }
}
