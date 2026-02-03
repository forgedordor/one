package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.skm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISonnyResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISonnyResultCallback {
        static final int TRANSACTION_onSonnyFailure = 3;
        static final int TRANSACTION_onSonnySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISonnyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISonnyResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyResultCallback
            public void onSonnyFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyResultCallback
            public void onSonnySuccess(skm skmVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skmVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISonnyResultCallback");
        }

        public static ISonnyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISonnyResultCallback");
            return iInterfaceQueryLocalInterface instanceof ISonnyResultCallback ? (ISonnyResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                skm skmVar = (skm) sgh.a(parcel, skm.CREATOR);
                enforceNoDataAvail(parcel);
                onSonnySuccess(skmVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSonnyFailure(i3);
            return true;
        }
    }

    void onSonnyFailure(int i);

    void onSonnySuccess(skm skmVar);
}
