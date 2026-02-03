package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.IWearableService;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class desm {
    private final Map a = new HashMap();

    public final void a(IBinder iBinder) {
        Map map = this.a;
        synchronized (map) {
            IWearableService iWearableServiceAsInterface = IWearableService.Stub.asInterface(iBinder);
            dett dettVar = new dett();
            for (Map.Entry entry : map.entrySet()) {
                WearableListenerStubImpl wearableListenerStubImpl = (WearableListenerStubImpl) entry.getValue();
                try {
                    iWearableServiceAsInterface.addListener(dettVar, new AddListenerRequest(wearableListenerStubImpl));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(wearableListenerStubImpl));
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(wearableListenerStubImpl));
                }
            }
        }
    }
}
