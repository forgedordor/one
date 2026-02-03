package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyci {
    public final fcsu a;
    public final fcsu b;
    public final List c;
    private final fctc d;

    /* JADX WARN: Multi-variable type inference failed */
    public cyci(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, Optional optional, fcsu fcsuVar5) {
        fcsuVar2.getClass();
        fcsuVar5.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fctc fctcVarA = fctd.a(new fdae() { // from class: cybx
            @Override // defpackage.fdae
            public final Object invoke() {
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.CMS_SETTINGS);
                cmggVarC.f(aumq.a);
                return ((cmgk) this.a.b.b()).a(cmggVarC.a());
            }
        });
        this.d = fctcVarA;
        List listI = ((autx) fcsuVar5.b()).j((aumq) ((cmfo) fctcVarA.a()).l()) ? fcva.i(fcsuVar3.b(), fcsuVar4.b()) : fcva.i(fcsuVar3.b());
        optional.isPresent();
        this.c = listI;
    }

    public final void a(final hox hoxVar, final int i, final cyeh cyehVar, hml hmlVar, final int i2) {
        int i3;
        boolean z;
        hoxVar.getClass();
        cyehVar.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-77460674);
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
            i3 |= true != hmlVarC.F(cyehVar) ? 128 : 256;
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
                objS = new fdae() { // from class: cyby
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar.b(Integer.valueOf(i));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dthi.a(z2, (fdae) objS, null, false, hxe.d(-1225393000, new cyca(cyehVar), hmlVarC), 0L, 0L, hmlVarC, 24576, 492);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cybz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cyci cyciVar = this.a;
                    hox hoxVar2 = hoxVar;
                    int i5 = i;
                    cyciVar.a(hoxVar2, i5, cyehVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(627874778);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtct.a(cybq.a, null, hxe.d(-1522715820, new cycc(this), hmlVarC), null, 0.0f, null, null, null, hmlVarC, 390, 250);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cybw
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
