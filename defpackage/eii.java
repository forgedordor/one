package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eii implements ept {
    final /* synthetic */ ejy a;
    final /* synthetic */ boolean b;

    public eii(ejy ejyVar, boolean z) {
        this.a = ejyVar;
        this.b = z;
    }

    @Override // defpackage.ept
    public final float a() {
        ejy ejyVar = this.a;
        return epu.a(ejyVar.b(), ejyVar.c(), ejyVar.h());
    }

    @Override // defpackage.ept
    public final float b() {
        ejy ejyVar = this.a;
        return epu.b(ejyVar.b(), ejyVar.c());
    }

    @Override // defpackage.ept
    public final int c() {
        ejy ejyVar = this.a;
        return ejyVar.d().b() + ejyVar.d().a();
    }

    @Override // defpackage.ept
    public final int d() {
        ejy ejyVar = this.a;
        return (int) (ejyVar.d().h() == dwm.a ? ejyVar.d().g() & 4294967295L : ejyVar.d().g() >> 32);
    }

    @Override // defpackage.ept
    public final jro e() {
        return this.b ? new jro(-1, 1) : new jro(1, -1);
    }

    @Override // defpackage.ept
    public final Object f(int i, fcxy fcxyVar) {
        Object objN = ejy.n(this.a, i, fcxyVar);
        return objN == fcyl.a ? objN : fctx.a;
    }
}
