package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IProximityAuthCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProximityAuthCallbacks {
        static final int TRANSACTION_onConnectionStatusChanged = 1;
        static final int TRANSACTION_onMessageReceived = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProximityAuthCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks
            public void onConnectionStatusChanged(String str, int i, int i2, int i3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks
            public void onMessageReceived(String str, String str2, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
        }

        public static IProximityAuthCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
            return iInterfaceQueryLocalInterface instanceof IProximityAuthCallbacks ? (IProximityAuthCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onConnectionStatusChanged(string, i3, i4, i5);
            } else {
                if (i != 2) {
                    return false;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onMessageReceived(string2, string3, bArrCreateByteArray);
            }
            return true;
        }
    }

    void onConnectionStatusChanged(String str, int i, int i2, int i3);

    void onMessageReceived(String str, String str2, byte[] bArr);
}
