package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftg implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ ftl b;

    public ftg(fdau fdauVar, ftl ftlVar) {
        this.a = fdauVar;
        this.b = ftlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fdau fdauVar = this.a;
            ftl ftlVar = this.b;
            ftlVar.getClass();
            fdauVar.a(ftlVar, hmlVar, 0);
        }
        return fctx.a;
    }
}
