package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class divm {
    public static final void a(final divn divnVar, final ics icsVar, final ikp ikpVar, hml hmlVar, final int i) {
        int i2;
        long jA;
        hml hmlVarC = hmlVar.c(-202065262);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(divnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar = ics.e;
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            ics icsVarU = egq.u(egq.d(icsVar, 1.0f), 40.0f, 0.0f, 2);
            if (divnVar.c) {
                hmlVarC.v(1818380701);
                jA = divo.a(divnVar, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1818437710);
                jA = glz.a(hmlVarC).B;
                ((hmw) hmlVarC).ab();
            }
            gvk.c(icsVarU, ikpVar, divo.a(divnVar, hmlVarC), 0L, 0.0f, 0.0f, dkz.a(1.0f, jA), hxe.d(-1648320403, new divl(divnVar), hmlVarC), hmlVarC, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: divk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    divn divnVar2 = divnVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    divm.a(divnVar2, icsVar2, ikpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
