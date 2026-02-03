package com.google.android.setupcompat.portal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.UserHandle;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.setupcompat.portal.IPortalRegisterResultListener;
import defpackage.efsm;
import defpackage.efso;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ISetupNotificationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISetupNotificationService {
        static final int TRANSACTION_isPortalAvailable = 5;
        static final int TRANSACTION_isPortalReady = 6;
        static final int TRANSACTION_isProgressServiceAlive = 4;
        static final int TRANSACTION_registerNotification = 1;
        static final int TRANSACTION_registerProgressService = 3;
        static final int TRANSACTION_unregisterNotification = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISetupNotificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.ISetupNotificationService");
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isPortalAvailable() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isPortalReady() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isProgressServiceAlive(efso efsoVar, UserHandle userHandle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, efsoVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, userHandle);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean registerNotification(efsm efsmVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, efsmVar);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public void registerProgressService(efso efsoVar, UserHandle userHandle, IPortalRegisterResultListener iPortalRegisterResultListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, efsoVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, userHandle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iPortalRegisterResultListener);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public void unregisterNotification(efsm efsmVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, efsmVar);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.ISetupNotificationService");
        }

        public static ISetupNotificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.ISetupNotificationService");
            return iInterfaceQueryLocalInterface instanceof ISetupNotificationService ? (ISetupNotificationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    efsm efsmVar = (efsm) sgh.a(parcel, efsm.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zRegisterNotification = registerNotification(efsmVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterNotification ? 1 : 0);
                    return true;
                case 2:
                    efsm efsmVar2 = (efsm) sgh.a(parcel, efsm.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterNotification(efsmVar2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    efso efsoVar = (efso) sgh.a(parcel, efso.CREATOR);
                    UserHandle userHandle = (UserHandle) sgh.a(parcel, UserHandle.CREATOR);
                    IPortalRegisterResultListener iPortalRegisterResultListenerAsInterface = IPortalRegisterResultListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerProgressService(efsoVar, userHandle, iPortalRegisterResultListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    efso efsoVar2 = (efso) sgh.a(parcel, efso.CREATOR);
                    UserHandle userHandle2 = (UserHandle) sgh.a(parcel, UserHandle.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zIsProgressServiceAlive = isProgressServiceAlive(efsoVar2, userHandle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsProgressServiceAlive ? 1 : 0);
                    return true;
                case 5:
                    boolean zIsPortalAvailable = isPortalAvailable();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsPortalAvailable ? 1 : 0);
                    return true;
                case 6:
                    boolean zIsPortalReady = isPortalReady();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zIsPortalReady ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean isPortalAvailable();

    boolean isPortalReady();

    boolean isProgressServiceAlive(efso efsoVar, UserHandle userHandle);

    boolean registerNotification(efsm efsmVar);

    void registerProgressService(efso efsoVar, UserHandle userHandle, IPortalRegisterResultListener iPortalRegisterResultListener);

    void unregisterNotification(efsm efsmVar);
}
