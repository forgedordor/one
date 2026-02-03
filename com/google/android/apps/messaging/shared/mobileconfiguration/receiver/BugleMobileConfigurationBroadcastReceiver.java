package com.google.android.apps.messaging.shared.mobileconfiguration.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.cebc;
import defpackage.cebe;
import defpackage.cebp;
import defpackage.cebq;
import defpackage.cece;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejwl;
import defpackage.ekby;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgp;
import defpackage.ekqg;
import defpackage.ekrd;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eoqg;
import defpackage.etsf;
import defpackage.eygg;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class BugleMobileConfigurationBroadcastReceiver extends cece {
    public eygg a;
    public eygg b;
    public eygg c;

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("BugleMobileConfigurationBroadcastReceiver Receive broadcast", "com/google/android/apps/messaging/shared/mobileconfiguration/receiver/BugleMobileConfigurationBroadcastReceiver", "beginRootTrace", 45);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.BugleMobileConfiguration.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.BugleMobileConfiguration.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.clca
    public final eiju j(Context context, Intent intent) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("onMobileConfigurationUpdated");
        try {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("config_data_ids_of_updated_configs");
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                eijuVarE = eijx.e(null);
            } else {
                ekgb ekgbVarN = ekgb.n(stringArrayListExtra);
                ((cebq) this.c.b()).g(ekgbVarN);
                cebe cebeVar = (cebe) this.b.b();
                ekby ekbyVar = new ekby();
                int size = ekgbVarN.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) ekgbVarN.get(i);
                    try {
                        String[] strArrSplit = str.split("\\.", 2);
                        ejwl.f(strArrSplit.length == 2, "Invalid configParameterId: %s", str);
                        String str2 = strArrSplit[0];
                        ejwl.f(!str2.isEmpty(), "Invalid configParameterId: %s", str);
                        cebc cebcVar = new cebc(str2, (etsf) Enum.valueOf(etsf.class, strArrSplit[1]));
                        ekbyVar.t(cebcVar.a, cebcVar);
                    } catch (IllegalArgumentException unused) {
                        ekrw ekrwVarJ = cebe.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "onConfigUpdated", 155, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: Invalid configuration id: %s", str);
                    }
                }
                if (ekbyVar.A()) {
                    eijuVarE = eijx.e(null);
                } else {
                    ekfw ekfwVar = new ekfw();
                    ekgp ekgpVar = cebeVar.b;
                    ekqg ekqgVarListIterator = ekgpVar.keySet().listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        etsf etsfVar = (etsf) ekqgVarListIterator.next();
                        ekgb ekgbVarN2 = ekgb.n(ekbyVar.c(etsfVar));
                        fcsu fcsuVar = (fcsu) ekgpVar.get(etsfVar);
                        if (!ekgbVarN2.isEmpty() && fcsuVar != null) {
                            ekfwVar.h(((cebp) fcsuVar.b()).a(ekgbVarN2));
                        }
                    }
                    eijuVarE = eijx.l(ekfwVar.g()).a(new Callable() { // from class: cebd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, eoqg.a);
                }
            }
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
