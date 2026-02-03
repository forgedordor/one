package com.google.android.libraries.inputmethod.preferences;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ICrossProcessPreferenceServer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICrossProcessPreferenceServer {
        static final int TRANSACTION_register = 2;
        static final int TRANSACTION_unregister = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICrossProcessPreferenceServer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer");
            }

            @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer
            public boolean register(ICrossProcessPreferenceClient iCrossProcessPreferenceClient) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCrossProcessPreferenceClient);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer
            public boolean unregister(ICrossProcessPreferenceClient iCrossProcessPreferenceClient) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCrossProcessPreferenceClient);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer");
        }

        public static ICrossProcessPreferenceServer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer");
            return iInterfaceQueryLocalInterface instanceof ICrossProcessPreferenceServer ? (ICrossProcessPreferenceServer) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ICrossProcessPreferenceClient iCrossProcessPreferenceClientAsInterface = ICrossProcessPreferenceClient.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                boolean zRegister = register(iCrossProcessPreferenceClientAsInterface);
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zRegister ? 1 : 0);
                return true;
            }
            if (i != 3) {
                return false;
            }
            ICrossProcessPreferenceClient iCrossProcessPreferenceClientAsInterface2 = ICrossProcessPreferenceClient.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            boolean zUnregister = unregister(iCrossProcessPreferenceClientAsInterface2);
            parcel2.writeNoException();
            int i4 = sgh.a;
            parcel2.writeInt(zUnregister ? 1 : 0);
            return true;
        }
    }

    boolean register(ICrossProcessPreferenceClient iCrossProcessPreferenceClient);

    boolean unregister(ICrossProcessPreferenceClient iCrossProcessPreferenceClient);
}
