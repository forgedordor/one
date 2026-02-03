package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzf extends BroadcastReceiver {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/receiver/CarrierConfigChangeReceiver");
    private final fcsu b;
    private final fcsu c;

    public ckzf(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/receiver/CarrierConfigChangeReceiver", "onReceive", 21, "CarrierConfigChangeReceiver.kt")).q("Carrier config changed. Reloading MMS config.");
        final cmum cmumVar = (cmum) this.b.b();
        final cmup cmupVar = (cmup) this.c.b();
        auwa.a(new Runnable() { // from class: cmul
            @Override // java.lang.Runnable
            public final void run() {
                cmumVar.c(cmupVar);
            }
        }, cmumVar.c);
    }
}
