package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dleh {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dldx r16, defpackage.ics r17, defpackage.dpn r18, boolean r19, defpackage.fdat r20, defpackage.hml r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dleh.a(dldx, ics, dpn, boolean, fdat, hml, int, int):void");
    }

    public static final void b(final dldx dldxVar, final ics icsVar, final dpn dpnVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2136604572);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dldxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dpnVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            diig.a(dldxVar != null ? dldxVar.a : null, dldxVar != null ? dldxVar.b : null, dae.k(dea.c(350, 0, new den(0.2f, 0.0f, 0.0f, 1.0f), 2), null, 10), dae.q(new dia(250, 150, new den(0.2f, 0.0f, 0.0f, 1.0f)), null, 10), null, hxe.d(1373340897, new dled(icsVar, dpnVar, dldxVar), hmlVarC), hmlVarC, 196992, 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dldx dldxVar2 = dldxVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dleh.b(dldxVar2, icsVar2, dpnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
