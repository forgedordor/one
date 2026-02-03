package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWorkAccountCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWorkAccountCallback {
        static final int TRANSACTION_onAccountAdded = 1;
        static final int TRANSACTION_onAccountRemoved = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWorkAccountCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.IWorkAccountCallback");
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountCallback
            public void onAccountAdded(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountCallback
            public void onAccountRemoved(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.IWorkAccountCallback");
        }

        public static IWorkAccountCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
            return iInterfaceQueryLocalInterface instanceof IWorkAccountCallback ? (IWorkAccountCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Account account = (Account) sgh.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                onAccountAdded(account);
            } else {
                if (i != 2) {
                    return false;
                }
                boolean zG = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                onAccountRemoved(zG);
            }
            return true;
        }
    }

    void onAccountAdded(Account account);

    void onAccountRemoved(boolean z);
}
