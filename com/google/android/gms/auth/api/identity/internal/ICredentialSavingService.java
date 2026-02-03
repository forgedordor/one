package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback;
import com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialSavingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialSavingService {
        static final int TRANSACTION_saveAccountLinkingToken = 1;
        static final int TRANSACTION_savePassword = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialSavingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialSavingService
            public void saveAccountLinkingToken(ISaveAccountLinkingTokenCallback iSaveAccountLinkingTokenCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSaveAccountLinkingTokenCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialSavingService
            public void savePassword(ISavePasswordCallback iSavePasswordCallback, SavePasswordRequest savePasswordRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSavePasswordCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, savePasswordRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        }

        public static ICredentialSavingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
            return iInterfaceQueryLocalInterface instanceof ICredentialSavingService ? (ICredentialSavingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ISaveAccountLinkingTokenCallback iSaveAccountLinkingTokenCallbackAsInterface = ISaveAccountLinkingTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) sgh.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                saveAccountLinkingToken(iSaveAccountLinkingTokenCallbackAsInterface, saveAccountLinkingTokenRequest, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                ISavePasswordCallback iSavePasswordCallbackAsInterface = ISavePasswordCallback.Stub.asInterface(parcel.readStrongBinder());
                SavePasswordRequest savePasswordRequest = (SavePasswordRequest) sgh.a(parcel, SavePasswordRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                savePassword(iSavePasswordCallbackAsInterface, savePasswordRequest, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void saveAccountLinkingToken(ISaveAccountLinkingTokenCallback iSaveAccountLinkingTokenCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, ApiMetadata apiMetadata);

    void savePassword(ISavePasswordCallback iSavePasswordCallback, SavePasswordRequest savePasswordRequest, ApiMetadata apiMetadata);
}
