package com.google.android.play.core.appupdate.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppUpdateService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppUpdateService {
        static final int TRANSACTION_completeUpdate = 3;
        static final int TRANSACTION_requestInfo = 2;
        static final int TRANSACTION_zzz = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppUpdateService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateService
            public void completeUpdate(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAppUpdateServiceCallback);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateService
            public void requestInfo(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAppUpdateServiceCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateService
            public void zzz(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        }

        public static IAppUpdateService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            return iInterfaceQueryLocalInterface instanceof IAppUpdateService ? (IAppUpdateService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String string = parcel.readString();
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                IAppUpdateServiceCallback iAppUpdateServiceCallbackAsInterface = IAppUpdateServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestInfo(string, bundle, iAppUpdateServiceCallbackAsInterface);
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                zzz(bundle2);
                return true;
            }
            String string2 = parcel.readString();
            Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
            IAppUpdateServiceCallback iAppUpdateServiceCallbackAsInterface2 = IAppUpdateServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            completeUpdate(string2, bundle3, iAppUpdateServiceCallbackAsInterface2);
            return true;
        }
    }

    void completeUpdate(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback);

    void requestInfo(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback);

    void zzz(Bundle bundle);
}
