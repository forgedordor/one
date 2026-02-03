package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxe {
    private final fdjx a;

    public ccxe(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = fdjxVar;
    }

    public static final MessageIdType b(MessageId messageId) {
        messageId.getClass();
        MessageIdType messageIdTypeC = ((BugleMessageId) messageId).c();
        messageIdTypeC.getClass();
        return messageIdTypeC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, com.google.android.apps.messaging.shared.api.messaging.MessageId r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ccxb
            if (r0 == 0) goto L13
            r0 = r8
            ccxb r0 = (defpackage.ccxb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccxb r0 = new ccxb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fdjx r8 = r5.a
            ccxd r2 = new ccxd
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            eiju r6 = defpackage.auvw.h(r8, r2)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r6, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxe.a(java.lang.String, com.google.android.apps.messaging.shared.api.messaging.MessageId, fcxy):java.lang.Object");
    }
}
