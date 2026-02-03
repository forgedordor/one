package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.ski;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISmartReplyResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmartReplyResultWithInfoCallback {
        static final int TRANSACTION_onSmartReplyInferenceFailure = 3;
        static final int TRANSACTION_onSmartReplyInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmartReplyResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback
            public void onSmartReplyInferenceFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback
            public void onSmartReplyInferenceSuccess(ski skiVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skiVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback");
        }

        public static ISmartReplyResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof ISmartReplyResultWithInfoCallback ? (ISmartReplyResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ski skiVar = (ski) sgh.a(parcel, ski.CREATOR);
                enforceNoDataAvail(parcel);
                onSmartReplyInferenceSuccess(skiVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onSmartReplyInferenceFailure(shlVar);
            return true;
        }
    }

    void onSmartReplyInferenceFailure(shl shlVar);

    void onSmartReplyInferenceSuccess(ski skiVar);
}
