package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehk implements fdau {
    final /* synthetic */ fdap a;

    public ehk(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-1608161351);
        fdap fdapVar = this.a;
        boolean zD = hmlVar.D(fdapVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new edq(fdapVar);
            hmlVar.y(objF);
        }
        edq edqVar = (edq) objF;
        hmlVar.o();
        return edqVar;
    }
}
