package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.skc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotResultCallback {
        static final int TRANSACTION_onRosieRobotInferenceFailure = 3;
        static final int TRANSACTION_onRosieRobotInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultCallback
            public void onRosieRobotInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultCallback
            public void onRosieRobotInferenceSuccess(skc skcVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skcVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
        }

        public static IRosieRobotResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
            return iInterfaceQueryLocalInterface instanceof IRosieRobotResultCallback ? (IRosieRobotResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onRosieRobotInferenceFailure(i3);
            return true;
        }
    }

    void onRosieRobotInferenceFailure(int i);

    void onRosieRobotInferenceSuccess(skc skcVar);
}
