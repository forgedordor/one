package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class debh<T extends IInterface> extends dcko<T> {
    public debh(Context context, Looper looper, int i, dcke dckeVar, dcgy dcgyVar, dcii dciiVar, deaq deaqVar) {
        super(context, looper, i, dckeVar, dcgyVar, dciiVar);
        if (deaqVar != null) {
            throw null;
        }
    }

    public final IInterface M() throws RemoteException {
        try {
            return w();
        } catch (IllegalStateException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("ComponentName", null);
        return bundle;
    }
}
