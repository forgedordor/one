package com.google.android.gms.fido.sourcedevice.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.fido.sourcedevice.internal.IStartDirectTransferCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISourceDirectTransferService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISourceDirectTransferService {
        static final int TRANSACTION_startDirectTransfer = 1;
        static final int TRANSACTION_startDirectTransferService = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISourceDirectTransferService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
            }

            @Override // com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService
            public void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStartDirectTransferCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, sourceStartDirectTransferOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor2);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService
            public void startDirectTransferService(IStatusCallback iStatusCallback, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, sourceStartDirectTransferOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
        }

        public static ISourceDirectTransferService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
            return iInterfaceQueryLocalInterface instanceof ISourceDirectTransferService ? (ISourceDirectTransferService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStartDirectTransferCallbacks iStartDirectTransferCallbacksAsInterface = IStartDirectTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions = (SourceStartDirectTransferOptions) sgh.a(parcel, SourceStartDirectTransferOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                startDirectTransfer(iStartDirectTransferCallbacksAsInterface, sourceStartDirectTransferOptions, parcelFileDescriptor, parcelFileDescriptor2);
            } else {
                if (i != 2) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions2 = (SourceStartDirectTransferOptions) sgh.a(parcel, SourceStartDirectTransferOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor4 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                startDirectTransferService(iStatusCallbackAsInterface, sourceStartDirectTransferOptions2, parcelFileDescriptor3, parcelFileDescriptor4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);

    void startDirectTransferService(IStatusCallback iStatusCallback, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);
}
