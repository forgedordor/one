package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyce implements fdat {
    final /* synthetic */ cyci a;
    final /* synthetic */ hox b;

    public cyce(cyci cyciVar, hox hoxVar) {
        this.a = cyciVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cyci cyciVar = this.a;
            hox hoxVar = this.b;
            int i = 0;
            for (Object obj3 : cyciVar.c) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                cyciVar.a(hoxVar, i, (cyeh) obj3, hmlVar, 0);
                i = i2;
            }
        }
        return fctx.a;
    }
}
