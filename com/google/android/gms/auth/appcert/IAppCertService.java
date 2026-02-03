package com.google.android.gms.auth.appcert;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAppCertService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppCertService {
        static final int TRANSACTION_getAppCert = 2;
        static final int TRANSACTION_initializeDeviceKey = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppCertService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.appcert.IAppCertService");
            }

            @Override // com.google.android.gms.auth.appcert.IAppCertService
            public String getAppCert(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.auth.appcert.IAppCertService
            public boolean initializeDeviceKey() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.appcert.IAppCertService");
        }

        public static IAppCertService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.appcert.IAppCertService");
            return iInterfaceQueryLocalInterface instanceof IAppCertService ? (IAppCertService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                boolean zInitializeDeviceKey = initializeDeviceKey();
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zInitializeDeviceKey ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                String appCert = getAppCert(string);
                parcel2.writeNoException();
                parcel2.writeString(appCert);
            }
            return true;
        }
    }

    String getAppCert(String str);

    boolean initializeDeviceKey();
}
