package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ILLMResultCallback;
import com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.sgh;
import defpackage.sio;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILLMService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILLMService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILLMService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ILLMService");
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback runCancellableInference(sio sioVar, ILLMResultCallback iLLMResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sioVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLLMResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback runCancellableInferenceWithInfo(sio sioVar, ILLMResultWithInfoCallback iLLMResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sioVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLLMResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public void runInference(sio sioVar, ILLMResultCallback iLLMResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sioVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLLMResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ILLMService");
        }

        public static ILLMService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMService");
            return iInterfaceQueryLocalInterface instanceof ILLMService ? (ILLMService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sio sioVar = (sio) sgh.a(parcel, sio.CREATOR);
                ILLMResultCallback iLLMResultCallbackAsInterface = ILLMResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInference(sioVar, iLLMResultCallbackAsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                sio sioVar2 = (sio) sgh.a(parcel, sio.CREATOR);
                ILLMResultCallback iLLMResultCallbackAsInterface2 = ILLMResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sioVar2, iLLMResultCallbackAsInterface2);
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
            if (i == 5) {
                IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackPrepareInferenceEngine);
                return true;
            }
            if (i != 6) {
                return false;
            }
            sio sioVar3 = (sio) sgh.a(parcel, sio.CREATOR);
            ILLMResultWithInfoCallback iLLMResultWithInfoCallbackAsInterface = ILLMResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(sioVar3, iLLMResultWithInfoCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(sio sioVar, ILLMResultCallback iLLMResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(sio sioVar, ILLMResultWithInfoCallback iLLMResultWithInfoCallback);

    @Deprecated
    void runInference(sio sioVar, ILLMResultCallback iLLMResultCallback);
}
