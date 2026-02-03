package com.google.android.gms.auth.frp.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.FrpUnlockResponse;
import com.google.android.gms.auth.frp.UnlockForWearResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFrpCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFrpCallbacks {
        static final int TRANSACTION_onGetSnapshot = 1;
        static final int TRANSACTION_onIsChallengeRequired = 3;
        static final int TRANSACTION_onIsChallengeSupported = 2;
        static final int TRANSACTION_onUnlock = 5;
        static final int TRANSACTION_onUnlockedForWear = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFrpCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.internal.IFrpCallbacks");
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onGetSnapshot(Status status, FrpSnapshot frpSnapshot) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, frpSnapshot);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onIsChallengeRequired(Status status, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onIsChallengeSupported(Status status, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, frpUnlockResponse);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, unlockForWearResponse);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.internal.IFrpCallbacks");
        }

        public static IFrpCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.internal.IFrpCallbacks");
            return iInterfaceQueryLocalInterface instanceof IFrpCallbacks ? (IFrpCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                FrpSnapshot frpSnapshot = (FrpSnapshot) sgh.a(parcel, FrpSnapshot.CREATOR);
                enforceNoDataAvail(parcel);
                onGetSnapshot(status, frpSnapshot);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                boolean zG = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                onIsChallengeSupported(status2, zG);
            } else if (i == 3) {
                Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                boolean zG2 = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                onIsChallengeRequired(status3, zG2);
            } else if (i == 4) {
                Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                UnlockForWearResponse unlockForWearResponse = (UnlockForWearResponse) sgh.a(parcel, UnlockForWearResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onUnlockedForWear(status4, unlockForWearResponse);
            } else {
                if (i != 5) {
                    return false;
                }
                Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                FrpUnlockResponse frpUnlockResponse = (FrpUnlockResponse) sgh.a(parcel, FrpUnlockResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onUnlock(status5, frpUnlockResponse);
            }
            return true;
        }
    }

    void onGetSnapshot(Status status, FrpSnapshot frpSnapshot);

    void onIsChallengeRequired(Status status, boolean z);

    void onIsChallengeSupported(Status status, boolean z);

    void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse);

    void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse);
}
