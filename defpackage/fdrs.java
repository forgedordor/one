package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrs implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ int b;

    public fdrs(fdpl fdplVar, int i) {
        this.a = fdplVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.fdrr
            if (r0 == 0) goto L13
            r0 = r10
            fdrr r0 = (defpackage.fdrr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdrr r0 = new fdrr
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r9 = r0.d
            defpackage.fctl.b(r10)     // Catch: defpackage.fdvn -> L29
            goto L5b
        L29:
            r10 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            fdcg r2 = new fdcg
            r2.<init>()
            fdpl r4 = r8.a     // Catch: defpackage.fdvn -> L54
            fdru r5 = new fdru     // Catch: defpackage.fdvn -> L54
            int r6 = r8.b     // Catch: defpackage.fdvn -> L54
            r5.<init>(r2, r6, r9, r10)     // Catch: defpackage.fdvn -> L54
            r0.d = r10     // Catch: defpackage.fdvn -> L54
            r0.b = r3     // Catch: defpackage.fdvn -> L54
            java.lang.Object r9 = r4.a(r5, r0)     // Catch: defpackage.fdvn -> L54
            if (r9 != r1) goto L5b
            return r1
        L54:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L58:
            defpackage.fdwu.a(r10, r9)
        L5b:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdrs.a(fdpm, fcxy):java.lang.Object");
    }
}
