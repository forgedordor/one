package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlg implements avld {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl");
    private final anty b;
    private final fcsu c;

    public avlg(anty antyVar, fcsu fcsuVar) {
        antyVar.getClass();
        this.b = antyVar;
        this.c = fcsuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, boolean r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.avle
            if (r0 == 0) goto L13
            r0 = r10
            avle r0 = (defpackage.avle) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avle r0 = new avle
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r9 = r0.a
            dzub r8 = r0.e
            defpackage.fctl.b(r10)
            goto L7d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.avlg.a
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleRecipientSync"
            r10.X(r2, r4)
            r2 = 36
            java.lang.String r4 = "ContactRecipientSyncImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl"
            java.lang.String r6 = "syncChangedContacts"
            ekrw r10 = r10.h(r5, r6, r2, r4)
            ekrd r10 = (defpackage.ekrd) r10
            int r2 = r8.size()
            java.lang.String r4 = "Syncing %d changed contacts with recipients"
            r10.r(r4, r2)
            fcsu r10 = r7.c
            java.lang.Object r10 = r10.b()
            dzuc r10 = (defpackage.dzuc) r10
            dzub r10 = r10.d()
            anty r2 = r7.b
            ekgb r8 = defpackage.ekfv.a(r8)
            eiju r8 = r2.v(r8)
            r0.e = r10
            r0.a = r9
            r0.d = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L95
            r8 = r10
        L7d:
            fcsu r10 = r7.c
            java.lang.Object r10 = r10.b()
            dzuc r10 = (defpackage.dzuc) r10
            if (r9 == 0) goto L8a
            dzfh r9 = defpackage.avbv.d
            goto L8c
        L8a:
            dzfh r9 = defpackage.avbv.k
        L8c:
            r0 = 0
            dzua r1 = defpackage.dzua.SUCCESS
            r10.f(r8, r9, r0, r1)
            fctx r8 = defpackage.fctx.a
            return r8
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avlg.a(java.util.List, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.avlf
            if (r0 == 0) goto L13
            r0 = r9
            avlf r0 = (defpackage.avlf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avlf r0 = new avlf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dzub r8 = r0.d
            defpackage.fctl.b(r9)
            goto L79
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            ekrg r9 = defpackage.avlg.a
            ekrw r9 = r9.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleRecipientSync"
            r9.X(r2, r4)
            r2 = 54
            java.lang.String r4 = "ContactRecipientSyncImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl"
            java.lang.String r6 = "syncDeletedContacts"
            ekrw r9 = r9.h(r5, r6, r2, r4)
            ekrd r9 = (defpackage.ekrd) r9
            int r2 = r8.size()
            java.lang.String r4 = "Syncing %d deleted contacts with recipients"
            r9.r(r4, r2)
            fcsu r9 = r7.c
            java.lang.Object r9 = r9.b()
            dzuc r9 = (defpackage.dzuc) r9
            dzub r9 = r9.d()
            anty r2 = r7.b
            ekhx r8 = defpackage.ekfv.f(r8)
            eiju r8 = r2.w(r8)
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L8c
            r8 = r9
        L79:
            fcsu r9 = r7.c
            java.lang.Object r9 = r9.b()
            dzuc r9 = (defpackage.dzuc) r9
            dzfh r0 = defpackage.avbv.l
            r1 = 0
            dzua r2 = defpackage.dzua.SUCCESS
            r9.f(r8, r0, r1, r2)
            fctx r8 = defpackage.fctx.a
            return r8
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avlg.b(java.util.Set, fcxy):java.lang.Object");
    }
}
