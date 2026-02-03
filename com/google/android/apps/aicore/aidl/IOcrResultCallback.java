package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sja;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOcrResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOcrResultCallback {
        static final int TRANSACTION_onOcrInferenceFailure = 3;
        static final int TRANSACTION_onOcrInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOcrResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IOcrResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IOcrResultCallback
            public void onOcrInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IOcrResultCallback
            public void onOcrInferenceSuccess(sja sjaVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjaVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IOcrResultCallback");
        }

        public static IOcrResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IOcrResultCallback");
            return iInterfaceQueryLocalInterface instanceof IOcrResultCallback ? (IOcrResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sja sjaVar = (sja) sgh.a(parcel, sja.CREATOR);
                enforceNoDataAvail(parcel);
                onOcrInferenceSuccess(sjaVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onOcrInferenceFailure(i3);
            return true;
        }
    }

    void onOcrInferenceFailure(int i);

    void onOcrInferenceSuccess(sja sjaVar);
}
