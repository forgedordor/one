package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpb extends fdpg {
    private final fdat d;

    public fdpb(fdat fdatVar, fcyh fcyhVar, int i, int i2) {
        super(fdatVar, fcyhVar, i, i2);
        this.d = fdatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpg, defpackage.fdvt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object b(defpackage.fdos r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fdpa
            if (r0 == 0) goto L13
            r0 = r6
            fdpa r0 = (defpackage.fdpa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdpa r0 = new fdpa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fdos r5 = r0.d
            defpackage.fctl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdpg.g(r4, r5, r0)
            if (r6 == r1) goto L51
        L3e:
            fdoa r5 = r5.b
            boolean r5 = r5.f()
            if (r5 == 0) goto L49
            fctx r5 = defpackage.fctx.a
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdpb.b(fdos, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdpg, defpackage.fdvt
    protected final fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdpb(this.d, fcyhVar, i, i2);
    }

    public /* synthetic */ fdpb(fdat fdatVar) {
        this(fdatVar, fcyi.a, -2, 1);
    }
}
