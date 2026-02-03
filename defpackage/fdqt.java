package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqt implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ fdau b;

    public fdqt(fdpl fdplVar, fdau fdauVar) {
        this.a = fdplVar;
        this.b = fdauVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fdqs
            if (r0 == 0) goto L13
            r0 = r9
            fdqs r0 = (defpackage.fdqs) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdqs r0 = new fdqs
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.d
            fdxb r8 = (defpackage.fdxb) r8
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L72
        L31:
            r9 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.d
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.fctl.b(r9)
            goto L93
        L43:
            java.lang.Object r8 = r0.d
            fdpm r8 = (defpackage.fdpm) r8
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L80
            goto L5b
        L4b:
            defpackage.fctl.b(r9)
            fdpl r9 = r7.a     // Catch: java.lang.Throwable -> L80
            r0.d = r8     // Catch: java.lang.Throwable -> L80
            r0.b = r5     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r1) goto L5b
            goto L92
        L5b:
            fdxb r9 = new fdxb
            fcyh r2 = r0.u()
            r9.<init>(r8, r2)
            fdau r8 = r7.b     // Catch: java.lang.Throwable -> L78
            r0.d = r9     // Catch: java.lang.Throwable -> L78
            r0.b = r3     // Catch: java.lang.Throwable -> L78
            r2 = 0
            java.lang.Object r8 = r8.a(r9, r2, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 == r1) goto L92
            r8 = r9
        L72:
            r8.f()
            fctx r8 = defpackage.fctx.a
            return r8
        L78:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7c:
            r8.f()
            throw r9
        L80:
            r8 = move-exception
            fdvm r9 = new fdvm
            r9.<init>(r8)
            fdau r2 = r7.b
            r0.d = r8
            r0.b = r4
            java.lang.Object r9 = defpackage.fdra.a(r9, r2, r8, r0)
            if (r9 != r1) goto L93
        L92:
            return r1
        L93:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdqt.a(fdpm, fcxy):java.lang.Object");
    }
}
