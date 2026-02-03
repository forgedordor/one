package com.google.android.gms.learning;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.learning.IExampleStoreQueryCallback;
import defpackage.sgh;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public interface IExampleStore extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStore {
        static final int TRANSACTION_startQuery = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStore {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.IExampleStore");
            }

            @Override // com.google.android.gms.learning.IExampleStore
            public void startQuery(String str, byte[] bArr, byte[] bArr2, IExampleStoreQueryCallback iExampleStoreQueryCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iExampleStoreQueryCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.IExampleStore");
        }

        public static IExampleStore asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.IExampleStore");
            return iInterfaceQueryLocalInterface instanceof IExampleStore ? (IExampleStore) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            IExampleStoreQueryCallback iExampleStoreQueryCallbackAsInterface = IExampleStoreQueryCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            startQuery(string, bArrCreateByteArray, bArrCreateByteArray2, iExampleStoreQueryCallbackAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void startQuery(String str, byte[] bArr, byte[] bArr2, IExampleStoreQueryCallback iExampleStoreQueryCallback);
}
