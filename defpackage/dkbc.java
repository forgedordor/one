package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkbc implements fdat {
    final /* synthetic */ boolean a;

    public dkbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkbl.b(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
