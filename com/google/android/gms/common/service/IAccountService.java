package com.google.android.gms.common.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAccountService {
        static final int TRANSACTION_clearSelectedAccount = 2;
        static final int TRANSACTION_resolveAccountName = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.service.IAccountService");
            }

            @Override // com.google.android.gms.common.service.IAccountService
            public void clearSelectedAccount(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.service.IAccountService
            public String resolveAccountName(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.service.IAccountService");
        }

        public static IAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.service.IAccountService");
            return iInterfaceQueryLocalInterface instanceof IAccountService ? (IAccountService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                String strResolveAccountName = resolveAccountName(string, string2);
                parcel2.writeNoException();
                parcel2.writeString(strResolveAccountName);
            } else {
                if (i != 2) {
                    return false;
                }
                String string3 = parcel.readString();
                enforceNoDataAvail(parcel);
                clearSelectedAccount(string3);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void clearSelectedAccount(String str);

    String resolveAccountName(String str, String str2);
}
