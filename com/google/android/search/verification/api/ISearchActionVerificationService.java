package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ISearchActionVerificationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchActionVerificationService {
        static final int TRANSACTION_getVersion = 2;
        static final int TRANSACTION_isSearchAction = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.search.verification.api.ISearchActionVerificationService");
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public int getVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.search.verification.api.ISearchActionVerificationService");
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            return iInterfaceQueryLocalInterface instanceof ISearchActionVerificationService ? (ISearchActionVerificationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean zIsSearchAction = isSearchAction(intent, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(zIsSearchAction ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
            }
            return true;
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}
