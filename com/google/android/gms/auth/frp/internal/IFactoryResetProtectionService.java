package com.google.android.gms.auth.frp.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.frp.FrpUnlockRequest;
import com.google.android.gms.auth.frp.UnlockForWearRequest;
import com.google.android.gms.auth.frp.internal.IFrpCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFactoryResetProtectionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFactoryResetProtectionService {
        static final int TRANSACTION_getSnapshot = 1;
        static final int TRANSACTION_isChallengeRequired = 3;
        static final int TRANSACTION_isChallengeSupported = 2;
        static final int TRANSACTION_unlock = 5;
        static final int TRANSACTION_unlockForWear = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFactoryResetProtectionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService");
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void getSnapshot(IFrpCallbacks iFrpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFrpCallbacks);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void isChallengeRequired(IFrpCallbacks iFrpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFrpCallbacks);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void isChallengeSupported(IFrpCallbacks iFrpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFrpCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void unlock(IFrpCallbacks iFrpCallbacks, FrpUnlockRequest frpUnlockRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFrpCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, frpUnlockRequest);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService
            public void unlockForWear(IFrpCallbacks iFrpCallbacks, UnlockForWearRequest unlockForWearRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFrpCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, unlockForWearRequest);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService");
        }

        public static IFactoryResetProtectionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.internal.IFactoryResetProtectionService");
            return iInterfaceQueryLocalInterface instanceof IFactoryResetProtectionService ? (IFactoryResetProtectionService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IFrpCallbacks iFrpCallbacksAsInterface = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getSnapshot(iFrpCallbacksAsInterface);
            } else if (i == 2) {
                IFrpCallbacks iFrpCallbacksAsInterface2 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                isChallengeSupported(iFrpCallbacksAsInterface2);
            } else if (i == 3) {
                IFrpCallbacks iFrpCallbacksAsInterface3 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                isChallengeRequired(iFrpCallbacksAsInterface3);
            } else if (i == 4) {
                IFrpCallbacks iFrpCallbacksAsInterface4 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                UnlockForWearRequest unlockForWearRequest = (UnlockForWearRequest) sgh.a(parcel, UnlockForWearRequest.CREATOR);
                enforceNoDataAvail(parcel);
                unlockForWear(iFrpCallbacksAsInterface4, unlockForWearRequest);
            } else {
                if (i != 5) {
                    return false;
                }
                IFrpCallbacks iFrpCallbacksAsInterface5 = IFrpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                FrpUnlockRequest frpUnlockRequest = (FrpUnlockRequest) sgh.a(parcel, FrpUnlockRequest.CREATOR);
                enforceNoDataAvail(parcel);
                unlock(iFrpCallbacksAsInterface5, frpUnlockRequest);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSnapshot(IFrpCallbacks iFrpCallbacks);

    void isChallengeRequired(IFrpCallbacks iFrpCallbacks);

    void isChallengeSupported(IFrpCallbacks iFrpCallbacks);

    void unlock(IFrpCallbacks iFrpCallbacks, FrpUnlockRequest frpUnlockRequest);

    @Deprecated
    void unlockForWear(IFrpCallbacks iFrpCallbacks, UnlockForWearRequest unlockForWearRequest);
}
