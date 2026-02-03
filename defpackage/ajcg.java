package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcg {
    public final egbf a;
    public final ajdy b;
    public final ajch c;
    public final ajcd d;
    private final fdjx e;

    public ajcg(fdjx fdjxVar, egbf egbfVar, ajdy ajdyVar, ajch ajchVar, ajcd ajcdVar) {
        fdjxVar.getClass();
        egbfVar.getClass();
        ajdyVar.getClass();
        this.e = fdjxVar;
        this.a = egbfVar;
        this.b = ajdyVar;
        this.c = ajchVar;
        this.d = ajcdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ajce
            if (r0 == 0) goto L13
            r0 = r6
            ajce r0 = (defpackage.ajce) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ajce r0 = new ajce
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.a
            defpackage.fctl.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            egbf r6 = r4.a
            com.google.common.util.concurrent.ListenableFuture r6 = r6.e()
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L63
        L44:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r6.next()
            r1 = r0
            efwo r1 = (defpackage.efwo) r1
            int r1 = r1.a()
            if (r1 != r5) goto L4d
            return r0
        L61:
            r5 = 0
            return r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcg.a(int, fcxy):java.lang.Object");
    }

    public final void b(int i) {
        auvw.k(this.e, null, null, new ajcf(this, i, null), 3);
    }
}
