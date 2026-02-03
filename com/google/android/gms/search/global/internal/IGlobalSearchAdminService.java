package com.google.android.gms.search.global.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGlobalSearchAdminService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGlobalSearchAdminService {
        static final int TRANSACTION_getCurrentExperimentIds = 4;
        static final int TRANSACTION_getGlobalSearchSources = 2;
        static final int TRANSACTION_getPendingExperimentIds = 5;
        static final int TRANSACTION_setExperimentIds = 3;
        static final int TRANSACTION_setIncludeInGlobalSearch = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGlobalSearchAdminService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getCurrentExperimentIds(GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCurrentExperimentIdsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getGlobalSearchSources(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getGlobalSearchSourcesCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getPendingExperimentIds(GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getPendingExperimentIdsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void setExperimentIds(SetExperimentIdsCall$Request setExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setExperimentIdsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void setIncludeInGlobalSearch(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setIncludeInGlobalSearchCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
        }

        public static IGlobalSearchAdminService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
            return iInterfaceQueryLocalInterface instanceof IGlobalSearchAdminService ? (IGlobalSearchAdminService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request = (GetGlobalSearchSourcesCall$Request) sgh.a(parcel, GetGlobalSearchSourcesCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacksAsInterface = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getGlobalSearchSources(getGlobalSearchSourcesCall$Request, iGlobalSearchAdminCallbacksAsInterface, apiMetadata);
            } else if (i == 3) {
                SetExperimentIdsCall$Request setExperimentIdsCall$Request = (SetExperimentIdsCall$Request) sgh.a(parcel, SetExperimentIdsCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacksAsInterface2 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setExperimentIds(setExperimentIdsCall$Request, iGlobalSearchAdminCallbacksAsInterface2, apiMetadata2);
            } else if (i == 4) {
                GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request = (GetCurrentExperimentIdsCall$Request) sgh.a(parcel, GetCurrentExperimentIdsCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacksAsInterface3 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getCurrentExperimentIds(getCurrentExperimentIdsCall$Request, iGlobalSearchAdminCallbacksAsInterface3, apiMetadata3);
            } else if (i == 5) {
                GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request = (GetPendingExperimentIdsCall$Request) sgh.a(parcel, GetPendingExperimentIdsCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacksAsInterface4 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getPendingExperimentIds(getPendingExperimentIdsCall$Request, iGlobalSearchAdminCallbacksAsInterface4, apiMetadata4);
            } else {
                if (i != 8) {
                    return false;
                }
                SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = (SetIncludeInGlobalSearchCall$Request) sgh.a(parcel, SetIncludeInGlobalSearchCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacksAsInterface5 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setIncludeInGlobalSearch(setIncludeInGlobalSearchCall$Request, iGlobalSearchAdminCallbacksAsInterface5, apiMetadata5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getCurrentExperimentIds(GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void getGlobalSearchSources(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void getPendingExperimentIds(GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void setExperimentIds(SetExperimentIdsCall$Request setExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void setIncludeInGlobalSearch(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);
}
