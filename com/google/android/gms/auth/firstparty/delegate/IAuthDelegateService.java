package com.google.android.gms.auth.firstparty.delegate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthDelegateService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthDelegateService {
        static final int TRANSACTION_accountSetupWorkflowAction = 9;
        static final int TRANSACTION_getAccountRemovalAllowedWorkflowIntent = 8;
        static final int TRANSACTION_getConfirmCredentialsWorkflowIntent = 4;
        static final int TRANSACTION_getFinishSessionWorkflowIntent = 7;
        static final int TRANSACTION_getSetupAccountWorkflowIntent = 1;
        static final int TRANSACTION_getStartAddAccountSessionWorkflowIntent = 5;
        static final int TRANSACTION_getStartUpdateCredentialsSessionWorkflowIntent = 6;
        static final int TRANSACTION_getTokenRetrievalWorkflowIntent = 2;
        static final int TRANSACTION_getUpdateCredentialsWorkflowIntent = 3;
        static final int TRANSACTION_tokenRetrievalWorkflowAction = 10;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthDelegateService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public Bundle accountSetupWorkflowAction(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setupAccountWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getAccountRemovalAllowedWorkflowIntent(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountRemovalAllowedWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getConfirmCredentialsWorkflowIntent(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, confirmCredentialsWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getFinishSessionWorkflowIntent(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, finishSessionWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getSetupAccountWorkflowIntent(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setupAccountWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getStartAddAccountSessionWorkflowIntent(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, startAddAccountSessionWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getStartUpdateCredentialsSessionWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, updateCredentialsWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getTokenRetrievalWorkflowIntent(TokenWorkflowRequest tokenWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, tokenWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getUpdateCredentialsWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, updateCredentialsWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public Bundle tokenRetrievalWorkflowAction(TokenWorkflowRequest tokenWorkflowRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, tokenWorkflowRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
        }

        public static IAuthDelegateService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
            return iInterfaceQueryLocalInterface instanceof IAuthDelegateService ? (IAuthDelegateService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    SetupAccountWorkflowRequest setupAccountWorkflowRequest = (SetupAccountWorkflowRequest) sgh.a(parcel, SetupAccountWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent setupAccountWorkflowIntent = getSetupAccountWorkflowIntent(setupAccountWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, setupAccountWorkflowIntent);
                    return true;
                case 2:
                    TokenWorkflowRequest tokenWorkflowRequest = (TokenWorkflowRequest) sgh.a(parcel, TokenWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent tokenRetrievalWorkflowIntent = getTokenRetrievalWorkflowIntent(tokenWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenRetrievalWorkflowIntent);
                    return true;
                case 3:
                    UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest = (UpdateCredentialsWorkflowRequest) sgh.a(parcel, UpdateCredentialsWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent updateCredentialsWorkflowIntent = getUpdateCredentialsWorkflowIntent(updateCredentialsWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, updateCredentialsWorkflowIntent);
                    return true;
                case 4:
                    ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest = (ConfirmCredentialsWorkflowRequest) sgh.a(parcel, ConfirmCredentialsWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent confirmCredentialsWorkflowIntent = getConfirmCredentialsWorkflowIntent(confirmCredentialsWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, confirmCredentialsWorkflowIntent);
                    return true;
                case 5:
                    StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest = (StartAddAccountSessionWorkflowRequest) sgh.a(parcel, StartAddAccountSessionWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent startAddAccountSessionWorkflowIntent = getStartAddAccountSessionWorkflowIntent(startAddAccountSessionWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, startAddAccountSessionWorkflowIntent);
                    return true;
                case 6:
                    UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest2 = (UpdateCredentialsWorkflowRequest) sgh.a(parcel, UpdateCredentialsWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent startUpdateCredentialsSessionWorkflowIntent = getStartUpdateCredentialsSessionWorkflowIntent(updateCredentialsWorkflowRequest2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, startUpdateCredentialsSessionWorkflowIntent);
                    return true;
                case 7:
                    FinishSessionWorkflowRequest finishSessionWorkflowRequest = (FinishSessionWorkflowRequest) sgh.a(parcel, FinishSessionWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent finishSessionWorkflowIntent = getFinishSessionWorkflowIntent(finishSessionWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, finishSessionWorkflowIntent);
                    return true;
                case 8:
                    AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest = (AccountRemovalAllowedWorkflowRequest) sgh.a(parcel, AccountRemovalAllowedWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent accountRemovalAllowedWorkflowIntent = getAccountRemovalAllowedWorkflowIntent(accountRemovalAllowedWorkflowRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountRemovalAllowedWorkflowIntent);
                    return true;
                case 9:
                    SetupAccountWorkflowRequest setupAccountWorkflowRequest2 = (SetupAccountWorkflowRequest) sgh.a(parcel, SetupAccountWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle bundleAccountSetupWorkflowAction = accountSetupWorkflowAction(setupAccountWorkflowRequest2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleAccountSetupWorkflowAction);
                    return true;
                case 10:
                    TokenWorkflowRequest tokenWorkflowRequest2 = (TokenWorkflowRequest) sgh.a(parcel, TokenWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle bundle = tokenRetrievalWorkflowAction(tokenWorkflowRequest2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundle);
                    return true;
                default:
                    return false;
            }
        }
    }

    Bundle accountSetupWorkflowAction(SetupAccountWorkflowRequest setupAccountWorkflowRequest);

    PendingIntent getAccountRemovalAllowedWorkflowIntent(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest);

    PendingIntent getConfirmCredentialsWorkflowIntent(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest);

    PendingIntent getFinishSessionWorkflowIntent(FinishSessionWorkflowRequest finishSessionWorkflowRequest);

    PendingIntent getSetupAccountWorkflowIntent(SetupAccountWorkflowRequest setupAccountWorkflowRequest);

    PendingIntent getStartAddAccountSessionWorkflowIntent(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest);

    PendingIntent getStartUpdateCredentialsSessionWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);

    PendingIntent getTokenRetrievalWorkflowIntent(TokenWorkflowRequest tokenWorkflowRequest);

    PendingIntent getUpdateCredentialsWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);

    Bundle tokenRetrievalWorkflowAction(TokenWorkflowRequest tokenWorkflowRequest);
}
