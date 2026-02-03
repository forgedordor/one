package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vnx extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ vod d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnx(vod vodVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = vodVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        vnx vnxVar = new vnx(this.d, (fcxy) obj3);
        vnxVar.b = (ekgb) obj;
        vnxVar.c = zBooleanValue;
        return vnxVar.b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.a
            r2 = 0
            if (r1 == 0) goto L11
            boolean r0 = r14.c
            java.lang.Object r1 = r14.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.fctl.b(r15)
            goto L5d
        L11:
            defpackage.fctl.b(r15)
            java.lang.Object r15 = r14.b
            ekgb r15 = (defpackage.ekgb) r15
            boolean r1 = r14.c
            ejxr r3 = defpackage.crvx.a
            java.lang.Object r3 = r3.get()
            cczi r3 = (defpackage.cczi) r3
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9b
            vod r3 = r14.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r3.d
            boolean r4 = r4 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId
            if (r4 == 0) goto L37
            goto L9b
        L37:
            java.lang.Object r15 = defpackage.fcva.Y(r15)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r15
            if (r15 != 0) goto L40
            return r2
        L40:
            boolean r4 = r15.B()
            if (r4 != 0) goto L47
            return r2
        L47:
            boolean r4 = r15.D()
            if (r4 != 0) goto L6a
            r14.b = r15
            r14.c = r1
            r4 = 1
            r14.a = r4
            java.lang.Object r3 = r3.c(r14)
            if (r3 == r0) goto L69
            r0 = r1
            r1 = r15
            r15 = r3
        L5d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L68
            r15 = r1
            r1 = r0
            goto L6a
        L68:
            return r2
        L69:
            return r0
        L6a:
            vod r0 = r14.d
            dihq r2 = new dihq
            if (r1 == 0) goto L7d
            android.content.Context r3 = r0.a
            r4 = 2132088773(0x7f1517c5, float:1.9817839E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
            goto L89
        L7d:
            android.content.Context r3 = r0.a
            r4 = 2132087891(0x7f151453, float:1.981605E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
        L89:
            vnu r12 = new vnu
            r12.<init>()
            r13 = 1014(0x3f6, float:1.421E-42)
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnx.b(java.lang.Object):java.lang.Object");
    }
}
