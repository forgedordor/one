package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwl {
    final String[] a;
    final fffn b;

    private qwl(String[] strArr, fffn fffnVar) {
        this.a = strArr;
        this.b = fffnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:19:0x003a, B:20:0x003d, B:21:0x0042, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qwl a(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6b
            fffd[] r0 = new defpackage.fffd[r0]     // Catch: java.io.IOException -> L6b
            ffez r1 = new ffez     // Catch: java.io.IOException -> L6b
            r1.<init>()     // Catch: java.io.IOException -> L6b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6b
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6b
            java.lang.String[] r5 = defpackage.qwn.a     // Catch: java.io.IOException -> L6b
            r6 = 34
            r1.P(r6)     // Catch: java.io.IOException -> L6b
            int r7 = r4.length()     // Catch: java.io.IOException -> L6b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
            r11 = 128(0x80, float:1.794E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6b
            if (r10 == 0) goto L42
            goto L38
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.V(r4, r9, r8)     // Catch: java.io.IOException -> L6b
        L3d:
            r1.ac(r10)     // Catch: java.io.IOException -> L6b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.V(r4, r9, r7)     // Catch: java.io.IOException -> L6b
        L4a:
            r1.P(r6)     // Catch: java.io.IOException -> L6b
            r1.d()     // Catch: java.io.IOException -> L6b
            fffd r4 = r1.u()     // Catch: java.io.IOException -> L6b
            r0[r3] = r4     // Catch: java.io.IOException -> L6b
            int r3 = r3 + 1
            goto La
        L59:
            qwl r1 = new qwl     // Catch: java.io.IOException -> L6b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
            fffm r2 = defpackage.fffn.a     // Catch: java.io.IOException -> L6b
            fffn r0 = r2.a(r0)     // Catch: java.io.IOException -> L6b
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
            return r1
        L6b:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwl.a(java.lang.String[]):qwl");
    }

    static /* synthetic */ String b(qwo qwoVar, String str) {
        return str + qwm.a(qwoVar.q()) + " at path " + qwoVar.e();
    }
}
