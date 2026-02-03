package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknv {
    public static final void a(final dkny dknyVar, final fdae fdaeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int iEn;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2074270111);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dknyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float f = true != z ? 1.0f : 0.0f;
            dew dewVar = dljt.d(hmlVarC).d;
            hmlVarC.v(-1633490746);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z3 | z2) || objS == hmk.a) {
                objS = new fdap() { // from class: dkns
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((Float) obj).floatValue();
                        if (z) {
                            fdaeVar.invoke();
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hsf hsfVarC = ddu.c(f, dewVar, (fdap) objS, hmlVarC, 3072, 4);
            hmlVarC.v(-508734965);
            int iEn2 = dknyVar.a.h.a ? 0 : (int) ((kio) hmlVarC.e(jmh.e)).en(12.0f);
            hmwVar.ab();
            fdae fdaeVar2 = dknyVar.c;
            dknx dknxVar = dknyVar.b;
            hmlVarC.v(-596332139);
            hpt hptVar = jmh.e;
            float fEn = ((kio) hmlVarC.e(hptVar)).en(70.0f);
            int i4 = dknxVar.a;
            if (i4 >= fEn) {
                hmlVarC.v(-1345722098);
                iEn = i4 + ((int) ((kio) hmlVarC.e(hptVar)).en(-90.0f));
                hmwVar.ab();
            } else {
                hmlVarC.v(-1345589542);
                iEn = (int) ((kio) hmlVarC.e(hptVar)).en(-65.0f);
                hmwVar.ab();
            }
            int i5 = dknxVar.c;
            hmwVar.ab();
            kna.b(new dknw(i5, iEn, dknxVar.b, iEn2), fdaeVar2, null, hxe.d(-917812865, new dknu(hsfVarC, dknyVar), hmlVarC), hmlVarC, 3072, 4);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dknt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkny dknyVar2 = dknyVar;
                    fdae fdaeVar3 = fdaeVar;
                    int i6 = i;
                    dknv.a(dknyVar2, fdaeVar3, z, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
