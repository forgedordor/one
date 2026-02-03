package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICortanaResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICortanaResultCallback {
        static final int TRANSACTION_onCortanaInferenceFailure = 3;
        static final int TRANSACTION_onCortanaInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICortanaResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ICortanaResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ICortanaResultCallback
            public void onCortanaInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ICortanaResultCallback
            public void onCortanaInferenceSuccess(shj shjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shjVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ICortanaResultCallback");
        }

        public static ICortanaResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaResultCallback");
            return iInterfaceQueryLocalInterface instanceof ICortanaResultCallback ? (ICortanaResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                shj shjVar = (shj) sgh.a(parcel, shj.CREATOR);
                enforceNoDataAvail(parcel);
                onCortanaInferenceSuccess(shjVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onCortanaInferenceFailure(i3);
            return true;
        }
    }

    void onCortanaInferenceFailure(int i);

    void onCortanaInferenceSuccess(shj shjVar);
}
