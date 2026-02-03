package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nny {
    public static int a(mfr mfrVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return mfrVar.j() + 1;
            case 7:
                return mfrVar.n() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean b(mfr mfrVar, noc nocVar, boolean z, nnx nnxVar) {
        try {
            long jT = mfrVar.t();
            if (!z) {
                jT *= nocVar.b;
            }
            nnxVar.a = jT;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.mfr r23, defpackage.noc r24, int r25, defpackage.nnx r26) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nny.c(mfr, noc, int, nnx):boolean");
    }
}
