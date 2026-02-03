package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback;
import com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.sgh;
import defpackage.shp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageDescriptionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageDescriptionService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageDescriptionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionService");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public ICancellationCallback runCancellableInference(shp shpVar, IImageDescriptionResultCallback iImageDescriptionResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shpVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iImageDescriptionResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public ICancellationCallback runCancellableInferenceWithInfo(shp shpVar, IImageDescriptionResultWithInfoCallback iImageDescriptionResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shpVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iImageDescriptionResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageDescriptionService");
        }

        public static IImageDescriptionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionService");
            return iInterfaceQueryLocalInterface instanceof IImageDescriptionService ? (IImageDescriptionService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                shp shpVar = (shp) sgh.a(parcel, shp.CREATOR);
                IImageDescriptionResultCallback iImageDescriptionResultCallbackAsInterface = IImageDescriptionResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(shpVar, iImageDescriptionResultCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInference);
                return true;
            }
            if (i == 3) {
                IPrepareInferenceEngineCallback iPrepareInferenceEngineCallbackAsInterface = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackPrepareInferenceEngine = prepareInferenceEngine(iPrepareInferenceEngineCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackPrepareInferenceEngine);
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
            shp shpVar2 = (shp) sgh.a(parcel, shp.CREATOR);
            IImageDescriptionResultWithInfoCallback iImageDescriptionResultWithInfoCallbackAsInterface = IImageDescriptionResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(shpVar2, iImageDescriptionResultWithInfoCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(shp shpVar, IImageDescriptionResultCallback iImageDescriptionResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(shp shpVar, IImageDescriptionResultWithInfoCallback iImageDescriptionResultWithInfoCallback);
}
