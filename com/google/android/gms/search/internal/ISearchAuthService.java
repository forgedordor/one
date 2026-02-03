package com.google.android.gms.search.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.internal.ISearchAuthCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchAuthService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getGoogleNowAuth = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.internal.ISearchAuthService");
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthService
            public void clearToken(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAuthCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthService
            public void getGoogleNowAuth(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchAuthCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.internal.ISearchAuthService");
        }

        public static ISearchAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            return iInterfaceQueryLocalInterface instanceof ISearchAuthService ? (ISearchAuthService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ISearchAuthCallbacks iSearchAuthCallbacksAsInterface = ISearchAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getGoogleNowAuth(iSearchAuthCallbacksAsInterface, string, string2, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                ISearchAuthCallbacks iSearchAuthCallbacksAsInterface2 = ISearchAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                clearToken(iSearchAuthCallbacksAsInterface2, string3, string4, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void getGoogleNowAuth(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata);
}
