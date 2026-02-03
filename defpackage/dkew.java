package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkew {
    /* JADX WARN: Removed duplicated region for block: B:108:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dkez r32, defpackage.ics r33, defpackage.eve r34, final boolean r35, final defpackage.fdav r36, defpackage.hml r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkew.a(dkez, ics, eve, boolean, fdav, hml, int, int):void");
    }

    public static final void b(final ede edeVar, final boolean z, ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        ije ijeVar;
        final ics icsVar2;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(-1627311014);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            final ics icsVar3 = icsVar;
            hmlVarC.v(-1201247307);
            if (z) {
                long j = glz.a(hmlVarC).a;
                ijeVar = new ije(ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.5f, ije.f(j)));
            } else {
                ijeVar = null;
            }
            ((hmw) hmlVarC).ab();
            if (ijeVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dket
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ede edeVar2 = edeVar;
                            boolean z2 = z;
                            dkew.b(edeVar2, z2, icsVar3, (hml) obj, hpy.a(i | 1), i2);
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ecz.b(dkl.a(edeVar.b(icsVar3), ijeVar.i, ikj.a), hmlVarC, 0);
            icsVar2 = icsVar3;
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkeu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    boolean z2 = z;
                    dkew.b(edeVar2, z2, icsVar2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
