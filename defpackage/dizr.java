package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dizr implements fdat {
    final /* synthetic */ dizu a;

    public dizr(dizu dizuVar) {
        this.a = dizuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dizs.b(this.a.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
