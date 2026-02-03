package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdor {
    public static final fdou a(fdjx fdjxVar, fcyh fcyhVar, int i, fdat fdatVar) {
        return c(fdjxVar, fcyhVar, i, 1, fdjz.a, fdatVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.fdos r4, defpackage.fdae r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.fdop
            if (r0 == 0) goto L13
            r0 = r6
            fdop r0 = (defpackage.fdop) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdop r0 = new fdop
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r4 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.fctl.b(r6)
            fcyh r6 = r0.u()
            fdlq r2 = defpackage.fdlr.c
            fcyf r6 = r6.get(r2)
            if (r6 != r4) goto L6d
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            fdiu r6 = new fdiu     // Catch: java.lang.Throwable -> L29
            fcxy r0 = defpackage.fcym.c(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.B()     // Catch: java.lang.Throwable -> L29
            fdoq r0 = new fdoq     // Catch: java.lang.Throwable -> L29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
            fdoa r4 = r4.b     // Catch: java.lang.Throwable -> L29
            r4.d(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.m()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L63
            return r1
        L63:
            r5.invoke()
            fctx r4 = defpackage.fctx.a
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdor.b(fdos, fdae, fcxy):java.lang.Object");
    }

    public static final fdou c(fdjx fdjxVar, fcyh fcyhVar, int i, int i2, fdjz fdjzVar, fdat fdatVar) {
        fdos fdosVar = new fdos(fdjn.b(fdjxVar, fcyhVar), fdod.a(i, i2, 4));
        fdjzVar.a(fdatVar, fdosVar, fdosVar);
        return fdosVar;
    }
}
