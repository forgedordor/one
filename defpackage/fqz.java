package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqz implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ ego b;

    public fqz(fdau fdauVar, ego egoVar) {
        this.a = fdauVar;
        this.b = egoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1691869137);
            float fB = fon.b(hmlVar);
            hmlVar.o();
            hnj.a(fop.a.c(Float.valueOf(fB)), hxe.d(-308149173, new fqy(this.a, this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
