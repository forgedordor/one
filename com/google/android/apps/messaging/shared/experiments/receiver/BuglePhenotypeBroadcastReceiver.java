package com.google.android.apps.messaging.shared.experiments.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.experiments.receiver.BuglePhenotypeBroadcastReceiver;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.cdao;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eksp;
import defpackage.eosc;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class BuglePhenotypeBroadcastReceiver extends cdao {
    public static final eksp a = eksp.c("BuglePhenotype");
    public fcsu b;
    public eigp c;
    public eosc d;

    @Override // defpackage.cldb
    protected final int a() {
        return 15;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.c.c("BuglePhenotypeBroadcastReceiver Receive broadcast", "com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "beginRootTrace", 46);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.PhenotypeCommit.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.PhenotypeCommit.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    public final eiju j(final Context context, final Intent intent) {
        eieu eieuVarK = eiiy.k("BuglePhenotypeBroadcastReceiver#doInBackgroundAsync");
        try {
            eiju eijuVarF = eijx.f(new Runnable() { // from class: cdam
                @Override // java.lang.Runnable
                public final void run() {
                    final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                    boolean zEquals = "com.google.android.ims.library".equals(stringExtra);
                    BuglePhenotypeBroadcastReceiver buglePhenotypeBroadcastReceiver = this.a;
                    if (zEquals) {
                        eksl ekslVar = (eksl) BuglePhenotypeBroadcastReceiver.a.h();
                        ekslVar.X(cdal.a, stringExtra);
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "doInBackgroundAsync", 82, "BuglePhenotypeBroadcastReceiver.java")).q("onReceive for cslib package");
                        final ccyw ccywVar = (ccyw) buglePhenotypeBroadcastReceiver.b.b();
                        ((crrz) ((cqbm) ccywVar.c.b()).a()).a(stringExtra, new ccyt(eiid.a(new ejvr() { // from class: ccys
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                eksp ekspVar = ccyw.a;
                                ekrw ekrwVarN = ekspVar.n();
                                ekrz ekrzVar = cdal.a;
                                String str = stringExtra;
                                ekrwVarN.X(ekrzVar, str);
                                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 130, "PhenotypeHelper.java")).t("CsLib Ph flags committed. success: %b", (Boolean) obj);
                                ccyw ccywVar2 = ccywVar;
                                fcsu fcsuVar = ccywVar2.c;
                                if (!ejuf.e(str, "com.google.android.ims.library")) {
                                    eksl ekslVar2 = (eksl) ekspVar.h();
                                    ekslVar2.X(cdal.b, "com.google.android.ims.library");
                                    ekslVar2.X(ekrzVar, str);
                                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 154, "PhenotypeHelper.java")).q("Skipping sending updates, package not current.");
                                    return null;
                                }
                                eksl ekslVar3 = (eksl) ekspVar.h();
                                ekslVar3.X(cdal.b, str);
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 137, "PhenotypeHelper.java")).q("Notify about updates in current package");
                                Context context2 = ccywVar2.b;
                                Intent intentA = aiiw.c(context2, dfnp.class, RcsIntents.ACTION_CSLIB_FLAGS_UPDATED).a();
                                intentA.putExtra(RcsIntents.EXTRA_MENDEL_PACKAGE_NAME, str);
                                context2.sendBroadcast(intentA);
                                dfaq.I(context2);
                                ccywVar2.a();
                                return null;
                            }
                        })));
                        return;
                    }
                    if (ccyy.a(context).equals(stringExtra)) {
                        eksl ekslVar2 = (eksl) BuglePhenotypeBroadcastReceiver.a.h();
                        ekslVar2.X(cdal.a, stringExtra);
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "doInBackgroundAsync", 91, "BuglePhenotypeBroadcastReceiver.java")).q("onReceive for bugle package");
                        ((ccyw) buglePhenotypeBroadcastReceiver.b.b()).e();
                    }
                }
            }, this.d);
            eieuVarK.b(eijuVarF);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.syncing_with_device_foreground_notification_text);
    }
}
