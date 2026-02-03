package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emn implements ept {
    final /* synthetic */ emi a;

    public emn(emi emiVar) {
        this.a = emiVar;
    }

    @Override // defpackage.ept
    public final float a() {
        emi emiVar = this.a;
        return epu.a(emiVar.b(), emiVar.c(), emiVar.h());
    }

    @Override // defpackage.ept
    public final float b() {
        emi emiVar = this.a;
        return epu.b(emiVar.b(), emiVar.c());
    }

    @Override // defpackage.ept
    public final int c() {
        emi emiVar = this.a;
        return emiVar.d().b() + emiVar.d().a();
    }

    @Override // defpackage.ept
    public final int d() {
        emi emiVar = this.a;
        return (int) (emiVar.d().h() == dwm.a ? emiVar.d().g() & 4294967295L : emiVar.d().g() >> 32);
    }

    @Override // defpackage.ept
    public final jro e() {
        return new jro(-1, -1);
    }

    @Override // defpackage.ept
    public final Object f(int i, fcxy fcxyVar) {
        hyr hyrVar = emi.a;
        emi emiVar = this.a;
        Object objE = emiVar.e(dod.a, new emh(emiVar, i, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objE != fcylVar) {
            objE = fctx.a;
        }
        return objE == fcylVar ? objE : fctx.a;
    }
}
