package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwn implements iqp {
    private final fdap a;
    private final fdat b;

    public fwn(fdap fdapVar, fdat fdatVar) {
        this.a = fdapVar;
        this.b = fdatVar;
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        if (!ira.a(i, 1) || ihs.b(j2) <= 0.0f) {
            return 0L;
        }
        return iht.a(0.0f, ((Number) this.a.invoke(Float.valueOf(ihs.b(j2)))).floatValue());
    }

    @Override // defpackage.iqp
    public final long b(long j, int i) {
        if (!ira.a(i, 1) || ihs.b(j) >= 0.0f) {
            return 0L;
        }
        return iht.a(0.0f, ((Number) this.a.invoke(Float.valueOf(ihs.b(j)))).floatValue());
    }

    @Override // defpackage.iqp
    public final /* synthetic */ Object c(long j, long j2, fcxy fcxyVar) {
        return new kjo(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r5, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.fwm
            if (r0 == 0) goto L13
            r0 = r7
            fwm r0 = (defpackage.fwm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fwm r0 = new fwm
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            fdat r7 = r4.b
            float r5 = defpackage.kjo.b(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.c = r3
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = defpackage.kjp.a(r6, r5)
            kjo r7 = new kjo
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwn.d(long, fcxy):java.lang.Object");
    }
}
