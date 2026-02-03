package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.slc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISummarizationResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISummarizationResultCallback {
        static final int TRANSACTION_onSummarizationInferenceFailure = 3;
        static final int TRANSACTION_onSummarizationInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISummarizationResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISummarizationResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultCallback
            public void onSummarizationInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultCallback
            public void onSummarizationInferenceSuccess(slc slcVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slcVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISummarizationResultCallback");
        }

        public static ISummarizationResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationResultCallback");
            return iInterfaceQueryLocalInterface instanceof ISummarizationResultCallback ? (ISummarizationResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                slc slcVar = (slc) sgh.a(parcel, slc.CREATOR);
                enforceNoDataAvail(parcel);
                onSummarizationInferenceSuccess(slcVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSummarizationInferenceFailure(i3);
            return true;
        }
    }

    void onSummarizationInferenceFailure(int i);

    void onSummarizationInferenceSuccess(slc slcVar);
}
