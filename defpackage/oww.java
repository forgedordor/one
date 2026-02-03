package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oww {
    private final owz a;
    private final feav b = new feaz();
    private fdlr c;

    public oww(owz owzVar) {
        this.a = owzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdlr r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.owu
            if (r0 == 0) goto L13
            r0 = r6
            owu r0 = (defpackage.owu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            owu r0 = new owu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r5 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            r6 = r5
            r5 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            feav r6 = r4.b
            r0.a = r5
            r2 = r6
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L5b
        L49:
            fdlr r0 = r4.c     // Catch: java.lang.Throwable -> L56
            if (r5 != r0) goto L50
            r5 = 0
            r4.c = r5     // Catch: java.lang.Throwable -> L56
        L50:
            r6.d()
            fctx r5 = defpackage.fctx.a
            return r5
        L56:
            r5 = move-exception
            r6.d()
            throw r5
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oww.a(fdlr, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r2.o(r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdlr r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.owv
            if (r0 == 0) goto L13
            r0 = r10
            owv r0 = (defpackage.owv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            owv r0 = new owv
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            feaz r9 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L7c
        L2e:
            r10 = move-exception
            goto L8a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            feaz r9 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            r10 = r9
            r9 = r2
            goto L56
        L42:
            defpackage.fctl.b(r10)
            feav r10 = r8.b
            r0.a = r9
            r2 = r10
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto L8e
        L56:
            fdlr r2 = r8.c     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L5d
            r2.v()     // Catch: java.lang.Throwable -> L86
        L5d:
            if (r2 == 0) goto L69
            owt r5 = new owt     // Catch: java.lang.Throwable -> L86
            owz r6 = r8.a     // Catch: java.lang.Throwable -> L86
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L86
            r2.t(r5)     // Catch: java.lang.Throwable -> L86
        L69:
            if (r2 == 0) goto L7a
            r0.a = r9     // Catch: java.lang.Throwable -> L86
            r5 = r10
            feaz r5 = (defpackage.feaz) r5     // Catch: java.lang.Throwable -> L86
            r0.e = r5     // Catch: java.lang.Throwable -> L86
            r0.d = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r2.o(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 == r1) goto L8e
        L7a:
            r0 = r9
            r9 = r10
        L7c:
            r8.c = r0     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2e
            r9.d()
            return r10
        L86:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L8a:
            r9.d()
            throw r10
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oww.b(fdlr, fcxy):java.lang.Object");
    }
}
