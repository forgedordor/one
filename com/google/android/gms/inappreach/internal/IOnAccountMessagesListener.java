package com.google.android.gms.inappreach.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnAccountMessagesListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnAccountMessagesListener {
        static final int TRANSACTION_onAccountMessages = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnAccountMessagesListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.inappreach.internal.IOnAccountMessagesListener");
            }

            @Override // com.google.android.gms.inappreach.internal.IOnAccountMessagesListener
            public void onAccountMessages(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.inappreach.internal.IOnAccountMessagesListener");
        }

        public static IOnAccountMessagesListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IOnAccountMessagesListener");
            return iInterfaceQueryLocalInterface instanceof IOnAccountMessagesListener ? (IOnAccountMessagesListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onAccountMessages(bArrCreateByteArray);
            return true;
        }
    }

    void onAccountMessages(byte[] bArr);
}
