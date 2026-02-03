package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlas implements fdau {
    final /* synthetic */ ics a;

    public dlas(ics icsVar) {
        this.a = icsVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final dlax dlaxVar = (dlax) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        dlaxVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(dlaxVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVar = this.a;
            hmlVar.v(5004770);
            int i = iIntValue & 14;
            Object objF = hmlVar.f();
            if (i == 4 || objF == hmk.a) {
                objF = new fdap() { // from class: dlaq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jto jtoVar = (jto) obj4;
                        jtoVar.getClass();
                        dlax dlaxVar2 = dlaxVar;
                        String str = dlaxVar2.j;
                        if (str != null) {
                            jtk.k(jtoVar, str);
                        }
                        if (dlaxVar2.i) {
                            jtk.n(jtoVar, 0);
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtdn.a(joj.a(jsh.c(icsVar, false, (fdap) objF), "AlertCard"), evn.b(30.0f), dtdj.b(glz.a(hmlVar).y, glz.a(hmlVar).q, hmlVar, 12), null, null, hxe.d(927214484, new dlar(dlaxVar), hmlVar), hmlVar, 196608, 24);
        }
        return fctx.a;
    }
}
