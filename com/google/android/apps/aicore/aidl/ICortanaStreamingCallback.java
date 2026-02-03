package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICortanaStreamingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICortanaStreamingCallback {
        static final int TRANSACTION_onNewText = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICortanaStreamingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ICortanaStreamingCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ICortanaStreamingCallback
            public void onNewText(int i, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ICortanaStreamingCallback");
        }

        public static ICortanaStreamingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaStreamingCallback");
            return iInterfaceQueryLocalInterface instanceof ICortanaStreamingCallback ? (ICortanaStreamingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onNewText(i3, string);
            return true;
        }
    }

    void onNewText(int i, String str);
}
