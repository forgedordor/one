package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.BrellaInvocationOptions;
import com.google.android.gms.learning.internal.training.IBrellaInvocationCallback;
import com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBrellaInvocation extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBrellaInvocation {
        static final int TRANSACTION_addHttpUrlConnectionFactory = 4;
        static final int TRANSACTION_cancel = 3;
        static final int TRANSACTION_runInBackgroundProcess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBrellaInvocation {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IBrellaInvocation");
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocation
            public void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iHttpUrlConnectionFactory);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocation
            public void cancel(IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocation
            public void runInBackgroundProcess(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, BrellaInvocationOptions brellaInvocationOptions, IStatusCallback iStatusCallback, IBrellaInvocationCallback iBrellaInvocationCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, brellaInvocationOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iBrellaInvocationCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IBrellaInvocation");
        }

        public static IBrellaInvocation asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IBrellaInvocation");
            return iInterfaceQueryLocalInterface instanceof IBrellaInvocation ? (IBrellaInvocation) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                BrellaInvocationOptions brellaInvocationOptions = (BrellaInvocationOptions) sgh.a(parcel, BrellaInvocationOptions.CREATOR);
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                IBrellaInvocationCallback iBrellaInvocationCallbackAsInterface = IBrellaInvocationCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInBackgroundProcess(iObjectWrapperAsInterface, iObjectWrapperAsInterface2, brellaInvocationOptions, iStatusCallbackAsInterface, iBrellaInvocationCallbackAsInterface);
            } else if (i == 3) {
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                cancel(iStatusCallbackAsInterface2);
            } else {
                if (i != 4) {
                    return false;
                }
                String string = parcel.readString();
                IHttpUrlConnectionFactory iHttpUrlConnectionFactoryAsInterface = IHttpUrlConnectionFactory.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                addHttpUrlConnectionFactory(string, iHttpUrlConnectionFactoryAsInterface);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory);

    void cancel(IStatusCallback iStatusCallback);

    void runInBackgroundProcess(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, BrellaInvocationOptions brellaInvocationOptions, IStatusCallback iStatusCallback, IBrellaInvocationCallback iBrellaInvocationCallback);
}
