package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybk {
    public static final void a(final kph kphVar, final kow kowVar, final xwn xwnVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-216235940);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(kphVar) : hmlVarC.F(kphVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(kowVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(xwnVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dirx dirxVar = (dirx) hsb.b(xwnVar.c, null, null, hmlVarC, 2).a();
            if (dirxVar != null) {
                List list = dirxVar.a;
                if (!list.isEmpty()) {
                    kow kowVarA = kphVar.a();
                    dirx dirxVar2 = new dirx(list, 1);
                    ico icoVar = ics.e;
                    hmlVarC.v(5004770);
                    int i3 = i2 & 112;
                    hmw hmwVar = (hmw) hmlVarC;
                    Object objS = hmwVar.S();
                    if (i3 == 32 || objS == hmk.a) {
                        objS = new fdap() { // from class: ybg
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                kov kovVar = (kov) obj;
                                kovVar.getClass();
                                kot kotVar = kovVar.g;
                                kow kowVar2 = kowVar;
                                kqa.a(kotVar, kowVar2.d, 0.0f, 6);
                                kpt.a(kovVar.h, kowVar2.e, 0.0f, 6);
                                return fctx.a;
                            }
                        };
                        hmwVar.af(objS);
                    }
                    hmwVar.ab();
                    ics icsVarD = kph.d(icoVar, kowVarA, (fdap) objS);
                    hmlVarC.v(1849434622);
                    Object objS2 = hmwVar.S();
                    if (objS2 == hmk.a) {
                        objS2 = new fdau() { // from class: ybh
                            @Override // defpackage.fdau
                            public final Object a(Object obj, Object obj2, Object obj3) {
                                ixp ixpVar = (ixp) obj;
                                ixk ixkVar = (ixk) obj2;
                                ixpVar.getClass();
                                ixkVar.getClass();
                                final iyl iylVarE = ixkVar.e(((kil) obj3).a);
                                return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: ybj
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj4) {
                                        iyk iykVar = (iyk) obj4;
                                        iykVar.getClass();
                                        iyl iylVar = iylVarE;
                                        iykVar.s(iylVar, 0, iylVar.b - ((int) kin.d(iykVar, 8.0f)), 0.0f);
                                        return fctx.a;
                                    }
                                });
                            }
                        };
                        hmwVar.af(objS2);
                    }
                    hmwVar.ab();
                    dirw.p(dirxVar2, iwl.a(icsVarD, (fdau) objS2), hmlVarC, 0);
                }
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ybi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kph kphVar2 = kphVar;
                    kow kowVar2 = kowVar;
                    int i4 = i;
                    ybk.a(kphVar2, kowVar2, xwnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
