package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.siq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILLMResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILLMResultCallback {
        static final int TRANSACTION_onLLMInferenceFailure = 3;
        static final int TRANSACTION_onLLMInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILLMResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ILLMResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
            public void onLLMInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
            public void onLLMInferenceSuccess(siq siqVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, siqVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ILLMResultCallback");
        }

        public static ILLMResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMResultCallback");
            return iInterfaceQueryLocalInterface instanceof ILLMResultCallback ? (ILLMResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onLLMInferenceFailure(i3);
            return true;
        }
    }

    void onLLMInferenceFailure(int i);

    void onLLMInferenceSuccess(siq siqVar);
}
