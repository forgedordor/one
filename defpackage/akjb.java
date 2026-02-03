package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akjb implements cbzl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/mls/MlsStateChangeHandler");
    public final ajvr b;
    private final aofc c;
    private final awjh d;
    private final fdjx e;

    public akjb(ajvr ajvrVar, aofc aofcVar, awjh awjhVar, fdjx fdjxVar) {
        ajvrVar.getClass();
        aofcVar.getClass();
        awjhVar.getClass();
        fdjxVar.getClass();
        this.b = ajvrVar;
        this.c = aofcVar;
        this.d = awjhVar;
        this.e = fdjxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (defpackage.fdxs.c(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r6, defpackage.aoer r7, java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.akiw
            if (r0 == 0) goto L13
            r0 = r9
            akiw r0 = (defpackage.akiw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akiw r0 = new akiw
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L81
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r8 = r0.e
            java.lang.Object r7 = r0.a
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r6 = r0.f
            defpackage.fctl.b(r9)
            goto L59
        L3c:
            defpackage.fctl.b(r9)
            r9 = r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r9 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r9
            anpj r2 = r9.f
            eiju r2 = r2.b()
            r2.getClass()
            r0.f = r9
            r0.a = r7
            r0.e = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.fdxs.c(r2, r0)
            if (r9 == r1) goto Lab
        L59:
            ajts r9 = (defpackage.ajts) r9
            cbqz r9 = r9.j()
            boolean r9 = r9.e()
            if (r9 == 0) goto L84
            ajvr r8 = r5.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6 = r6.a
            cbqz r9 = defpackage.cbqz.c
            eiju r6 = r8.N(r6, r9, r7)
            r7 = 0
            r0.f = r7
            r0.a = r7
            r0.e = r7
            r0.d = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L81
            goto Lab
        L81:
            fctx r6 = defpackage.fctx.a
            return r6
        L84:
            ekrg r7 = defpackage.akjb.a
            ekrw r7 = r7.j()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r0 = "BugleE2eeMls"
            r7.X(r9, r0)
            r9 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = "MlsStateChangeHandler.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/conversation/mls/MlsStateChangeHandler"
            java.lang.String r2 = "downgradeConversation"
            ekrw r7 = r7.h(r1, r2, r9, r0)
            ekrd r7 = (defpackage.ekrd) r7
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6 = r6.a
            java.lang.String r9 = "Conversation %s associated with MLS group %s is already not MLS, cannot downgrade"
            r7.D(r9, r6, r8)
            fctx r6 = defpackage.fctx.a
            return r6
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjb.a(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, aoer, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezol r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.akix
            if (r0 == 0) goto L13
            r0 = r8
            akix r0 = (defpackage.akix) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akix r0 = new akix
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L4c
        L38:
            defpackage.fctl.b(r8)
            ajvr r8 = r6.b
            awjh r2 = r6.d
            r0.a = r8
            r0.d = r4
            java.lang.Object r7 = r2.g(r7, r0)
            if (r7 == r1) goto L5f
            r5 = r8
            r8 = r7
            r7 = r5
        L4c:
            awjl r8 = (defpackage.awjl) r8
            eiju r7 = r7.i(r8)
            r8 = 0
            r0.a = r8
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 != r1) goto L5e
            goto L5f
        L5e:
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjb.b(ezol, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ccpl r9, defpackage.fcxy r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.akiy
            if (r0 == 0) goto L13
            r0 = r10
            akiy r0 = (defpackage.akiy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akiy r0 = new akiy
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.String r9 = r0.e
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            defpackage.fctl.b(r10)
            goto L6f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.a
            ccpl r9 = (defpackage.ccpl) r9
            defpackage.fctl.b(r10)
            goto L4d
        L40:
            defpackage.fctl.b(r10)
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r9.c()
            if (r10 == r1) goto Ld9
        L4d:
            aofc r2 = r8.c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r9 = r9.b()
            anpj r2 = r2.a()
            eiju r2 = r2.b()
            r2.getClass()
            r0.a = r10
            r0.e = r9
            r0.d = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto Ld9
            r7 = r0
            r0 = r10
            r10 = r7
        L6f:
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L7d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ld4
            java.lang.Object r2 = r10.next()
            r3 = r2
            aoer r3 = (defpackage.aoer) r3
            r5 = 0
            awxn r6 = r3.k()     // Catch: java.lang.UnsupportedOperationException -> Lba
            axcm r6 = r6.b()     // Catch: java.lang.UnsupportedOperationException -> Lba
            java.lang.String r6 = r6.b()     // Catch: java.lang.UnsupportedOperationException -> Lba
            boolean r6 = defpackage.fdbq.f(r6, r9)     // Catch: java.lang.UnsupportedOperationException -> Lba
            if (r6 != 0) goto Lb8
            j$.util.Optional r6 = r3.o()     // Catch: java.lang.UnsupportedOperationException -> Lba
            java.lang.Object r6 = defpackage.fdct.b(r6)     // Catch: java.lang.UnsupportedOperationException -> Lba
            alqm r6 = (defpackage.alqm) r6     // Catch: java.lang.UnsupportedOperationException -> Lba
            if (r6 == 0) goto Lae
            java.lang.String r6 = r6.l()     // Catch: java.lang.UnsupportedOperationException -> Lba
            goto Laf
        Lae:
            r6 = r5
        Laf:
            boolean r3 = defpackage.fdbq.f(r6, r0)     // Catch: java.lang.UnsupportedOperationException -> Lba
            if (r3 == 0) goto Lb6
            goto Lb8
        Lb6:
            r3 = 0
            goto Lce
        Lb8:
            r3 = r4
            goto Lce
        Lba:
            j$.util.Optional r3 = r3.o()
            java.lang.Object r3 = defpackage.fdct.b(r3)
            alqm r3 = (defpackage.alqm) r3
            if (r3 == 0) goto Lca
            java.lang.String r5 = r3.l()
        Lca:
            boolean r3 = defpackage.fdbq.f(r5, r0)
        Lce:
            if (r3 == 0) goto L7d
            r1.add(r2)
            goto L7d
        Ld4:
            java.lang.Object r9 = defpackage.fcva.P(r1)
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjb.c(ccpl, fcxy):java.lang.Object");
    }

    @Override // defpackage.cbzl
    public final void d(ccep ccepVar, ccpl ccplVar, akim akimVar) {
        ccepVar.getClass();
        ccplVar.getClass();
        akimVar.getClass();
        auvw.k(this.e, null, null, new akiz(this, ccplVar, ccepVar, null), 3);
    }

    @Override // defpackage.cbzl
    public final void e(ccep ccepVar, ezol ezolVar, ccpl ccplVar) {
        ccepVar.getClass();
        ccplVar.getClass();
        auvw.k(this.e, null, null, new akja(this, ezolVar, ccepVar, ccplVar, null), 3);
    }
}
