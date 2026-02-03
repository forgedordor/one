package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.IProofreadingResultCallback;
import defpackage.sgh;
import defpackage.sjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IProofreadingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProofreadingService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProofreadingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IProofreadingService");
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public ICancellationCallback runCancellableInference(sjk sjkVar, IProofreadingResultCallback iProofreadingResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjkVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iProofreadingResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingService
            public void runInference(sjk sjkVar, IProofreadingResultCallback iProofreadingResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjkVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iProofreadingResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IProofreadingService");
        }

        public static IProofreadingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IProofreadingService");
            return iInterfaceQueryLocalInterface instanceof IProofreadingService ? (IProofreadingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sjk sjkVar = (sjk) sgh.a(parcel, sjk.CREATOR);
                IProofreadingResultCallback iProofreadingResultCallbackAsInterface = IProofreadingResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInference(sjkVar, iProofreadingResultCallbackAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                sjk sjkVar2 = (sjk) sgh.a(parcel, sjk.CREATOR);
                IProofreadingResultCallback iProofreadingResultCallbackAsInterface2 = IProofreadingResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sjkVar2, iProofreadingResultCallbackAsInterface2);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInference);
                return true;
            }
            if (i == 4) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i != 5) {
                return false;
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

    ICancellationCallback runCancellableInference(sjk sjkVar, IProofreadingResultCallback iProofreadingResultCallback);

    @Deprecated
    void runInference(sjk sjkVar, IProofreadingResultCallback iProofreadingResultCallback);
}
