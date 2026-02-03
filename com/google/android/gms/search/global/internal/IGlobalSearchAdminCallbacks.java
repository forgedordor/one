package com.google.android.gms.search.global.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGlobalSearchAdminCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGlobalSearchAdminCallbacks {
        static final int TRANSACTION_onGetCurrentExperimentIdsResponse = 4;
        static final int TRANSACTION_onGetGlobalSearchSourcesResponse = 2;
        static final int TRANSACTION_onGetPendingExperimentIdsResponse = 5;
        static final int TRANSACTION_onSetExperimentIdsResponse = 3;
        static final int TRANSACTION_onSetIncludeInGlobalSearchResponse = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGlobalSearchAdminCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
            public void onGetCurrentExperimentIdsResponse(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCurrentExperimentIdsCall$Response);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
            public void onGetGlobalSearchSourcesResponse(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getGlobalSearchSourcesCall$Response);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
            public void onGetPendingExperimentIdsResponse(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getPendingExperimentIdsCall$Response);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
            public void onSetExperimentIdsResponse(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setExperimentIdsCall$Response);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
            public void onSetIncludeInGlobalSearchResponse(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setIncludeInGlobalSearchCall$Response);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
        }

        public static IGlobalSearchAdminCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGlobalSearchAdminCallbacks ? (IGlobalSearchAdminCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = (GetGlobalSearchSourcesCall$Response) sgh.a(parcel, GetGlobalSearchSourcesCall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onGetGlobalSearchSourcesResponse(getGlobalSearchSourcesCall$Response);
                return true;
            }
            if (i == 3) {
                SetExperimentIdsCall$Response setExperimentIdsCall$Response = (SetExperimentIdsCall$Response) sgh.a(parcel, SetExperimentIdsCall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onSetExperimentIdsResponse(setExperimentIdsCall$Response);
                return true;
            }
            if (i == 4) {
                GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response = (GetCurrentExperimentIdsCall$Response) sgh.a(parcel, GetCurrentExperimentIdsCall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onGetCurrentExperimentIdsResponse(getCurrentExperimentIdsCall$Response);
                return true;
            }
            if (i == 5) {
                GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response = (GetPendingExperimentIdsCall$Response) sgh.a(parcel, GetPendingExperimentIdsCall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onGetPendingExperimentIdsResponse(getPendingExperimentIdsCall$Response);
                return true;
            }
            if (i != 8) {
                return false;
            }
            SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response = (SetIncludeInGlobalSearchCall$Response) sgh.a(parcel, SetIncludeInGlobalSearchCall$Response.CREATOR);
            enforceNoDataAvail(parcel);
            onSetIncludeInGlobalSearchResponse(setIncludeInGlobalSearchCall$Response);
            return true;
        }
    }

    void onGetCurrentExperimentIdsResponse(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response);

    void onGetGlobalSearchSourcesResponse(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response);

    void onGetPendingExperimentIdsResponse(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response);

    void onSetExperimentIdsResponse(SetExperimentIdsCall$Response setExperimentIdsCall$Response);

    void onSetIncludeInGlobalSearchResponse(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response);
}
