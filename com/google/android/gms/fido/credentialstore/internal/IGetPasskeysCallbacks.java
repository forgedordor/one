package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetPasskeysCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetPasskeysCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetPasskeysCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks
            public void onResult(Status status, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
        }

        public static IGetPasskeysCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGetPasskeysCallbacks ? (IGetPasskeysCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, parcelFileDescriptor);
            return true;
        }
    }

    void onResult(Status status, ParcelFileDescriptor parcelFileDescriptor);
}
