package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcgp extends BasePendingResult implements dcgq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected dcgp(dcfe dcfeVar, dcfq dcfqVar) {
        super(dcfqVar);
        dclh.n(dcfqVar, "GoogleApiClient must not be null");
        dclh.n(dcfeVar, "Api must not be null");
        dcfd dcfdVar = dcfeVar.b;
    }

    private final void d(RemoteException remoteException) {
        j(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(dcev dcevVar);

    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void i(dcev dcevVar) throws DeadObjectException {
        try {
            b(dcevVar);
        } catch (DeadObjectException e) {
            d(e);
            throw e;
        } catch (RemoteException e2) {
            d(e2);
        }
    }

    public final void j(Status status) {
        dclh.b(!status.d(), "Failed result must not be success");
        m(a(status));
    }
}
