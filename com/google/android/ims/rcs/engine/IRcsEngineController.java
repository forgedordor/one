package com.google.android.ims.rcs.engine;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IRcsEngineController extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRcsEngineController {
        static final int TRANSACTION_destroy = 2;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_initializeAndStartRcsTransport = 5;
        static final int TRANSACTION_stopAllRcsTransportsExcept = 6;
        static final int TRANSACTION_triggerStartRcsStack = 3;
        static final int TRANSACTION_triggerStopRcsStack = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRcsEngineController {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcs.engine.IRcsEngineController");
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult destroy(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) sgh.a(parcelTransactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult initialize(int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) sgh.a(parcelTransactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, initializeAndStartRcsTransportRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) sgh.a(parcelTransactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, stopAllRcsTransportsExceptRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) sgh.a(parcelTransactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) sgh.a(parcelTransactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) sgh.a(parcelTransactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcs.engine.IRcsEngineController");
        }

        public static IRcsEngineController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcs.engine.IRcsEngineController");
            return iInterfaceQueryLocalInterface instanceof IRcsEngineController ? (IRcsEngineController) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultInitialize = initialize(i3, i4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, rcsEngineLifecycleServiceResultInitialize);
                    return true;
                case 2:
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultDestroy = destroy(i5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, rcsEngineLifecycleServiceResultDestroy);
                    return true;
                case 3:
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultTriggerStartRcsStack = triggerStartRcsStack(i6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, rcsEngineLifecycleServiceResultTriggerStartRcsStack);
                    return true;
                case 4:
                    int i7 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultTriggerStopRcsStack = triggerStopRcsStack(i7);
                    parcel2.writeNoException();
                    sgh.e(parcel2, rcsEngineLifecycleServiceResultTriggerStopRcsStack);
                    return true;
                case 5:
                    InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest = (InitializeAndStartRcsTransportRequest) sgh.a(parcel, InitializeAndStartRcsTransportRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultInitializeAndStartRcsTransport = initializeAndStartRcsTransport(initializeAndStartRcsTransportRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, rcsEngineLifecycleServiceResultInitializeAndStartRcsTransport);
                    return true;
                case 6:
                    StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest = (StopAllRcsTransportsExceptRequest) sgh.a(parcel, StopAllRcsTransportsExceptRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultStopAllRcsTransportsExcept = stopAllRcsTransportsExcept(stopAllRcsTransportsExceptRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, rcsEngineLifecycleServiceResultStopAllRcsTransportsExcept);
                    return true;
                default:
                    return false;
            }
        }
    }

    RcsEngineLifecycleServiceResult destroy(int i);

    RcsEngineLifecycleServiceResult initialize(int i, int i2);

    RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest);

    RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest);

    RcsEngineLifecycleServiceResult triggerStartRcsStack(int i);

    RcsEngineLifecycleServiceResult triggerStopRcsStack(int i);
}
