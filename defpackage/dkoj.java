package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkoj {
    public static final /* synthetic */ int a = 0;
    private static final hpt b = new hsg(new fdae() { // from class: dkoe
        @Override // defpackage.fdae
        public final Object invoke() {
            int i = dkoj.a;
            return new LinkedHashSet();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dkol r22, java.lang.String r23, boolean r24, defpackage.hml r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkoj.a(dkol, java.lang.String, boolean, hml, int, int):void");
    }

    public static final void b(final dkod dkodVar, final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-358282337);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkodVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dlkx dlkxVar = new dlkx(str, new dlkv(dkodVar.a, null, null, 30));
            ics icsVarC = ics.e;
            if (!z) {
                icsVarC = dihi.c(icsVarC);
            }
            dlku.c(dlkxVar, icsVarC, false, hmlVarC, 384);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkof
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkod dkodVar2 = dkodVar;
                    int i4 = i;
                    String str2 = str;
                    int iA = hpy.a(i4 | 1);
                    dkoj.b(dkodVar2, str2, z, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    private static final boolean c(dkol dkolVar) {
        return (dkolVar.a == null && dkolVar.b == null && dkolVar.c == null) ? false : true;
    }
}
