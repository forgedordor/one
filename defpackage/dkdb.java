package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkdb implements fdat {
    final /* synthetic */ djrr a;

    public dkdb(djrr djrrVar) {
        this.a = djrrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkdf.a(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
