package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sjm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IProofreadingResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProofreadingResultCallback {
        static final int TRANSACTION_onProofreadingInferenceFailure = 3;
        static final int TRANSACTION_onProofreadingInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProofreadingResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IProofreadingResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingResultCallback
            public void onProofreadingInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingResultCallback
            public void onProofreadingInferenceSuccess(sjm sjmVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjmVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IProofreadingResultCallback");
        }

        public static IProofreadingResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IProofreadingResultCallback");
            return iInterfaceQueryLocalInterface instanceof IProofreadingResultCallback ? (IProofreadingResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sjm sjmVar = (sjm) sgh.a(parcel, sjm.CREATOR);
                enforceNoDataAvail(parcel);
                onProofreadingInferenceSuccess(sjmVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onProofreadingInferenceFailure(i3);
            return true;
        }
    }

    void onProofreadingInferenceFailure(int i);

    void onProofreadingInferenceSuccess(sjm sjmVar);
}
