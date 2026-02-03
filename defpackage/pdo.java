package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.room.IMultiInstanceInvalidationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdo implements IMultiInstanceInvalidationCallback {
    private final IBinder a;

    public pdo(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void onInvalidation(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeStringArray(strArr);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
