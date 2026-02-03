package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjh extends fcyz implements fdat {
    int a;
    final /* synthetic */ zjk b;
    final /* synthetic */ zjj c;
    final /* synthetic */ MessageId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjh(zjk zjkVar, zjj zjjVar, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zjkVar;
        this.c = zjjVar;
        this.d = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zjh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r11 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            java.lang.String r2 = "Failed to select questionnaire option"
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/messagelist/message/cardstone/EmergencyQuestionnaireCardstoneUiAdapter$questionnaireOnClick$1"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "EmergencyQuestionnaireCardstoneUiAdapter.kt"
            if (r1 == 0) goto L19
            defpackage.fctl.b(r11)
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L79
            goto L8f
        L19:
            defpackage.fctl.b(r11)
            zjk r11 = r10.b
            zjk r1 = defpackage.zjk.f
            if (r11 != r1) goto L55
            zjj r1 = r10.c
            vwg r5 = r1.d
            vwd r8 = defpackage.vwd.a
            r5.c(r8)
            java.lang.String r11 = r11.name()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r10.d
            r10.a = r6
            ccxe r1 = r1.g
            java.lang.Object r11 = r1.a(r11, r5, r10)
            if (r11 == r0) goto Lab
        L3b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto La8
            ekrg r11 = defpackage.zjj.a
            ekrw r11 = r11.j()
            r0 = 198(0xc6, float:2.77E-43)
            ekrw r11 = r11.h(r4, r3, r0, r7)
            ekrd r11 = (defpackage.ekrd) r11
            r11.q(r2)
            goto La8
        L55:
            zjj r1 = r10.c
            int r11 = r11.i
            android.content.Context r8 = r1.b
            java.lang.String r11 = r8.getString(r11)
            r11.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r9 = 0
            r6[r9] = r11
            r11 = 2132084048(0x7f150550, float:1.9808256E38)
            java.lang.String r11 = r8.getString(r11, r6)
            r11.getClass()
            r10.a = r5
            java.lang.Object r11 = r1.b(r11, r10)
            if (r11 == r0) goto Lab
        L79:
            zjj r11 = r10.c
            zjk r1 = r10.b
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r10.d
            java.lang.String r1 = r1.name()
            r6 = 3
            r10.a = r6
            ccxe r11 = r11.g
            java.lang.Object r11 = r11.a(r1, r5, r10)
            if (r11 != r0) goto L8f
            goto Lab
        L8f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto La8
            ekrg r11 = defpackage.zjj.a
            ekrw r11 = r11.j()
            r0 = 209(0xd1, float:2.93E-43)
            ekrw r11 = r11.h(r4, r3, r0, r7)
            ekrd r11 = (defpackage.ekrd) r11
            r11.q(r2)
        La8:
            fctx r11 = defpackage.fctx.a
            return r11
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zjh(this.b, this.c, this.d, fcxyVar);
    }
}
