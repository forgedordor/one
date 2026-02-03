package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwl extends fbwm {
    public fbwl(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.fbwm
    public final void a(int i, fbwq fbwqVar) throws RemoteException {
        if (!c(i, fbwqVar.b())) {
            throw new RemoteException(a.e(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
