package com.google.android.gms.search.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchAuthCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchAuthCallbacks {
        static final int TRANSACTION_onClearTokenComplete = 2;
        static final int TRANSACTION_onGoogleNowAuthReceived = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchAuthCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthCallbacks
            public void onClearTokenComplete(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthCallbacks
            public void onGoogleNowAuthReceived(Status status, GoogleNowAuthState googleNowAuthState) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleNowAuthState);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.internal.ISearchAuthCallbacks");
        }

        public static ISearchAuthCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
            return iInterfaceQueryLocalInterface instanceof ISearchAuthCallbacks ? (ISearchAuthCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                GoogleNowAuthState googleNowAuthState = (GoogleNowAuthState) sgh.a(parcel, GoogleNowAuthState.CREATOR);
                enforceNoDataAvail(parcel);
                onGoogleNowAuthReceived(status, googleNowAuthState);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onClearTokenComplete(status2);
            }
            return true;
        }
    }

    void onClearTokenComplete(Status status);

    void onGoogleNowAuthReceived(Status status, GoogleNowAuthState googleNowAuthState);
}
