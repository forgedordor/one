package com.google.android.gms.learning.internal.training;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory;
import com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppTrainingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppTrainingService {
        static final int TRANSACTION_addHttpRequestHandleFactory = 10;
        static final int TRANSACTION_addHttpUrlConnectionFactory = 9;
        static final int TRANSACTION_onBind = 3;
        static final int TRANSACTION_onCreate = 1;
        static final int TRANSACTION_onDestroy = 2;
        static final int TRANSACTION_onRebind = 7;
        static final int TRANSACTION_onStartCommand = 5;
        static final int TRANSACTION_onTrimMemory = 4;
        static final int TRANSACTION_onUnbind = 6;
        static final int TRANSACTION_setPRFSdkImpl = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppTrainingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void addHttpRequestHandleFactory(String str, IHttpRequestHandleFactory iHttpRequestHandleFactory) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iHttpRequestHandleFactory);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iHttpUrlConnectionFactory);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public IBinder onBind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
                parcelTransactAndReadException.recycle();
                return strongBinder;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onCreate(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onRebind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public int onStartCommand(Intent intent, int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                int i3 = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i3;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onTrimMemory(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public boolean onUnbind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void setPRFSdkImpl() {
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppTrainingService");
        }

        public static IInAppTrainingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
            return iInterfaceQueryLocalInterface instanceof IInAppTrainingService ? (IInAppTrainingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onCreate(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    IBinder iBinderOnBind = onBind(intent);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderOnBind);
                    return true;
                case 4:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onTrimMemory(i3);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    Intent intent2 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    int i4 = parcel.readInt();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    int iOnStartCommand = onStartCommand(intent2, i4, i5);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnStartCommand);
                    return true;
                case 6:
                    Intent intent3 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zOnUnbind = onUnbind(intent3);
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnUnbind ? 1 : 0);
                    return true;
                case 7:
                    Intent intent4 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRebind(intent4);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    setPRFSdkImpl();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    String string = parcel.readString();
                    IHttpUrlConnectionFactory iHttpUrlConnectionFactoryAsInterface = IHttpUrlConnectionFactory.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addHttpUrlConnectionFactory(string, iHttpUrlConnectionFactoryAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    String string2 = parcel.readString();
                    IHttpRequestHandleFactory iHttpRequestHandleFactoryAsInterface = IHttpRequestHandleFactory.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addHttpRequestHandleFactory(string2, iHttpRequestHandleFactoryAsInterface);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addHttpRequestHandleFactory(String str, IHttpRequestHandleFactory iHttpRequestHandleFactory);

    void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory);

    IBinder onBind(Intent intent);

    void onCreate(IObjectWrapper iObjectWrapper);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);

    @Deprecated
    void setPRFSdkImpl();
}
