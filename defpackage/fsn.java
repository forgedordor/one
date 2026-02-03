package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsn implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ fsv b;

    public fsn(fdau fdauVar, fsv fsvVar) {
        this.a = fdauVar;
        this.b = fsvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(this.b.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
