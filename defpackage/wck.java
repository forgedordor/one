package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wck implements fdat {
    final /* synthetic */ hsf a;

    public wck(hsf hsfVar) {
        this.a = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String str = wcp.a(this.a).a;
            if (str != null) {
                dlod.a(str, hmlVar, 48);
            }
        }
        return fctx.a;
    }
}
