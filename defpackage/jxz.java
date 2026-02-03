package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxz {
    public static final long a = kjm.c(14);
    public static final long b = kjm.c(0);
    public static final long c = ije.g;
    public static final khs d = khq.a(ije.a);

    public static final long a(long j, long j2, float f) {
        if (kjl.b(j) == 0 || kjl.b(j2) == 0) {
            return ((kjl) c(new kjl(j), new kjl(j2), f)).b;
        }
        if (kjl.b(j) == 0 || kjl.b(j2) == 0) {
            kiz.a("Cannot perform operation for Unspecified type.");
        }
        if (!kjn.b(kjl.c(j), kjl.c(j2))) {
            kiz.a("Cannot perform operation for " + ((Object) kjn.a(kjl.c(j))) + " and " + ((Object) kjn.a(kjl.c(j2))));
        }
        return kjm.d(kjl.b(j), kjx.b(kjl.a(j), kjl.a(j2), f));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r10
      0x0045: PHI (r10v4 long) = (r10v0 long), (r10v5 long) binds: [B:6:0x002d, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[PHI: r25
      0x0092: PHI (r25v4 long) = (r25v2 long), (r25v5 long), (r25v5 long), (r25v5 long), (r25v5 long), (r25v5 long), (r25v5 long) binds: [B:32:0x0090, B:39:0x00ab, B:51:0x00d3, B:48:0x00c9, B:45:0x00bf, B:42:0x00b5, B:37:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jxx b(defpackage.jxx r24, long r25, defpackage.iiy r27, float r28, long r29, defpackage.kcc r31, defpackage.kbw r32, defpackage.kbx r33, defpackage.kbj r34, java.lang.String r35, long r36, defpackage.kgw r38, defpackage.kht r39, defpackage.kfu r40, long r41, defpackage.khl r43, defpackage.iko r44, defpackage.jvs r45, defpackage.ina r46) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxz.b(jxx, long, iiy, float, long, kcc, kbw, kbx, kbj, java.lang.String, long, kgw, kht, kfu, long, khl, iko, jvs, ina):jxx");
    }

    public static final Object c(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }
}
