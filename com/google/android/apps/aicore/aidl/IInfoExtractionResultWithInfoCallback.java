package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.sig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IInfoExtractionResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInfoExtractionResultWithInfoCallback {
        static final int TRANSACTION_onInfoExtractionInferenceFailure = 3;
        static final int TRANSACTION_onInfoExtractionInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInfoExtractionResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback
            public void onInfoExtractionInferenceFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback
            public void onInfoExtractionInferenceSuccess(sig sigVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sigVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback");
        }

        public static IInfoExtractionResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof IInfoExtractionResultWithInfoCallback ? (IInfoExtractionResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sig sigVar = (sig) sgh.a(parcel, sig.CREATOR);
                enforceNoDataAvail(parcel);
                onInfoExtractionInferenceSuccess(sigVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onInfoExtractionInferenceFailure(shlVar);
            return true;
        }
    }

    void onInfoExtractionInferenceFailure(shl shlVar);

    void onInfoExtractionInferenceSuccess(sig sigVar);
}
