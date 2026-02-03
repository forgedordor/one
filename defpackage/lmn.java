package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lmn {
    private final feav a = new feaz();
    public final fdjc c = new fdjd();

    protected abstract Object a(fcxy fcxyVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lmm
            if (r0 == 0) goto L13
            r0 = r7
            lmm r0 = (defpackage.lmm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lmm r0 = new lmm
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            feaz r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L76
        L2c:
            r7 = move-exception
            goto L89
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            feaz r2 = r0.d
            defpackage.fctl.b(r7)
            r7 = r2
            goto L5a
        L3d:
            defpackage.fctl.b(r7)
            fdjc r7 = r6.c
            boolean r7 = r7.y()
            if (r7 == 0) goto L4b
            fctx r7 = defpackage.fctx.a
            return r7
        L4b:
            feav r7 = r6.a
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L8d
        L5a:
            fdjc r2 = r6.c     // Catch: java.lang.Throwable -> L85
            boolean r2 = r2.y()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L68
            fctx r0 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L85
            r7.d()
            return r0
        L68:
            r2 = r7
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L85
            r0.d = r2     // Catch: java.lang.Throwable -> L85
            r0.c = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == r1) goto L8d
            r0 = r7
        L76:
            fdjc r7 = r6.c     // Catch: java.lang.Throwable -> L2c
            fctx r1 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L2c
            fdme r7 = (defpackage.fdme) r7     // Catch: java.lang.Throwable -> L2c
            r7.R(r1)     // Catch: java.lang.Throwable -> L2c
            r0.d()
            fctx r7 = defpackage.fctx.a
            return r7
        L85:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L89:
            r0.d()
            throw r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmn.b(fcxy):java.lang.Object");
    }
}
