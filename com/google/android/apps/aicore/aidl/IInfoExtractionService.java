package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.sgh;
import defpackage.sie;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IInfoExtractionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInfoExtractionService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInfoExtractionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IInfoExtractionService");
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionService
            public ICancellationCallback runCancellableInferenceWithInfo(sie sieVar, IInfoExtractionResultWithInfoCallback iInfoExtractionResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sieVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iInfoExtractionResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IInfoExtractionService");
        }

        public static IInfoExtractionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IInfoExtractionService");
            return iInterfaceQueryLocalInterface instanceof IInfoExtractionService ? (IInfoExtractionService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sie sieVar = (sie) sgh.a(parcel, sie.CREATOR);
                IInfoExtractionResultWithInfoCallback iInfoExtractionResultWithInfoCallbackAsInterface = IInfoExtractionResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(sieVar, iInfoExtractionResultWithInfoCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, iCancellationCallbackPrepareInferenceEngine);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInferenceWithInfo(sie sieVar, IInfoExtractionResultWithInfoCallback iInfoExtractionResultWithInfoCallback);
}
