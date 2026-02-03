package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IQuestionToAnswerStreamingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IQuestionToAnswerStreamingCallback {
        static final int TRANSACTION_onNewText = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IQuestionToAnswerStreamingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback
            public void onNewText(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback");
        }

        public static IQuestionToAnswerStreamingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback");
            return iInterfaceQueryLocalInterface instanceof IQuestionToAnswerStreamingCallback ? (IQuestionToAnswerStreamingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
