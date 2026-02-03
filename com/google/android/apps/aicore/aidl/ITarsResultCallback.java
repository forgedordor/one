package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.slk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITarsResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITarsResultCallback {
        static final int TRANSACTION_onTarsFailure = 3;
        static final int TRANSACTION_onTarsSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITarsResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITarsResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
            public void onTarsFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
            public void onTarsSuccess(slk slkVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slkVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITarsResultCallback");
        }

        public static ITarsResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITarsResultCallback");
            return iInterfaceQueryLocalInterface instanceof ITarsResultCallback ? (ITarsResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                slk slkVar = (slk) sgh.a(parcel, slk.CREATOR);
                enforceNoDataAvail(parcel);
                onTarsSuccess(slkVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTarsFailure(i3);
            return true;
        }
    }

    void onTarsFailure(int i);

    void onTarsSuccess(slk slkVar);
}
