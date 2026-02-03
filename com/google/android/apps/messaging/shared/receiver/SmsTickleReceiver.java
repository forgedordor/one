package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import androidx.car.app.hardware.info.EnergyProfile;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cdeb;
import defpackage.clad;
import defpackage.crnp;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksq;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.ezua;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SmsTickleReceiver extends clad {
    public fcsu b;
    public fcsu c;
    public fcsu d;
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver");
    public static final cczv a = cdag.e(cdag.b, "sms_tickle_receiver_port", 8901);

    @Override // defpackage.cldb
    protected final int a() {
        return 19;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.b.b()).c("SmsTickleReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "beginRootTrace", 57);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SmsTickleReceiver.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SmsTickleReceiver.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
        int length;
        ekrg ekrgVar = e;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleSatellite");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "doInBackground", 92, "SmsTickleReceiver.java")).t("processBroadcast %s", intent);
        int iIntValue = ((Integer) a.e()).intValue();
        ekrw ekrwVarE = ekrgVar.e();
        ekrwVarE.X(ekrzVar, "BugleSatellite");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "getSmsPort", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SmsTickleReceiver.java")).r("getSmsPort from flag: %d", iIntValue);
        Uri data = intent.getData();
        if (data == null) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 108, "SmsTickleReceiver.java")).q("processSmsIntent, uri is null, ignoring");
            return;
        }
        int port = data.getPort();
        if (iIntValue != port) {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 113, "SmsTickleReceiver.java")).u("processSmsIntent, port not matching, ignoring. expectedPort: %d actual port: %d", iIntValue, port);
            return;
        }
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        if (messagesFromIntent != null && (length = messagesFromIntent.length) > 0) {
            char c = 0;
            SmsMessage smsMessage = messagesFromIntent[0];
            if (smsMessage != null) {
                byte[] userData = smsMessage.getUserData();
                ekrw ekrwVarE2 = ekrgVar.e();
                ekrwVarE2.X(ekrzVar, "BugleSatellite");
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 127, "SmsTickleReceiver.java")).r("Received Message Count: %d", length);
                try {
                    ezua ezuaVar = (ezua) evsn.parseFrom(ezua.a, userData, evrr.a());
                    if (ezuaVar != null) {
                        int i = ezuaVar.d;
                        if (i == 0) {
                            c = 2;
                        } else if (i == 1) {
                            c = 3;
                        }
                        if (c == 0 || c != 3) {
                            ekrw ekrwVarJ3 = ekrgVar.j();
                            ekrwVarJ3.X(eksq.a, "BugleSatellite");
                            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 138, "SmsTickleReceiver.java")).r("processSmsIntent, skipping because of unexpected tickle type: %d", ezuaVar.d);
                            return;
                        }
                    }
                    ((cdeb) this.d.b()).a(ezuaVar);
                    return;
                } catch (evtj e2) {
                    ekrw ekrwVarI = e.i();
                    ekrwVarI.X(eksq.a, "BugleSatellite");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e2)).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", (char) 133, "SmsTickleReceiver.java")).q("processSmsIntent: couldn't parse payload into an SmsTickle, skipping");
                    return;
                }
            }
        }
        ekrw ekrwVarI2 = ekrgVar.i();
        ekrwVarI2.X(ekrzVar, "BugleSatellite");
        ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 122, "SmsTickleReceiver.java")).q("Received SMS data intent could not be parsed");
    }

    @Override // defpackage.clca
    public final boolean h(Context context, Intent intent) {
        ekrg ekrgVar = e;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleSatellite");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 82, "SmsTickleReceiver.java")).q("SmsTickle feature enabled");
        if (((crnp) this.c.b()).d()) {
            return true;
        }
        ekrw ekrwVarJ = ekrgVar.j();
        ekrwVarJ.X(ekrzVar, "BugleSatellite");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 84, "SmsTickleReceiver.java")).q("SmsTickle not default sms app");
        return false;
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }
}
