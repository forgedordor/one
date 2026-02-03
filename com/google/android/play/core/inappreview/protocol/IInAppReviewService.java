package com.google.android.play.core.inappreview.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IInAppReviewService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppReviewService {
        static final int TRANSACTION_getLaunchReviewFlowInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppReviewService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            }

            @Override // com.google.android.play.core.inappreview.protocol.IInAppReviewService
            public void getLaunchReviewFlowInfo(String str, Bundle bundle, IInAppReviewServiceCallback iInAppReviewServiceCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iInAppReviewServiceCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        }

        public static IInAppReviewService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            return iInterfaceQueryLocalInterface instanceof IInAppReviewService ? (IInAppReviewService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
            IInAppReviewServiceCallback iInAppReviewServiceCallbackAsInterface = IInAppReviewServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getLaunchReviewFlowInfo(string, bundle, iInAppReviewServiceCallbackAsInterface);
            return true;
        }
    }

    void getLaunchReviewFlowInfo(String str, Bundle bundle, IInAppReviewServiceCallback iInAppReviewServiceCallback);
}
