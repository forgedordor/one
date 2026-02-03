package com.google.android.apps.messaging.shared.notification.receiver;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import defpackage.ajhd;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cgbe;
import defpackage.cgbn;
import defpackage.cgfa;
import defpackage.ebsn;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekgp;
import defpackage.elqb;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class DismissNotificationReceiver extends cgfa {
    static final cczi a = cdag.h(cdag.b, "disable_logging_spam_auto_reply_conversation_observer", false);
    private static final ekgp e = ekgp.l(cgbe.AUTOMOVED_SPAM, elqb.AUTOMOVED_SPAM_NOTIFICATION);
    public cgbn b;
    public eigp c;
    public fcsu d;

    public static PendingIntent f(Context context, cgbe cgbeVar) {
        Intent intent = new Intent(context, (Class<?>) DismissNotificationReceiver.class);
        intent.setAction("com.google.android.apps.messaging.dismiss_notification");
        intent.putExtra("NOTIFICATION_ID", cgbeVar.G);
        ClipData clipData = ebsn.a;
        return ebsn.d(context, 136, intent, 335544320);
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.c.c("DismissReceiver Receive Broadcast", "com/google/android/apps/messaging/shared/notification/receiver/DismissNotificationReceiver", "beginRootTrace", 60);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        cgbe cgbeVar;
        int intExtra = intent.getIntExtra("NOTIFICATION_ID", -1);
        if (intExtra != -1) {
            cgbe[] cgbeVarArrValues = cgbe.values();
            int length = cgbeVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cgbeVar = null;
                    break;
                }
                cgbeVar = cgbeVarArrValues[i];
                if (cgbeVar.G == intExtra) {
                    break;
                }
                i++;
            }
            if (cgbeVar != null) {
                this.b.j(cgbeVar);
                if (!((Boolean) a.e()).booleanValue()) {
                    ((ajhd) this.d.b()).au((elqb) e.getOrDefault(cgbeVar, elqb.UNKNOWN_NOTIFICATION));
                }
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.DismissNotificationReceiver.Latency";
    }
}
