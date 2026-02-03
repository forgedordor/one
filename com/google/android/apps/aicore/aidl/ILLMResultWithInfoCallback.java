package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.siq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILLMResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILLMResultWithInfoCallback {
        static final int TRANSACTION_onLLMInferenceFailure = 3;
        static final int TRANSACTION_onLLMInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILLMResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback
            public void onLLMInferenceFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback
            public void onLLMInferenceSuccess(siq siqVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, siqVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
        }

        public static ILLMResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof ILLMResultWithInfoCallback ? (ILLMResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                siq siqVar = (siq) sgh.a(parcel, siq.CREATOR);
                enforceNoDataAvail(parcel);
                onLLMInferenceSuccess(siqVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onLLMInferenceFailure(shlVar);
            return true;
        }
    }

    void onLLMInferenceFailure(shl shlVar);

    void onLLMInferenceSuccess(siq siqVar);
}
