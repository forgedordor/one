package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISummarizationResultCallback;
import com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.sgh;
import defpackage.sla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISummarizationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISummarizationService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_getTokenCount = 7;
        static final int TRANSACTION_getTokenInfo = 8;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISummarizationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISummarizationService");
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback getTokenInfo(sla slaVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slaVar);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback runCancellableInference(sla slaVar, ISummarizationResultCallback iSummarizationResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slaVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSummarizationResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback runCancellableInferenceWithInfo(sla slaVar, ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slaVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSummarizationResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public void runInference(sla slaVar, ISummarizationResultCallback iSummarizationResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slaVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSummarizationResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISummarizationService");
        }

        public static ISummarizationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationService");
            return iInterfaceQueryLocalInterface instanceof ISummarizationService ? (ISummarizationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    sla slaVar = (sla) sgh.a(parcel, sla.CREATOR);
                    ISummarizationResultCallback iSummarizationResultCallbackAsInterface = ISummarizationResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    runInference(slaVar, iSummarizationResultCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    sla slaVar2 = (sla) sgh.a(parcel, sla.CREATOR);
                    ISummarizationResultCallback iSummarizationResultCallbackAsInterface2 = ISummarizationResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(slaVar2, iSummarizationResultCallbackAsInterface2);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancellationCallbackRunCancellableInference);
                    return true;
                case 4:
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                    return true;
                case 5:
                    IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancellationCallbackPrepareInferenceEngine);
                    return true;
                case 6:
                    sla slaVar3 = (sla) sgh.a(parcel, sla.CREATOR);
                    ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallbackAsInterface = ISummarizationResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(slaVar3, iSummarizationResultWithInfoCallbackAsInterface);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                    return true;
                case 7:
                    String string = parcel.readString();
                    ITokenizationCallback iTokenizationCallbackAsInterface = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenCount = getTokenCount(string, iTokenizationCallbackAsInterface);
                    parcel2.writeNoException();
                    sgh.f(parcel2, tokenCount);
                    return true;
                case 8:
                    sla slaVar4 = (sla) sgh.a(parcel, sla.CREATOR);
                    boolean zG = sgh.g(parcel);
                    ITokenizationCallback iTokenizationCallbackAsInterface2 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenInfo = getTokenInfo(slaVar4, zG, iTokenizationCallbackAsInterface2);
                    parcel2.writeNoException();
                    sgh.f(parcel2, tokenInfo);
                    return true;
                default:
                    return false;
            }
        }
    }

    int getApiVersion();

    @Deprecated
    ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback getTokenInfo(sla slaVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(sla slaVar, ISummarizationResultCallback iSummarizationResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(sla slaVar, ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallback);

    @Deprecated
    void runInference(sla slaVar, ISummarizationResultCallback iSummarizationResultCallback);
}
