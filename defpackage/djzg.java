package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzg {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.djzh r16, defpackage.ics r17, defpackage.jyq r18, defpackage.hml r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djzg.a(djzh, ics, jyq, hml, int, int):void");
    }

    public static final void b(final djrr djrrVar, final boolean z, final Integer num, hml hmlVar, final int i) {
        int i2;
        long jC;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1057923624);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(num) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            inz inzVarB = djrs.b(djrrVar, hmlVarC);
            if (z) {
                hmlVarC.v(-1242640019);
                jC = glz.a(hmlVarC).w;
                ((hmw) hmlVarC).ab();
            } else if (num != null) {
                hmlVarC.v(-1242638921);
                ((hmw) hmlVarC).ab();
                jC = ijg.c(num.intValue());
            } else {
                hmlVarC.v(-1242637073);
                jC = glz.a(hmlVarC).a;
                ((hmw) hmlVarC).ab();
            }
            dtfn.a(inzVarB, null, null, jC, hmlVarC, 0, 4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djzd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    boolean z2 = z;
                    int i4 = i;
                    djzg.b(djrrVar2, z2, num, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dijt dijtVar, final jyq jyqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(752714083);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dijtVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1803732550);
            jyq jyqVar2 = jyqVar == null ? (jyq) hmlVarC.e(gyj.a) : jyqVar;
            ((hmw) hmlVarC).ab();
            dijr.f(dijtVar, null, null, ((ije) hmlVarC.e(gea.a)).i, jyqVar2, null, 0L, null, false, null, null, null, null, hmlVarC, i2 & 14, 0, 8166);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djzb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dijt dijtVar2 = dijtVar;
                    int i4 = i;
                    djzg.c(dijtVar2, jyqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
