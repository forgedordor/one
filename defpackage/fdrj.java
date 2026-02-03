package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class fdrj {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fdpl r4, defpackage.fdpm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.fdrd
            if (r0 == 0) goto L13
            r0 = r6
            fdrd r0 = (defpackage.fdrd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdrd r0 = new fdrd
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fdci r4 = r0.c
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.fctl.b(r6)
            fdci r6 = new fdci
            r6.<init>()
            fdrf r2 = new fdrf     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.c = r6     // Catch: java.lang.Throwable -> L4d
            r0.b = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L50:
            java.lang.Object r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = b(r5, r4)
            if (r6 != 0) goto L88
            fcyh r6 = r0.u()
            fdlq r0 = defpackage.fdlr.c
            fcyf r6 = r6.get(r0)
            fdlr r6 = (defpackage.fdlr) r6
            if (r6 == 0) goto L79
            boolean r0 = r6.x()
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.util.concurrent.CancellationException r6 = r6.p()
            boolean r6 = b(r5, r6)
            if (r6 != 0) goto L88
        L79:
            if (r4 != 0) goto L7c
            return r5
        L7c:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L84
            defpackage.fcsw.a(r4, r5)
            throw r4
        L84:
            defpackage.fcsw.a(r5, r4)
            throw r5
        L88:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrj.a(fdpl, fdpm, fcxy):java.lang.Object");
    }

    private static final boolean b(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        boolean z = fdkb.b;
        if (z) {
            th2 = fdzh.c(th2);
        }
        if (z) {
            th = fdzh.c(th);
        }
        return fdbq.f(th2, th);
    }
}
