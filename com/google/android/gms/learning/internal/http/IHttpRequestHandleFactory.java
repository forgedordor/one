package com.google.android.gms.learning.internal.http;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.http.IHttpRequestHandle;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpRequestHandleFactory extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpRequestHandleFactory {
        static final int TRANSACTION_create = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpRequestHandleFactory {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory
            public IHttpRequestHandle create(byte[] bArr, IObjectWrapper iObjectWrapper, int i, int i2, double d) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeDouble(d);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IHttpRequestHandle iHttpRequestHandleAsInterface = IHttpRequestHandle.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iHttpRequestHandleAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
        }

        public static IHttpRequestHandleFactory asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
            return iInterfaceQueryLocalInterface instanceof IHttpRequestHandleFactory ? (IHttpRequestHandleFactory) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            double d = parcel.readDouble();
            enforceNoDataAvail(parcel);
            IHttpRequestHandle iHttpRequestHandleCreate = create(bArrCreateByteArray, iObjectWrapperAsInterface, i3, i4, d);
            parcel2.writeNoException();
            sgh.f(parcel2, iHttpRequestHandleCreate);
            return true;
        }
    }

    IHttpRequestHandle create(byte[] bArr, IObjectWrapper iObjectWrapper, int i, int i2, double d);
}
