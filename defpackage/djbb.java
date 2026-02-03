package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djbb {
    public static final void a(final djgb djgbVar, final ics icsVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        igrVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-710451877);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djgbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djdm djdmVar = djgbVar.c;
            if (djdmVar != null) {
                hmlVarC.v(527166840);
                int i4 = i2;
                djcy djcyVar = djgbVar.a;
                djfn djfnVar = djgbVar.b;
                int i5 = djgbVar.g;
                float f = djgbVar.d;
                djga djgaVar = djgbVar.f;
                djhx.f(djcyVar, djfnVar, djdmVar, i5, f, djgaVar.b, icsVar, igrVar, djgbVar.e, djgaVar, hmlVarC, (i4 << 15) & 33030144);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(527594795);
                djir.c(djgbVar.a, djgbVar.g, djgbVar.d, icsVar, igrVar, djgbVar.f, hmlVarC, (i2 << 6) & 64512);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djaz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djgb djgbVar2 = djgbVar;
                    ics icsVar2 = icsVar;
                    int i6 = i;
                    djbb.a(djgbVar2, icsVar2, igrVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.ego r19, final int r20, final float r21, defpackage.djdy r22, final defpackage.fdat r23, defpackage.hml r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djbb.b(ego, int, float, djdy, fdat, hml, int, int):void");
    }
}
