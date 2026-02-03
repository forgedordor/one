package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agee implements afyy {
    private final cdoj a;
    private final agax b;

    public agee(cdoj cdojVar, agax agaxVar) {
        cdojVar.getClass();
        this.a = cdojVar;
        this.b = agaxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.afyy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.agec r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aged
            if (r0 == 0) goto L13
            r0 = r9
            aged r0 = (defpackage.aged) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aged r0 = new aged
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            defpackage.fctl.b(r9)
            goto La4
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.fctl.b(r9)
            goto L82
        L3b:
            defpackage.fctl.b(r9)
            goto L59
        L3f:
            defpackage.fctl.b(r9)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9 = r8.a
            boolean r2 = r9 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId
            if (r2 != 0) goto L5c
            cdoj r8 = r7.a
            java.lang.String r9 = r9.b()
            r9.getClass()
            r0.c = r6
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 == r1) goto Lb4
        L59:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L84
        L5c:
            java.util.List r8 = r8.b
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Lb5
            cdoj r9 = r7.a
            r0.c = r5
            fcsu r2 = r9.c
            java.lang.Object r2 = r2.b()
            r2.getClass()
            fcyh r2 = (defpackage.fcyh) r2
            fcyh r2 = defpackage.eicg.a(r2)
            cdog r5 = new cdog
            r5.<init>(r3, r8, r9)
            java.lang.Object r9 = defpackage.fdin.a(r2, r5, r0)
            if (r9 == r1) goto Lb4
        L82:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
        L84:
            if (r9 == 0) goto Lb1
            android.content.IntentSender r8 = r9.getIntentSender()
            r8.getClass()
            adt r9 = new adt
            r2 = 0
            r9.<init>(r8, r3, r2, r2)
            agax r8 = r7.b
            aep r2 = new aep
            r2.<init>()
            r0.c = r4
            java.lang.String r3 = "PARENTAL_APPROVAL_DIALOG_KEY"
            java.lang.Object r9 = defpackage.agax.c(r8, r3, r2, r9, r0)
            if (r9 == r1) goto Lb4
        La4:
            adh r9 = (defpackage.adh) r9
            int r8 = r9.a
            r9 = -1
            if (r8 != r9) goto Lae
            agef r8 = defpackage.agef.a
            return r8
        Lae:
            agef r8 = defpackage.agef.b
            return r8
        Lb1:
            agef r8 = defpackage.agef.b
            return r8
        Lb4:
            return r1
        Lb5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Either ConversationId or messaging identities must be provided."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agee.b(agec, fcxy):java.lang.Object");
    }
}
