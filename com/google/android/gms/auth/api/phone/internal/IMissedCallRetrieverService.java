package com.google.android.gms.auth.api.phone.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMissedCallRetrieverService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMissedCallRetrieverService {
        static final int TRANSACTION_startMissedCallRetriever = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMissedCallRetrieverService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService
            public void startMissedCallRetriever(IMissedCallRetrieverCallbacks iMissedCallRetrieverCallbacks, IncomingCallRetrieverRequest incomingCallRetrieverRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMissedCallRetrieverCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, incomingCallRetrieverRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
        }

        public static IMissedCallRetrieverService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
            return iInterfaceQueryLocalInterface instanceof IMissedCallRetrieverService ? (IMissedCallRetrieverService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IMissedCallRetrieverCallbacks iMissedCallRetrieverCallbacksAsInterface = IMissedCallRetrieverCallbacks.Stub.asInterface(parcel.readStrongBinder());
            IncomingCallRetrieverRequest incomingCallRetrieverRequest = (IncomingCallRetrieverRequest) sgh.a(parcel, IncomingCallRetrieverRequest.CREATOR);
            enforceNoDataAvail(parcel);
            startMissedCallRetriever(iMissedCallRetrieverCallbacksAsInterface, incomingCallRetrieverRequest);
            parcel2.writeNoException();
            return true;
        }
    }

    void startMissedCallRetriever(IMissedCallRetrieverCallbacks iMissedCallRetrieverCallbacks, IncomingCallRetrieverRequest incomingCallRetrieverRequest);
}
