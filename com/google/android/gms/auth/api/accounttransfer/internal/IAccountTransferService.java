package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAccountTransferService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAccountTransferService {
        static final int TRANSACTION_exportAccounts = 1;
        static final int TRANSACTION_exportExternalAccounts = 3;
        static final int TRANSACTION_getDeviceMetaData = 7;
        static final int TRANSACTION_importAccounts = 2;
        static final int TRANSACTION_importExternalAccounts = 4;
        static final int TRANSACTION_launchChallenge = 8;
        static final int TRANSACTION_notifyCompletion = 9;
        static final int TRANSACTION_retrieveData = 6;
        static final int TRANSACTION_sendData = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAccountTransferService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void exportAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountTransferMsg);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void exportExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, authenticatorTransferInfo);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void getDeviceMetaData(IAccountTransferCallbacks iAccountTransferCallbacks, DeviceMetaDataRequest deviceMetaDataRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, deviceMetaDataRequest);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void importAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountTransferMsg);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void importExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, authenticatorTransferInfo);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void launchChallenge(IAccountTransferCallbacks iAccountTransferCallbacks, UserChallengeRequest userChallengeRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, userChallengeRequest);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void notifyCompletion(IAccountTransferCallbacks iAccountTransferCallbacks, NotifyCompletionRequest notifyCompletionRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, notifyCompletionRequest);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void retrieveData(IAccountTransferCallbacks iAccountTransferCallbacks, RetrieveDataRequest retrieveDataRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, retrieveDataRequest);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void sendData(IAccountTransferCallbacks iAccountTransferCallbacks, SendDataRequest sendDataRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, sendDataRequest);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        }

        public static IAccountTransferService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
            return iInterfaceQueryLocalInterface instanceof IAccountTransferService ? (IAccountTransferService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountTransferMsg accountTransferMsg = (AccountTransferMsg) sgh.a(parcel, AccountTransferMsg.CREATOR);
                    enforceNoDataAvail(parcel);
                    exportAccounts(iAccountTransferCallbacksAsInterface, accountTransferMsg);
                    break;
                case 2:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface2 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountTransferMsg accountTransferMsg2 = (AccountTransferMsg) sgh.a(parcel, AccountTransferMsg.CREATOR);
                    enforceNoDataAvail(parcel);
                    importAccounts(iAccountTransferCallbacksAsInterface2, accountTransferMsg2);
                    break;
                case 3:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface3 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticatorTransferInfo authenticatorTransferInfo = (AuthenticatorTransferInfo) sgh.a(parcel, AuthenticatorTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    exportExternalAccounts(iAccountTransferCallbacksAsInterface3, authenticatorTransferInfo);
                    break;
                case 4:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface4 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticatorTransferInfo authenticatorTransferInfo2 = (AuthenticatorTransferInfo) sgh.a(parcel, AuthenticatorTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    importExternalAccounts(iAccountTransferCallbacksAsInterface4, authenticatorTransferInfo2);
                    break;
                case 5:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface5 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    SendDataRequest sendDataRequest = (SendDataRequest) sgh.a(parcel, SendDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendData(iAccountTransferCallbacksAsInterface5, sendDataRequest);
                    break;
                case 6:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface6 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RetrieveDataRequest retrieveDataRequest = (RetrieveDataRequest) sgh.a(parcel, RetrieveDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    retrieveData(iAccountTransferCallbacksAsInterface6, retrieveDataRequest);
                    break;
                case 7:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface7 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    DeviceMetaDataRequest deviceMetaDataRequest = (DeviceMetaDataRequest) sgh.a(parcel, DeviceMetaDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceMetaData(iAccountTransferCallbacksAsInterface7, deviceMetaDataRequest);
                    break;
                case 8:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface8 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    UserChallengeRequest userChallengeRequest = (UserChallengeRequest) sgh.a(parcel, UserChallengeRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    launchChallenge(iAccountTransferCallbacksAsInterface8, userChallengeRequest);
                    break;
                case 9:
                    IAccountTransferCallbacks iAccountTransferCallbacksAsInterface9 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    NotifyCompletionRequest notifyCompletionRequest = (NotifyCompletionRequest) sgh.a(parcel, NotifyCompletionRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    notifyCompletion(iAccountTransferCallbacksAsInterface9, notifyCompletionRequest);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void exportAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg);

    void exportExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo);

    void getDeviceMetaData(IAccountTransferCallbacks iAccountTransferCallbacks, DeviceMetaDataRequest deviceMetaDataRequest);

    void importAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg);

    void importExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo);

    void launchChallenge(IAccountTransferCallbacks iAccountTransferCallbacks, UserChallengeRequest userChallengeRequest);

    void notifyCompletion(IAccountTransferCallbacks iAccountTransferCallbacks, NotifyCompletionRequest notifyCompletionRequest);

    void retrieveData(IAccountTransferCallbacks iAccountTransferCallbacks, RetrieveDataRequest retrieveDataRequest);

    void sendData(IAccountTransferCallbacks iAccountTransferCallbacks, SendDataRequest sendDataRequest);
}
