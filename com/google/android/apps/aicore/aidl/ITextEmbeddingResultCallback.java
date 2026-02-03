package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.slw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextEmbeddingResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextEmbeddingResultCallback {
        static final int TRANSACTION_onTextEmbeddingInferenceFailure = 3;
        static final int TRANSACTION_onTextEmbeddingInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextEmbeddingResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
            public void onTextEmbeddingInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
            public void onTextEmbeddingInferenceSuccess(slw slwVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slwVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback");
        }

        public static ITextEmbeddingResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback");
            return iInterfaceQueryLocalInterface instanceof ITextEmbeddingResultCallback ? (ITextEmbeddingResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                slw slwVar = (slw) sgh.a(parcel, slw.CREATOR);
                enforceNoDataAvail(parcel);
                onTextEmbeddingInferenceSuccess(slwVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextEmbeddingInferenceFailure(i3);
            return true;
        }
    }

    void onTextEmbeddingInferenceFailure(int i);

    void onTextEmbeddingInferenceSuccess(slw slwVar);
}
