package com.google.android.gms.auth.aang.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.aang.FetchAppRestrictionRequest;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.HasCapabilitiesRequest;
import com.google.android.gms.auth.aang.ReauthRequest;
import com.google.android.gms.auth.aang.SyncAccountStateRequest;
import com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleAuthAangService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleAuthAangService {
        static final int TRANSACTION_clearToken = 3;
        static final int TRANSACTION_fetchAppRestriction = 5;
        static final int TRANSACTION_getAccounts = 1;
        static final int TRANSACTION_getToken = 2;
        static final int TRANSACTION_hasCapabilities = 4;
        static final int TRANSACTION_reauthenticateAccount = 7;
        static final int TRANSACTION_syncAccountState = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleAuthAangService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void clearToken(IStatusCallback iStatusCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void fetchAppRestriction(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, FetchAppRestrictionRequest fetchAppRestrictionRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleAuthAangCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, fetchAppRestrictionRequest);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void getAccounts(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, GetAccountsRequest getAccountsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleAuthAangCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getAccountsRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void getToken(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, GetTokenRequest getTokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleAuthAangCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getTokenRequest);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void hasCapabilities(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, HasCapabilitiesRequest hasCapabilitiesRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleAuthAangCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, hasCapabilitiesRequest);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void reauthenticateAccount(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, ReauthRequest reauthRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleAuthAangCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, reauthRequest);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangService
            public void syncAccountState(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, SyncAccountStateRequest syncAccountStateRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleAuthAangCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, syncAccountStateRequest);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        }

        public static IGoogleAuthAangService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
            return iInterfaceQueryLocalInterface instanceof IGoogleAuthAangService ? (IGoogleAuthAangService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IGoogleAuthAangCallbacks iGoogleAuthAangCallbacksAsInterface = IGoogleAuthAangCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetAccountsRequest getAccountsRequest = (GetAccountsRequest) sgh.a(parcel, GetAccountsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccounts(iGoogleAuthAangCallbacksAsInterface, getAccountsRequest);
                    break;
                case 2:
                    IGoogleAuthAangCallbacks iGoogleAuthAangCallbacksAsInterface2 = IGoogleAuthAangCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetTokenRequest getTokenRequest = (GetTokenRequest) sgh.a(parcel, GetTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getToken(iGoogleAuthAangCallbacksAsInterface2, getTokenRequest);
                    break;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    clearToken(iStatusCallbackAsInterface, string);
                    break;
                case 4:
                    IGoogleAuthAangCallbacks iGoogleAuthAangCallbacksAsInterface3 = IGoogleAuthAangCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    HasCapabilitiesRequest hasCapabilitiesRequest = (HasCapabilitiesRequest) sgh.a(parcel, HasCapabilitiesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasCapabilities(iGoogleAuthAangCallbacksAsInterface3, hasCapabilitiesRequest);
                    break;
                case 5:
                    IGoogleAuthAangCallbacks iGoogleAuthAangCallbacksAsInterface4 = IGoogleAuthAangCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    FetchAppRestrictionRequest fetchAppRestrictionRequest = (FetchAppRestrictionRequest) sgh.a(parcel, FetchAppRestrictionRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAppRestriction(iGoogleAuthAangCallbacksAsInterface4, fetchAppRestrictionRequest);
                    break;
                case 6:
                    IGoogleAuthAangCallbacks iGoogleAuthAangCallbacksAsInterface5 = IGoogleAuthAangCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    SyncAccountStateRequest syncAccountStateRequest = (SyncAccountStateRequest) sgh.a(parcel, SyncAccountStateRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    syncAccountState(iGoogleAuthAangCallbacksAsInterface5, syncAccountStateRequest);
                    break;
                case 7:
                    IGoogleAuthAangCallbacks iGoogleAuthAangCallbacksAsInterface6 = IGoogleAuthAangCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ReauthRequest reauthRequest = (ReauthRequest) sgh.a(parcel, ReauthRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    reauthenticateAccount(iGoogleAuthAangCallbacksAsInterface6, reauthRequest);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(IStatusCallback iStatusCallback, String str);

    void fetchAppRestriction(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, FetchAppRestrictionRequest fetchAppRestrictionRequest);

    void getAccounts(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, GetAccountsRequest getAccountsRequest);

    void getToken(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, GetTokenRequest getTokenRequest);

    void hasCapabilities(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, HasCapabilitiesRequest hasCapabilitiesRequest);

    void reauthenticateAccount(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, ReauthRequest reauthRequest);

    void syncAccountState(IGoogleAuthAangCallbacks iGoogleAuthAangCallbacks, SyncAccountStateRequest syncAccountStateRequest);
}
