package com.google.android.gms.appdatasearch.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.esav;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILightweightAppDataSearch extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILightweightAppDataSearch {
        static final int TRANSACTION_getFileDescriptorAndDelete = 2;
        static final int TRANSACTION_getRecentContext = 5;
        static final int TRANSACTION_registerCompletionFilter = 6;
        static final int TRANSACTION_reportUsage = 1;
        static final int TRANSACTION_reportUserActions = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILightweightAppDataSearch {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void getFileDescriptorAndDelete(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void getRecentContext(GetRecentContextCall$Request getRecentContextCall$Request, ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getRecentContextCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void registerCompletionFilter(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void reportUsage(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, UsageInfo[] usageInfoArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(usageInfoArr, 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void reportUserActions(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, esav[] esavVarArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(esavVarArr, 0);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        }

        public static ILightweightAppDataSearch asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return iInterfaceQueryLocalInterface instanceof ILightweightAppDataSearch ? (ILightweightAppDataSearch) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacksAsInterface = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                UsageInfo[] usageInfoArr = (UsageInfo[]) parcel.createTypedArray(UsageInfo.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                reportUsage(iLightweightAppDataSearchCallbacksAsInterface, string, usageInfoArr, apiMetadata);
            } else if (i == 2) {
                ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacksAsInterface2 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getFileDescriptorAndDelete(iLightweightAppDataSearchCallbacksAsInterface2, apiMetadata2);
            } else if (i == 5) {
                GetRecentContextCall$Request getRecentContextCall$Request = (GetRecentContextCall$Request) sgh.a(parcel, GetRecentContextCall$Request.CREATOR);
                ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacksAsInterface3 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getRecentContext(getRecentContextCall$Request, iLightweightAppDataSearchCallbacksAsInterface3, apiMetadata3);
            } else if (i == 6) {
                ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacksAsInterface4 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                registerCompletionFilter(iLightweightAppDataSearchCallbacksAsInterface4, string2, string3, apiMetadata4);
            } else {
                if (i != 7) {
                    return false;
                }
                ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacksAsInterface5 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                esav[] esavVarArr = (esav[]) parcel.createTypedArray(esav.CREATOR);
                enforceNoDataAvail(parcel);
                reportUserActions(iLightweightAppDataSearchCallbacksAsInterface5, esavVarArr);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getFileDescriptorAndDelete(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata);

    void getRecentContext(GetRecentContextCall$Request getRecentContextCall$Request, ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata);

    void registerCompletionFilter(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void reportUsage(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, UsageInfo[] usageInfoArr, ApiMetadata apiMetadata);

    void reportUserActions(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, esav[] esavVarArr);
}
