package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IResolveAccountCallbacks;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.ISignInCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_authAccount = 2;
        static final int TRANSACTION_clearAccountFromSessionStore = 7;
        static final int TRANSACTION_getCurrentAccount = 11;
        static final int TRANSACTION_onCheckServerAuthorization = 3;
        static final int TRANSACTION_onUploadServerAuthCode = 4;
        static final int TRANSACTION_recordConsent = 10;
        static final int TRANSACTION_recordConsentByConsentResult = 14;
        static final int TRANSACTION_resolveAccount = 5;
        static final int TRANSACTION_saveAccountToSessionStore = 8;
        static final int TRANSACTION_saveDefaultAccountToSharedPref = 9;
        static final int TRANSACTION_setGamesHasBeenGreeted = 13;
        static final int TRANSACTION_signIn = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void authAccount(AuthAccountRequest authAccountRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, authAccountRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void clearAccountFromSessionStore(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void getCurrentAccount(ISignInCallbacks iSignInCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void onCheckServerAuthorization(CheckServerAuthResult checkServerAuthResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, checkServerAuthResult);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void onUploadServerAuthCode(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void recordConsent(RecordConsentRequest recordConsentRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, recordConsentRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void recordConsentByConsentResult(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, recordConsentByConsentResultRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void resolveAccount(ResolveAccountRequest resolveAccountRequest, IResolveAccountCallbacks iResolveAccountCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, resolveAccountRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iResolveAccountCallbacks);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void saveAccountToSessionStore(int i, Account account, ISignInCallbacks iSignInCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void saveDefaultAccountToSharedPref(IAccountAccessor iAccountAccessor, int i, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAccountAccessor);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void setGamesHasBeenGreeted(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInService
            public void signIn(SignInRequest signInRequest, ISignInCallbacks iSignInCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, signInRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.signin.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return iInterfaceQueryLocalInterface instanceof ISignInService ? (ISignInService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    AuthAccountRequest authAccountRequest = (AuthAccountRequest) sgh.a(parcel, AuthAccountRequest.CREATOR);
                    ISignInCallbacks iSignInCallbacksAsInterface = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    authAccount(authAccountRequest, iSignInCallbacksAsInterface);
                    break;
                case 3:
                    CheckServerAuthResult checkServerAuthResult = (CheckServerAuthResult) sgh.a(parcel, CheckServerAuthResult.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCheckServerAuthorization(checkServerAuthResult);
                    break;
                case 4:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    onUploadServerAuthCode(zG);
                    break;
                case 5:
                    ResolveAccountRequest resolveAccountRequest = (ResolveAccountRequest) sgh.a(parcel, ResolveAccountRequest.CREATOR);
                    IResolveAccountCallbacks iResolveAccountCallbacksAsInterface = IResolveAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    resolveAccount(resolveAccountRequest, iResolveAccountCallbacksAsInterface);
                    break;
                case 6:
                default:
                    return false;
                case 7:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    clearAccountFromSessionStore(i3);
                    break;
                case 8:
                    int i4 = parcel.readInt();
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    ISignInCallbacks iSignInCallbacksAsInterface2 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAccountToSessionStore(i4, account, iSignInCallbacksAsInterface2);
                    break;
                case 9:
                    IAccountAccessor iAccountAccessorAsInterface = IAccountAccessor.Stub.asInterface(parcel.readStrongBinder());
                    int i5 = parcel.readInt();
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    saveDefaultAccountToSharedPref(iAccountAccessorAsInterface, i5, zG2);
                    break;
                case 10:
                    RecordConsentRequest recordConsentRequest = (RecordConsentRequest) sgh.a(parcel, RecordConsentRequest.CREATOR);
                    ISignInCallbacks iSignInCallbacksAsInterface3 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    recordConsent(recordConsentRequest, iSignInCallbacksAsInterface3);
                    break;
                case 11:
                    ISignInCallbacks iSignInCallbacksAsInterface4 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCurrentAccount(iSignInCallbacksAsInterface4);
                    break;
                case 12:
                    SignInRequest signInRequest = (SignInRequest) sgh.a(parcel, SignInRequest.CREATOR);
                    ISignInCallbacks iSignInCallbacksAsInterface5 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    signIn(signInRequest, iSignInCallbacksAsInterface5);
                    break;
                case 13:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setGamesHasBeenGreeted(zG3);
                    break;
                case 14:
                    RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = (RecordConsentByConsentResultRequest) sgh.a(parcel, RecordConsentByConsentResultRequest.CREATOR);
                    ISignInCallbacks iSignInCallbacksAsInterface6 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    recordConsentByConsentResult(recordConsentByConsentResultRequest, iSignInCallbacksAsInterface6);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authAccount(AuthAccountRequest authAccountRequest, ISignInCallbacks iSignInCallbacks);

    void clearAccountFromSessionStore(int i);

    void getCurrentAccount(ISignInCallbacks iSignInCallbacks);

    void onCheckServerAuthorization(CheckServerAuthResult checkServerAuthResult);

    void onUploadServerAuthCode(boolean z);

    void recordConsent(RecordConsentRequest recordConsentRequest, ISignInCallbacks iSignInCallbacks);

    void recordConsentByConsentResult(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, ISignInCallbacks iSignInCallbacks);

    void resolveAccount(ResolveAccountRequest resolveAccountRequest, IResolveAccountCallbacks iResolveAccountCallbacks);

    void saveAccountToSessionStore(int i, Account account, ISignInCallbacks iSignInCallbacks);

    void saveDefaultAccountToSharedPref(IAccountAccessor iAccountAccessor, int i, boolean z);

    void setGamesHasBeenGreeted(boolean z);

    void signIn(SignInRequest signInRequest, ISignInCallbacks iSignInCallbacks);
}
