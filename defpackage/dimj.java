package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimj implements fdat {
    final /* synthetic */ diks a;

    public dimj(diks diksVar) {
        this.a = diksVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dimx.e((dikp) this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
