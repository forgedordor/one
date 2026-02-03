package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdr implements fdat {
    final /* synthetic */ acec a;
    final /* synthetic */ dayp b;

    public acdr(acec acecVar, dayp daypVar) {
        this.a = acecVar;
        this.b = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cuit.a(null, null, false, null, false, hxe.d(1844372075, new acdq(this.a, this.b), hmlVar), hmlVar, 196608, 31);
        }
        return fctx.a;
    }
}
