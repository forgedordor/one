package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ITarsResultCallback;
import defpackage.sgh;
import defpackage.sli;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITarsService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITarsService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITarsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITarsService");
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsService
            public ICancellationCallback runCancellableInference(sli sliVar, ITarsResultCallback iTarsResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sliVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iTarsResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITarsService");
        }

        public static ITarsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITarsService");
            return iInterfaceQueryLocalInterface instanceof ITarsService ? (ITarsService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sli sliVar = (sli) sgh.a(parcel, sli.CREATOR);
                ITarsResultCallback iTarsResultCallbackAsInterface = ITarsResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(sliVar, iTarsResultCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInference);
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

    ICancellationCallback runCancellableInference(sli sliVar, ITarsResultCallback iTarsResultCallback);
}
