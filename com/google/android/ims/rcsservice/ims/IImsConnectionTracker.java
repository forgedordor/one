package com.google.android.ims.rcsservice.ims;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IImsConnectionTracker extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImsConnectionTracker {
        static final int TRANSACTION_getRegistrationState = 2;
        static final int TRANSACTION_isRegistered = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImsConnectionTracker {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.ims.IImsConnectionTracker");
            }

            @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
            public ImsRegistrationState getRegistrationState() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                ImsRegistrationState imsRegistrationState = (ImsRegistrationState) sgh.a(parcelTransactAndReadException, ImsRegistrationState.CREATOR);
                parcelTransactAndReadException.recycle();
                return imsRegistrationState;
            }

            @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
            public boolean isRegistered() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.ims.IImsConnectionTracker");
        }

        public static IImsConnectionTracker asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.ims.IImsConnectionTracker");
            return iInterfaceQueryLocalInterface instanceof IImsConnectionTracker ? (IImsConnectionTracker) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                boolean zIsRegistered = isRegistered();
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zIsRegistered ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                ImsRegistrationState registrationState = getRegistrationState();
                parcel2.writeNoException();
                sgh.e(parcel2, registrationState);
            }
            return true;
        }
    }

    ImsRegistrationState getRegistrationState();

    boolean isRegistered();
}
