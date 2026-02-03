package com.google.android.gms.auth.account.device.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceAccountCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceAccountCallbacks {
        static final int TRANSACTION_onCastCertificateAddedToDeviceAccount = 1;
        static final int TRANSACTION_onGetDeviceAccountJwt = 3;
        static final int TRANSACTION_onGetIddid = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceAccountCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks");
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
            public void onCastCertificateAddedToDeviceAccount(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
            public void onGetDeviceAccountJwt(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
            public void onGetIddid(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks");
        }

        public static IDeviceAccountCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks");
            return iInterfaceQueryLocalInterface instanceof IDeviceAccountCallbacks ? (IDeviceAccountCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                onCastCertificateAddedToDeviceAccount(status, string);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onGetIddid(status2, string2);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                String string3 = parcel.readString();
                enforceNoDataAvail(parcel);
                onGetDeviceAccountJwt(status3, string3);
            }
            return true;
        }
    }

    void onCastCertificateAddedToDeviceAccount(Status status, String str);

    void onGetDeviceAccountJwt(Status status, String str);

    void onGetIddid(Status status, String str);
}
