package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chkr implements chkk {
    public final cogw a;
    private final ecjh b;

    public chkr(ecjh ecjhVar, cogw cogwVar) {
        ecjhVar.getClass();
        cogwVar.getClass();
        this.b = ecjhVar;
        this.a = cogwVar;
        new feaz();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.chkn
            if (r0 == 0) goto L13
            r0 = r5
            chkn r0 = (defpackage.chkn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chkn r0 = new chkn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkr.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.chko
            if (r0 == 0) goto L13
            r0 = r5
            chko r0 = (defpackage.chko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chko r0 = new chko
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkr.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.chkk
    public final Object c(fcxy fcxyVar) {
        Object objB = crrj.b(this.b, new fdap() { // from class: chkm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                chks chksVar = (chks) obj;
                long epochMilli = this.a.a.f().toEpochMilli();
                chksVar.copyOnWrite();
                chkt chktVar = (chkt) chksVar.instance;
                chkt chktVar2 = chkt.a;
                chktVar.b |= 1;
                chktVar.c = epochMilli;
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.chkk
    public final Object d(fcxy fcxyVar) {
        Object objB = crrj.b(this.b, new fdap() { // from class: chkl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                chks chksVar = (chks) obj;
                long epochMilli = this.a.a.f().toEpochMilli();
                chksVar.copyOnWrite();
                chkt chktVar = (chkt) chksVar.instance;
                chkt chktVar2 = chkt.a;
                chktVar.b |= 2;
                chktVar.d = epochMilli;
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.chkp
            if (r0 == 0) goto L13
            r0 = r9
            chkp r0 = (defpackage.chkp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chkp r0 = new chkp
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L43
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            defpackage.fctl.b(r9)
            ecjh r9 = r8.b
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r9.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto L68
        L43:
            chkt r9 = (defpackage.chkt) r9
            long r0 = r9.c
            cogw r9 = r8.a
            j$.time.Instant r9 = r9.f()
            long r4 = r9.toEpochMilli()
            chkt r9 = defpackage.chkt.a
            long r6 = r9.c
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 == 0) goto L63
            long r4 = r4 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L62
            goto L63
        L62:
            r3 = 0
        L63:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkr.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.chkq
            if (r0 == 0) goto L13
            r0 = r9
            chkq r0 = (defpackage.chkq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chkq r0 = new chkq
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L43
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            defpackage.fctl.b(r9)
            ecjh r9 = r8.b
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r9.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto L68
        L43:
            chkt r9 = (defpackage.chkt) r9
            long r0 = r9.d
            cogw r9 = r8.a
            j$.time.Instant r9 = r9.f()
            long r4 = r9.toEpochMilli()
            chkt r9 = defpackage.chkt.a
            long r6 = r9.d
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 == 0) goto L63
            long r4 = r4 - r0
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L62
            goto L63
        L62:
            r3 = 0
        L63:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkr.f(fcxy):java.lang.Object");
    }
}
