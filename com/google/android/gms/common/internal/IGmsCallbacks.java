package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGmsCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGmsCallbacks {
        static final int TRANSACTION_onAccountValidationComplete = 2;
        static final int TRANSACTION_onPostInitComplete = 1;
        static final int TRANSACTION_onPostInitCompleteWithConnectionInfo = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGmsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
            }

            @Override // com.google.android.gms.common.internal.IGmsCallbacks
            public void onAccountValidationComplete(int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.internal.IGmsCallbacks
            public void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.internal.IGmsCallbacks
            public void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionInfo);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public static IGmsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGmsCallbacks ? (IGmsCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onPostInitComplete(i3, strongBinder, bundle);
            } else if (i == 2) {
                int i4 = parcel.readInt();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onAccountValidationComplete(i4, bundle2);
            } else {
                if (i != 3) {
                    return false;
                }
                int i5 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                ConnectionInfo connectionInfo = (ConnectionInfo) sgh.a(parcel, ConnectionInfo.CREATOR);
                enforceNoDataAvail(parcel);
                onPostInitCompleteWithConnectionInfo(i5, strongBinder2, connectionInfo);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAccountValidationComplete(int i, Bundle bundle);

    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle);

    void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo);
}
