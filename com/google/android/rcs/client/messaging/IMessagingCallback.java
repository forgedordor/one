package com.google.android.rcs.client.messaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IMessagingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMessagingCallback {
        static final int TRANSACTION_onGroupCompleted = 2;
        static final int TRANSACTION_onMessagingCompleted = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMessagingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.rcs.client.messaging.IMessagingCallback");
            }

            @Override // com.google.android.rcs.client.messaging.IMessagingCallback
            public void onGroupCompleted(GroupOperationResult groupOperationResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, groupOperationResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.rcs.client.messaging.IMessagingCallback
            public void onMessagingCompleted(MessagingOperationResult messagingOperationResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, messagingOperationResult);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.rcs.client.messaging.IMessagingCallback");
        }

        public static IMessagingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.rcs.client.messaging.IMessagingCallback");
            return iInterfaceQueryLocalInterface instanceof IMessagingCallback ? (IMessagingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                MessagingOperationResult messagingOperationResult = (MessagingOperationResult) sgh.a(parcel, MessagingOperationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onMessagingCompleted(messagingOperationResult);
            } else {
                if (i != 2) {
                    return false;
                }
                GroupOperationResult groupOperationResult = (GroupOperationResult) sgh.a(parcel, GroupOperationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onGroupCompleted(groupOperationResult);
            }
            return true;
        }
    }

    void onGroupCompleted(GroupOperationResult groupOperationResult);

    void onMessagingCompleted(MessagingOperationResult messagingOperationResult);
}
