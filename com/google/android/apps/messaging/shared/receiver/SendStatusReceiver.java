package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.ckzy;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SendStatusReceiver extends ckzy {
    private static final cqce i = cqce.g("Bugle", "SendStatusReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.e.b()).c("SendStatusReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/SendStatusReceiver", "beginRootTrace", 90);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SendStatus.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SendStatus.Latency";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5 A[Catch: all -> 0x0272, TryCatch #0 {all -> 0x0272, blocks: (B:8:0x006b, B:11:0x009d, B:14:0x00ab, B:16:0x00b4, B:25:0x011e, B:18:0x00d2, B:20:0x00f5, B:21:0x0109, B:26:0x013e, B:28:0x014a, B:29:0x0170, B:31:0x0178, B:32:0x0195, B:34:0x019d, B:51:0x01e5, B:52:0x01ee, B:54:0x01f8, B:55:0x01fe, B:57:0x021d, B:59:0x0267, B:37:0x01af, B:39:0x01b5, B:43:0x01c1, B:49:0x01df, B:40:0x01ba), top: B:72:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    @Override // defpackage.clca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Context r25, android.content.Intent r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.clca
    public final boolean h(Context context, Intent intent) {
        intent.putExtra("resultCode", getResultCode());
        return true;
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    @Override // defpackage.clca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.String k(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            goto L43
        L7:
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1366403072: goto L30;
                case -1070391116: goto L26;
                case -246885565: goto L1c;
                case 1022419196: goto L12;
                default: goto L11;
            }
        L11:
            goto L3a
        L12:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_DELIVERED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3a
            r6 = r2
            goto L3b
        L1c:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3a
            r6 = r1
            goto L3b
        L26:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3a
            r6 = r3
            goto L3b
        L30:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_SENT"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3a
            r6 = 0
            goto L3b
        L3a:
            r6 = -1
        L3b:
            if (r6 == 0) goto L55
            if (r6 == r3) goto L55
            if (r6 == r2) goto L4d
            if (r6 == r1) goto L45
        L43:
            r5 = 0
            return r5
        L45:
            r6 = 2132083985(0x7f150511, float:1.9808128E38)
            java.lang.String r5 = r5.getString(r6)
            return r5
        L4d:
            r6 = 2132083836(0x7f15047c, float:1.9807826E38)
            java.lang.String r5 = r5.getString(r6)
            return r5
        L55:
            r6 = 2132086159(0x7f150d8f, float:1.9812537E38)
            java.lang.String r5 = r5.getString(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.k(android.content.Context, android.content.Intent):java.lang.String");
    }
}
