package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwk extends fbwm {
    private final fclc d;

    public fbwk(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new fclc(executor);
    }

    @Override // defpackage.fbwm
    public final void a(final int i, fbwq fbwqVar) {
        final Parcel parcelA = fbwqVar.a();
        this.d.execute(new Runnable() { // from class: fbwj
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (this.a.c(i, parcelA)) {
                        return;
                    }
                    fbwm.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                } catch (Exception e) {
                    fbwm.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
                }
            }
        });
        fbwqVar.b();
    }
}
