package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akja extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ akjb c;
    final /* synthetic */ ezol d;
    final /* synthetic */ ccep e;
    final /* synthetic */ ccpl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akja(akjb akjbVar, ezol ezolVar, ccep ccepVar, ccpl ccplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = akjbVar;
        this.d = ezolVar;
        this.e = ccepVar;
        this.f = ccplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akja) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
    
        if (defpackage.fdxs.c(r9, r8) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/conversation/mls/MlsStateChangeHandler$onMlsGroupStarted$1"
            java.lang.String r4 = "BugleE2eeMls"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "MlsStateChangeHandler.kt"
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r5) goto L19
            defpackage.fctl.b(r9)
            goto La5
        L19:
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            goto L66
        L1f:
            defpackage.fctl.b(r9)
            goto L32
        L23:
            defpackage.fctl.b(r9)
            akjb r9 = r8.c
            ezol r1 = r8.d
            r8.b = r6
            java.lang.Object r9 = r9.b(r1, r8)
            if (r9 == r0) goto La8
        L32:
            r1 = r9
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r1
            if (r1 != 0) goto L58
            ekrg r9 = defpackage.akjb.a
            ekrw r9 = r9.j()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r4)
            r0 = 54
            ekrw r9 = r9.h(r3, r2, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            ccep r0 = r8.e
            java.lang.String r1 = "Cannot find conversation for MLS group %s. Not upgrading."
            java.lang.String r0 = r0.toString()
            r9.t(r1, r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L58:
            akjb r9 = r8.c
            ccpl r6 = r8.f
            r8.a = r1
            r8.b = r5
            java.lang.Object r9 = r9.c(r6, r8)
            if (r9 == r0) goto La8
        L66:
            aoer r9 = (defpackage.aoer) r9
            if (r9 != 0) goto L85
            ekrg r9 = defpackage.akjb.a
            ekrw r9 = r9.j()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r4)
            r0 = 60
            ekrw r9 = r9.h(r3, r2, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Cannot find self identity for MLS identity. Not upgrading."
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L85:
            akjb r2 = r8.c
            ccep r3 = r8.e
            cbqz r4 = defpackage.cbqz.c
            cbqx r5 = new cbqx
            java.lang.String r3 = r3.a
            r5.<init>(r3)
            ajvr r2 = r2.b
            eiju r9 = r2.M(r1, r4, r5, r9)
            r1 = 0
            r8.a = r1
            r1 = 3
            r8.b = r1
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 != r0) goto La5
            goto La8
        La5:
            fctx r9 = defpackage.fctx.a
            return r9
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akja.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akja(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
