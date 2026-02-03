package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drm implements fdpm {
    final /* synthetic */ fdci a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ fdat c;

    public drm(fdci fdciVar, fdjx fdjxVar, fdat fdatVar) {
        this.a = fdciVar;
        this.b = fdjxVar;
        this.c = fdatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.drl
            if (r0 == 0) goto L13
            r0 = r8
            drl r0 = (defpackage.drl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            drl r0 = new drl
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.b
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L53
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            fdci r8 = r6.a
            java.lang.Object r8 = r8.a
            fdlr r8 = (defpackage.fdlr) r8
            if (r8 == 0) goto L53
            dra r2 = new dra
            r2.<init>()
            r8.t(r2)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r8 = r8.o(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            fdci r8 = r6.a
            fdjx r0 = r6.b
            fdat r1 = r6.c
            fdjz r2 = defpackage.fdjz.d
            drk r4 = new drk
            r5 = 0
            r4.<init>(r1, r7, r0, r5)
            fdlr r7 = defpackage.fdil.d(r0, r5, r2, r4, r3)
            r8.a = r7
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drm.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
