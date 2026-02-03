package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sgr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAstroboyResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAstroboyResultCallback {
        static final int TRANSACTION_onAstroboyFailure = 3;
        static final int TRANSACTION_onAstroboySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAstroboyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAstroboyResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IAstroboyResultCallback
            public void onAstroboyFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAstroboyResultCallback
            public void onAstroboySuccess(sgr sgrVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgrVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAstroboyResultCallback");
        }

        public static IAstroboyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAstroboyResultCallback");
            return iInterfaceQueryLocalInterface instanceof IAstroboyResultCallback ? (IAstroboyResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sgr sgrVar = (sgr) sgh.a(parcel, sgr.CREATOR);
                enforceNoDataAvail(parcel);
                onAstroboySuccess(sgrVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onAstroboyFailure(i3);
            return true;
        }
    }

    void onAstroboyFailure(int i);

    void onAstroboySuccess(sgr sgrVar);
}
