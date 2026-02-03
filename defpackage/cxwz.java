package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwz {
    public final cxwn a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public cxwz(cxwn cxwnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = cxwnVar;
        this.b = fcva.g(fcsuVar.b(), new cxyz("Messages", (cxzb) fcsuVar2.b()), new cxyz("Conversations", (cxzb) fcsuVar3.b()), new cxyz("Participants", (cxzb) fcsuVar4.b()), fcsuVar5.b());
    }

    public final void a(final hox hoxVar, final int i, final cxwl cxwlVar, hml hmlVar, final int i2) {
        int i3;
        boolean z;
        hoxVar.getClass();
        cxwlVar.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(636697074);
        boolean z2 = true;
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(hoxVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(cxwlVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (((Number) hoxVar.a()).intValue() == i) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            hmlVarC.v(-1633490746);
            boolean z3 = (i3 & 14) == 4 ? z : false;
            if ((i3 & 112) != 32) {
                z = false;
            }
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z3 | z) || objS == hmk.a) {
                objS = new fdae() { // from class: cxwo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar.b(Integer.valueOf(i));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dthi.a(z2, (fdae) objS, null, false, hxe.d(-1313676724, new cxwr(cxwlVar), hmlVarC), 0L, 0L, hmlVarC, 24576, 492);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxwp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxwz cxwzVar = this.a;
                    hox hoxVar2 = hoxVar;
                    int i5 = i;
                    cxwzVar.a(hoxVar2, i5, cxwlVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-357543454);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtct.b(cxxc.a, null, hxe.d(1670774353, new cxwt(this), hmlVarC), null, null, null, hmlVarC, 390);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxwq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.b((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
