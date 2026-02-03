package defpackage;

import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import com.google.android.gms.wearable.internal.IWearableListener;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class depg extends IWearableListener.Stub {
    final /* synthetic */ deph a;
    private volatile int b = -1;

    public depg(deph dephVar) {
        this.a = dephVar;
    }

    public static final void a(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        try {
            iRpcResponseCallback.onResponse(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    private final boolean b(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.a.E.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            deph dephVar = this.a;
            if ((!deuo.a(dephVar).b() || !dcnn.b(dephVar, callingUid, "com.google.android.wearable.app.cn")) && !dcnn.a(dephVar, callingUid)) {
                Log.e("WearableLS", a.g(callingUid, "Caller is not GooglePlayServices; caller UID: "));
                return false;
            }
            this.b = callingUid;
        }
        deph dephVar2 = this.a;
        synchronized (dephVar2.H) {
            if (dephVar2.I) {
                return false;
            }
            dephVar2.F.post(runnable);
            return true;
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
        b(new depf(this, channelEventParcelable), "onChannelEvent", channelEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
        b(new depc(), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectedNodes(List<NodeParcelable> list) {
        b(new depb(), "onConnectedNodes", list);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onDataChanged(DataHolder dataHolder) {
        try {
            if (b(new deox(this, dataHolder), "onDataItemChanged", a.f(dataHolder.i, String.valueOf(dataHolder), ", rows="))) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        b(new depe(), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onMessageReceived(MessageEventParcelable messageEventParcelable) {
        b(new deoy(this, messageEventParcelable), "onMessageReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onNodeMigrated(final NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        Runnable runnable = new Runnable() { // from class: deow
            @Override // java.lang.Runnable
            public final void run() {
                NodeMigratedEventParcelable nodeMigratedEventParcelable2 = nodeMigratedEventParcelable;
                denx denxVar = new denx(nodeMigratedEventParcelable2.b);
                try {
                    String str = nodeMigratedEventParcelable2.a;
                    denxVar.b();
                } catch (Throwable th) {
                    try {
                        denxVar.b();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        DataHolder dataHolder = nodeMigratedEventParcelable.b;
        if (b(runnable, "onNodeMigrated", "DataHolder[rows=" + dataHolder.i + "]")) {
            return;
        }
        dataHolder.close();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
        b(new depd(), "onNotificationReceived", ancsNotificationParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onPeerConnected(NodeParcelable nodeParcelable) {
        b(new deoz(), "onPeerConnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onPeerDisconnected(NodeParcelable nodeParcelable) {
        b(new depa(), "onPeerDisconnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onRequestReceived(final MessageEventParcelable messageEventParcelable, final IRpcResponseCallback iRpcResponseCallback) {
        b(new Runnable() { // from class: deou
            @Override // java.lang.Runnable
            public final void run() {
                deph dephVar = this.a.a;
                MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                defn defnVarD = dephVar.d(messageEventParcelable2.d, messageEventParcelable2.b, messageEventParcelable2.c);
                final IRpcResponseCallback iRpcResponseCallback2 = iRpcResponseCallback;
                defnVarD.s(new defb() { // from class: deov
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        IRpcResponseCallback iRpcResponseCallback3 = iRpcResponseCallback2;
                        if (defnVar.m()) {
                            depg.a(iRpcResponseCallback3, true, (byte[]) defnVar.i());
                        } else {
                            Log.e("WearableLS", "Failed to resolve future, sending null response", defnVar.h());
                            depg.a(iRpcResponseCallback3, false, null);
                        }
                    }
                });
            }
        }, "onRequestReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConsentChanged(ConsentResponse consentResponse) {
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
    }
}
