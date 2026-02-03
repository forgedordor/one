package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.sgh;
import defpackage.slu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextEmbeddingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextEmbeddingService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_getTokenInfo = 5;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextEmbeddingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextEmbeddingService");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingService
            public ICancellationCallback getTokenInfo(slu sluVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sluVar);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingService
            public ICancellationCallback runCancellableInference(slu sluVar, ITextEmbeddingResultCallback iTextEmbeddingResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sluVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTextEmbeddingResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextEmbeddingService");
        }

        public static ITextEmbeddingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextEmbeddingService");
            return iInterfaceQueryLocalInterface instanceof ITextEmbeddingService ? (ITextEmbeddingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                slu sluVar = (slu) sgh.a(parcel, slu.CREATOR);
                ITextEmbeddingResultCallback iTextEmbeddingResultCallbackAsInterface = ITextEmbeddingResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sluVar, iTextEmbeddingResultCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInference);
                return true;
            }
            if (i == 3) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i == 4) {
                IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackPrepareInferenceEngine);
                return true;
            }
            if (i != 5) {
                return false;
            }
            slu sluVar2 = (slu) sgh.a(parcel, slu.CREATOR);
            boolean zG = sgh.g(parcel);
            ITokenizationCallback iTokenizationCallbackAsInterface = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback tokenInfo = getTokenInfo(sluVar2, zG, iTokenizationCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, tokenInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback getTokenInfo(slu sluVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(slu sluVar, ITextEmbeddingResultCallback iTextEmbeddingResultCallback);
}
