package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sma;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextToImageResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextToImageResultCallback {
        static final int TRANSACTION_onTextToImageInferenceFailure = 3;
        static final int TRANSACTION_onTextToImageInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextToImageResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextToImageResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextToImageResultCallback
            public void onTextToImageInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextToImageResultCallback
            public void onTextToImageInferenceSuccess(sma smaVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, smaVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextToImageResultCallback");
        }

        public static ITextToImageResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextToImageResultCallback");
            return iInterfaceQueryLocalInterface instanceof ITextToImageResultCallback ? (ITextToImageResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sma smaVar = (sma) sgh.a(parcel, sma.CREATOR);
                enforceNoDataAvail(parcel);
                onTextToImageInferenceSuccess(smaVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextToImageInferenceFailure(i3);
            return true;
        }
    }

    void onTextToImageInferenceFailure(int i);

    void onTextToImageInferenceSuccess(sma smaVar);
}
