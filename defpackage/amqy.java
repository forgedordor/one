package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqy extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ amqj c;
    final /* synthetic */ amqz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqy(long j, amqj amqjVar, amqz amqzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
        this.c = amqjVar;
        this.d = amqzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r2.a(r1, r11) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker$scheduleSessionTimeout$1$1"
            r4 = 1
            java.lang.String r5 = "EmergencySessionTimeoutTracker.kt"
            defpackage.fctl.b(r12)
            if (r1 == 0) goto L13
            if (r1 == r4) goto L3b
            goto L5e
        L13:
            ekrg r12 = defpackage.amqz.a
            ekrw r12 = r12.h()
            r1 = 88
            ekrw r12 = r12.h(r3, r2, r1, r5)
            ekrd r12 = (defpackage.ekrd) r12
            long r6 = r11.b
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            amqj r8 = r11.c
            amqz r9 = r11.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r9 = r9.d
            java.lang.String r10 = "Scheduling emergency session expiry with delay %s for session %s in conversation %s"
            r12.I(r10, r1, r8, r9)
            r11.a = r4
            java.lang.Object r12 = defpackage.fdkj.c(r6, r11)
            if (r12 == r0) goto L71
        L3b:
            ekrg r12 = defpackage.amqz.a
            ekrw r12 = r12.h()
            r1 = 97
            ekrw r12 = r12.h(r3, r2, r1, r5)
            ekrd r12 = (defpackage.ekrd) r12
            amqj r1 = r11.c
            amqz r2 = r11.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r3 = r2.d
            java.lang.String r4 = "Emergency session expired for %s in conversation %s"
            r12.D(r4, r1, r3)
            r12 = 2
            r11.a = r12
            java.lang.Object r12 = r2.a(r1, r11)
            if (r12 != r0) goto L5e
            goto L71
        L5e:
            amqz r12 = r11.d
            amqj r0 = r11.c
            amqx r1 = new amqx
            r1.<init>()
            cqtq r12 = r12.f
            java.lang.String r0 = "EmergencySessionTimeoutTracker::Notify"
            r12.c(r1, r0)
            fctx r12 = defpackage.fctx.a
            return r12
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amqy(this.b, this.c, this.d, fcxyVar);
    }
}
