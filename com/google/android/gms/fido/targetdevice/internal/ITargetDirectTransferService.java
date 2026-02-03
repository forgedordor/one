package com.google.android.gms.fido.targetdevice.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITargetDirectTransferService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITargetDirectTransferService {
        static final int TRANSACTION_cancelDirectTransfer = 2;
        static final int TRANSACTION_startDirectTransfer = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITargetDirectTransferService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
            }

            @Override // com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService
            public void cancelDirectTransfer(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService
            public void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStartDirectTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
        }

        public static ITargetDirectTransferService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
            return iInterfaceQueryLocalInterface instanceof ITargetDirectTransferService ? (ITargetDirectTransferService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStartDirectTransferCallbacks iStartDirectTransferCallbacksAsInterface = IStartDirectTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) sgh.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                startDirectTransfer(iStartDirectTransferCallbacksAsInterface, publicKeyCredentialRequestOptions, parcelFileDescriptor, parcelFileDescriptor2, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                cancelDirectTransfer(iStatusCallbackAsInterface, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void cancelDirectTransfer(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ApiMetadata apiMetadata);
}
