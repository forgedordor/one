package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkem implements fdat {
    final /* synthetic */ fdae a;

    public dkem(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkeo.a(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
