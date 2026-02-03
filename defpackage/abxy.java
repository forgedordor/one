package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxy implements afju {
    public final Optional a;
    private final fdjx b;
    private final fcsu c;
    private final egyt d;
    private efwo e;

    public abxy(fdjx fdjxVar, Optional optional, fcsu fcsuVar, egyt egytVar) {
        fdjxVar.getClass();
        optional.getClass();
        fcsuVar.getClass();
        egytVar.getClass();
        this.b = fdjxVar;
        this.a = optional;
        this.c = fcsuVar;
        this.d = egytVar;
    }

    @Override // defpackage.afju
    public final void a(efwo efwoVar) {
        if (this.a.isEmpty() || fdbq.f(efwoVar, this.e)) {
            return;
        }
        this.e = efwoVar;
        auvw.k(this.b, null, null, new abxw(this, efwoVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.efwo r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.abxx
            if (r0 == 0) goto L13
            r0 = r8
            abxx r0 = (defpackage.abxx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            abxx r0 = new abxx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L7c
            goto L57
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.fctl.b(r8)
            egyt r8 = r6.d     // Catch: java.lang.Exception -> L7c
            fcsu r2 = r6.c     // Catch: java.lang.Exception -> L7c
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L7c
            egbf r2 = (defpackage.egbf) r2     // Catch: java.lang.Exception -> L7c
            egyi r2 = r2.b()     // Catch: java.lang.Exception -> L7c
            egzr r5 = defpackage.egzr.DONT_CARE     // Catch: java.lang.Exception -> L7c
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a(r2, r5)     // Catch: java.lang.Exception -> L7c
            r8.getClass()     // Catch: java.lang.Exception -> L7c
            r0.a = r7     // Catch: java.lang.Exception -> L7c
            r0.d = r4     // Catch: java.lang.Exception -> L7c
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: java.lang.Exception -> L7c
            if (r8 != r1) goto L57
            return r1
        L57:
            r8.getClass()     // Catch: java.lang.Exception -> L7c
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L7c
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L7c
        L60:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L78
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Exception -> L7c
            r1 = r0
            egbe r1 = (defpackage.egbe) r1     // Catch: java.lang.Exception -> L7c
            efwo r1 = r1.a()     // Catch: java.lang.Exception -> L7c
            boolean r1 = defpackage.fdbq.f(r1, r7)     // Catch: java.lang.Exception -> L7c
            if (r1 == 0) goto L60
            goto L79
        L78:
            r0 = r3
        L79:
            egbe r0 = (defpackage.egbe) r0     // Catch: java.lang.Exception -> L7c
            return r0
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abxy.b(efwo, fcxy):java.lang.Object");
    }
}
