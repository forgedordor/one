package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.skc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotResultWithInfoCallback {
        static final int TRANSACTION_onRosieRobotInferenceFailure = 3;
        static final int TRANSACTION_onRosieRobotInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback
            public void onRosieRobotInferenceFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback
            public void onRosieRobotInferenceSuccess(skc skcVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skcVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback");
        }

        public static IRosieRobotResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof IRosieRobotResultWithInfoCallback ? (IRosieRobotResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                skc skcVar = (skc) sgh.a(parcel, skc.CREATOR);
                enforceNoDataAvail(parcel);
                onRosieRobotInferenceSuccess(skcVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onRosieRobotInferenceFailure(shlVar);
            return true;
        }
    }

    void onRosieRobotInferenceFailure(shl shlVar);

    void onRosieRobotInferenceSuccess(skc skcVar);
}
