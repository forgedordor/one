package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhp implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vhr b;

    public vhp(fdpm fdpmVar, vhr vhrVar) {
        this.a = fdpmVar;
        this.b = vhrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.vho
            if (r2 == 0) goto L17
            r2 = r1
            vho r2 = (defpackage.vho) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vho r2 = new vho
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L75
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r21
            zqw r4 = (defpackage.zqw) r4
            vhr r6 = r0.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r7 = r6.c
            boolean r7 = r7 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId
            if (r7 == 0) goto L46
            r4 = 0
            goto L6c
        L46:
            android.content.Context r7 = r6.b
            dihq r8 = new dihq
            r9 = 2132083817(0x7f150469, float:1.9807787E38)
            java.lang.String r9 = r7.getString(r9)
            r9.getClass()
            djrr r10 = defpackage.djrr.aG
            vhi r7 = new vhi
            r7.<init>(r6, r4)
            r19 = 1020(0x3fc, float:1.43E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = r8
        L6c:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r4, r2)
            if (r1 != r3) goto L75
            return r3
        L75:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhp.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
