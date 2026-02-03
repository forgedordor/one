package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akaj implements akbd {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater");
    private final fcsu b;
    private final fdjx c;

    public akaj(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fdjxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (defpackage.fdxs.c(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9, defpackage.ajts r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.akai
            if (r0 == 0) goto L13
            r0 = r11
            akai r0 = (defpackage.akai) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akai r0 = new akai
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r11)
            goto Lca
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto L4d
        L39:
            defpackage.fctl.b(r11)
            eiju r9 = r9.r()
            r9.getClass()
            r0.a = r10
            r0.d = r4
            java.lang.Object r11 = defpackage.fdxs.c(r9, r0)
            if (r11 == r1) goto Lcd
        L4d:
            awjl r11 = (defpackage.awjl) r11
            awjl r9 = defpackage.awjl.a
            boolean r9 = defpackage.fdbq.f(r11, r9)
            java.lang.String r2 = "updateDestinationToken"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater"
            java.lang.String r5 = "BugleCME"
            java.lang.String r6 = "BugleConversationDestinationTokenUpdater.kt"
            if (r9 == 0) goto L85
            ekrg r9 = defpackage.akaj.a
            ekrw r9 = r9.j()
            ekrz r11 = defpackage.eksq.a
            r9.X(r11, r5)
            ekrd r9 = (defpackage.ekrd) r9
            ekrz r11 = defpackage.cqnc.t
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r10 = r10.d()
            r9.X(r11, r10)
            r10 = 71
            ekrw r9 = r9.h(r4, r2, r10, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Recipient should have a valid destination token for an RCS conversation."
            r9.q(r10)
            fctx r9 = defpackage.fctx.a
            return r9
        L85:
            ekrg r9 = defpackage.akaj.a
            ekrw r9 = r9.h()
            ekrz r7 = defpackage.eksq.a
            r9.X(r7, r5)
            ekrd r9 = (defpackage.ekrd) r9
            ekrz r5 = defpackage.cqnc.t
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r7 = r10.d()
            r9.X(r5, r7)
            r5 = 77
            ekrw r9 = r9.h(r4, r2, r5, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Updating the destination token for the RCS conversation."
            r9.q(r2)
            fcsu r9 = r8.b
            java.lang.Object r9 = r9.b()
            ajvr r9 = (defpackage.ajvr) r9
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r10 = r10.d()
            r10.getClass()
            r11.getClass()
            eiju r9 = r9.Q(r10, r11)
            r10 = 0
            r0.a = r10
            r0.d = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto Lca
            goto Lcd
        Lca:
            fctx r9 = defpackage.fctx.a
            return r9
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaj.a(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, ajts, fcxy):java.lang.Object");
    }

    @Override // defpackage.akbd
    public final void b(ajts ajtsVar, List list) {
        ajtsVar.getClass();
        list.getClass();
        if (!fdbq.f(ajtsVar.G(), awjl.a)) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleCME");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.t, ajtsVar.d());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater", "onConversationRcs", 44, "BugleConversationDestinationTokenUpdater.kt")).q("Not updating token for conversation, since it's already set.");
            return;
        }
        if (ajtsVar.c() != ajlj.GROUP) {
            auvw.m(this.c, null, new akah(this, list, ajtsVar, null), 3);
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleCME");
        ekrd ekrdVar2 = (ekrd) ekrwVarH;
        ekrdVar2.X(cqnc.t, ajtsVar.d());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater", "onConversationRcs", 51, "BugleConversationDestinationTokenUpdater.kt")).q("Not updating destination token for a RCS group conversation. This should be done elsewhere.");
    }
}
