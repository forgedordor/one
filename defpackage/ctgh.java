package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgh implements baya, baxz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;

    public ctgh(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    private final void b(MessageCoreData messageCoreData) {
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        if (messagePartCoreDataH == null || !messagePartCoreDataH.bj()) {
            return;
        }
        Uri uriT = messagePartCoreDataH.t();
        if (uriT == null) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener", "callSafetyCoreAndPersistVerdict", 78, "SpatulaOnImageDownloadedListener.kt")).q("contentUri is null.");
        } else {
            auvw.m(this.d, null, new ctgf(this, uriT, messagePartCoreDataH, messageCoreData, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ctgg
            if (r0 == 0) goto L13
            r0 = r10
            ctgg r0 = (defpackage.ctgg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctgg r0 = new ctgg
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "insertToolstone"
            java.lang.String r4 = "com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener"
            r5 = 1
            java.lang.String r6 = "SpatulaOnImageDownloadedListener.kt"
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            defpackage.fctl.b(r10)
            goto L5c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.ctgh.a
            ekrw r10 = r10.e()
            r2 = 115(0x73, float:1.61E-43)
            ekrw r10 = r10.h(r4, r3, r2, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "SpatulaToolstoneInserter#insertToolstone executing..."
            r10.q(r2)
            fcsu r10 = r7.e
            java.lang.Object r10 = r10.b()
            cpdn r10 = (defpackage.cpdn) r10
            r0.c = r5
            java.lang.Object r10 = r10.c(r8, r9, r0)
            if (r10 != r1) goto L5c
            return r1
        L5c:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r10 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType) r10
            ekrg r8 = defpackage.ctgh.a
            ekrw r8 = r8.e()
            r9 = 125(0x7d, float:1.75E-43)
            ekrw r8 = r8.h(r4, r3, r9, r6)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "SatelliteToolstoneUpdater#insertToolstone toolstone updated."
            r8.q(r9)
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctgh.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, fcxy):java.lang.Object");
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        ((ekrd) a.e().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener", "afterIncomingFileTransferCompleted", 57, "SpatulaOnImageDownloadedListener.kt")).q("spatula afterIncomingFileTransferCompleted");
        if (((csme) this.f.b()).b()) {
            b(messageCoreData);
        }
    }

    @Override // defpackage.baxz
    public final void g(MessageCoreData messageCoreData) {
        ((ekrd) a.e().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener", "onBeforeInsertedInTransaction", 66, "SpatulaOnImageDownloadedListener.kt")).t("spatula onBeforeInsertedInTransaction with message: %s", messageCoreData.C());
        if (((csme) this.f.b()).b()) {
            b(messageCoreData);
        }
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void gb(MessageCoreData messageCoreData) {
    }
}
