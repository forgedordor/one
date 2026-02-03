package defpackage;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dhfp {
    public static IInterface a(dhfq dhfqVar) throws RemoteException {
        IInterface iInterface = dhfqVar.getInterface();
        if (!((crma) ((dfdn) dfdr.a(dhfqVar.getContext())).f.b()).j()) {
            throw new IllegalStateException("No permission to run RCS Engine.");
        }
        if (iInterface != null) {
            return iInterface;
        }
        if (((Boolean) dhfr.a.a()).booleanValue()) {
            throw new IllegalStateException("JibeService Not Initialized");
        }
        throw new RemoteException("JibeService Not Initialized");
    }
}
