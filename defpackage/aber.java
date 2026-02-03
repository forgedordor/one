package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aber implements ServiceConnection {
    final /* synthetic */ abes a;

    public aber(abes abesVar) {
        this.a = abesVar;
    }

    private final void a() {
        AtomicReference atomicReference;
        Optional optionalOf = Optional.of(this);
        Optional optionalEmpty = Optional.empty();
        do {
            abes abesVar = this.a;
            atomicReference = abesVar.f;
            if (atomicReference.compareAndSet(optionalOf, optionalEmpty)) {
                abesVar.b.unbindService(this);
                return;
            }
        } while (atomicReference.get() == optionalOf);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHealthMonitoringConnection", "onBindingDied", 289, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection died");
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHealthMonitoringConnection", "onServiceConnected", 278, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection established");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHealthMonitoringConnection", "onServiceDisconnected", 283, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection disconnected");
        a();
    }
}
