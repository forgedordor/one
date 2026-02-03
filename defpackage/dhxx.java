package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhxx extends dhxr {
    public final ecjh a;

    public dhxx(ecjh ecjhVar) {
        this.a = ecjhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhxr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object i(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dhxs
            if (r0 == 0) goto L13
            r0 = r5
            dhxs r0 = (defpackage.dhxs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhxs r0 = new dhxs
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            dhxt r5 = new dhxt
            r2 = 0
            r5.<init>(r4, r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdjy.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhxx.i(fcxy):java.lang.Object");
    }

    @Override // defpackage.dhxr
    protected final Object p(fdap fdapVar, fcxy fcxyVar) {
        Object objA = fdjy.a(new dhxw(this, fdapVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
