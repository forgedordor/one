package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftn {
    private final feav a = new feaz();
    private final hox b = new hpl(null, hsi.a);

    private final void c(ftl ftlVar) {
        this.b.b(ftlVar);
    }

    public final ftl a() {
        return (ftl) this.b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, int r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ftm
            if (r0 == 0) goto L13
            r0 = r10
            ftm r0 = (defpackage.ftm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ftm r0 = new ftm
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            feaz r8 = r0.e
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L81
        L2d:
            r9 = move-exception
            goto L8d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            feaz r8 = r0.e
            int r9 = r0.f
            java.lang.String r2 = r0.d
            defpackage.fctl.b(r10)
            r10 = r8
            r8 = r2
            goto L59
        L43:
            defpackage.fctl.b(r10)
            feav r10 = r7.a
            r0.d = r8
            r0.f = r9
            r2 = r10
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.c = r5
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto L95
        L59:
            r0.d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f = r9     // Catch: java.lang.Throwable -> L8a
            r2 = r10
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L8a
            r0.e = r2     // Catch: java.lang.Throwable -> L8a
            r0.c = r4     // Catch: java.lang.Throwable -> L8a
            fdiu r2 = new fdiu     // Catch: java.lang.Throwable -> L8a
            fcxy r0 = defpackage.fcym.c(r0)     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r0, r5)     // Catch: java.lang.Throwable -> L8a
            r2.B()     // Catch: java.lang.Throwable -> L8a
            ftl r0 = new ftl     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L8a
            r7.c(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r8 = r2.m()     // Catch: java.lang.Throwable -> L8a
            if (r8 == r1) goto L95
            r6 = r10
            r10 = r8
            r8 = r6
        L81:
            r7.c(r3)     // Catch: java.lang.Throwable -> L88
            r8.d()
            return r10
        L88:
            r9 = move-exception
            goto L91
        L8a:
            r8 = move-exception
            r9 = r8
            r8 = r10
        L8d:
            r7.c(r3)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L91:
            r8.d()
            throw r9
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftn.b(java.lang.String, int, fcxy):java.lang.Object");
    }
}
