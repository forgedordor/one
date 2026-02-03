package com.google.android.play.core.install.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.play.core.install.protocol.IInstallServiceCallback;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IInstallService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInstallService {
        static final int TRANSACTION_completeUpdate = 3;
        static final int TRANSACTION_requestInfo = 2;
        static final int TRANSACTION_requestInstall = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInstallService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
            }

            @Override // com.google.android.play.core.install.protocol.IInstallService
            public void completeUpdate(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iInstallServiceCallback);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallService
            public void requestInfo(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iInstallServiceCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallService
            public void requestInstall(String str, List<Bundle> list, Bundle bundle, IInstallServiceCallback iInstallServiceCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iInstallServiceCallback);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.install.protocol.IInstallService");
        }

        public static IInstallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            return iInterfaceQueryLocalInterface instanceof IInstallService ? (IInstallService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                IInstallServiceCallback iInstallServiceCallbackAsInterface = IInstallServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestInstall(string, arrayListCreateTypedArrayList, bundle, iInstallServiceCallbackAsInterface);
            } else if (i == 2) {
                String string2 = parcel.readString();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                IInstallServiceCallback iInstallServiceCallbackAsInterface2 = IInstallServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestInfo(string2, bundle2, iInstallServiceCallbackAsInterface2);
            } else {
                if (i != 3) {
                    return false;
                }
                String string3 = parcel.readString();
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                IInstallServiceCallback iInstallServiceCallbackAsInterface3 = IInstallServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                completeUpdate(string3, bundle3, iInstallServiceCallbackAsInterface3);
            }
            return true;
        }
    }

    void completeUpdate(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback);

    void requestInfo(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback);

    void requestInstall(String str, List<Bundle> list, Bundle bundle, IInstallServiceCallback iInstallServiceCallback);
}
