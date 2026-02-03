package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISummarizationStreamingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISummarizationStreamingCallback {
        static final int TRANSACTION_onNewText = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISummarizationStreamingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback
            public void onNewText(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback");
        }

        public static ISummarizationStreamingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback");
            return iInterfaceQueryLocalInterface instanceof ISummarizationStreamingCallback ? (ISummarizationStreamingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onNewText(string);
            return true;
        }
    }

    void onNewText(String str);
}
