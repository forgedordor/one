package com.google.android.gms.auth.api.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFidoPersistentService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFidoPersistentService {
        static final int TRANSACTION_listPasskeysForRp = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFidoPersistentService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.IFidoPersistentService");
            }

            @Override // com.google.android.gms.auth.api.fido.IFidoPersistentService
            public void listPasskeysForRp(IListPasskeysForRpCallback iListPasskeysForRpCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iListPasskeysForRpCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.IFidoPersistentService");
        }

        public static IFidoPersistentService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.IFidoPersistentService");
            return iInterfaceQueryLocalInterface instanceof IFidoPersistentService ? (IFidoPersistentService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IListPasskeysForRpCallback iListPasskeysForRpCallbackAsInterface = IListPasskeysForRpCallback.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            listPasskeysForRp(iListPasskeysForRpCallbackAsInterface, string);
            return true;
        }
    }

    void listPasskeysForRp(IListPasskeysForRpCallback iListPasskeysForRpCallback, String str);
}
