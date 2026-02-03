package com.google.android.setupcompat.portal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.setupcompat.portal.IPortalProgressCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IPortalProgressService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPortalProgressService {
        static final int TRANSACTION_onAllowMobileData = 4;
        static final int TRANSACTION_onGetRemainingValues = 5;
        static final int TRANSACTION_onPortalSessionStart = 1;
        static final int TRANSACTION_onSetCallback = 2;
        static final int TRANSACTION_onSuspend = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPortalProgressService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.IPortalProgressService");
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onAllowMobileData(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public Bundle onGetRemainingValues() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onPortalSessionStart() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onSetCallback(IPortalProgressCallback iPortalProgressCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPortalProgressCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onSuspend() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.IPortalProgressService");
        }

        public static IPortalProgressService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.IPortalProgressService");
            return iInterfaceQueryLocalInterface instanceof IPortalProgressService ? (IPortalProgressService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                onPortalSessionStart();
            } else if (i == 2) {
                IPortalProgressCallback iPortalProgressCallbackAsInterface = IPortalProgressCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onSetCallback(iPortalProgressCallbackAsInterface);
            } else if (i == 3) {
                onSuspend();
            } else if (i == 4) {
                boolean zG = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                onAllowMobileData(zG);
            } else {
                if (i != 5) {
                    return false;
                }
                Bundle bundleOnGetRemainingValues = onGetRemainingValues();
                parcel2.writeNoException();
                sgh.e(parcel2, bundleOnGetRemainingValues);
            }
            return true;
        }
    }

    void onAllowMobileData(boolean z);

    Bundle onGetRemainingValues();

    void onPortalSessionStart();

    void onSetCallback(IPortalProgressCallback iPortalProgressCallback);

    void onSuspend();
}
