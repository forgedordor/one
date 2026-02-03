package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIntegrationCallbackService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIntegrationCallbackService {
        static final int TRANSACTION_forwardCallbackEvent = 1;
        static final int TRANSACTION_registerDeathRecipient = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIntegrationCallbackService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService
            public void forwardCallbackEvent(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService
            public void registerDeathRecipient(IBinder iBinder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
        }

        public static IAppIntegrationCallbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
            return iInterfaceQueryLocalInterface instanceof IAppIntegrationCallbackService ? (IAppIntegrationCallbackService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                forwardCallbackEvent(bArrCreateByteArray);
            } else {
                if (i != 2) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                enforceNoDataAvail(parcel);
                registerDeathRecipient(strongBinder);
            }
            return true;
        }
    }

    void forwardCallbackEvent(byte[] bArr);

    void registerDeathRecipient(IBinder iBinder);
}
