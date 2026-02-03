package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auuf extends auum {
    public aypy a;
    public eigp b;
    public axut c;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("CloudSyncInternalReceiver Receive broadcast", "com/google/android/apps/messaging/shared/cloudsync/CloudSyncInternalReceiver", "beginRootTrace", 41);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // defpackage.cldb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju c(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            java.lang.String r12 = r13.getAction()
            if (r12 == 0) goto L89
            int r0 = r12.hashCode()
            r1 = -883916357(0xffffffffcb5081bb, float:-1.3664699E7)
            r2 = 0
            r3 = 1
            r4 = -1
            if (r0 == r1) goto L22
            r1 = -525415832(0xffffffffe0aeca68, float:-1.0075995E20)
            if (r0 == r1) goto L18
            goto L2c
        L18:
            java.lang.String r0 = "com.google.android.apps.messaging.cloudsync.internal.action.SEND_MESSAGE_RESULT"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L2c
            r12 = r2
            goto L2d
        L22:
            java.lang.String r0 = "com.google.android.apps.messaging.cloudsync.internal.action.ACTION_ATTACHMENTS_DOWNLOADED"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L2c
            r12 = r3
            goto L2d
        L2c:
            r12 = r4
        L2d:
            java.lang.String r0 = "com.google.android.apps.messaging.cloudsync.extra.ID"
            if (r12 == 0) goto L68
            if (r12 == r3) goto L34
            goto L89
        L34:
            axut r12 = r11.c
            int r1 = r11.getResultCode()
            if (r1 == r4) goto L3d
            r2 = 2
        L3d:
            r6 = r2
            java.lang.String r7 = r13.getStringExtra(r0)
            java.lang.String r0 = "com.google.android.apps.messaging.cloudsync.extra.ATTACHMENTS_TYPES"
            java.lang.String[] r8 = r13.getStringArrayExtra(r0)
            java.lang.String r0 = "com.google.android.apps.messaging.cloudsync.extra.ATTACHMENTS_VALUES"
            java.lang.String[] r9 = r13.getStringArrayExtra(r0)
            android.os.Bundle r10 = r13.getExtras()
            com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction r3 = new com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction
            r8.getClass()
            r9.getClass()
            r10.getClass()
            fcsu r5 = r12.b
            fcsu r4 = r12.c
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3.z()
            goto L89
        L68:
            aypy r12 = r11.a
            java.lang.String r1 = "com.google.android.apps.messaging.cloudsync.internal.extra.REQUEST_ID"
            java.lang.String r1 = r13.getStringExtra(r1)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = defpackage.bary.b(r1)
            java.lang.String r0 = r13.getStringExtra(r0)
            java.lang.String r2 = "com.google.android.apps.messaging.cloudsync.internal.extra.SUB_ID"
            int r13 = r13.getIntExtra(r2, r4)
            int r2 = r11.getResultCode()
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r12 = r12.a(r1, r0, r13, r2)
            r12.q(r11)
        L89:
            r12 = 0
            eiju r12 = defpackage.eijx.e(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auuf.c(android.content.Context, android.content.Intent):eiju");
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.CloudSync.Latency";
    }
}
