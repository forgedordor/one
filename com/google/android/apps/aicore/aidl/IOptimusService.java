package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IOptimusResultCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.sgh;
import defpackage.sjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOptimusService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOptimusService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOptimusService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IOptimusService");
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusService
            public ICancellationCallback runCancellableInference(sjg sjgVar, IOptimusResultCallback iOptimusResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjgVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iOptimusResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IOptimusService");
        }

        public static IOptimusService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IOptimusService");
            return iInterfaceQueryLocalInterface instanceof IOptimusService ? (IOptimusService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sjg sjgVar = (sjg) sgh.a(parcel, sjg.CREATOR);
                IOptimusResultCallback iOptimusResultCallbackAsInterface = IOptimusResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sjgVar, iOptimusResultCallbackAsInterface);
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
            if (i != 4) {
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

    ICancellationCallback runCancellableInference(sjg sjgVar, IOptimusResultCallback iOptimusResultCallback);
}
