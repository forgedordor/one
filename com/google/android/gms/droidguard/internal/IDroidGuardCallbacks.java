package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDroidGuardCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDroidGuardCallbacks {
        static final int TRANSACTION_onDroidGuardResults = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDroidGuardCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardCallbacks
            public void onDroidGuardResults(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
        }

        public static IDroidGuardCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
            return iInterfaceQueryLocalInterface instanceof IDroidGuardCallbacks ? (IDroidGuardCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onDroidGuardResults(bArrCreateByteArray);
            return true;
        }
    }

    void onDroidGuardResults(byte[] bArr);
}
