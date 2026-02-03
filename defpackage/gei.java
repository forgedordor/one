package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gei implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public gei(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final String str = this.a;
            ico icoVar = ics.e;
            boolean zD = hmlVar.D(str);
            final String str2 = this.b;
            boolean zD2 = zD | hmlVar.D(str2);
            Object objF = hmlVar.f();
            if (zD2 || objF == hmk.a) {
                objF = new fdap() { // from class: geh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jtk.k((jto) obj3, str + ", " + str2);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gyj.c(str, jsh.c(icoVar, false, (fdap) objF), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262140);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
