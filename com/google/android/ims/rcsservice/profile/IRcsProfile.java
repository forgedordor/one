package com.google.android.ims.rcsservice.profile;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IRcsProfile extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRcsProfile {
        static final int TRANSACTION_getRcsConfig = 3;
        static final int TRANSACTION_getValue = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRcsProfile {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.profile.IRcsProfile");
            }

            @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
            public Bundle getRcsConfig() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
            public RcsProfileServiceResult getValue(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                RcsProfileServiceResult rcsProfileServiceResult = (RcsProfileServiceResult) sgh.a(parcelTransactAndReadException, RcsProfileServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return rcsProfileServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.profile.IRcsProfile");
        }

        public static IRcsProfile asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.profile.IRcsProfile");
            return iInterfaceQueryLocalInterface instanceof IRcsProfile ? (IRcsProfile) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                RcsProfileServiceResult value = getValue(i3);
                parcel2.writeNoException();
                sgh.e(parcel2, value);
            } else {
                if (i != 3) {
                    return false;
                }
                Bundle rcsConfig = getRcsConfig();
                parcel2.writeNoException();
                sgh.e(parcel2, rcsConfig);
            }
            return true;
        }
    }

    Bundle getRcsConfig();

    RcsProfileServiceResult getValue(int i);
}
