package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.sjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IQuestionToAnswerResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IQuestionToAnswerResultWithInfoCallback {
        static final int TRANSACTION_onQuestionToAnswerInferenceFailure = 3;
        static final int TRANSACTION_onQuestionToAnswerInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IQuestionToAnswerResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback
            public void onQuestionToAnswerInferenceFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback
            public void onQuestionToAnswerInferenceSuccess(sjs sjsVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sjsVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback");
        }

        public static IQuestionToAnswerResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof IQuestionToAnswerResultWithInfoCallback ? (IQuestionToAnswerResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sjs sjsVar = (sjs) sgh.a(parcel, sjs.CREATOR);
                enforceNoDataAvail(parcel);
                onQuestionToAnswerInferenceSuccess(sjsVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onQuestionToAnswerInferenceFailure(shlVar);
            return true;
        }
    }

    void onQuestionToAnswerInferenceFailure(shl shlVar);

    void onQuestionToAnswerInferenceSuccess(sjs sjsVar);
}
