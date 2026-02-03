package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tej {
    public static final void a(final teg tegVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(412152758);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ditp ditpVar = tegVar.a;
            ditk.o(ditpVar, icsVar, hmlVarC, i2 & 112);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new tei(tegVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(ditpVar.c, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: teh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    teg tegVar2 = tegVar;
                    int i5 = i;
                    tej.a(tegVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
