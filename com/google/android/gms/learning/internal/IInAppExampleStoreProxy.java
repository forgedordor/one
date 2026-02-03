package com.google.android.gms.learning.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.IExampleStoreV2;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppExampleStoreProxy extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppExampleStoreProxy {
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_onBind = 3;
        static final int TRANSACTION_onDestroy = 2;
        static final int TRANSACTION_onRebind = 6;
        static final int TRANSACTION_onTrimMemory = 4;
        static final int TRANSACTION_onUnbind = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppExampleStoreProxy {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void init(IObjectWrapper iObjectWrapper, IExampleStoreV2 iExampleStoreV2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iExampleStoreV2);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public IBinder onBind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IBinder strongBinder = parcelTransactAndReadException.readStrongBinder();
                parcelTransactAndReadException.recycle();
                return strongBinder;
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void onRebind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void onTrimMemory(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public boolean onUnbind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
        }

        public static IInAppExampleStoreProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
            return iInterfaceQueryLocalInterface instanceof IInAppExampleStoreProxy ? (IInAppExampleStoreProxy) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IExampleStoreV2 iExampleStoreV2AsInterface = IExampleStoreV2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    init(iObjectWrapperAsInterface, iExampleStoreV2AsInterface);
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
                    enforceNoDataAvail(parcel);
                    boolean zOnUnbind = onUnbind(intent2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnUnbind ? 1 : 0);
                    return true;
                case 6:
                    Intent intent3 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRebind(intent3);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void init(IObjectWrapper iObjectWrapper, IExampleStoreV2 iExampleStoreV2);

    IBinder onBind(Intent intent);

    void onDestroy();

    void onRebind(Intent intent);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
