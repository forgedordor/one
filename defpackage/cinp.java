package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cinp extends fcyz implements fdap {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ cinr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cinp(cinr cinrVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.e = cinrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008a -> B:18:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.d
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBatchWorker$upgradeEligibleMmsGroups$2"
            java.lang.String r4 = "BugleGroupManagement"
            r5 = 1
            java.lang.String r6 = "MmsGroupUpgradeBatchWorker.kt"
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            int r1 = r9.c
            java.lang.Object r5 = r9.b
            java.lang.Object r7 = r9.a
            defpackage.fctl.b(r10)
            goto L8d
        L1c:
            defpackage.fctl.b(r10)
            goto L36
        L20:
            defpackage.fctl.b(r10)
            cinr r10 = r9.e
            ajln r10 = r10.c
            eiju r10 = r10.k()
            r10.getClass()
            r9.d = r5
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 == r0) goto Lc3
        L36:
            ekgb r10 = (defpackage.ekgb) r10
            ekrg r1 = defpackage.cinr.a
            ekrw r1 = r1.h()
            ekrz r5 = defpackage.eksq.a
            r1.X(r5, r4)
            r5 = 28
            ekrw r1 = r1.h(r3, r2, r5, r6)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r5 = "Upgradable candidate groups: %s"
            r1.t(r5, r10)
            r10.getClass()
            cinr r1 = r9.e
            boolean r5 = r10.isEmpty()
            r7 = 0
            if (r5 == 0) goto L5d
            goto La1
        L5d:
            java.util.Iterator r10 = r10.iterator()
            r5 = r7
            r7 = r1
            r1 = r5
            r5 = r10
        L65:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto La0
            java.lang.Object r10 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r10 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r10
            r8 = r7
            cinr r8 = (defpackage.cinr) r8
            ajln r8 = r8.c
            eiju r10 = r8.F(r10)
            r10.getClass()
            r9.a = r7
            r9.b = r5
            r9.c = r1
            r8 = 2
            r9.d = r8
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 != r0) goto L8d
            goto Lc3
        L8d:
            r10.getClass()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L65
            int r1 = r1 + 1
            if (r1 >= 0) goto L65
            defpackage.fcva.l()
            goto L65
        La0:
            r7 = r1
        La1:
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r7)
            int r0 = r10.intValue()
            ekrg r1 = defpackage.cinr.a
            ekrw r1 = r1.h()
            ekrz r5 = defpackage.eksq.a
            r1.X(r5, r4)
            r4 = 33
            ekrw r1 = r1.h(r3, r2, r4, r6)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "%d groups attempted to upgrade."
            r1.r(r2, r0)
            return r10
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cinp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cinp(this.e, (fcxy) obj).b(fctx.a);
    }
}
