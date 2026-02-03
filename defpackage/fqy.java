package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqy implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ ego b;

    public fqy(fdau fdauVar, ego egoVar) {
        this.a = fdauVar;
        this.b = egoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
