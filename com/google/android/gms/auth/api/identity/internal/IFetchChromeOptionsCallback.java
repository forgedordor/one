package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFetchChromeOptionsCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFetchChromeOptionsCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFetchChromeOptionsCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback
            public void onResult(Status status, ChromeOptions chromeOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, chromeOptions);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback");
        }

        public static IFetchChromeOptionsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback");
            return iInterfaceQueryLocalInterface instanceof IFetchChromeOptionsCallback ? (IFetchChromeOptionsCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ChromeOptions chromeOptions = (ChromeOptions) sgh.a(parcel, ChromeOptions.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, chromeOptions);
            return true;
        }
    }

    void onResult(Status status, ChromeOptions chromeOptions);
}
