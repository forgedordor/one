package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpUrlConnectionFactory extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpUrlConnectionFactory {
        static final int TRANSACTION_allowFallbackToDefault = 3;
        static final int TRANSACTION_createUrlConnection = 2;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_requestEnableQuic = 6;
        static final int TRANSACTION_supportAcceptEncodingHeader = 4;
        static final int TRANSACTION_supportSetConnectTimeoutMs = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpUrlConnectionFactory {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean allowFallbackToDefault() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public IObjectWrapper createUrlConnection(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean initialize() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public void requestEnableQuic(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean supportAcceptEncodingHeader() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean supportSetConnectTimeoutMs() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
        }

        public static IHttpUrlConnectionFactory asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
            return iInterfaceQueryLocalInterface instanceof IHttpUrlConnectionFactory ? (IHttpUrlConnectionFactory) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean zInitialize = initialize();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zInitialize ? 1 : 0);
                    return true;
                case 2:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperCreateUrlConnection = createUrlConnection(string);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperCreateUrlConnection);
                    return true;
                case 3:
                    boolean zAllowFallbackToDefault = allowFallbackToDefault();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zAllowFallbackToDefault ? 1 : 0);
                    return true;
                case 4:
                    boolean zSupportAcceptEncodingHeader = supportAcceptEncodingHeader();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zSupportAcceptEncodingHeader ? 1 : 0);
                    return true;
                case 5:
                    boolean zSupportSetConnectTimeoutMs = supportSetConnectTimeoutMs();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zSupportSetConnectTimeoutMs ? 1 : 0);
                    return true;
                case 6:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    requestEnableQuic(zG);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean allowFallbackToDefault();

    IObjectWrapper createUrlConnection(String str);

    boolean initialize();

    void requestEnableQuic(boolean z);

    boolean supportAcceptEncodingHeader();

    boolean supportSetConnectTimeoutMs();
}
