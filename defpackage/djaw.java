package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djaw {
    public static final void a(final djgb djgbVar, final ics icsVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        igrVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1231696797);
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
                hmlVarC.v(1573869558);
                int i4 = i2;
                djcy djcyVar = djgbVar.a;
                djfn djfnVar = djgbVar.b;
                int i5 = djgbVar.g;
                float f = djgbVar.d;
                djga djgaVar = djgbVar.f;
                djhj.b(djcyVar, djfnVar, djdmVar, i5, f, djgaVar.b, djgbVar.e, icsVar, igrVar, djgaVar, hmlVarC, (i4 << 18) & 264241152);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1574298753);
                djii.b(djgbVar.a, djgbVar.b, djgbVar.g, djgbVar.d, icsVar, igrVar, djgbVar.f, hmlVarC, (i2 << 9) & 516096);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djav
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djgb djgbVar2 = djgbVar;
                    ics icsVar2 = icsVar;
                    int i6 = i;
                    djaw.a(djgbVar2, icsVar2, igrVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.djcw r21, int r22, final float r23, boolean r24, final defpackage.fdat r25, defpackage.hml r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djaw.b(djcw, int, float, boolean, fdat, hml, int, int):void");
    }
}
