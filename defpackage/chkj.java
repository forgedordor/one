package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chkj implements chjr {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/profile/analytics/ProfileRecurringMetricsLoggerImpl");
    public final fcsu a;
    private final fcsu c;
    private final fdjx d;
    private final chpz e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcyh i;
    private final fdap j;

    public chkj(fcsu fcsuVar, fdjx fdjxVar, chpz chpzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcyh fcyhVar, fcsu fcsuVar5) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcyhVar.getClass();
        fcsuVar5.getClass();
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.e = chpzVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcyhVar;
        this.a = fcsuVar5;
        this.j = new elge(new chkd(this, null));
    }

    @Override // defpackage.chjr
    public final eiju a() {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.d, eicg.a(fcyiVar), fdjzVar, new chjz(null, this)));
    }

    @Override // defpackage.chjr
    public final eiju b() {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.d, eicg.a(fcyiVar), fdjzVar, new chkc(null, this)));
    }

    @Override // defpackage.chjr
    public final eiju c() {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.d, eicg.a(fcyiVar), fdjzVar, new chki(null, this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0139, code lost:
    
        if (r10 != r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:26:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.chjw
            if (r0 == 0) goto L13
            r0 = r6
            chjw r0 = (defpackage.chjw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chjw r0 = new chjw
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.i     // Catch: java.lang.Exception -> L27
            fcyh r6 = defpackage.eicg.a(r6)     // Catch: java.lang.Exception -> L27
            chjv r2 = new chjv     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        L4a:
            ekrg r0 = defpackage.chkj.b
            ekrw r0 = r0.i()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleProfiles"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r6 = r0.g(r6)
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r1 = "ProfileRecurringMetricsLoggerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/analytics/ProfileRecurringMetricsLoggerImpl"
            java.lang.String r3 = "getPeopleProfileConsumerState"
            ekrw r6 = r6.h(r2, r3, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Unexpected error in ProfileRecurringMetricsLoggerImpl#getPeopleProfileConsumerState"
            r6.q(r0)
            elqv r6 = defpackage.elqv.a
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.chkb
            if (r0 == 0) goto L13
            r0 = r6
            chkb r0 = (defpackage.chkb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chkb r0 = new chkb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.i     // Catch: java.lang.Exception -> L27
            fcyh r6 = defpackage.eicg.a(r6)     // Catch: java.lang.Exception -> L27
            chka r2 = new chka     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        L4a:
            ekrg r0 = defpackage.chkj.b
            ekrw r0 = r0.i()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleProfiles"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r6 = r0.g(r6)
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = "ProfileRecurringMetricsLoggerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/analytics/ProfileRecurringMetricsLoggerImpl"
            java.lang.String r3 = "getPeopleProfileProducerState"
            ekrw r6 = r6.h(r2, r3, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Unexpected error in ProfileRecurringMetricsLoggerImpl#getPeopleProfileProducerState"
            r6.q(r0)
            elqz r6 = defpackage.elqz.a
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r9 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r9 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008b -> B:28:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.chke
            if (r0 == 0) goto L13
            r0 = r9
            chke r0 = (defpackage.chke) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            chke r0 = new chke
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r9)
            goto L8d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.fctl.b(r9)
            goto L57
        L39:
            defpackage.fctl.b(r9)
            fcsu r9 = r8.g
            java.lang.Object r9 = r9.b()
            aofc r9 = (defpackage.aofc) r9
            anpj r9 = r9.a()
            eiju r9 = r9.b()
            r9.getClass()
            r0.d = r5
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto Lb6
        L57:
            r9.getClass()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L6a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6a
            goto Lb1
        L6a:
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L6f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r2.next()
            aoer r9 = (defpackage.aoer) r9
            j$.util.Optional r6 = j$.util.Optional.empty()
            eiju r9 = r9.A(r5, r6)
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto Lb6
        L8d:
            j$.util.Optional r9 = (j$.util.Optional) r9
            chjs r6 = new chjs
            r6.<init>()
            chjt r7 = new chjt
            r7.<init>()
            j$.util.Optional r9 = r9.map(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r9 = r9.orElse(r6)
            r9.getClass()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6f
            r4 = r5
        Lb1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.chkf
            if (r0 == 0) goto L13
            r0 = r10
            chkf r0 = (defpackage.chkf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            chkf r0 = new chkf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r9 = r0.c
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            enwm r3 = r0.k
            enuq r4 = r0.j
            enwm r5 = r0.i
            enwm r6 = r0.h
            enuq r0 = r0.g
            defpackage.fctl.b(r10)
            goto Lb2
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            boolean r9 = r0.a
            defpackage.fctl.b(r10)
            goto L66
        L49:
            defpackage.fctl.b(r10)
            chpz r10 = r8.e
            r0.a = r9
            r0.f = r4
            chqg r10 = (defpackage.chqg) r10
            fcyh r2 = r10.a
            fcyh r2 = defpackage.eicg.a(r2)
            chqb r4 = new chqb
            r5 = 0
            r4.<init>(r5, r10)
            java.lang.Object r10 = defpackage.fdin.a(r2, r4, r0)
            if (r10 == r1) goto Lcf
        L66:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            fcsu r2 = r8.c
            java.lang.Object r2 = r2.b()
            aisp r2 = (defpackage.aisp) r2
            enko r4 = defpackage.enko.a
            evsf r4 = r4.createBuilder()
            enkn r4 = (defpackage.enkn) r4
            enuq r4 = defpackage.enup.a(r4)
            enkq r5 = defpackage.enkq.a
            evsf r5 = r5.createBuilder()
            enkp r5 = (defpackage.enkp) r5
            enwm r5 = defpackage.enwl.a(r5)
            long r6 = (long) r10
            r5.b(r6)
            fdap r10 = r8.j
            r0.g = r4
            r0.h = r5
            r0.i = r5
            r0.j = r4
            r0.k = r5
            r0.b = r2
            r0.a = r9
            r6 = 200718(0x3100e, float:2.81266E-40)
            r0.c = r6
            r0.f = r3
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 == r1) goto Lcf
            r1 = r9
            r0 = r4
            r3 = r5
            r9 = r6
            r6 = r3
        Lb2:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r3.c(r10)
            r5.d(r1)
            enkq r10 = r6.a()
            r4.b(r10)
            enko r10 = r0.a()
            r2.a(r9, r10)
            fctx r9 = defpackage.fctx.a
            return r9
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.h(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.chkg
            if (r0 == 0) goto L13
            r0 = r10
            chkg r0 = (defpackage.chkg) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            chkg r0 = new chkg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r9 = r0.c
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            enwm r3 = r0.k
            enuq r4 = r0.j
            enwm r5 = r0.i
            enwm r6 = r0.h
            enuq r0 = r0.g
            defpackage.fctl.b(r10)
            goto Lb2
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            boolean r9 = r0.a
            defpackage.fctl.b(r10)
            goto L66
        L49:
            defpackage.fctl.b(r10)
            chpz r10 = r8.e
            r0.a = r9
            r0.f = r4
            chqg r10 = (defpackage.chqg) r10
            fcyh r2 = r10.a
            fcyh r2 = defpackage.eicg.a(r2)
            chqc r4 = new chqc
            r5 = 0
            r4.<init>(r5, r10)
            java.lang.Object r10 = defpackage.fdin.a(r2, r4, r0)
            if (r10 == r1) goto Lcf
        L66:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            fcsu r2 = r8.c
            java.lang.Object r2 = r2.b()
            aisp r2 = (defpackage.aisp) r2
            enko r4 = defpackage.enko.a
            evsf r4 = r4.createBuilder()
            enkn r4 = (defpackage.enkn) r4
            enuq r4 = defpackage.enup.a(r4)
            enkq r5 = defpackage.enkq.a
            evsf r5 = r5.createBuilder()
            enkp r5 = (defpackage.enkp) r5
            enwm r5 = defpackage.enwl.a(r5)
            long r6 = (long) r10
            r5.b(r6)
            fdap r10 = r8.j
            r0.g = r4
            r0.h = r5
            r0.i = r5
            r0.j = r4
            r0.k = r5
            r0.b = r2
            r0.a = r9
            r6 = 200719(0x3100f, float:2.81267E-40)
            r0.c = r6
            r0.f = r3
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 == r1) goto Lcf
            r1 = r9
            r0 = r4
            r3 = r5
            r9 = r6
            r6 = r3
        Lb2:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r3.c(r10)
            r5.d(r1)
            enkq r10 = r6.a()
            r4.b(r10)
            enko r10 = r0.a()
            r2.a(r9, r10)
            fctx r9 = defpackage.fctx.a
            return r9
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.i(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (h(r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.chkh
            if (r0 == 0) goto L13
            r0 = r7
            chkh r0 = (defpackage.chkh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chkh r0 = new chkh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            goto L7d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Boolean r2 = r0.d
            defpackage.fctl.b(r7)
            goto L6a
        L3b:
            defpackage.fctl.b(r7)
            goto L56
        L3f:
            defpackage.fctl.b(r7)
            fcsu r7 = r6.f
            java.lang.Object r7 = r7.b()
            cdku r7 = (defpackage.cdku) r7
            eiju r7 = r7.a()
            r0.c = r5
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L80
        L56:
            r2 = r7
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            boolean r7 = r2.booleanValue()
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = r6.i(r7, r0)
            if (r7 == r1) goto L80
        L6a:
            r2.getClass()
            boolean r7 = r2.booleanValue()
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r6.h(r7, r0)
            if (r7 != r1) goto L7d
            goto L80
        L7d:
            fctx r7 = defpackage.fctx.a
            return r7
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkj.j(fcxy):java.lang.Object");
    }
}
