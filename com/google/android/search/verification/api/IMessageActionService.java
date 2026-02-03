package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IMessageActionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMessageActionService {
        static final int TRANSACTION_sendMessage = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMessageActionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.search.verification.api.IMessageActionService");
            }

            @Override // com.google.android.search.verification.api.IMessageActionService
            public void sendMessage(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.search.verification.api.IMessageActionService");
        }

        public static IMessageActionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.IMessageActionService");
            return iInterfaceQueryLocalInterface instanceof IMessageActionService ? (IMessageActionService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
            enforceNoDataAvail(parcel);
            sendMessage(intent);
            return true;
        }
    }

    void sendMessage(Intent intent);
}
