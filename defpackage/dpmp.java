package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpmp implements fdat {
    final /* synthetic */ dpmg a;

    public dpmp(dpmg dpmgVar) {
        this.a = dpmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dpmg dpmgVar = this.a;
            if (dpmgVar != null) {
                dpol.b(dpmgVar, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
