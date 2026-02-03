package defpackage;

import com.google.android.rcs.client.messaging.data.FileTransferInformation;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpw implements cbty {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsEncryptedFileTransferXmlHandler");

    public ccpw(ccpm ccpmVar, apwn apwnVar) {
        ccpmVar.getClass();
        apwnVar.getClass();
    }

    @Override // defpackage.cbty
    public final /* synthetic */ eiju b(FileTransferInformation fileTransferInformation, atys atysVar) {
        return cbtw.a(this, fileTransferInformation, atysVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.rcs.client.messaging.data.FileTransferInformation r4, defpackage.atys r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r6 instanceof defpackage.ccpv
            if (r4 == 0) goto L13
            r4 = r6
            ccpv r4 = (defpackage.ccpv) r4
            int r5 = r4.c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.c = r5
            goto L18
        L13:
            ccpv r4 = new ccpv
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r5 = r4.a
            int r4 = r4.c
            if (r4 == 0) goto L74
            r6 = 1
            r0 = 0
            if (r4 == r6) goto L60
            r6 = 2
            if (r4 != r6) goto L58
            defpackage.fctl.b(r5)
            ccan r5 = (defpackage.ccan) r5
            ccqq r4 = defpackage.ccqq.a
            atav r4 = r4.a(r5)
            ekrg r5 = defpackage.ccpw.a
            ekrw r5 = r5.h()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r1 = "BugleE2eeMls"
            r5.X(r6, r1)
            ekrd r5 = (defpackage.ekrd) r5
            ekrz r6 = defpackage.cqnc.e
            r5.X(r6, r0)
            r6 = 69
            java.lang.String r0 = "MlsEncryptedFileTransferXmlHandler.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsEncryptedFileTransferXmlHandler"
            java.lang.String r2 = "handle"
            ekrw r5 = r5.h(r1, r2, r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "The message has been processed with result: %s"
            r5.t(r6, r4)
            return r4
        L58:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L60:
            defpackage.fctl.b(r5)
            ccpl r5 = (defpackage.ccpl) r5
            cbwd r4 = defpackage.cbwd.a
            evsf r4 = r4.createBuilder()
            cbwc r4 = (defpackage.cbwc) r4
            r4.getClass()
            defpackage.cbwf.e(r0, r4)
            throw r0
        L74:
            defpackage.fctl.b(r5)
            atav r4 = defpackage.atav.FAIL_NO_RETRY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccpw.d(com.google.android.rcs.client.messaging.data.FileTransferInformation, atys, fcxy):java.lang.Object");
    }

    @Override // defpackage.cbty
    public final boolean e(FileTransferInformation fileTransferInformation) {
        return false;
    }
}
