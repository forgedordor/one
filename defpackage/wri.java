package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wri extends fcyz implements fdat {
    int a;
    final /* synthetic */ wrt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wri(fcxy fcxyVar, wrt wrtVar) {
        super(2, fcxyVar);
        this.b = wrtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wri) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r8 != r0) goto L21;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Exception {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L15
            if (r1 == r2) goto L11
            defpackage.fctl.b(r8)
            return r4
        L11:
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L19
            goto L46
        L15:
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L19
            goto L38
        L19:
            r8 = move-exception
            goto L4a
        L1b:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.c
            fdjx r8 = (defpackage.fdjx) r8
            wrt r8 = r7.b     // Catch: java.lang.Exception -> L19
            fcyh r1 = r8.d     // Catch: java.lang.Exception -> L19
            fcyh r1 = defpackage.eicg.a(r1)     // Catch: java.lang.Exception -> L19
            wrj r5 = new wrj     // Catch: java.lang.Exception -> L19
            r5.<init>(r4, r8)     // Catch: java.lang.Exception -> L19
            r7.a = r3     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = defpackage.fdin.a(r1, r5, r7)     // Catch: java.lang.Exception -> L19
            if (r8 != r0) goto L38
            goto L8d
        L38:
            bpbj r8 = (defpackage.bpbj) r8     // Catch: java.lang.Exception -> L19
            if (r8 == 0) goto L49
            wrt r1 = r7.b     // Catch: java.lang.Exception -> L19
            r7.a = r2     // Catch: java.lang.Exception -> L19
            java.lang.Object r8 = r1.e(r8, r7)     // Catch: java.lang.Exception -> L19
            if (r8 == r0) goto L8d
        L46:
            vvw r8 = (defpackage.vvw) r8     // Catch: java.lang.Exception -> L19
            return r8
        L49:
            return r4
        L4a:
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L8e
            boolean r1 = r8 instanceof java.lang.InterruptedException
            if (r1 != 0) goto L8e
            ekrg r1 = defpackage.wrt.a
            ekrw r1 = r1.i()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleComposeRow2"
            r1.X(r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            ekrw r8 = r1.g(r8)
            ekrd r8 = (defpackage.ekrd) r8
            wrt r1 = r7.b
            ekrz r2 = defpackage.cqnc.t
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = r1.b
            r8.X(r2, r3)
            r2 = 70
            java.lang.String r3 = "ConversationDraftPersistence.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$query$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r8 = r8.h(r5, r6, r2, r3)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r2 = "Exception when querying draft"
            r8.q(r2)
            r8 = 3
            r7.a = r8
            java.lang.Object r8 = r1.c(r7)
            if (r8 == r0) goto L8d
            return r4
        L8d:
            return r0
        L8e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wri.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wri wriVar = new wri(fcxyVar, this.b);
        wriVar.c = obj;
        return wriVar;
    }
}
