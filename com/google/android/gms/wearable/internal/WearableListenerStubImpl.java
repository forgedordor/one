package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.dcib;
import defpackage.dclh;
import defpackage.denb;
import defpackage.denc;
import defpackage.deng;
import defpackage.denh;
import defpackage.denk;
import defpackage.denp;
import defpackage.denq;
import defpackage.deoc;
import defpackage.deod;
import defpackage.deog;
import defpackage.deoh;
import defpackage.deoi;
import defpackage.deom;
import defpackage.detz;
import defpackage.deua;
import defpackage.deub;
import defpackage.deuc;
import defpackage.deud;
import defpackage.deue;
import defpackage.deuf;
import defpackage.deug;
import defpackage.deuh;
import defpackage.deuj;
import defpackage.deuk;
import defpackage.deul;
import defpackage.deum;
import defpackage.deun;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WearableListenerStubImpl<T> extends IWearableListener.Stub {
    private dcib a;
    private dcib b;
    private dcib c;
    private dcib d;
    private dcib e;
    private dcib f;
    private dcib g;
    private dcib h;
    private dcib i;
    private dcib j;
    private dcib k;
    private dcib l;
    private dcib m;
    private final IntentFilter[] n;
    private final String o;

    private WearableListenerStubImpl(IntentFilter[] intentFilterArr, String str) {
        dclh.m(intentFilterArr);
        this.n = intentFilterArr;
        this.o = str;
    }

    private static void a(dcib dcibVar) {
        if (dcibVar != null) {
            dcibVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        try {
            iRpcResponseCallback.onResponse(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableListenerStub", "Failed to send a response back", e);
        }
    }

    public static WearableListenerStubImpl<denb> forAms(dcib<? extends denb> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<denb> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).a = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<denc> forAncs(dcib<? extends denc> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<denc> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).b = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deng> forCapability(dcib<? extends deng> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deng> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).i = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<denh> forChannel(dcib<? extends denh> dcibVar, String str, IntentFilter[] intentFilterArr) {
        dclh.m(str);
        WearableListenerStubImpl<denh> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, str);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).h = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<denk> forConnectionStateChange(dcib<? extends denk> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<denk> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).k = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<denp> forConsent(dcib<? extends denp> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<denp> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).j = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<denq> forData(dcib<? extends denq> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<denq> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).c = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deoc> forMessage(dcib<? extends deoc> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deoc> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).d = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deoh> forNode(dcib<? extends deoh> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deoh> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).f = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deoi> forNodeMigrated(dcib<? extends deoi> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deoi> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).l = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deog> forOnConnectedNodes(dcib<? extends deog> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deog> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).g = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deod> forRequest(dcib<? extends deod> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deod> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).e = dcibVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<deom> forRestoreCompleted(dcib<? extends deom> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<deom> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).m = dcibVar;
        return wearableListenerStubImpl;
    }

    public void clear() {
        a(this.a);
        this.a = null;
        a(this.b);
        this.b = null;
        a(this.c);
        this.c = null;
        a(this.d);
        this.d = null;
        a(this.e);
        this.e = null;
        a(this.f);
        this.f = null;
        a(this.g);
        this.g = null;
        a(this.h);
        this.h = null;
        a(this.i);
        this.i = null;
        a(this.j);
        this.j = null;
        a(this.k);
        this.k = null;
        a(this.l);
        this.l = null;
        a(this.m);
        this.m = null;
    }

    public String getChannelToken() {
        return this.o;
    }

    public IntentFilter[] getFilters() {
        return this.n;
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
        dcib dcibVar = this.h;
        if (dcibVar != null) {
            dcibVar.b(new deun(channelEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
        dcib dcibVar = this.i;
        if (dcibVar != null) {
            dcibVar.b(new detz());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectedNodes(List<NodeParcelable> list) {
        dcib dcibVar = this.g;
        if (dcibVar != null) {
            dcibVar.b(new deum());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
        dcib dcibVar = this.k;
        if (dcibVar != null) {
            dcibVar.b(new deub());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConsentChanged(ConsentResponse consentResponse) {
        dcib dcibVar = this.j;
        if (dcibVar != null) {
            dcibVar.b(new deua());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onDataChanged(DataHolder dataHolder) {
        dcib dcibVar = this.c;
        if (dcibVar != null) {
            dcibVar.b(new deug(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        dcib dcibVar = this.a;
        if (dcibVar != null) {
            dcibVar.b(new deuf());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onMessageReceived(MessageEventParcelable messageEventParcelable) {
        dcib dcibVar = this.d;
        if (dcibVar != null) {
            dcibVar.b(new deuh(messageEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        dcib dcibVar = this.l;
        if (dcibVar == null) {
            nodeMigratedEventParcelable.b.close();
        } else {
            String str = nodeMigratedEventParcelable.a;
            dcibVar.b(new deuc(nodeMigratedEventParcelable.b));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
        dcib dcibVar = this.b;
        if (dcibVar != null) {
            dcibVar.b(new deue());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onPeerConnected(NodeParcelable nodeParcelable) {
        dcib dcibVar = this.f;
        if (dcibVar != null) {
            dcibVar.b(new deuk());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onPeerDisconnected(NodeParcelable nodeParcelable) {
        dcib dcibVar = this.f;
        if (dcibVar != null) {
            dcibVar.b(new deul());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        dcib dcibVar = this.e;
        if (dcibVar != null) {
            dcibVar.b(new deuj(messageEventParcelable, iRpcResponseCallback));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
        dcib dcibVar = this.m;
        if (dcibVar != null) {
            dcibVar.b(new deud());
        }
    }

    public static WearableListenerStubImpl<denh> forChannel(dcib<? extends denh> dcibVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<denh> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dclh.m(dcibVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).h = dcibVar;
        return wearableListenerStubImpl;
    }
}
