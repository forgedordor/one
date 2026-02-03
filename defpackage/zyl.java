package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyl {
    public static final void a(final divg divgVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-436027790);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(divgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            diuy.c(icsVar, null, 0L, 0L, divgVar, hxe.d(214191, new zyk(divgVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 196608 | ((i2 << 12) & 57344), 14);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zyi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    divg divgVar2 = divgVar;
                    int i4 = i;
                    zyl.a(divgVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final divg divgVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(526519009);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(divgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = divgVar instanceof aadc;
            ico icoVar = ics.e;
            if (z) {
                hmlVarC.v(-821362387);
                aadf.a((aadc) divgVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else if (divgVar instanceof aadg) {
                hmlVarC.v(-821359635);
                aadj.a((aadg) divgVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else if (divgVar instanceof zzk) {
                hmlVarC.v(-821357114);
                zzm.a((zzk) divgVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else if (divgVar instanceof xsn) {
                hmlVarC.v(-821354919);
                xtn.g((xsn) divgVar, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            } else if ((divgVar instanceof divf) || (divgVar instanceof diva)) {
                hmlVarC.v(-821351874);
                diuy.a(divgVar, icoVar, hmlVarC, i3 & 126, 0);
                ((hmw) hmlVarC).ab();
            } else {
                if (divgVar instanceof agub) {
                    hmlVarC.v(-821349615);
                    throw null;
                }
                int i4 = i3 & 112;
                if (divgVar instanceof zzy) {
                    hmlVarC.v(-821345912);
                    aaaa.a((zzy) divgVar, icoVar, hmlVarC, i4);
                    ((hmw) hmlVarC).ab();
                } else if (divgVar instanceof aabu) {
                    hmlVarC.v(-821343152);
                    aacz.l((aabu) divgVar, icoVar, hmlVarC, i4);
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(-821341242);
                    a(divgVar, icoVar, hmlVarC, i3 & 126);
                    ((hmw) hmlVarC).ab();
                }
            }
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zyj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    divg divgVar2 = divgVar;
                    int i5 = i;
                    zyl.b(divgVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
