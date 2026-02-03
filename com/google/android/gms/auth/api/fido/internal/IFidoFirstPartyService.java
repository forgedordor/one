package com.google.android.gms.auth.api.fido.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportRequest;
import com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback;
import com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFidoFirstPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFidoFirstPartyService {
        static final int TRANSACTION_getGooglePasskeyForExport = 4;
        static final int TRANSACTION_listWebauthnCredentialSpecifics = 3;
        static final int TRANSACTION_saveNewlyCreatedWebauthnCredentialSpecifics = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFidoFirstPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService
            public void getGooglePasskeyForExport(IGetGooglePasskeyForExportCallback iGetGooglePasskeyForExportCallback, GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetGooglePasskeyForExportCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, getGooglePasskeyForExportRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService
            public void listWebauthnCredentialSpecifics(IListWebauthnCredentialSpecificsCallback iListWebauthnCredentialSpecificsCallback, String str, Account account, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iListWebauthnCredentialSpecificsCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService
            public void saveNewlyCreatedWebauthnCredentialSpecifics(IStatusCallback iStatusCallback, String str, Account account, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
        }

        public static IFidoFirstPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IFidoFirstPartyService");
            return iInterfaceQueryLocalInterface instanceof IFidoFirstPartyService ? (IFidoFirstPartyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                Account account = (Account) sgh.a(parcel, Account.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                saveNewlyCreatedWebauthnCredentialSpecifics(iStatusCallbackAsInterface, string, account, bArrCreateByteArray, apiMetadata);
            } else if (i == 3) {
                IListWebauthnCredentialSpecificsCallback iListWebauthnCredentialSpecificsCallbackAsInterface = IListWebauthnCredentialSpecificsCallback.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                listWebauthnCredentialSpecifics(iListWebauthnCredentialSpecificsCallbackAsInterface, string2, account2, apiMetadata2);
            } else {
                if (i != 4) {
                    return false;
                }
                IGetGooglePasskeyForExportCallback iGetGooglePasskeyForExportCallbackAsInterface = IGetGooglePasskeyForExportCallback.Stub.asInterface(parcel.readStrongBinder());
                GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest = (GetGooglePasskeyForExportRequest) sgh.a(parcel, GetGooglePasskeyForExportRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getGooglePasskeyForExport(iGetGooglePasskeyForExportCallbackAsInterface, getGooglePasskeyForExportRequest, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getGooglePasskeyForExport(IGetGooglePasskeyForExportCallback iGetGooglePasskeyForExportCallback, GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest, ApiMetadata apiMetadata);

    void listWebauthnCredentialSpecifics(IListWebauthnCredentialSpecificsCallback iListWebauthnCredentialSpecificsCallback, String str, Account account, ApiMetadata apiMetadata);

    void saveNewlyCreatedWebauthnCredentialSpecifics(IStatusCallback iStatusCallback, String str, Account account, byte[] bArr, ApiMetadata apiMetadata);
}
