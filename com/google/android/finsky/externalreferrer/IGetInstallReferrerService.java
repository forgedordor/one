package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetInstallReferrerService {
        static final int TRANSACTION_getInstallReferrer = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public Bundle getInstallReferrer(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle2;
            }
        }

        public Stub() {
            super("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        public static IGetInstallReferrerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            Bundle installReferrer = getInstallReferrer(bundle);
            parcel2.writeNoException();
            sgh.e(parcel2, installReferrer);
            return true;
        }
    }

    Bundle getInstallReferrer(Bundle bundle);
}
