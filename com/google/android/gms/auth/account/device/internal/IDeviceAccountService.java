package com.google.android.gms.auth.account.device.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.device.AddCastCertificateToDeviceAccountRequest;
import com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceAccountService {
        static final int TRANSACTION_addCastCertificateToDeviceAccount = 1;
        static final int TRANSACTION_getDeviceAccountJwt = 3;
        static final int TRANSACTION_getIddid = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void addCastCertificateToDeviceAccount(IDeviceAccountCallbacks iDeviceAccountCallbacks, AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, addCastCertificateToDeviceAccountRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void getDeviceAccountJwt(IDeviceAccountCallbacks iDeviceAccountCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void getIddid(IDeviceAccountCallbacks iDeviceAccountCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
        }

        public static IDeviceAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
            return iInterfaceQueryLocalInterface instanceof IDeviceAccountService ? (IDeviceAccountService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IDeviceAccountCallbacks iDeviceAccountCallbacksAsInterface = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest = (AddCastCertificateToDeviceAccountRequest) sgh.a(parcel, AddCastCertificateToDeviceAccountRequest.CREATOR);
                enforceNoDataAvail(parcel);
                addCastCertificateToDeviceAccount(iDeviceAccountCallbacksAsInterface, addCastCertificateToDeviceAccountRequest);
            } else if (i == 2) {
                IDeviceAccountCallbacks iDeviceAccountCallbacksAsInterface2 = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getIddid(iDeviceAccountCallbacksAsInterface2);
            } else {
                if (i != 3) {
                    return false;
                }
                IDeviceAccountCallbacks iDeviceAccountCallbacksAsInterface3 = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                getDeviceAccountJwt(iDeviceAccountCallbacksAsInterface3, string);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addCastCertificateToDeviceAccount(IDeviceAccountCallbacks iDeviceAccountCallbacks, AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest);

    void getDeviceAccountJwt(IDeviceAccountCallbacks iDeviceAccountCallbacks, String str);

    void getIddid(IDeviceAccountCallbacks iDeviceAccountCallbacks);
}
