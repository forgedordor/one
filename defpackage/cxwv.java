package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxwv implements fdat {
    final /* synthetic */ cxwz a;
    final /* synthetic */ hri b;

    public cxwv(cxwz cxwzVar, hri hriVar) {
        this.a = cxwzVar;
        this.b = hriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cxwz cxwzVar = this.a;
            hri hriVar = this.b;
            int i = 0;
            for (Object obj3 : cxwzVar.b) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                cxwzVar.a(hriVar, i, (cxwl) obj3, hmlVar, 0);
                i = i2;
            }
        }
        return fctx.a;
    }
}
