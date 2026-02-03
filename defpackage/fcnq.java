package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcnq {
    private final fdae a;
    private final fdoa b = fdod.a(-1, 0, 6);

    public fcnq(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fcnp
            if (r0 == 0) goto L13
            r0 = r5
            fcnp r0 = (defpackage.fcnp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fcnp r0 = new fcnp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2c:
            defpackage.fctl.b(r5)
        L2f:
            fdae r5 = r4.a
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L48
            fdoa r5 = r4.b
            r0.c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L2f
            return r1
        L48:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcnq.a(fcxy):java.lang.Object");
    }

    public final void b() throws Throwable {
        Object objB = this.b.b(fctx.a);
        if (objB instanceof fdof) {
            Throwable thB = fdog.b(objB);
            if (thB != null) {
                throw thB;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
