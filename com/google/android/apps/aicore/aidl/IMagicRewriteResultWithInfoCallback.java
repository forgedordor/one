package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.siw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMagicRewriteResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMagicRewriteResultWithInfoCallback {
        static final int TRANSACTION_onMagicRewriteInferenceFailure = 3;
        static final int TRANSACTION_onMagicRewriteInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMagicRewriteResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback
            public void onMagicRewriteInferenceFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback
            public void onMagicRewriteInferenceSuccess(siw siwVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, siwVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback");
        }

        public static IMagicRewriteResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof IMagicRewriteResultWithInfoCallback ? (IMagicRewriteResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onMagicRewriteInferenceFailure(shlVar);
            return true;
        }
    }

    void onMagicRewriteInferenceFailure(shl shlVar);

    void onMagicRewriteInferenceSuccess(siw siwVar);
}
