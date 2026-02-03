package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdoz implements fdpl {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdoy
            if (r0 == 0) goto L13
            r0 = r7
            fdoy r0 = (defpackage.fdoy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdoy r0 = new fdoy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fdxb r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L29:
            r7 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            fdxb r7 = new fdxb
            fcyh r2 = r0.u()
            r7.<init>(r6, r2)
            r0.d = r7     // Catch: java.lang.Throwable -> L51
            r0.c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L51
            if (r6 == r1) goto L50
            r6 = r7
        L4a:
            r6.f()
            fctx r6 = defpackage.fctx.a
            return r6
        L50:
            return r1
        L51:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L55:
            r6.f()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdoz.a(fdpm, fcxy):java.lang.Object");
    }

    public abstract Object b(fdpm fdpmVar, fcxy fcxyVar);
}
