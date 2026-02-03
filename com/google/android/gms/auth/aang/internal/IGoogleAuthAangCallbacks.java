package com.google.android.gms.auth.aang.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.aang.AppRestriction;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleAuthAangCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleAuthAangCallbacks {
        static final int TRANSACTION_onFetchAppRestriction = 4;
        static final int TRANSACTION_onGetAccounts = 1;
        static final int TRANSACTION_onGetToken = 2;
        static final int TRANSACTION_onHasCapabilities = 3;
        static final int TRANSACTION_onReauthenticateAccount = 6;
        static final int TRANSACTION_onSyncAccountState = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleAuthAangCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
            public void onFetchAppRestriction(Status status, AppRestriction appRestriction) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, appRestriction);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
            public void onGetAccounts(Status status, GetAccountsResponse getAccountsResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getAccountsResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
            public void onGetToken(Status status, GetTokenResponse getTokenResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getTokenResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
            public void onHasCapabilities(Status status, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
            public void onReauthenticateAccount(Status status, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
            public void onSyncAccountState(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
        }

        public static IGoogleAuthAangCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGoogleAuthAangCallbacks ? (IGoogleAuthAangCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    GetAccountsResponse getAccountsResponse = (GetAccountsResponse) sgh.a(parcel, GetAccountsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAccounts(status, getAccountsResponse);
                    return true;
                case 2:
                    Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                    GetTokenResponse getTokenResponse = (GetTokenResponse) sgh.a(parcel, GetTokenResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetToken(status2, getTokenResponse);
                    return true;
                case 3:
                    Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onHasCapabilities(status3, i3);
                    return true;
                case 4:
                    Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                    AppRestriction appRestriction = (AppRestriction) sgh.a(parcel, AppRestriction.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFetchAppRestriction(status4, appRestriction);
                    return true;
                case 5:
                    Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSyncAccountState(status5);
                    return true;
                case 6:
                    Status status6 = (Status) sgh.a(parcel, Status.CREATOR);
                    PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onReauthenticateAccount(status6, pendingIntent);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onFetchAppRestriction(Status status, AppRestriction appRestriction);

    void onGetAccounts(Status status, GetAccountsResponse getAccountsResponse);

    void onGetToken(Status status, GetTokenResponse getTokenResponse);

    void onHasCapabilities(Status status, int i);

    void onReauthenticateAccount(Status status, PendingIntent pendingIntent);

    void onSyncAccountState(Status status);
}
