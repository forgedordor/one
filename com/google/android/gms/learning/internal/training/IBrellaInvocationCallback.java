package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBrellaInvocationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBrellaInvocationCallback {
        static final int TRANSACTION_onComputationCompleted = 4;
        static final int TRANSACTION_onInvocationFinished = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBrellaInvocationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocationCallback
            public void onComputationCompleted(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocationCallback
            public void onInvocationFinished(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
        }

        public static IBrellaInvocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
            return iInterfaceQueryLocalInterface instanceof IBrellaInvocationCallback ? (IBrellaInvocationCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 4) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onComputationCompleted(bArrCreateByteArray);
            } else {
                if (i != 5) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onInvocationFinished(bArrCreateByteArray2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onComputationCompleted(byte[] bArr);

    void onInvocationFinished(byte[] bArr);
}
