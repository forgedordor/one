package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.claa;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SmsDeliverReceiver extends claa {
    private static final cqce m = cqce.g("Bugle", "SmsDeliverReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;
    public fcsu k;
    public fcsu l;

    @Override // defpackage.cldb
    protected final int a() {
        return 8;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.e.b()).c("SmsDeliverReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/SmsDeliverReceiver", "beginRootTrace", 69);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SmsDeliver.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.SmsDeliver.Latency";
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #5 {all -> 0x01d8, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x0016, B:9:0x0023, B:16:0x0044, B:19:0x0049, B:22:0x0069, B:39:0x00c9, B:41:0x00de, B:43:0x00f5, B:45:0x0138, B:47:0x0144, B:48:0x0157, B:55:0x018e, B:64:0x019b, B:65:0x019e, B:67:0x01a0, B:42:0x00ef, B:24:0x0077, B:38:0x00c5, B:73:0x01c9, B:74:0x01cc, B:75:0x01cd, B:12:0x002b, B:13:0x003a, B:25:0x0098, B:26:0x00a4, B:28:0x00aa, B:30:0x00b7, B:36:0x00c1, B:37:0x00c4, B:34:0x00bf, B:29:0x00b4, B:71:0x01c7), top: B:95:0x000a, inners: #2, #4, #7, #8 }] */
    @Override // defpackage.clca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Context r19, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.SmsDeliverReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.incoming_message_foreground_notification_text);
    }
}
