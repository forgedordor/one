package com.google.android.gms.auth.frp;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFrpService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFrpService {
        static final int TRANSACTION_getSnapshot = 5;
        static final int TRANSACTION_isChallengeRequired = 1;
        static final int TRANSACTION_isChallengeSupported = 2;
        static final int TRANSACTION_unlockFactoryResetProtection = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFrpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.IFrpService");
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public FrpSnapshot getSnapshot() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                FrpSnapshot frpSnapshot = (FrpSnapshot) sgh.a(parcelTransactAndReadException, FrpSnapshot.CREATOR);
                parcelTransactAndReadException.recycle();
                return frpSnapshot;
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public boolean isChallengeRequired() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public boolean isChallengeSupported() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.frp.IFrpService
            public UnlockFactoryResetProtectionResponse unlockFactoryResetProtection(UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, unlockFactoryResetProtectionRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                UnlockFactoryResetProtectionResponse unlockFactoryResetProtectionResponse = (UnlockFactoryResetProtectionResponse) sgh.a(parcelTransactAndReadException, UnlockFactoryResetProtectionResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return unlockFactoryResetProtectionResponse;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.IFrpService");
        }

        public static IFrpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.IFrpService");
            return iInterfaceQueryLocalInterface instanceof IFrpService ? (IFrpService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                boolean zIsChallengeRequired = isChallengeRequired();
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zIsChallengeRequired ? 1 : 0);
            } else if (i == 2) {
                boolean zIsChallengeSupported = isChallengeSupported();
                parcel2.writeNoException();
                int i4 = sgh.a;
                parcel2.writeInt(zIsChallengeSupported ? 1 : 0);
            } else if (i == 3) {
                UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest = (UnlockFactoryResetProtectionRequest) sgh.a(parcel, UnlockFactoryResetProtectionRequest.CREATOR);
                enforceNoDataAvail(parcel);
                UnlockFactoryResetProtectionResponse unlockFactoryResetProtectionResponseUnlockFactoryResetProtection = unlockFactoryResetProtection(unlockFactoryResetProtectionRequest);
                parcel2.writeNoException();
                sgh.e(parcel2, unlockFactoryResetProtectionResponseUnlockFactoryResetProtection);
            } else {
                if (i != 5) {
                    return false;
                }
                FrpSnapshot snapshot = getSnapshot();
                parcel2.writeNoException();
                sgh.e(parcel2, snapshot);
            }
            return true;
        }
    }

    FrpSnapshot getSnapshot();

    boolean isChallengeRequired();

    boolean isChallengeSupported();

    UnlockFactoryResetProtectionResponse unlockFactoryResetProtection(UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest);
}
