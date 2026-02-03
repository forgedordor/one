package com.google.android.apps.tachyon.telecom;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.telecom.IHandoverFallbackSource;
import com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITelecomFallbackService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITelecomFallbackService {
        static final int TRANSACTION_requestHandover = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITelecomFallbackService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
            }

            @Override // com.google.android.apps.tachyon.telecom.ITelecomFallbackService
            public IHandoverFallbackTarget requestHandover(IHandoverFallbackSource iHandoverFallbackSource, Uri uri, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iHandoverFallbackSource);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IHandoverFallbackTarget iHandoverFallbackTargetAsInterface = IHandoverFallbackTarget.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iHandoverFallbackTargetAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
        }

        public static ITelecomFallbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
            return iInterfaceQueryLocalInterface instanceof ITelecomFallbackService ? (ITelecomFallbackService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IHandoverFallbackSource iHandoverFallbackSourceAsInterface = IHandoverFallbackSource.Stub.asInterface(parcel.readStrongBinder());
            Uri uri = (Uri) sgh.a(parcel, Uri.CREATOR);
            Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            IHandoverFallbackTarget iHandoverFallbackTargetRequestHandover = requestHandover(iHandoverFallbackSourceAsInterface, uri, bundle);
            parcel2.writeNoException();
            sgh.f(parcel2, iHandoverFallbackTargetRequestHandover);
            return true;
        }
    }

    IHandoverFallbackTarget requestHandover(IHandoverFallbackSource iHandoverFallbackSource, Uri uri, Bundle bundle);
}
