package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bv implements IPostMessageService {
    private final IBinder a;

    public bv(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.customtabs.IPostMessageService
    public final void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeStrongInterface(iCustomTabsCallback);
            bw.b(parcelObtain, bundle);
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.IPostMessageService
    public final void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeStrongInterface(iCustomTabsCallback);
            parcelObtain.writeString(str);
            bw.b(parcelObtain, bundle);
            this.a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
