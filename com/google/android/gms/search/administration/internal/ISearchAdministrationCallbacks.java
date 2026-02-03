package com.google.android.gms.search.administration.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchAdministrationCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchAdministrationCallbacks {
        static final int TRANSACTION_onClearDebugUiCacheResponse = 8;
        static final int TRANSACTION_onClearUsageReportDataResponse = 4;
        static final int TRANSACTION_onDiagnosticResponse = 3;
        static final int TRANSACTION_onGetAppIndexingPackageDetailsResponse = 6;
        static final int TRANSACTION_onGetAppIndexingPackagesResponse = 5;
        static final int TRANSACTION_onGetStorageStatsResponse = 2;
        static final int TRANSACTION_onRequestAppIndexingUpdateIndexResponse = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchAdministrationCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onClearDebugUiCacheResponse(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, clearDebugUiCacheCall$Response);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onClearUsageReportDataResponse(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onDiagnosticResponse(BundleResponse bundleResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundleResponse);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onGetAppIndexingPackageDetailsResponse(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getAppIndexingPackageDetailsCall$Response);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onGetAppIndexingPackagesResponse(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getAppIndexingPackagesCall$Response);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onGetStorageStatsResponse(GetStorageStatsCall$Response getStorageStatsCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getStorageStatsCall$Response);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks
            public void onRequestAppIndexingUpdateIndexResponse(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, requestAppIndexingUpdateIndexCall$Response);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
        }

        public static ISearchAdministrationCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
            return iInterfaceQueryLocalInterface instanceof ISearchAdministrationCallbacks ? (ISearchAdministrationCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetStorageStatsCall$Response getStorageStatsCall$Response = (GetStorageStatsCall$Response) sgh.a(parcel, GetStorageStatsCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetStorageStatsResponse(getStorageStatsCall$Response);
                    return true;
                case 3:
                    BundleResponse bundleResponse = (BundleResponse) sgh.a(parcel, BundleResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDiagnosticResponse(bundleResponse);
                    return true;
                case 4:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearUsageReportDataResponse(status);
                    return true;
                case 5:
                    GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response = (GetAppIndexingPackagesCall$Response) sgh.a(parcel, GetAppIndexingPackagesCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAppIndexingPackagesResponse(getAppIndexingPackagesCall$Response);
                    return true;
                case 6:
                    GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response = (GetAppIndexingPackageDetailsCall$Response) sgh.a(parcel, GetAppIndexingPackageDetailsCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAppIndexingPackageDetailsResponse(getAppIndexingPackageDetailsCall$Response);
                    return true;
                case 7:
                    RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response = (RequestAppIndexingUpdateIndexCall$Response) sgh.a(parcel, RequestAppIndexingUpdateIndexCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRequestAppIndexingUpdateIndexResponse(requestAppIndexingUpdateIndexCall$Response);
                    return true;
                case 8:
                    ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response = (ClearDebugUiCacheCall$Response) sgh.a(parcel, ClearDebugUiCacheCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearDebugUiCacheResponse(clearDebugUiCacheCall$Response);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onClearDebugUiCacheResponse(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response);

    void onClearUsageReportDataResponse(Status status);

    void onDiagnosticResponse(BundleResponse bundleResponse);

    void onGetAppIndexingPackageDetailsResponse(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response);

    void onGetAppIndexingPackagesResponse(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response);

    void onGetStorageStatsResponse(GetStorageStatsCall$Response getStorageStatsCall$Response);

    void onRequestAppIndexingUpdateIndexResponse(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response);
}
