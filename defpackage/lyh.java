package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyh {
    public static final void a(final lva lvaVar, final lvj lvjVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-709389590);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.B(lvaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                lvjVar = (lvj) hmlVarC.e(lyj.a);
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            if (lvaVar == lva.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            final hsf hsfVarA = hsc.a(fdaeVar, hmlVarC);
            boolean zD = hmlVarC.D(hsfVarA) | ((i2 & 14) == 4) | hmlVarC.F(lvjVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: lyd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        final lva lvaVar2 = lvaVar;
                        final hsf hsfVar = hsfVarA;
                        lvh lvhVar = new lvh() { // from class: lyf
                            @Override // defpackage.lvh
                            public final void gL(lvj lvjVar2, lva lvaVar3) {
                                if (lvaVar3 == lvaVar2) {
                                    ((fdae) hsfVar.a()).invoke();
                                }
                            }
                        };
                        lvj lvjVar2 = lvjVar;
                        lvjVar2.P().c(lvhVar);
                        return new lyg(lvjVar2, lvhVar);
                    }
                };
                hmwVar.af(objS);
            }
            hob.c(lvjVar, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: lye
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    lva lvaVar2 = lvaVar;
                    lvj lvjVar2 = lvjVar;
                    int i3 = i;
                    lyh.a(lvaVar2, lvjVar2, fdaeVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
