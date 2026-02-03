package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsv implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public dmsv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            long jG = glz.d(hmlVar).o.g();
            ico icoVar = ics.e;
            hmlVar.v(5004770);
            final String str = this.a;
            boolean zD = hmlVar.D(str);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: dmsu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jto jtoVar = (jto) obj4;
                        jtoVar.getClass();
                        jtk.k(jtoVar, str);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            gyj.c(this.b, jsh.c(icoVar, false, (fdap) objF), 0L, jG, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262124);
        }
        return fctx.a;
    }
}
