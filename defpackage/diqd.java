package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diqd implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdae b;

    public diqd(boolean z, fdae fdaeVar) {
        this.a = z;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        diqe.a(hmlVar, 0);
        boolean z = this.a;
        Boolean boolValueOf = Boolean.valueOf(z);
        hmlVar.v(-1633490746);
        boolean zE = hmlVar.E(z);
        fdae fdaeVar = this.b;
        boolean zD = zE | hmlVar.D(fdaeVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new diqc(z, fdaeVar, null);
            hmlVar.y(objF);
        }
        hmlVar.o();
        hob.g(boolValueOf, (fdat) objF, hmlVar);
        return fctx.a;
    }
}
