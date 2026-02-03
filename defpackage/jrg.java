package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrg {
    public final int a;
    public float b;
    private final fdat c;

    public jrg(int i, fdat fdatVar) {
        this.a = i;
        this.c = fdatVar;
    }

    public final int a(int i) {
        return fddu.i(i - fdcu.b(this.b), 0, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jrf
            if (r0 == 0) goto L13
            r0 = r6
            jrf r0 = (defpackage.jrf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jrf r0 = new jrf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fdat r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrg.b(float, fcxy):java.lang.Object");
    }

    public final Object c(float f, fcxy fcxyVar) throws Throwable {
        Object objB = b(f - this.b, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
