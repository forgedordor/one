package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.siw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMagicRewriteResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMagicRewriteResultCallback {
        static final int TRANSACTION_onMagicRewriteInferenceFailure = 3;
        static final int TRANSACTION_onMagicRewriteInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMagicRewriteResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
            public void onMagicRewriteInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
            public void onMagicRewriteInferenceSuccess(siw siwVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, siwVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback");
        }

        public static IMagicRewriteResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback");
            return iInterfaceQueryLocalInterface instanceof IMagicRewriteResultCallback ? (IMagicRewriteResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                siw siwVar = (siw) sgh.a(parcel, siw.CREATOR);
                enforceNoDataAvail(parcel);
                onMagicRewriteInferenceSuccess(siwVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onMagicRewriteInferenceFailure(i3);
            return true;
        }
    }

    void onMagicRewriteInferenceFailure(int i);

    void onMagicRewriteInferenceSuccess(siw siwVar);
}
