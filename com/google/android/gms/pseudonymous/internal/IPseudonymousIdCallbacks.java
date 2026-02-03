package com.google.android.gms.pseudonymous.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPseudonymousIdCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPseudonymousIdCallbacks {
        static final int TRANSACTION_onGetLastResetWallTimeMs = 3;
        static final int TRANSACTION_onSessionZwiebackTokensRetrieved = 4;
        static final int TRANSACTION_onSetSessionZwiebackTokens = 5;
        static final int TRANSACTION_onSetToken = 2;
        static final int TRANSACTION_onTokenRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPseudonymousIdCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onGetLastResetWallTimeMs(Status status, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSetSessionZwiebackTokens(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSetToken(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, pseudonymousIdToken);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
        }

        public static IPseudonymousIdCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
            return iInterfaceQueryLocalInterface instanceof IPseudonymousIdCallbacks ? (IPseudonymousIdCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) sgh.a(parcel, PseudonymousIdToken.CREATOR);
                enforceNoDataAvail(parcel);
                onTokenRetrieved(status, pseudonymousIdToken);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onSetToken(status2);
            } else if (i == 3) {
                Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                enforceNoDataAvail(parcel);
                onGetLastResetWallTimeMs(status3, j);
            } else if (i == 4) {
                Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                enforceNoDataAvail(parcel);
                onSessionZwiebackTokensRetrieved(status4, arrayListCreateTypedArrayList);
            } else {
                if (i != 5) {
                    return false;
                }
                Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onSetSessionZwiebackTokens(status5);
            }
            return true;
        }
    }

    void onGetLastResetWallTimeMs(Status status, long j);

    void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list);

    void onSetSessionZwiebackTokens(Status status);

    void onSetToken(Status status);

    void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken);
}
