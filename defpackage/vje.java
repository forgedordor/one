package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vje implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vjg b;
    final /* synthetic */ Context c;

    public vje(fdpm fdpmVar, vjg vjgVar, Context context) {
        this.a = fdpmVar;
        this.b = vjgVar;
        this.c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof defpackage.vjd
            if (r2 == 0) goto L17
            r2 = r1
            vjd r2 = (defpackage.vjd) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vjd r2 = new vjd
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L8c
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r22
            zqw r4 = (defpackage.zqw) r4
            java.util.List r6 = r4.a
            int r7 = r6.size()
            r8 = 0
            if (r7 != r5) goto L83
            java.lang.Object r6 = defpackage.fcva.X(r6)
            ajlt r6 = (defpackage.ajlt) r6
            boolean r6 = r6.u()
            if (r6 != 0) goto L52
            goto L83
        L52:
            vjg r6 = r0.b
            android.content.Context r7 = r0.c
            dihq r9 = new dihq
            r10 = 2132085485(0x7f150aed, float:1.981117E38)
            java.lang.String r10 = r7.getString(r10)
            r10.getClass()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r7 = r6.a
            boolean r7 = r7 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId
            if (r7 == 0) goto L6a
            djrr r8 = defpackage.djrr.bo
        L6a:
            r11 = r8
            r13 = r7 ^ 1
            vjc r7 = new vjc
            r7.<init>(r6, r4)
            r20 = 996(0x3e4, float:1.396E-42)
            r12 = 0
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8 = r9
        L83:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r8, r2)
            if (r1 != r3) goto L8c
            return r3
        L8c:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vje.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
