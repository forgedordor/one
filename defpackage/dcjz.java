package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjz extends dcjt {
    public final IBinder g;
    final /* synthetic */ BaseGmsClient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcjz(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.h = baseGmsClient;
        this.g = iBinder;
    }

    @Override // defpackage.dcjt
    protected final void a(ConnectionResult connectionResult) {
        dckn dcknVar = this.h.t;
        if (dcknVar != null) {
            dcknVar.a(connectionResult);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.dcjt
    protected final boolean b() throws RemoteException {
        try {
            IBinder iBinder = this.g;
            dclh.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.h;
            if (!baseGmsClient.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + baseGmsClient.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = baseGmsClient.b(this.g);
            if (iInterfaceB == null || !(baseGmsClient.F(2, 4, iInterfaceB) || baseGmsClient.F(3, 4, iInterfaceB))) {
                return false;
            }
            baseGmsClient.o = null;
            dckm dckmVar = baseGmsClient.s;
            if (dckmVar == null) {
                return true;
            }
            dckmVar.a.onConnected(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
