package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import defpackage.fdbq;
import defpackage.pec;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final Map b = new LinkedHashMap();
    public final RemoteCallbackList c = new pec(this);
    private final IMultiInstanceInvalidationService.Stub d = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i, String[] strArr) {
            strArr.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
            synchronized (remoteCallbackList) {
                Map map = multiInstanceInvalidationService.b;
                String str = (String) map.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = remoteCallbackList.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) map.get(num);
                        if (i != iIntValue && fdbq.f(str, str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) remoteCallbackList.getBroadcastItem(i2)).onInvalidation(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.c.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            iMultiInstanceInvalidationCallback.getClass();
            int i = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
            synchronized (remoteCallbackList) {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                Integer numValueOf = Integer.valueOf(i2);
                if (remoteCallbackList.register(iMultiInstanceInvalidationCallback, numValueOf)) {
                    multiInstanceInvalidationService.b.put(numValueOf, str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            }
            return i;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
            iMultiInstanceInvalidationCallback.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
            synchronized (remoteCallbackList) {
                remoteCallbackList.unregister(iMultiInstanceInvalidationCallback);
            }
        }
    };

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
