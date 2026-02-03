package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpms implements fdat {
    final /* synthetic */ dpmg a;

    public dpms(dpmg dpmgVar) {
        this.a = dpmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dpmw.a(hxe.d(507605825, new dpmr(this.a), hmlVar), hmlVar, 6);
        }
        return fctx.a;
    }
}
