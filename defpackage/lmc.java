package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmc {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.io.File r4, defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.lmb
            if (r0 == 0) goto L13
            r0 = r6
            lmb r0 = (defpackage.lmb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lmb r0 = new lmb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.fctl.b(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.fctl.b(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof defpackage.ljr
            if (r6 != 0) goto La8
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = defpackage.lls.a(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmc.a(java.io.File, fdap, fcxy):java.lang.Object");
    }
}
