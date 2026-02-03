package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBaymaxResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBaymaxResultCallback {
        static final int TRANSACTION_onBaymaxInferenceFailure = 3;
        static final int TRANSACTION_onBaymaxInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBaymaxResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IBaymaxResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxResultCallback
            public void onBaymaxInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxResultCallback
            public void onBaymaxInferenceSuccess(sgv sgvVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgvVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IBaymaxResultCallback");
        }

        public static IBaymaxResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IBaymaxResultCallback");
            return iInterfaceQueryLocalInterface instanceof IBaymaxResultCallback ? (IBaymaxResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sgv sgvVar = (sgv) sgh.a(parcel, sgv.CREATOR);
                enforceNoDataAvail(parcel);
                onBaymaxInferenceSuccess(sgvVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onBaymaxInferenceFailure(i3);
            return true;
        }
    }

    void onBaymaxInferenceFailure(int i);

    void onBaymaxInferenceSuccess(sgv sgvVar);
}
