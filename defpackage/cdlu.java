package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlu {
    public final fcyh a;
    public final ecjh b;

    public cdlu(fcyh fcyhVar, fdjx fdjxVar, ecjh ecjhVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        ecjhVar.getClass();
        this.a = fcyhVar;
        this.b = ecjhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cdln
            if (r0 == 0) goto L13
            r0 = r6
            cdln r0 = (defpackage.cdln) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdln r0 = new cdln
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.a
            fcyh r6 = defpackage.eicg.a(r6)
            cdlm r2 = new cdlm
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdlu.a(fcxy):java.lang.Object");
    }

    public final Object b(Instant instant, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.a), new cdlq(null, this, instant), fcxyVar);
    }

    public final Object c(int i, Instant instant, int i2, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.a), new cdlo(null, this, i, instant, i2), fcxyVar);
    }
}
