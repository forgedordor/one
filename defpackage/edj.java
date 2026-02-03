package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edj {
    public static final void a(ics icsVar, iby ibyVar, final fdau fdauVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(380139498);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(ibyVar) ? 16 : 32;
        }
        int i6 = i3 | 384;
        if ((i & 3072) == 0) {
            i6 |= true != hmlVarC.F(fdauVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i6 & 1171) != 1170, i6 & 1)) {
            if (i4 != 0) {
                icsVar = ics.e;
            }
            if (i5 != 0) {
                ibyVar = ibw.a;
            }
            final ixm ixmVarA = ecz.a(ibyVar, false);
            boolean zD = ((i6 & 7168) == 2048) | hmlVarC.D(ixmVarA);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdat() { // from class: edg
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        izm izmVar = (izm) obj;
                        long j = ((kil) obj2).a;
                        return ixmVarA.e(izmVar, izmVar.a(fctx.a, new hxd(-431986394, true, new edi(fdauVar, new edk(izmVar, j)))), j);
                    }
                };
                hmwVar.af(objS);
            }
            izg.a(icsVar, (fdat) objS, hmlVarC, i6 & 14, 0);
        } else {
            hmlVarC.s();
        }
        final iby ibyVar2 = ibyVar;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final ics icsVar2 = icsVar;
            hpxVarL.d = new fdat() { // from class: edh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    iby ibyVar3 = ibyVar2;
                    edj.a(icsVar3, ibyVar3, fdauVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
