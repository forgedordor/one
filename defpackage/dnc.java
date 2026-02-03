package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnc {
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.inz r18, final java.lang.String r19, defpackage.ics r20, defpackage.iby r21, defpackage.iva r22, float r23, defpackage.ijf r24, defpackage.hml r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnc.a(inz, java.lang.String, ics, iby, iva, float, ijf, hml, int, int):void");
    }

    public static final void b(ijp ijpVar, String str, ics icsVar, iby ibyVar, iva ivaVar, hml hmlVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            icsVar = ics.e;
        }
        ics icsVar2 = icsVar;
        if ((i2 & 8) != 0) {
            ibyVar = ibw.e;
        }
        iby ibyVar2 = ibyVar;
        iva ivaVar2 = (i2 & 16) != 0 ? iuz.b : ivaVar;
        boolean zD = hmlVar.D(ijpVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            inx inxVar = new inx(ijpVar, (ijpVar.b() & 4294967295L) | (ijpVar.c() << 32));
            inxVar.a = 1;
            hmlVar.y(inxVar);
            objF = inxVar;
        }
        a((inx) objF, str, icsVar2, ibyVar2, ivaVar2, 1.0f, null, hmlVar, i & 65520, 0);
    }
}
