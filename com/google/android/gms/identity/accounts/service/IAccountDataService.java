package com.google.android.gms.identity.accounts.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.service.IAccountDataCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAccountDataService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAccountDataService {
        static final int TRANSACTION_decryptAccountData = 2;
        static final int TRANSACTION_encryptAccountData = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAccountDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identity.accounts.service.IAccountDataService");
            }

            @Override // com.google.android.gms.identity.accounts.service.IAccountDataService
            public void decryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountDataCallbacks);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identity.accounts.service.IAccountDataService
            public void encryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, AccountData accountData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountDataCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountData);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identity.accounts.service.IAccountDataService");
        }

        public static IAccountDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.accounts.service.IAccountDataService");
            return iInterfaceQueryLocalInterface instanceof IAccountDataService ? (IAccountDataService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IAccountDataCallbacks iAccountDataCallbacksAsInterface = IAccountDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AccountData accountData = (AccountData) sgh.a(parcel, AccountData.CREATOR);
                enforceNoDataAvail(parcel);
                encryptAccountData(iAccountDataCallbacksAsInterface, accountData);
            } else {
                if (i != 2) {
                    return false;
                }
                IAccountDataCallbacks iAccountDataCallbacksAsInterface2 = IAccountDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                decryptAccountData(iAccountDataCallbacksAsInterface2, bArrCreateByteArray);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void decryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, byte[] bArr);

    void encryptAccountData(IAccountDataCallbacks iAccountDataCallbacks, AccountData accountData);
}
