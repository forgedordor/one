package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyq {
    public static final void a(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2104141203);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.i(ics.e, 16.0f, 0.0f, 2), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, (i2 & 14) | 48, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diym
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    diyq.a(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1155637839);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.i(ics.e, 16.0f, 0.0f, 2), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).v, hmlVar2, (i2 & 14) | 48, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diyo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    diyq.b(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final diyr diyrVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1546348987);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diyrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(icsVar, 1.0f);
            eve eveVar = glz.c(hmlVarC).g;
            hmlVarC.v(-843828533);
            hmlVarC.v(829600610);
            boolean z = !((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() && dljt.h(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (z) {
                hmlVarC.v(-52097940);
                j = glz.a(hmlVarC).p;
                hmwVar.ab();
            } else {
                hmlVarC.v(-52049053);
                j = glz.a(hmlVarC).F;
                hmwVar.ab();
            }
            hmwVar.ab();
            dtdn.a(icsVarD, eveVar, dtdj.b(j, 0L, hmlVarC, 14), null, null, hxe.d(-79547465, new diyp(diyrVar), hmlVarC), hmlVarC, 196608, 24);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diyn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diyr diyrVar2 = diyrVar;
                    int i4 = i;
                    diyq.c(diyrVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
