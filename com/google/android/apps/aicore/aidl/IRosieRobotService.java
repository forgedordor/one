package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IHintCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.IRosieRobotResultCallback;
import com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback;
import defpackage.sgh;
import defpackage.shn;
import defpackage.ska;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_hint = 7;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotService");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback hint(shn shnVar, IHintCallback iHintCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shnVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iHintCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback runCancellableInference(ska skaVar, IRosieRobotResultCallback iRosieRobotResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skaVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iRosieRobotResultCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback runCancellableInferenceWithInfo(ska skaVar, IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skaVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iRosieRobotResultWithInfoCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ICancellationCallback iCancellationCallbackAsInterface = ICancellationCallback.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancellationCallbackAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotService");
        }

        public static IRosieRobotService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotService");
            return iInterfaceQueryLocalInterface instanceof IRosieRobotService ? (IRosieRobotService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ska skaVar = (ska) sgh.a(parcel, ska.CREATOR);
                IRosieRobotResultCallback iRosieRobotResultCallbackAsInterface = IRosieRobotResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInference = runCancellableInference(skaVar, iRosieRobotResultCallbackAsInterface);
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
            if (i == 6) {
                ska skaVar2 = (ska) sgh.a(parcel, ska.CREATOR);
                IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallbackAsInterface = IRosieRobotResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback iCancellationCallbackRunCancellableInferenceWithInfo = runCancellableInferenceWithInfo(skaVar2, iRosieRobotResultWithInfoCallbackAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancellationCallbackRunCancellableInferenceWithInfo);
                return true;
            }
            if (i != 7) {
                return false;
            }
            shn shnVar = (shn) sgh.a(parcel, shn.CREATOR);
            IHintCallback iHintCallbackAsInterface = IHintCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback iCancellationCallbackHint = hint(shnVar, iHintCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, iCancellationCallbackHint);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback hint(shn shnVar, IHintCallback iHintCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(ska skaVar, IRosieRobotResultCallback iRosieRobotResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(ska skaVar, IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallback);
}
