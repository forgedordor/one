package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.ckzv;
import defpackage.cqce;
import defpackage.dzfh;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eksp;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class NotificationReceiver extends ckzv {
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
    public fcsu m;
    private static final cqce n = cqce.g("Bugle", "NotificationReceiver");
    public static final eksp a = eksp.c("BugleNotifications");
    public static final dzfh b = new dzfh("SwipeNotificationTimer");

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.g.b()).c("NotificationReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "beginRootTrace", 88);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.Notification.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Notification.Latency";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Type inference failed for: r10v18, types: [cmfo, java.lang.Object] */
    @Override // defpackage.clca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Context r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.NotificationReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.updating_notifications_foreground_notification_text);
    }
}
