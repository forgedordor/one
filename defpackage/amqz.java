package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker");
    public final fdjx b;
    public final fcsu c;
    public final EmergencyConversationId d;
    public final Map e = new ConcurrentHashMap();
    public final cqtq f;
    private final fcsu g;
    private final anpj h;

    public amqz(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, cqtp cqtpVar, EmergencyConversationId emergencyConversationId, anpj anpjVar) {
        this.b = fdjxVar;
        this.g = fcsuVar;
        this.c = fcsuVar2;
        this.d = emergencyConversationId;
        this.h = anpjVar;
        this.f = cqtpVar.a(new amqv());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        if (defpackage.fdxs.c(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.amqj r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.amqw
            if (r0 == 0) goto L13
            r0 = r10
            amqw r0 = (defpackage.amqw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amqw r0 = new amqw
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "onSessionTimeout"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "EmergencySessionTimeoutTracker.kt"
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            defpackage.fctl.b(r10)
            goto La3
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.fctl.b(r10)
            goto L69
        L3c:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.amqz.a
            ekrw r10 = r10.h()
            r2 = 133(0x85, float:1.86E-43)
            ekrw r10 = r10.h(r4, r3, r2, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "Emergency session timeout: %s"
            r10.t(r2, r9)
            amrb r9 = r9.b
            amrb r10 = defpackage.amrb.b
            if (r9 != r10) goto La3
            anpj r9 = r8.h
            eiju r9 = r9.b()
            r9.getClass()
            r0.c = r6
            java.lang.Object r10 = defpackage.fdxs.c(r9, r0)
            if (r10 == r1) goto La2
        L69:
            akep r10 = (defpackage.akep) r10
            elwp r9 = r10.I()
            elwp r10 = defpackage.elwp.SEND_MODE_XMS_LATCH
            if (r9 != r10) goto La3
            ekrg r9 = defpackage.amqz.a
            ekrw r9 = r9.h()
            r10 = 138(0x8a, float:1.93E-43)
            ekrw r9 = r9.h(r4, r3, r10, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Unlatching emergency conversation from XMS due to XMS session timeout."
            r9.q(r10)
            fcsu r9 = r8.g
            java.lang.Object r9 = r9.b()
            ajvr r9 = (defpackage.ajvr) r9
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r10 = r8.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r10 = r10.c()
            elwp r2 = defpackage.elwp.SEND_MODE_AUTO
            eiju r9 = r9.P(r10, r2)
            r0.c = r5
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto La3
        La2:
            return r1
        La3:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqz.a(amqj, fcxy):java.lang.Object");
    }
}
