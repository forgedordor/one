package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExampleStoreV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreV2 {
        static final int TRANSACTION_startQuery = 2;
        static final int TRANSACTION_startQueryWithSelectorContext = 4;
        static final int TRANSACTION_supportsSelectorContext = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreV2");
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreV2
            public void startQuery(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iExampleStoreQueryCallbackV2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreV2
            public void startQueryWithSelectorContext(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2, IObjectWrapper iObjectWrapper3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iExampleStoreQueryCallbackV2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper3);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreV2
            public boolean supportsSelectorContext() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IExampleStoreV2");
        }

        public static IExampleStoreV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreV2");
            return iInterfaceQueryLocalInterface instanceof IExampleStoreV2 ? (IExampleStoreV2) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2AsInterface = IExampleStoreQueryCallbackV2.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                startQuery(string, iObjectWrapperAsInterface, iObjectWrapperAsInterface2, iExampleStoreQueryCallbackV2AsInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                boolean zSupportsSelectorContext = supportsSelectorContext();
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zSupportsSelectorContext ? 1 : 0);
                return true;
            }
            if (i != 4) {
                return false;
            }
            String string2 = parcel.readString();
            IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2AsInterface2 = IExampleStoreQueryCallbackV2.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            startQueryWithSelectorContext(string2, iObjectWrapperAsInterface3, iObjectWrapperAsInterface4, iExampleStoreQueryCallbackV2AsInterface2, iObjectWrapperAsInterface5);
            parcel2.writeNoException();
            return true;
        }
    }

    void startQuery(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2);

    void startQueryWithSelectorContext(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2, IObjectWrapper iObjectWrapper3);

    boolean supportsSelectorContext();
}
