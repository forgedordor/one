package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ii implements IResultReceiver {
    private final IBinder a;

    public ii(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.os.IResultReceiver
    public final void send(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
