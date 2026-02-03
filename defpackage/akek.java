package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akek extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ EmergencyConversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akek(EmergencyConversation emergencyConversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = emergencyConversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akek) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (defpackage.fdxs.c(r6, r5) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[PHI: r6
      0x0095: PHI (r6v26 java.lang.Object) = (r6v24 java.lang.Object), (r6v0 java.lang.Object) binds: [B:28:0x0093, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L14
            defpackage.fctl.b(r6)
            if (r1 == r2) goto L95
            goto Ld2
        L14:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L72
        L1a:
            defpackage.fctl.b(r6)
            goto L36
        L1e:
            defpackage.fctl.b(r6)
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            anpj r6 = r6.i()
            eiju r6 = r6.b()
            r6.getClass()
            r5.b = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto Ld5
        L36:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = defpackage.fcva.P(r6)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            if (r6 == 0) goto Ld2
            alqm r6 = r6.g()
            if (r6 == 0) goto Ld2
            j$.util.Optional r6 = r6.e()
            if (r6 == 0) goto Ld2
            java.lang.Object r6 = defpackage.fdct.b(r6)
            aubq r6 = (defpackage.aubq) r6
            if (r6 == 0) goto Ld2
            java.lang.String r1 = r6.d
            if (r1 == 0) goto Ld2
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            anpj r6 = r6.m()
            eiju r6 = r6.b()
            r6.getClass()
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto Ld5
        L72:
            akep r6 = (defpackage.akep) r6
            elwp r6 = r6.I()
            elwp r3 = defpackage.elwp.SEND_MODE_XMS_LATCH
            if (r6 != r3) goto Ld2
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            fcsu r6 = r6.e
            java.lang.Object r6 = r6.b()
            ccwi r6 = (defpackage.ccwi) r6
            amrb r3 = defpackage.amrb.b
            r4 = 0
            r5.a = r4
            r5.b = r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.c(r1, r3, r5)
            if (r6 == r0) goto Ld5
        L95:
            amqj r6 = (defpackage.amqj) r6
            if (r6 != 0) goto Ld2
            ekrg r6 = com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation.a
            ekrw r6 = r6.h()
            r1 = 110(0x6e, float:1.54E-43)
            java.lang.String r2 = "EmergencyConversation.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/EmergencyConversation$unlatchConversationIfNeeded$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r6 = r6.h(r3, r4, r1, r2)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r1 = "Unlatching emergency conversation. There is no active XMS session."
            r6.q(r1)
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            fcsu r1 = r6.f
            java.lang.Object r1 = r1.b()
            ajvr r1 = (defpackage.ajvr) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r6 = r6.i
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6 = r6.c()
            elwp r2 = defpackage.elwp.SEND_MODE_AUTO
            eiju r6 = r1.P(r6, r2)
            r1 = 4
            r5.b = r1
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 != r0) goto Ld2
            goto Ld5
        Ld2:
            fctx r6 = defpackage.fctx.a
            return r6
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akek.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akek(this.c, fcxyVar);
    }
}
