package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkn implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ hkt b;

    public hkn(fdau fdauVar, hkt hktVar) {
        this.a = fdauVar;
        this.b = hktVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            this.a.a(this.b, hmlVar, 6);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
