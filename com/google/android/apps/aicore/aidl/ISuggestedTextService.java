package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.sgh;
import defpackage.sks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISuggestedTextService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISuggestedTextService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_getTokenInfo = 6;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISuggestedTextService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISuggestedTextService");
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback getTokenInfo(sks sksVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sksVar);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback runCancellableInference(sks sksVar, ISuggestedTextResultCallback iSuggestedTextResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sksVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSuggestedTextResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback runCancellableInferenceWithInfo(sks sksVar, ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sksVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSuggestedTextResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISuggestedTextService");
        }

        public static ISuggestedTextService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISuggestedTextService");
            return iInterfaceQueryLocalInterface instanceof ISuggestedTextService ? (ISuggestedTextService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sks sksVar = (sks) sgh.a(parcel, sks.CREATOR);
                ISuggestedTextResultCallback iSuggestedTextResultCallbackAsInterface = ISuggestedTextResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sksVar, iSuggestedTextResultCallbackAsInterface);
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
            if (i == 5) {
                sks sksVar2 = (sks) sgh.a(parcel, sks.CREATOR);
                ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallbackAsInterface = ISuggestedTextResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(sksVar2, iSuggestedTextResultWithInfoCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                return true;
            }
            if (i != 6) {
                return false;
            }
            sks sksVar3 = (sks) sgh.a(parcel, sks.CREATOR);
            boolean zG = sgh.g(parcel);
            ITokenizationCallback iTokenizationCallbackAsInterface = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback tokenInfo = getTokenInfo(sksVar3, zG, iTokenizationCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, tokenInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback getTokenInfo(sks sksVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(sks sksVar, ISuggestedTextResultCallback iSuggestedTextResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(sks sksVar, ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallback);
}
