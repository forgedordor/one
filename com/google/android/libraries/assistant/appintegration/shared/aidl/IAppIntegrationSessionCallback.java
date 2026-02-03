package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIntegrationSessionCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIntegrationSessionCallback {
        static final int TRANSACTION_onUpdate = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIntegrationSessionCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback
            public void onUpdate(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
        }

        public static IAppIntegrationSessionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
            return iInterfaceQueryLocalInterface instanceof IAppIntegrationSessionCallback ? (IAppIntegrationSessionCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onUpdate(bArrCreateByteArray);
            return true;
        }
    }

    void onUpdate(byte[] bArr);
}
