package com.google.android.apps.tycho.psd.api;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFiProductSpecificDataCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFiProductSpecificDataCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFiProductSpecificDataCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback");
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback
            public void onError(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback
            public void onSuccess(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback");
        }

        public static IFiProductSpecificDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback");
            return iInterfaceQueryLocalInterface instanceof IFiProductSpecificDataCallback ? (IFiProductSpecificDataCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(bundle);
            } else {
                if (i != 2) {
                    return false;
                }
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                onError(string);
            }
            return true;
        }
    }

    void onError(String str);

    void onSuccess(Bundle bundle);
}
