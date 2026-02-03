package com.google.android.ims.client.provisioning;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IProvisioningService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProvisioningService {
        static final int TRANSACTION_getConfigurationValues = 1;
        static final int TRANSACTION_getProvisioningState = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProvisioningService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.provisioning.IProvisioningService");
            }

            @Override // com.google.android.ims.client.provisioning.IProvisioningService
            public Bundle getConfigurationValues(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.ims.client.provisioning.IProvisioningService
            public int getProvisioningState() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.provisioning.IProvisioningService");
        }

        public static IProvisioningService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.provisioning.IProvisioningService");
            return iInterfaceQueryLocalInterface instanceof IProvisioningService ? (IProvisioningService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                Bundle configurationValues = getConfigurationValues(i3);
                parcel2.writeNoException();
                sgh.e(parcel2, configurationValues);
            } else {
                if (i != 2) {
                    return false;
                }
                int provisioningState = getProvisioningState();
                parcel2.writeNoException();
                parcel2.writeInt(provisioningState);
            }
            return true;
        }
    }

    Bundle getConfigurationValues(int i);

    int getProvisioningState();
}
