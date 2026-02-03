package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgy implements fdat {
    final /* synthetic */ String a;

    public cwgy(String str) {
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String str = this.a;
            if (str == null) {
                str = new String();
            }
            dthx.b(str, null, ije.d, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVar).g, hmlVar, 384, 3120, 55290);
        }
        return fctx.a;
    }
}
