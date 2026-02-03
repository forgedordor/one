package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhua {
    private static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/logging/LoggingHelper");

    public static final int a(sep sepVar) {
        if ((sepVar.b & 4) == 0) {
            return 0;
        }
        sdt sdtVar = sepVar.e;
        if (sdtVar == null) {
            sdtVar = sdt.a;
        }
        return !sdtVar.c ? 2 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r4
      0x0029: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x001f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: NumberFormatException -> 0x007a, PHI: r7
      0x0052: PHI (r7v2 long) = (r7v1 long), (r7v4 long) binds: [B:20:0x0040, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {NumberFormatException -> 0x007a, blocks: (B:4:0x000c, B:32:0x0069, B:34:0x006c, B:35:0x0079, B:7:0x0014, B:16:0x0031, B:19:0x003c, B:23:0x0046, B:26:0x0052, B:29:0x005e, B:30:0x0062), top: B:40:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(defpackage.dhnv r12) {
        /*
            java.lang.String r12 = r12.b
            java.lang.String r0 = ""
            boolean r0 = defpackage.fdbq.f(r12, r0)
            r1 = 0
            if (r0 != 0) goto L9d
            int r0 = r12.length()     // Catch: java.lang.NumberFormatException -> L7a
            r3 = 0
            if (r0 != 0) goto L14
            goto L67
        L14:
            r4 = 0
            char r5 = r12.charAt(r4)     // Catch: java.lang.NumberFormatException -> L7a
            r6 = 48
            int r6 = defpackage.fdbq.a(r5, r6)     // Catch: java.lang.NumberFormatException -> L7a
            if (r6 >= 0) goto L29
            r4 = 1
            if (r0 == r4) goto L67
            r6 = 43
            if (r5 == r6) goto L29
            goto L67
        L29:
            r5 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r7 = r5
        L2f:
            if (r4 >= r0) goto L62
            char r9 = r12.charAt(r4)     // Catch: java.lang.NumberFormatException -> L7a
            int r9 = defpackage.fdfv.b(r9)     // Catch: java.lang.NumberFormatException -> L7a
            if (r9 >= 0) goto L3c
            goto L67
        L3c:
            int r10 = defpackage.fdhg.a(r1, r7)     // Catch: java.lang.NumberFormatException -> L7a
            if (r10 <= 0) goto L52
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L67
            r7 = 1844674407370955161(0x1999999999999999, double:2.353437368264535E-185)
            int r10 = defpackage.fdhg.a(r1, r7)     // Catch: java.lang.NumberFormatException -> L7a
            if (r10 <= 0) goto L52
            goto L67
        L52:
            r10 = 10
            long r1 = r1 * r10
            long r9 = (long) r9     // Catch: java.lang.NumberFormatException -> L7a
            long r9 = r9 + r1
            int r1 = defpackage.fdhg.a(r9, r1)     // Catch: java.lang.NumberFormatException -> L7a
            if (r1 >= 0) goto L5e
            goto L67
        L5e:
            int r4 = r4 + 1
            r1 = r9
            goto L2f
        L62:
            fcts r3 = new fcts     // Catch: java.lang.NumberFormatException -> L7a
            r3.<init>(r1)     // Catch: java.lang.NumberFormatException -> L7a
        L67:
            if (r3 == 0) goto L6c
            long r0 = r3.a     // Catch: java.lang.NumberFormatException -> L7a
            return r0
        L6c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L7a
            java.lang.String r1 = "Invalid number format: '"
            java.lang.String r2 = "'"
            java.lang.String r12 = defpackage.a.a(r12, r1, r2)     // Catch: java.lang.NumberFormatException -> L7a
            r0.<init>(r12)     // Catch: java.lang.NumberFormatException -> L7a
            throw r0     // Catch: java.lang.NumberFormatException -> L7a
        L7a:
            r12 = move-exception
            ekrg r0 = defpackage.dhua.a
            ekrw r0 = r0.j()
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r12 = r0.g(r12)
            r0 = 83
            java.lang.String r1 = "LoggingHelper.kt"
            java.lang.String r2 = "com/google/android/libraries/abuse/hades/moirai/logging/LoggingHelper"
            java.lang.String r3 = "clientRoleForLogging"
            ekrw r12 = r12.h(r2, r3, r0, r1)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "ClientId.role is not a number."
            r12.q(r0)
            r0 = -1
            return r0
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhua.b(dhnv):long");
    }

    public static final int c(dhuo dhuoVar) {
        int iOrdinal = dhuoVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }
}
