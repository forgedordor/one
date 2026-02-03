package com.google.android.ims.wakelocks;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IWakeLockManager extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWakeLockManager {
        static final int TRANSACTION_acquire = 1;
        static final int TRANSACTION_release = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWakeLockManager {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.wakelocks.IWakeLockManager");
            }

            @Override // com.google.android.ims.wakelocks.IWakeLockManager
            public int acquire(IBinder iBinder, String str, int i, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                int i2 = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i2;
            }

            @Override // com.google.android.ims.wakelocks.IWakeLockManager
            public void release(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.wakelocks.IWakeLockManager");
        }

        public static IWakeLockManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.wakelocks.IWakeLockManager");
            return iInterfaceQueryLocalInterface instanceof IWakeLockManager ? (IWakeLockManager) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                String string = parcel.readString();
                int i3 = parcel.readInt();
                long j = parcel.readLong();
                enforceNoDataAvail(parcel);
                int iAcquire = acquire(strongBinder, string, i3, j);
                parcel2.writeNoException();
                parcel2.writeInt(iAcquire);
            } else {
                if (i != 2) {
                    return false;
                }
                int i4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                release(i4);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    int acquire(IBinder iBinder, String str, int i, long j);

    void release(int i);
}
