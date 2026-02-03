package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyResultCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.sgh;
import defpackage.skg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISmartReplyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmartReplyService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_getTokenCount = 7;
        static final int TRANSACTION_getTokenInfo = 8;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmartReplyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISmartReplyService");
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback getTokenInfo(skg skgVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skgVar);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback runCancellableInference(skg skgVar, ISmartReplyResultCallback iSmartReplyResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skgVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSmartReplyResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback runCancellableInferenceWithInfo(skg skgVar, ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skgVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSmartReplyResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public void runInference(skg skgVar, ISmartReplyResultCallback iSmartReplyResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skgVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSmartReplyResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISmartReplyService");
        }

        public static ISmartReplyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISmartReplyService");
            return iInterfaceQueryLocalInterface instanceof ISmartReplyService ? (ISmartReplyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    skg skgVar = (skg) sgh.a(parcel, skg.CREATOR);
                    ISmartReplyResultCallback iSmartReplyResultCallbackAsInterface = ISmartReplyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    runInference(skgVar, iSmartReplyResultCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    skg skgVar2 = (skg) sgh.a(parcel, skg.CREATOR);
                    ISmartReplyResultCallback iSmartReplyResultCallbackAsInterface2 = ISmartReplyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(skgVar2, iSmartReplyResultCallbackAsInterface2);
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
                    skg skgVar3 = (skg) sgh.a(parcel, skg.CREATOR);
                    ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallbackAsInterface = ISmartReplyResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(skgVar3, iSmartReplyResultWithInfoCallbackAsInterface);
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
                    skg skgVar4 = (skg) sgh.a(parcel, skg.CREATOR);
                    boolean zG = sgh.g(parcel);
                    ITokenizationCallback iTokenizationCallbackAsInterface2 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenInfo = getTokenInfo(skgVar4, zG, iTokenizationCallbackAsInterface2);
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

    ICancellationCallback getTokenInfo(skg skgVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(skg skgVar, ISmartReplyResultCallback iSmartReplyResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(skg skgVar, ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallback);

    @Deprecated
    void runInference(skg skgVar, ISmartReplyResultCallback iSmartReplyResultCallback);
}
