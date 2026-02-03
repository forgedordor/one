package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.aiyc;
import defpackage.aiyd;
import defpackage.aiyt;
import defpackage.ajhd;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cgbn;
import defpackage.clac;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.emgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SmsRejectedReceiver extends clac {
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    private static final cqce g = cqce.g("Bugle", "SmsRejectedReceiver");
    public static final cczv a = cdag.h(cdag.b, "enable_sms_rejected_receiver", false);
    public static final cczv b = cdag.h(cdag.b, "enable_sms_rejected_receiver_to_post_notification", false);

    @Override // defpackage.cldb
    protected final int a() {
        return 6;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.c.b()).c("SmsRejectedReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/SmsRejectedReceiver", "beginRootTrace", 70);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        eieu eieuVarK = eiiy.k("SmsRejectedReceiver.executeAction");
        if (intent != null) {
            try {
                String action = intent.getAction();
                cqce cqceVar = g;
                cqbd cqbdVarE = cqceVar.e();
                cqbdVarE.I(intent);
                cqbdVarE.r();
                if ("android.provider.Telephony.SMS_REJECTED".equals(action)) {
                    int intExtra = intent.getIntExtra("result", 1);
                    int intExtra2 = intent.getIntExtra("subId", -1);
                    cqbd cqbdVarE2 = cqceVar.e();
                    cqbdVarE2.I("SMS_REJECTED_ACTION");
                    cqbdVarE2.y("result", intExtra);
                    cqbdVarE2.r();
                    ((ajhd) this.d.b()).P(intExtra, intExtra2);
                    aiyt aiytVar = (aiyt) this.f.b();
                    aiyc aiycVar = (aiyc) aiyd.a.createBuilder();
                    aiycVar.copyOnWrite();
                    aiyd aiydVar = (aiyd) aiycVar.instance;
                    aiydVar.c = 1;
                    aiydVar.b = 1 | aiydVar.b;
                    aiycVar.copyOnWrite();
                    aiyd aiydVar2 = (aiyd) aiycVar.instance;
                    aiydVar2.b |= 16;
                    aiydVar2.g = intExtra;
                    aiytVar.e((aiyd) aiycVar.build());
                    if (((Boolean) b.e()).booleanValue()) {
                        ((cgbn) this.e.b()).W(emgm.SMS_REJECTED, context.getResources().getString(R.string.report_receive_issue_notification_message));
                    }
                }
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieuVarK.close();
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
