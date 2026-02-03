package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwd extends Binder {
    private static final Logger b = Logger.getLogger(fbwd.class.getName());
    public fbwc a;

    public fbwd(fbwc fbwcVar) {
        this.a = fbwcVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        fbwc fbwcVar = this.a;
        if (fbwcVar != null) {
            try {
                if ((i2 & 1) != 0) {
                    return fbwcVar.D(i, parcel);
                }
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.g(i2, "ignoring non-oneway transaction. flags="));
                return false;
            } catch (RuntimeException e) {
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.g(i, "failure sending transaction "), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
