package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfkp implements cfkj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/DittoConversationLeaverImpl");
    public final fcyh b;
    public final fcsu c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;

    public cfkp(fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.d = fdjxVar;
        this.b = fcyhVar;
        this.e = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
    }

    @Override // defpackage.cfkj
    public final eiju a(eozq eozqVar) {
        eozqVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cfkn(this, eozqVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cfkk
            if (r0 == 0) goto L13
            r0 = r7
            cfkk r0 = (defpackage.cfkk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cfkk r0 = new cfkk
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r0.e
            defpackage.fctl.b(r7)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            fcsu r7 = r4.f
            java.lang.Object r7 = r7.b()
            chtk r7 = (defpackage.chtk) r7
            eiju r7 = r7.f(r5)
            r0.e = r6
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L84
        L4e:
            aubq r7 = (defpackage.aubq) r7
            if (r7 != 0) goto L83
            ekrg r0 = defpackage.cfkp.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleDitto"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.s
            r0.X(r1, r6)
            ekrz r6 = defpackage.cqnc.w
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r5)
            r0.X(r6, r1)
            r5 = 111(0x6f, float:1.56E-43)
            java.lang.String r6 = "DittoConversationLeaverImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/net/handler/ditto/DittoConversationLeaverImpl"
            java.lang.String r2 = "getChatEndpointForSubId"
            ekrw r5 = r0.h(r1, r2, r5, r6)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "No self identity found for subId, aborting RCS group leave."
            r5.q(r6)
        L83:
            return r7
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfkp.b(int, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cfkm
            if (r0 == 0) goto L13
            r0 = r6
            cfkm r0 = (defpackage.cfkm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfkm r0 = new cfkm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r0.d
            defpackage.fctl.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.f
            java.lang.Object r6 = r6.b()
            chtk r6 = (defpackage.chtk) r6
            eiju r6 = r6.e(r5)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L7f
        L4a:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            java.lang.Object r6 = defpackage.fdct.b(r6)
            aubq r6 = (defpackage.aubq) r6
            if (r6 != 0) goto L7e
            ekrg r0 = defpackage.cfkp.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleDitto"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.s
            r0.X(r1, r5)
            r5 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = "DittoConversationLeaverImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/net/handler/ditto/DittoConversationLeaverImpl"
            java.lang.String r3 = "getSelfIdentityForConversationId"
            ekrw r5 = r0.h(r2, r3, r5, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "No self identity found for ditto conversation, aborting RCS group leave."
            r5.q(r0)
        L7e:
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfkp.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ciju r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cfko
            if (r0 == 0) goto L13
            r0 = r7
            cfko r0 = (defpackage.cfko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfko r0 = new cfko
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
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4d
        L36:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.e
            java.lang.Object r7 = r7.b()
            cijw r7 = (defpackage.cijw) r7
            eiju r6 = r7.a(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L78
        L4d:
            cazi r7 = (defpackage.cazi) r7
            eiju r6 = r7.a()
            r6.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            cbcw r7 = (defpackage.cbcw) r7
            boolean r6 = r7.e()
            eozs r7 = defpackage.eozs.a
            evsf r7 = r7.createBuilder()
            eozr r7 = (defpackage.eozr) r7
            r7.getClass()
            defpackage.eozt.b(r6, r7)
            eozs r6 = defpackage.eozt.a(r7)
            return r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfkp.d(ciju, fcxy):java.lang.Object");
    }
}
