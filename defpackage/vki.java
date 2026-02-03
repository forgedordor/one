package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vki implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vkk b;

    public vki(fdpm fdpmVar, vkk vkkVar) {
        this.a = fdpmVar;
        this.b = vkkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r6.fO(r10, r2) == r3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof defpackage.vkh
            if (r2 == 0) goto L17
            r2 = r1
            vkh r2 = (defpackage.vkh) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vkh r2 = new vkh
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3f
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            defpackage.fctl.b(r1)
            goto La3
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            java.lang.Object r4 = r2.e
            java.lang.Object r6 = r2.c
            defpackage.fctl.b(r1)
            goto L5b
        L3f:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r24
            ajlk r4 = (defpackage.ajlk) r4
            vkk r7 = r0.b
            r2.c = r1
            r2.e = r4
            r2.b = r6
            java.lang.Object r6 = r7.c(r4, r2)
            if (r6 == r3) goto La6
            r22 = r6
            r6 = r1
            r1 = r22
        L5b:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r7 = 0
            if (r1 == 0) goto L95
            vkk r1 = r0.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r4.d()
            r4.getClass()
            android.content.Context r8 = r1.a
            r9 = 2132085127(0x7f150987, float:1.9810444E38)
            java.lang.String r11 = r8.getString(r9)
            r11.getClass()
            djrr r12 = defpackage.djrr.cn
            dihq r10 = new dihq
            vkc r8 = new vkc
            r8.<init>()
            r21 = 996(0x3e4, float:1.396E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L96
        L95:
            r10 = r7
        L96:
            r2.c = r7
            r2.e = r7
            r2.b = r5
            java.lang.Object r1 = r6.fO(r10, r2)
            if (r1 != r3) goto La3
            goto La6
        La3:
            fctx r1 = defpackage.fctx.a
            return r1
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vki.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
