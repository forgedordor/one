package com.google.android.ims.client.capabilities;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.capabilities.CapabilitiesListenerInternal;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ICapabilitiesExchangeService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICapabilitiesExchangeService {
        static final int TRANSACTION_registerCapabilitiesListener = 1;
        static final int TRANSACTION_requestCapabilities = 3;
        static final int TRANSACTION_requestMultipleCapabilities = 4;
        static final int TRANSACTION_unregisterCapabilitiesListener = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICapabilitiesExchangeService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public boolean registerCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, capabilitiesListenerInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public int requestCapabilities(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public int requestMultipleCapabilities(String[] strArr, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public boolean unregisterCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, capabilitiesListenerInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
        }

        public static ICapabilitiesExchangeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
            return iInterfaceQueryLocalInterface instanceof ICapabilitiesExchangeService ? (ICapabilitiesExchangeService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                CapabilitiesListenerInternal capabilitiesListenerInternalAsInterface = CapabilitiesListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zRegisterCapabilitiesListener = registerCapabilitiesListener(capabilitiesListenerInternalAsInterface, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterCapabilitiesListener ? 1 : 0);
            } else if (i == 2) {
                CapabilitiesListenerInternal capabilitiesListenerInternalAsInterface2 = CapabilitiesListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zUnregisterCapabilitiesListener = unregisterCapabilitiesListener(capabilitiesListenerInternalAsInterface2, bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zUnregisterCapabilitiesListener ? 1 : 0);
            } else if (i == 3) {
                String string = parcel.readString();
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iRequestCapabilities = requestCapabilities(string, bundle3);
                parcel2.writeNoException();
                parcel2.writeInt(iRequestCapabilities);
            } else {
                if (i != 4) {
                    return false;
                }
                String[] strArrCreateStringArray = parcel.createStringArray();
                Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iRequestMultipleCapabilities = requestMultipleCapabilities(strArrCreateStringArray, bundle4);
                parcel2.writeNoException();
                parcel2.writeInt(iRequestMultipleCapabilities);
            }
            return true;
        }
    }

    boolean registerCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle);

    int requestCapabilities(String str, Bundle bundle);

    int requestMultipleCapabilities(String[] strArr, Bundle bundle);

    boolean unregisterCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle);
}
