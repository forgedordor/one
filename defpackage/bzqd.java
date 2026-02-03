package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqd implements bzqa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaBugleDbHelperImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final aqmq f;
    private final bxlc g;
    private final byeq h;

    public bzqd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, bxlc bxlcVar, aqmq aqmqVar, fdjx fdjxVar, byeq byeqVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        bxlcVar.getClass();
        aqmqVar.getClass();
        fdjxVar.getClass();
        byeqVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.g = bxlcVar;
        this.f = aqmqVar;
        this.h = byeqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.bzqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData r12, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13, final com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14, final java.lang.String r15, final android.net.Uri r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.bzqc
            if (r1 == 0) goto L15
            r1 = r0
            bzqc r1 = (defpackage.bzqc) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            bzqc r1 = new bzqc
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14 = r1.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13 = r1.d
            defpackage.fctl.b(r0)
            goto L5b
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.fctl.b(r0)
            byeq r0 = r11.h
            bzqb r5 = new bzqb
            r6 = r11
            r7 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>()
            java.lang.String r12 = "CmsMediaBugleDbHelper#updateBugleDbForMediaUri"
            eiju r12 = r0.b(r12, r5)
            r12.getClass()
            r1.d = r13
            r1.e = r14
            r1.c = r4
            java.lang.Object r12 = defpackage.fdxs.c(r12, r1)
            if (r12 != r2) goto L5b
            return r2
        L5b:
            bxlc r12 = r11.g
            java.lang.String[] r15 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a
            java.lang.String r15 = "parts"
            java.lang.String[] r15 = new java.lang.String[]{r15}
            r12.l(r13, r14, r15)
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqd.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, java.lang.String, android.net.Uri, fcxy):java.lang.Object");
    }

    @Override // defpackage.bzqa
    public final void b(bvdl bvdlVar, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        bvdlVar.getClass();
        conversationIdType.getClass();
        messageIdType.getClass();
        str.getClass();
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("updateAndNotifyCmsAttachmentProcessingStatus");
        bsjhVar.f(bvdlVar);
        bsjhVar.c(str);
        this.g.l(conversationIdType, messageIdType, "parts");
    }
}
