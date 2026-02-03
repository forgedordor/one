package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWearableListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWearableListener {
        static final int TRANSACTION_onChannelEvent = 7;
        static final int TRANSACTION_onConnectedCapabilityChanged = 8;
        static final int TRANSACTION_onConnectedNodes = 5;
        static final int TRANSACTION_onConnectionStateChanged = 15;
        static final int TRANSACTION_onConsentChanged = 14;
        static final int TRANSACTION_onDataChanged = 1;
        static final int TRANSACTION_onEntityUpdate = 9;
        static final int TRANSACTION_onMessageReceived = 2;
        static final int TRANSACTION_onNodeMigrated = 16;
        static final int TRANSACTION_onNotificationReceived = 6;
        static final int TRANSACTION_onPeerConnected = 3;
        static final int TRANSACTION_onPeerDisconnected = 4;
        static final int TRANSACTION_onRequestReceived = 13;
        static final int TRANSACTION_onRestoreCompleted = 17;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWearableListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IWearableListener");
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, channelEventParcelable);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, capabilityInfoParcelable);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConnectedNodes(List<NodeParcelable> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionStateEventParcelable);
                transactOneway(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConsentChanged(ConsentResponse consentResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, consentResponse);
                transactOneway(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onDataChanged(DataHolder dataHolder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, dataHolder);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, amsEntityUpdateParcelable);
                transactOneway(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onMessageReceived(MessageEventParcelable messageEventParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, messageEventParcelable);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, nodeMigratedEventParcelable);
                transactOneway(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, ancsNotificationParcelable);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onPeerConnected(NodeParcelable nodeParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, nodeParcelable);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onPeerDisconnected(NodeParcelable nodeParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, nodeParcelable);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, messageEventParcelable);
                sgh.f(parcelObtainAndWriteInterfaceToken, iRpcResponseCallback);
                transactOneway(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, restoreCompletedEventParcelable);
                transactOneway(17, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IWearableListener");
        }

        public static IWearableListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return iInterfaceQueryLocalInterface instanceof IWearableListener ? (IWearableListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    DataHolder dataHolder = (DataHolder) sgh.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataChanged(dataHolder);
                    return true;
                case 2:
                    MessageEventParcelable messageEventParcelable = (MessageEventParcelable) sgh.a(parcel, MessageEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onMessageReceived(messageEventParcelable);
                    return true;
                case 3:
                    NodeParcelable nodeParcelable = (NodeParcelable) sgh.a(parcel, NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPeerConnected(nodeParcelable);
                    return true;
                case 4:
                    NodeParcelable nodeParcelable2 = (NodeParcelable) sgh.a(parcel, NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPeerDisconnected(nodeParcelable2);
                    return true;
                case 5:
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConnectedNodes(arrayListCreateTypedArrayList);
                    return true;
                case 6:
                    AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) sgh.a(parcel, AncsNotificationParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onNotificationReceived(ancsNotificationParcelable);
                    return true;
                case 7:
                    ChannelEventParcelable channelEventParcelable = (ChannelEventParcelable) sgh.a(parcel, ChannelEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onChannelEvent(channelEventParcelable);
                    return true;
                case 8:
                    CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) sgh.a(parcel, CapabilityInfoParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConnectedCapabilityChanged(capabilityInfoParcelable);
                    return true;
                case 9:
                    AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) sgh.a(parcel, AmsEntityUpdateParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onEntityUpdate(amsEntityUpdateParcelable);
                    return true;
                case 10:
                case 11:
                case 12:
                default:
                    return false;
                case 13:
                    MessageEventParcelable messageEventParcelable2 = (MessageEventParcelable) sgh.a(parcel, MessageEventParcelable.CREATOR);
                    IRpcResponseCallback iRpcResponseCallbackAsInterface = IRpcResponseCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onRequestReceived(messageEventParcelable2, iRpcResponseCallbackAsInterface);
                    return true;
                case 14:
                    ConsentResponse consentResponse = (ConsentResponse) sgh.a(parcel, ConsentResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConsentChanged(consentResponse);
                    return true;
                case 15:
                    ConnectionStateEventParcelable connectionStateEventParcelable = (ConnectionStateEventParcelable) sgh.a(parcel, ConnectionStateEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConnectionStateChanged(connectionStateEventParcelable);
                    return true;
                case 16:
                    NodeMigratedEventParcelable nodeMigratedEventParcelable = (NodeMigratedEventParcelable) sgh.a(parcel, NodeMigratedEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onNodeMigrated(nodeMigratedEventParcelable);
                    return true;
                case 17:
                    RestoreCompletedEventParcelable restoreCompletedEventParcelable = (RestoreCompletedEventParcelable) sgh.a(parcel, RestoreCompletedEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRestoreCompleted(restoreCompletedEventParcelable);
                    return true;
            }
        }
    }

    void onChannelEvent(ChannelEventParcelable channelEventParcelable);

    void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable);

    void onConnectedNodes(List<NodeParcelable> list);

    void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable);

    void onConsentChanged(ConsentResponse consentResponse);

    void onDataChanged(DataHolder dataHolder);

    void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void onMessageReceived(MessageEventParcelable messageEventParcelable);

    void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable);

    void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable);

    void onPeerConnected(NodeParcelable nodeParcelable);

    void onPeerDisconnected(NodeParcelable nodeParcelable);

    void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback);

    void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable);
}
