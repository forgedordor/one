package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvc implements fbwc {
    static final fbvc a = new fbvc();

    @Override // defpackage.fbwc
    public final boolean D(int i, Parcel parcel) {
        if (i == 1 && parcel.readInt() > 0) {
            IBinder strongBinder = parcel.readStrongBinder();
            try {
                fbwq fbwqVarC = fbwq.c();
                try {
                    fbwqVarC.a().writeInt(0);
                    strongBinder.transact(2, fbwqVarC.a(), null, 1);
                    fbwqVarC.close();
                } finally {
                }
            } catch (RemoteException e) {
                fbvd.a.logp(Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", (Throwable) e);
            }
        }
        return false;
    }
}
