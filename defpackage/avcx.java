package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avcx implements aiyu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/analytics/ContactsSyncRecurringMetricsLoggerImpl");
    public final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public avcx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.b = fcsuVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.avcw
            if (r0 == 0) goto L13
            r0 = r6
            avcw r0 = (defpackage.avcw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avcw r0 = new avcw
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.c
            java.lang.Object r6 = r6.b()
            r6.getClass()
            fcyh r6 = (defpackage.fcyh) r6
            fcyh r6 = defpackage.eicg.a(r6)
            avcv r2 = new avcv
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 == r1) goto La5
        L4f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L5a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r6.next()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L71
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L5a
        L71:
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r3 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r3
            java.lang.String r3 = r3.Q()
            if (r3 == 0) goto L8d
            boolean r3 = defpackage.fdgn.H(r3)
            if (r3 == 0) goto L75
        L8d:
            r0.add(r1)
            goto L5a
        L91:
            int r6 = r0.size()
            fcsu r0 = r5.e
            java.lang.Object r0 = r0.b()
            ains r0 = (defpackage.ains) r0
            java.lang.String r1 = "Bugle.RecentConversations.RecipientWithoutName.Count"
            r0.e(r1, r6)
            fctx r6 = defpackage.fctx.a
            return r6
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avcx.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.aiyu
    public final void b() {
        Object objB = this.d.b();
        objB.getClass();
        auvw.k((fdjx) objB, null, null, new avcu(this, null), 3);
    }
}
