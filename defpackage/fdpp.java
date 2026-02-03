package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpp implements fdpl {
    final /* synthetic */ fdap a;

    public fdpp(fdap fdapVar) {
        this.a = fdapVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r6.fO(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdpo
            if (r0 == 0) goto L13
            r0 = r7
            fdpo r0 = (defpackage.fdpo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdpo r0 = new fdpo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.d
            defpackage.fctl.b(r7)
            goto L47
        L38:
            defpackage.fctl.b(r7)
            fdap r7 = r5.a
            r0.d = r6
            r0.b = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 == r1) goto L56
        L47:
            r2 = 0
            r0.d = r2
            r0.b = r3
            java.lang.Object r6 = r6.fO(r7, r0)
            if (r6 != r1) goto L53
            goto L56
        L53:
            fctx r6 = defpackage.fctx.a
            return r6
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdpp.a(fdpm, fcxy):java.lang.Object");
    }
}
