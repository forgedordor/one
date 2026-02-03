package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizi {
    public static final void a(final dizj dizjVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1178601125);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dizjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: dizf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Integer.valueOf(((ekoe) dizjVar.a).c);
                    }
                };
                hmwVar.af(objS);
            }
            final fdae fdaeVar = (fdae) objS;
            hmwVar.ab();
            Object[] objArr = new Object[0];
            hyr hyrVar = hec.a;
            boolean zB = hmlVarC.B(0) | hmlVarC.D(fdaeVar);
            Object objS2 = hmwVar.S();
            if (zB || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: hed
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hec(0, 0.0f, fdaeVar);
                    }
                };
                hmwVar.af(objS2);
            }
            hec hecVar = (hec) hxy.e(objArr, hyrVar, (fdae) objS2, hmlVarC, 0, 4);
            hdy hdyVar = hecVar.b;
            hdyVar.a.b(fdaeVar);
            icsVar2 = icsVar;
            hdt.c(hecVar, icsVar2, ese.a(hdyVar, new hdc(), ddi.a(hmlVarC), dea.b(0.0f, 400.0f, null, 5), hmlVarC, 0, 16), 0.0f, 0.0f, null, hxe.d(-1227618563, new dizh(dizjVar), hmlVarC), hmlVarC, ((i2 << 3) & 896) | 100666424);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dizg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dizj dizjVar2 = dizjVar;
                    int i5 = i;
                    dizi.a(dizjVar2, icsVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
