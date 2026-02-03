package com.google.android.gms.pseudonymous.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPseudonymousIdService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPseudonymousIdService {
        static final int TRANSACTION_getLastResetWallTimeMs = 3;
        static final int TRANSACTION_getSessionZwiebackTokens = 4;
        static final int TRANSACTION_getToken = 1;
        static final int TRANSACTION_setSessionZwiebackTokens = 5;
        static final int TRANSACTION_setToken = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPseudonymousIdService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getLastResetWallTimeMs(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<String> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void setSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<SessionZwiebackToken> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void setToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, PseudonymousIdToken pseudonymousIdToken, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, pseudonymousIdToken);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        }

        public static IPseudonymousIdService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
            return iInterfaceQueryLocalInterface instanceof IPseudonymousIdService ? (IPseudonymousIdService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IPseudonymousIdCallbacks iPseudonymousIdCallbacksAsInterface = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getToken(iPseudonymousIdCallbacksAsInterface, apiMetadata);
            } else if (i == 2) {
                IPseudonymousIdCallbacks iPseudonymousIdCallbacksAsInterface2 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) sgh.a(parcel, PseudonymousIdToken.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setToken(iPseudonymousIdCallbacksAsInterface2, pseudonymousIdToken, apiMetadata2);
            } else if (i == 3) {
                IPseudonymousIdCallbacks iPseudonymousIdCallbacksAsInterface3 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getLastResetWallTimeMs(iPseudonymousIdCallbacksAsInterface3, apiMetadata3);
            } else if (i == 4) {
                IPseudonymousIdCallbacks iPseudonymousIdCallbacksAsInterface4 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSessionZwiebackTokens(iPseudonymousIdCallbacksAsInterface4, arrayListCreateStringArrayList, apiMetadata4);
            } else {
                if (i != 5) {
                    return false;
                }
                IPseudonymousIdCallbacks iPseudonymousIdCallbacksAsInterface5 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setSessionZwiebackTokens(iPseudonymousIdCallbacksAsInterface5, arrayListCreateTypedArrayList, apiMetadata5);
            }
            return true;
        }
    }

    @Deprecated
    void getLastResetWallTimeMs(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata);

    void getSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<String> list, ApiMetadata apiMetadata);

    void getToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata);

    void setSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<SessionZwiebackToken> list, ApiMetadata apiMetadata);

    void setToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, PseudonymousIdToken pseudonymousIdToken, ApiMetadata apiMetadata);
}
