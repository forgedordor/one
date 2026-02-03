package com.google.android.apps.tycho.psd.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFiProductSpecificDataService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFiProductSpecificDataService {
        static final int TRANSACTION_getFiProductSpecificBinaryData = 2;
        static final int TRANSACTION_getFiProductSpecificData = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFiProductSpecificDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService");
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService
            public void getFiProductSpecificBinaryData(String str, IFiProductSpecificBinaryDataCallback iFiProductSpecificBinaryDataCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFiProductSpecificBinaryDataCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService
            public void getFiProductSpecificData(String str, IFiProductSpecificDataCallback iFiProductSpecificDataCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFiProductSpecificDataCallback);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService");
        }

        public static IFiProductSpecificDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService");
            return iInterfaceQueryLocalInterface instanceof IFiProductSpecificDataService ? (IFiProductSpecificDataService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                IFiProductSpecificDataCallback iFiProductSpecificDataCallbackAsInterface = IFiProductSpecificDataCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getFiProductSpecificData(string, iFiProductSpecificDataCallbackAsInterface);
            } else {
                if (i != 2) {
                    return false;
                }
                String string2 = parcel.readString();
                IFiProductSpecificBinaryDataCallback iFiProductSpecificBinaryDataCallbackAsInterface = IFiProductSpecificBinaryDataCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getFiProductSpecificBinaryData(string2, iFiProductSpecificBinaryDataCallbackAsInterface);
            }
            return true;
        }
    }

    void getFiProductSpecificBinaryData(String str, IFiProductSpecificBinaryDataCallback iFiProductSpecificBinaryDataCallback);

    void getFiProductSpecificData(String str, IFiProductSpecificDataCallback iFiProductSpecificDataCallback);
}
