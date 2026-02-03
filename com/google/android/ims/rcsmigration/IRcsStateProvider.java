package com.google.android.ims.rcsmigration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IRcsStateProvider extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRcsStateProvider {
        static final int TRANSACTION_getRcsState = 1;
        static final int TRANSACTION_onMigrationComplete = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRcsStateProvider {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsmigration.IRcsStateProvider");
            }

            @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
            public RcsState getRcsState() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                RcsState rcsState = (RcsState) sgh.a(parcelTransactAndReadException, RcsState.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsState;
            }

            @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
            public void onMigrationComplete() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsmigration.IRcsStateProvider");
        }

        public static IRcsStateProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsmigration.IRcsStateProvider");
            return iInterfaceQueryLocalInterface instanceof IRcsStateProvider ? (IRcsStateProvider) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                RcsState rcsState = getRcsState();
                parcel2.writeNoException();
                sgh.e(parcel2, rcsState);
            } else {
                if (i != 2) {
                    return false;
                }
                onMigrationComplete();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    RcsState getRcsState();

    void onMigrationComplete();
}
