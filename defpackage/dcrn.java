package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrn {
    static dcff a(Exception exc, int i, String str) {
        dcff dcffVar = new dcff(new Status(i, str.concat(exc.getMessage() == null ? "" : ": ".concat(String.valueOf(exc.getMessage())))));
        dcffVar.initCause(exc);
        return dcffVar;
    }

    static dcff b(RemoteException remoteException, String str) {
        return a(remoteException, true != (remoteException instanceof DeadObjectException) ? 19 : 20, str);
    }
}
