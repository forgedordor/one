package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.IAuthTabCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bn implements IAuthTabCallback {
    private final IBinder a;

    public bn(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            bo.b(parcelObtain, bundle, 0);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            bo.b(parcelObtain, bundle, 0);
            this.a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) bo.a(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeInt(i);
            bo.b(parcelObtain, bundle, 0);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            bo.b(parcelObtain, bundle, 0);
            this.a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
