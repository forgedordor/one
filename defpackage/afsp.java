package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afsp {
    /* JADX WARN: Removed duplicated region for block: B:121:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.afrs r25, final defpackage.aftp r26, final defpackage.oxm r27, final defpackage.afts r28, defpackage.hml r29, final int r30) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afsp.a(afrs, aftp, oxm, afts, hml, int):void");
    }

    public static final void b(afrs afrsVar, hml hmlVar, final int i) {
        int i2;
        final afrs afrsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-915801987);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(afrsVar) : hmlVarC.F(afrsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            afrsVar2 = afrsVar;
        } else {
            fcyh fcyhVar = ((auut) hmlVarC.e(auwg.a)).a;
            afrsVar2 = afrsVar;
            a(afrsVar2, (aftp) hro.a(afrsVar.a, hmlVarC).a(), oxr.a(afrsVar.b, fcyhVar, hmlVarC, 0), (afts) hro.a(afrsVar.c, hmlVarC).a(), hmlVarC, (i2 & 14) | 520);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afrv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    afsp.b(afrsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
