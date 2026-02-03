package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjr implements cfmz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/ConversationGroupNameSearchDelegate");
    private final fdjx b;
    private final cexq c;
    private final ajoy d;
    private final ajln e;
    private final anty f;
    private final fcsu g;
    private final fcsu h;
    private final alrj i;
    private final cfol j;
    private final aqoz k;

    public cfjr(fdjx fdjxVar, cexq cexqVar, ajoy ajoyVar, ajln ajlnVar, anty antyVar, fcsu fcsuVar, fcsu fcsuVar2, alrj alrjVar, cfol cfolVar, aqoz aqozVar) {
        fdjxVar.getClass();
        cexqVar.getClass();
        ajoyVar.getClass();
        ajlnVar.getClass();
        antyVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        alrjVar.getClass();
        cfolVar.getClass();
        aqozVar.getClass();
        this.b = fdjxVar;
        this.c = cexqVar;
        this.d = ajoyVar;
        this.e = ajlnVar;
        this.f = antyVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = alrjVar;
        this.j = cfolVar;
        this.k = aqozVar;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        eozg eozgVar = (eozg) evuhVar;
        eozgVar.getClass();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleDitto");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.S, "ConversationGroupNameSearchDelegate");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/ConversationGroupNameSearchDelegate", "handleRequestInternal", 71, "ConversationGroupNameSearchDelegate.kt")).q("Handle Group Conversation Search Request.");
        return auvw.c(this.b, fcyi.a, fdjz.a, new cfjq(this, eozgVar, null));
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        eozg eozgVar = (eozg) evsn.parseFrom(eozg.a, evqsVar);
        eozgVar.getClass();
        return eozgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [cfjr] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0115 -> B:36:0x0116). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.bcuw r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjr.d(bcuw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eozg r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cfjm
            if (r0 == 0) goto L13
            r0 = r7
            cfjm r0 = (defpackage.cfjm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfjm r0 = new cfjm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L41
        L36:
            defpackage.fctl.b(r7)
            r0.c = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L80
        L41:
            ekgb r7 = (defpackage.ekgb) r7
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L5e
            eozi r6 = defpackage.eozi.a
            evsf r6 = r6.createBuilder()
            eozh r6 = (defpackage.eozh) r6
            r6.getClass()
            evsn r6 = r6.build()
            r6.getClass()
            eozi r6 = (defpackage.eozi) r6
            return r6
        L5e:
            bcvf r6 = defpackage.bcvg.n()
            r6.b(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r2 = r6
            bbmq r2 = (defpackage.bbmq) r2
            r2.b = r7
            bcvg r6 = r6.a()
            bcuw r6 = r6.l()
            r0.c = r3
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r1) goto L7f
            goto L80
        L7f:
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjr.e(eozg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cfjn
            if (r0 == 0) goto L13
            r0 = r6
            cfjn r0 = (defpackage.cfjn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfjn r0 = new cfjn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            int r6 = r5.length()
            if (r6 != 0) goto L40
            int r5 = defpackage.ekgb.d
            ekgb r5 = defpackage.ekoe.a
            r5.getClass()
            return r5
        L40:
            ajoy r6 = r4.d
            ajoz r6 = r6.b()
            eiju r5 = r6.b(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto La5
        L55:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r1 = defpackage.fcva.p(r6, r0)
            r5.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r6.next()
            ajpq r1 = (defpackage.ajpq) r1
            alqm r1 = r1.b()
            r5.add(r1)
            goto L69
        L7d:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = defpackage.fcva.p(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L8a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r5.next()
            alqm r0 = (defpackage.alqm) r0
            anty r1 = r4.f
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = r1.h(r0)
            r6.add(r0)
            goto L8a
        La0:
            ekgb r5 = defpackage.ekfv.a(r6)
            return r5
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjr.f(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        if (r2 != r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.eozg r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjr.g(eozg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.bajf r5, defpackage.ekgb r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cfjp
            if (r0 == 0) goto L13
            r0 = r7
            cfjp r0 = (defpackage.cfjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfjp r0 = new cfjp
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            fcsu r7 = r4.h
            java.lang.Object r7 = r7.b()
            cehg r7 = (defpackage.cehg) r7
            eiju r5 = r7.f(r5, r6)
            r5.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjr.h(bajf, ekgb, fcxy):java.lang.Object");
    }
}
