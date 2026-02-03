package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIntegrationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIntegrationService {
        static final int TRANSACTION_startSession = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIntegrationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService
            public IAppIntegrationSession startSession(String str, IAppIntegrationSessionCallback iAppIntegrationSessionCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAppIntegrationSessionCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IAppIntegrationSession iAppIntegrationSessionAsInterface = IAppIntegrationSession.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iAppIntegrationSessionAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
        }

        public static IAppIntegrationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
            return iInterfaceQueryLocalInterface instanceof IAppIntegrationService ? (IAppIntegrationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            String string = parcel.readString();
            IAppIntegrationSessionCallback iAppIntegrationSessionCallbackAsInterface = IAppIntegrationSessionCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            IAppIntegrationSession iAppIntegrationSessionStartSession = startSession(string, iAppIntegrationSessionCallbackAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, iAppIntegrationSessionStartSession);
            return true;
        }
    }

    IAppIntegrationSession startSession(String str, IAppIntegrationSessionCallback iAppIntegrationSessionCallback);
}
