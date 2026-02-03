package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.slo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextClassificationResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextClassificationResultCallback {
        static final int TRANSACTION_onTextClassificationInferenceFailure = 3;
        static final int TRANSACTION_onTextClassificationInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextClassificationResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextClassificationResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextClassificationResultCallback
            public void onTextClassificationInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextClassificationResultCallback
            public void onTextClassificationInferenceSuccess(slo sloVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sloVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextClassificationResultCallback");
        }

        public static ITextClassificationResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextClassificationResultCallback");
            return iInterfaceQueryLocalInterface instanceof ITextClassificationResultCallback ? (ITextClassificationResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                slo sloVar = (slo) sgh.a(parcel, slo.CREATOR);
                enforceNoDataAvail(parcel);
                onTextClassificationInferenceSuccess(sloVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextClassificationInferenceFailure(i3);
            return true;
        }
    }

    void onTextClassificationInferenceFailure(int i);

    void onTextClassificationInferenceSuccess(slo sloVar);
}
