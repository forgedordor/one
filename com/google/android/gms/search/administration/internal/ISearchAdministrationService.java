package com.google.android.gms.search.administration.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;
import com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchAdministrationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchAdministrationService {
        static final int TRANSACTION_clearDebugUiCache = 8;
        static final int TRANSACTION_clearUsageReportData = 4;
        static final int TRANSACTION_diagnostic = 3;
        static final int TRANSACTION_getAppIndexingPackageDetails = 6;
        static final int TRANSACTION_getAppIndexingPackages = 5;
        static final int TRANSACTION_getStorageStats = 2;
        static final int TRANSACTION_requestAppIndexingUpdateIndex = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchAdministrationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationService");
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void clearDebugUiCache(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, clearDebugUiCacheCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void clearUsageReportData(ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void diagnostic(Bundle bundle, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getAppIndexingPackageDetails(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getAppIndexingPackageDetailsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getAppIndexingPackages(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getAppIndexingPackagesCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getStorageStats(GetStorageStatsCall$Request getStorageStatsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getStorageStatsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void requestAppIndexingUpdateIndex(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, requestAppIndexingUpdateIndexCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
        }

        public static ISearchAdministrationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
            return iInterfaceQueryLocalInterface instanceof ISearchAdministrationService ? (ISearchAdministrationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetStorageStatsCall$Request getStorageStatsCall$Request = (GetStorageStatsCall$Request) sgh.a(parcel, GetStorageStatsCall$Request.CREATOR);
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getStorageStats(getStorageStatsCall$Request, iSearchAdministrationCallbacksAsInterface, apiMetadata);
                    break;
                case 3:
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface2 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    diagnostic(bundle, iSearchAdministrationCallbacksAsInterface2, apiMetadata2);
                    break;
                case 4:
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface3 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearUsageReportData(iSearchAdministrationCallbacksAsInterface3, apiMetadata3);
                    break;
                case 5:
                    GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request = (GetAppIndexingPackagesCall$Request) sgh.a(parcel, GetAppIndexingPackagesCall$Request.CREATOR);
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface4 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAppIndexingPackages(getAppIndexingPackagesCall$Request, iSearchAdministrationCallbacksAsInterface4, apiMetadata4);
                    break;
                case 6:
                    GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request = (GetAppIndexingPackageDetailsCall$Request) sgh.a(parcel, GetAppIndexingPackageDetailsCall$Request.CREATOR);
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface5 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAppIndexingPackageDetails(getAppIndexingPackageDetailsCall$Request, iSearchAdministrationCallbacksAsInterface5, apiMetadata5);
                    break;
                case 7:
                    RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request = (RequestAppIndexingUpdateIndexCall$Request) sgh.a(parcel, RequestAppIndexingUpdateIndexCall$Request.CREATOR);
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface6 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestAppIndexingUpdateIndex(requestAppIndexingUpdateIndexCall$Request, iSearchAdministrationCallbacksAsInterface6, apiMetadata6);
                    break;
                case 8:
                    ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request = (ClearDebugUiCacheCall$Request) sgh.a(parcel, ClearDebugUiCacheCall$Request.CREATOR);
                    ISearchAdministrationCallbacks iSearchAdministrationCallbacksAsInterface7 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearDebugUiCache(clearDebugUiCacheCall$Request, iSearchAdministrationCallbacksAsInterface7, apiMetadata7);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearDebugUiCache(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void clearUsageReportData(ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void diagnostic(Bundle bundle, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void getAppIndexingPackageDetails(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void getAppIndexingPackages(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void getStorageStats(GetStorageStatsCall$Request getStorageStatsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void requestAppIndexingUpdateIndex(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);
}
