package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dng implements fdau {
    final /* synthetic */ dne a;

    public dng(dne dneVar) {
        this.a = dneVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-353972293);
        boolean zD = hmlVar.D(this.a.b(hmlVar));
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new dni();
            hmlVar.y(objF);
        }
        dni dniVar = (dni) objF;
        hmlVar.o();
        return dniVar;
    }
}
