package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdwl implements fdpm {
    final /* synthetic */ fdoa a;
    final /* synthetic */ int b;

    public fdwl(fdoa fdoaVar, int i) {
        this.a = fdoaVar;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (defpackage.fdnh.a(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fdwk
            if (r0 == 0) goto L13
            r0 = r8
            fdwk r0 = (defpackage.fdwk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdwk r0 = new fdwk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L53
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.fctl.b(r8)
            goto L4a
        L36:
            defpackage.fctl.b(r8)
            fdoa r8 = r6.a
            int r2 = r6.b
            fcvv r5 = new fcvv
            r5.<init>(r2, r7)
            r0.c = r4
            java.lang.Object r7 = r8.a(r5, r0)
            if (r7 == r1) goto L56
        L4a:
            r0.c = r3
            java.lang.Object r7 = defpackage.fdnh.a(r0)
            if (r7 != r1) goto L53
            goto L56
        L53:
            fctx r7 = defpackage.fctx.a
            return r7
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdwl.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
