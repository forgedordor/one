package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotStreamingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotStreamingCallback {
        static final int TRANSACTION_onNewEncodedText = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotStreamingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotStreamingCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotStreamingCallback
            public void onNewEncodedText(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotStreamingCallback");
        }

        public static IRosieRobotStreamingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotStreamingCallback");
            return iInterfaceQueryLocalInterface instanceof IRosieRobotStreamingCallback ? (IRosieRobotStreamingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onNewEncodedText(string);
            return true;
        }
    }

    void onNewEncodedText(String str);
}
