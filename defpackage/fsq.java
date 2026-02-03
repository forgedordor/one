package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsq implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ fss b;

    public fsq(fdau fdauVar, fss fssVar) {
        this.a = fdauVar;
        this.b = fssVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(this.b, hmlVar, 6);
        }
        return fctx.a;
    }
}
