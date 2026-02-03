package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cion {
    private final dzuc a;
    private final dzqp b;

    public cion(dzuc dzucVar, dzqp dzqpVar) {
        dzucVar.getClass();
        dzqpVar.getClass();
        this.a = dzucVar;
        this.b = dzqpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dzfh r7, defpackage.dzfh r8, defpackage.fdap r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ciom
            if (r0 == 0) goto L13
            r0 = r10
            ciom r0 = (defpackage.ciom) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciom r0 = new ciom
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            dzua r7 = r0.g
            dzub r8 = r0.f
            dzfh r9 = r0.e
            dzfh r0 = r0.d
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L32
            r2 = r7
            r7 = r0
            goto L64
        L32:
            r10 = move-exception
            r2 = r10
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r7
            r7 = r0
            goto L71
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            defpackage.fctl.b(r10)
            dzuc r10 = r6.a
            dzub r10 = r10.d()
            r10.getClass()
            dzua r2 = defpackage.dzua.SUCCESS
            r0.d = r7     // Catch: java.lang.Throwable -> L70
            r0.e = r8     // Catch: java.lang.Throwable -> L70
            r0.f = r10     // Catch: java.lang.Throwable -> L70
            r0.g = r2     // Catch: java.lang.Throwable -> L70
            r0.c = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L70
            if (r9 == r1) goto L6f
            r5 = r9
            r9 = r8
            r8 = r10
            r10 = r5
        L64:
            dzuc r0 = r6.a
            r0.f(r8, r7, r4, r2)
            dzqp r7 = r6.b
            r7.e(r9, r4)
            return r10
        L6f:
            return r1
        L70:
            r9 = move-exception
        L71:
            dzua r2 = defpackage.dzua.ERROR     // Catch: java.lang.Throwable -> L74
            throw r9     // Catch: java.lang.Throwable -> L74
        L74:
            r9 = move-exception
            dzuc r0 = r6.a
            r0.f(r10, r7, r4, r2)
            dzqp r7 = r6.b
            r7.e(r8, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cion.a(dzfh, dzfh, fdap, fcxy):java.lang.Object");
    }
}
