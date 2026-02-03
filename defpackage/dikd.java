package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikd {
    public static final void a(final dilm dilmVar, final ikp ikpVar, hml hmlVar, final int i, final int i2) {
        int i3;
        dilmVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-730325091);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dilmVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                ikpVar = ikj.a;
            }
            if (dilmVar instanceof diks) {
                hmlVarC.v(-1762738911);
                dimx.l((diks) dilmVar, null, ikpVar, hmlVarC, (i3 << 3) & 896);
                ((hmw) hmlVarC).ab();
            } else if (dilmVar instanceof diky) {
                hmlVarC.v(-1762736620);
                dini.g((diky) dilmVar, null, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            } else if (dilmVar instanceof dilc) {
                hmlVarC.v(-1762734831);
                dins.g((dilc) dilmVar, null, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            } else if (dilmVar instanceof dild) {
                hmlVarC.v(-1762732871);
                diny.a((dild) dilmVar, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            } else if (dilmVar instanceof dilh) {
                hmlVarC.v(-1762730894);
                diod.d((dilh) dilmVar, null, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dilmVar instanceof dill)) {
                    hmlVarC.v(-1762740073);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-1762729134);
                diok.e((dill) dilmVar, null, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dikc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dilm dilmVar2 = dilmVar;
                    int i6 = i;
                    dikd.a(dilmVar2, ikpVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
