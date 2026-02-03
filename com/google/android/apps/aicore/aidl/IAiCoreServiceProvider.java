package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback;
import defpackage.sgh;
import defpackage.sgz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAiCoreServiceProvider extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAiCoreServiceProvider {
        static final int TRANSACTION_get = 2;
        static final int TRANSACTION_getWithCallerInfo = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAiCoreServiceProvider {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProvider
            public void get(IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAiCoreServiceProviderCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProvider
            public void getWithCallerInfo(sgz sgzVar, IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgzVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAiCoreServiceProviderCallback);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
        }

        public static IAiCoreServiceProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
            return iInterfaceQueryLocalInterface instanceof IAiCoreServiceProvider ? (IAiCoreServiceProvider) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IAiCoreServiceProviderCallback iAiCoreServiceProviderCallbackAsInterface = IAiCoreServiceProviderCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                get(iAiCoreServiceProviderCallbackAsInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            sgz sgzVar = (sgz) sgh.a(parcel, sgz.CREATOR);
            IAiCoreServiceProviderCallback iAiCoreServiceProviderCallbackAsInterface2 = IAiCoreServiceProviderCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getWithCallerInfo(sgzVar, iAiCoreServiceProviderCallbackAsInterface2);
            return true;
        }
    }

    void get(IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback);

    void getWithCallerInfo(sgz sgzVar, IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback);
}
