package com.google.android.gms.auth.api.identity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.internal.IClearCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.IGetCredentialCallback;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialProviderService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialProviderService {
        static final int TRANSACTION_clearCredential = 3;
        static final int TRANSACTION_createCredential = 2;
        static final int TRANSACTION_getCredential = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialProviderService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialProviderService
            public void clearCredential(IClearCredentialCallback iClearCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearCredentialCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialProviderService
            public void createCredential(ICreateCredentialCallback iCreateCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCreateCredentialCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialProviderService
            public void getCredential(IGetCredentialCallback iGetCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetCredentialCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
        }

        public static ICredentialProviderService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
            return iInterfaceQueryLocalInterface instanceof ICredentialProviderService ? (ICredentialProviderService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IGetCredentialCallback iGetCredentialCallbackAsInterface = IGetCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                String string = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getCredential(iGetCredentialCallbackAsInterface, bundle, string, apiMetadata);
            } else if (i == 2) {
                ICreateCredentialCallback iCreateCredentialCallbackAsInterface = ICreateCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                String string2 = parcel.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                createCredential(iCreateCredentialCallbackAsInterface, bundle2, string2, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IClearCredentialCallback iClearCredentialCallbackAsInterface = IClearCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                String string3 = parcel.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                clearCredential(iClearCredentialCallbackAsInterface, bundle3, string3, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearCredential(IClearCredentialCallback iClearCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata);

    void createCredential(ICreateCredentialCallback iCreateCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata);

    void getCredential(IGetCredentialCallback iGetCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata);
}
