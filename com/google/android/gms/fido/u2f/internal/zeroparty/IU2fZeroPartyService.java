package com.google.android.gms.fido.u2f.internal.zeroparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.u2f.api.IRegisterResponseHandler;
import com.google.android.gms.fido.u2f.api.ISignResponseHandler;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IU2fZeroPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IU2fZeroPartyService {
        static final int TRANSACTION_headlessRegister = 2;
        static final int TRANSACTION_headlessSign = 1;
        static final int TRANSACTION_updateTransaction = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IU2fZeroPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void headlessRegister(IStatusCallback iStatusCallback, BrowserRegisterRequestParams browserRegisterRequestParams, IRegisterResponseHandler iRegisterResponseHandler, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserRegisterRequestParams);
                sgh.f(parcelObtainAndWriteInterfaceToken, iRegisterResponseHandler);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void headlessSign(IStatusCallback iStatusCallback, BrowserSignRequestParams browserSignRequestParams, ISignResponseHandler iSignResponseHandler, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserSignRequestParams);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignResponseHandler);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void updateTransaction(IStatusCallback iStatusCallback, StateUpdate stateUpdate, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, stateUpdate);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        }

        public static IU2fZeroPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            return iInterfaceQueryLocalInterface instanceof IU2fZeroPartyService ? (IU2fZeroPartyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) sgh.a(parcel, BrowserSignRequestParams.CREATOR);
                ISignResponseHandler iSignResponseHandlerAsInterface = ISignResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                headlessSign(iStatusCallbackAsInterface, browserSignRequestParams, iSignResponseHandlerAsInterface, apiMetadata);
            } else if (i == 2) {
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) sgh.a(parcel, BrowserRegisterRequestParams.CREATOR);
                IRegisterResponseHandler iRegisterResponseHandlerAsInterface = IRegisterResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                headlessRegister(iStatusCallbackAsInterface2, browserRegisterRequestParams, iRegisterResponseHandlerAsInterface, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                StateUpdate stateUpdate = (StateUpdate) sgh.a(parcel, StateUpdate.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                updateTransaction(iStatusCallbackAsInterface3, stateUpdate, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void headlessRegister(IStatusCallback iStatusCallback, BrowserRegisterRequestParams browserRegisterRequestParams, IRegisterResponseHandler iRegisterResponseHandler, ApiMetadata apiMetadata);

    void headlessSign(IStatusCallback iStatusCallback, BrowserSignRequestParams browserSignRequestParams, ISignResponseHandler iSignResponseHandler, ApiMetadata apiMetadata);

    void updateTransaction(IStatusCallback iStatusCallback, StateUpdate stateUpdate, ApiMetadata apiMetadata);
}
