package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppTrainerCanceller extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppTrainerCanceller {
        static final int TRANSACTION_cancelJobsByType = 2;
        static final int TRANSACTION_init = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppTrainerCanceller {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainerCanceller
            public void cancelJobsByType(int i, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainerCanceller
            public boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
        }

        public static IInAppTrainerCanceller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
            return iInterfaceQueryLocalInterface instanceof IInAppTrainerCanceller ? (IInAppTrainerCanceller) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                boolean zInit = init(iObjectWrapperAsInterface, iObjectWrapperAsInterface2, iStatusCallbackAsInterface);
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zInit ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                int i4 = parcel.readInt();
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                cancelJobsByType(i4, iStatusCallbackAsInterface2);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void cancelJobsByType(int i, IStatusCallback iStatusCallback);

    boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IStatusCallback iStatusCallback);
}
