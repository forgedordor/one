package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adbf implements fdat {
    final /* synthetic */ hsf a;
    final /* synthetic */ adbm b;

    public adbf(hsf hsfVar, adbm adbmVar) {
        this.a = hsfVar;
        this.b = adbmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cuit.a(null, null, false, null, false, hxe.d(-1781260446, new adbe(this.a, this.b), hmlVar), hmlVar, 196608, 31);
        }
        return fctx.a;
    }
}
