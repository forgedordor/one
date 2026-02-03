package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akiz extends fcyz implements fdat {
    int a;
    final /* synthetic */ akjb b;
    final /* synthetic */ ccpl c;
    final /* synthetic */ ccep d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akiz(akjb akjbVar, ccpl ccplVar, ccep ccepVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akjbVar;
        this.c = ccplVar;
        this.d = ccepVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akiz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r1.a(r3, r6, r2, r5) == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L61
        Ld:
            akjb r6 = r5.b
            ccpl r1 = r5.c
            r5.a = r2
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 == r0) goto L64
        L19:
            aoer r6 = (defpackage.aoer) r6
            if (r6 != 0) goto L40
            ekrg r6 = defpackage.akjb.a
            ekrw r6 = r6.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleE2eeMls"
            r6.X(r0, r1)
            r0 = 83
            java.lang.String r1 = "MlsStateChangeHandler.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/conversation/mls/MlsStateChangeHandler$onMlsGroupEnded$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r6 = r6.h(r2, r3, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Cannot find self identity for MLS identity. Not downgrading."
            r6.q(r0)
            fctx r6 = defpackage.fctx.a
            return r6
        L40:
            akjb r1 = r5.b
            ccep r2 = r5.d
            cbqx r3 = new cbqx
            java.lang.String r4 = r2.a
            r3.<init>(r4)
            ajvr r4 = r1.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r3 = r4.S(r3)
            if (r3 == 0) goto L61
            java.lang.String r2 = r2.toString()
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r1.a(r3, r6, r2, r5)
            if (r6 != r0) goto L61
            goto L64
        L61:
            fctx r6 = defpackage.fctx.a
            return r6
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akiz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akiz(this.b, this.c, this.d, fcxyVar);
    }
}
