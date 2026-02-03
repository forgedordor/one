package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhft {
    public final axky a;
    public final egbf b;
    public final egzh c;
    public final fdjx d;
    public final fcsu e;
    public final efwo f;
    private final Optional g;
    private final fctc h = fctd.a(new fdae() { // from class: fhfp
        @Override // defpackage.fdae
        public final Object invoke() {
            uda udaVar = (uda) fdct.b((Optional) ((eyig) this.a.e).a);
            return Boolean.valueOf(udaVar != null ? udaVar.a() : false);
        }
    });

    public fhft(axky axkyVar, egbf egbfVar, egzh egzhVar, fdjx fdjxVar, Optional optional, fcsu fcsuVar, efwo efwoVar) {
        this.a = axkyVar;
        this.b = egbfVar;
        this.c = egzhVar;
        this.d = fdjxVar;
        this.g = optional;
        this.e = fcsuVar;
        this.f = efwoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r8 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.efwo r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fhfs
            if (r0 == 0) goto L13
            r0 = r8
            fhfs r0 = (defpackage.fhfs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fhfs r0 = new fhfs
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r8)
            goto L9f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            goto L4c
        L38:
            defpackage.fctl.b(r8)
            if (r7 == 0) goto La9
            egbf r8 = r6.b
            com.google.common.util.concurrent.ListenableFuture r7 = r8.c(r7)
            r0.c = r5
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 != r1) goto L4c
            goto La8
        L4c:
            egbe r8 = (defpackage.egbe) r8
            egbs r7 = r8.b()
            java.lang.String r7 = r7.k
            java.lang.String r8 = "pseudonymous"
            boolean r7 = defpackage.fdbq.f(r7, r8)
            if (r7 == 0) goto L5d
            goto La9
        L5d:
            boolean r7 = defpackage.cpyl.a()
            if (r7 != 0) goto L64
            goto Laa
        L64:
            ejxr r7 = defpackage.cqaa.a
            java.lang.Object r7 = r7.get()
            cczi r7 = (defpackage.cczi) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L79
            goto Laa
        L79:
            j$.util.Optional r7 = r6.g
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L82
            goto Laa
        L82:
            fctc r8 = r6.h
            java.lang.Object r8 = r8.a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L91
            goto Laa
        L91:
            java.lang.Object r7 = r7.get()
            cqaa r7 = (defpackage.cqaa) r7
            r0.c = r3
            java.lang.Object r8 = r7.a()
            if (r8 == r1) goto La8
        L9f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto Laa
            goto La9
        La8:
            return r1
        La9:
            r4 = r5
        Laa:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhft.a(efwo, fcxy):java.lang.Object");
    }
}
