package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkaj implements fdat {
    final /* synthetic */ String a;

    public dkaj(String str) {
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkan.g(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
