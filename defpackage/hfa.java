package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfa {
    public static final void a(final lvj lvjVar, final fdap fdapVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1868327245);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(lvjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            boolean zF = ((i2 & 112) == 32) | hmlVarC.F(lvjVar);
            boolean z = (i2 & 896) == 256;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | zF) || objS == hmk.a) {
                objS = new fdap() { // from class: hev
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        final fdap fdapVar2 = fdapVar;
                        lvh lvhVar = new lvh() { // from class: heu
                            @Override // defpackage.lvh
                            public final void gL(lvj lvjVar2, lva lvaVar) {
                                fdapVar2.invoke(lvaVar);
                            }
                        };
                        lvj lvjVar2 = lvjVar;
                        lvjVar2.P().c(lvhVar);
                        return new hez(fdaeVar, lvjVar2, lvhVar);
                    }
                };
                hmwVar.af(objS);
            }
            hob.c(lvjVar, (fdap) objS, hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hew
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    lvj lvjVar2 = lvjVar;
                    fdap fdapVar2 = fdapVar;
                    int i4 = i;
                    hfa.a(lvjVar2, fdapVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
