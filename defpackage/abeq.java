package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abeq implements ServiceConnection {
    public kog a;
    private final AtomicReference c = new AtomicReference(Optional.empty());
    public final eiju b = eiju.g(kol.a(new koi() { // from class: abep
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.a = kogVar;
            return null;
        }
    }));

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHandlerServiceConnection", "onBindingDied", 345, "SatelliteBackgroundHandlerManagerImpl.java")).q("SatelliteBackgroundHandlerService binding died");
        this.c.set(Optional.empty());
        this.a.d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (componentName == null || iBinder == null) {
            this.a.c(new IllegalStateException("Could not start background service"));
            return;
        }
        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHandlerServiceConnection", "onServiceConnected", 328, "SatelliteBackgroundHandlerManagerImpl.java")).q("SatelliteBackgroundHandlerService bound");
        abex abexVar = ((abew) iBinder).a;
        AtomicReference atomicReference = this.c;
        Optional optionalOf = Optional.of(abexVar);
        atomicReference.set(optionalOf);
        this.a.b(optionalOf);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl$SatelliteBackgroundHandlerServiceConnection", "onServiceDisconnected", 338, "SatelliteBackgroundHandlerManagerImpl.java")).q("SatelliteBackgroundHandlerService unbound");
        this.c.set(Optional.empty());
        this.a.d();
    }
}
