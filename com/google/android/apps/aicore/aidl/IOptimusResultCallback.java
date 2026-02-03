package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sji;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOptimusResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOptimusResultCallback {
        static final int TRANSACTION_onOptimusInferenceFailure = 3;
        static final int TRANSACTION_onOptimusInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOptimusResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IOptimusResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusResultCallback
            public void onOptimusInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusResultCallback
            public void onOptimusInferenceSuccess(sji sjiVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjiVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IOptimusResultCallback");
        }

        public static IOptimusResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IOptimusResultCallback");
            return iInterfaceQueryLocalInterface instanceof IOptimusResultCallback ? (IOptimusResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sji sjiVar = (sji) sgh.a(parcel, sji.CREATOR);
                enforceNoDataAvail(parcel);
                onOptimusInferenceSuccess(sjiVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onOptimusInferenceFailure(i3);
            return true;
        }
    }

    void onOptimusInferenceFailure(int i);

    void onOptimusInferenceSuccess(sji sjiVar);
}
