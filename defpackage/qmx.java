package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmx implements IWorkManagerImplCallback {
    private final IBinder a;

    public qmx(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void onFailure(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void onSuccess(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
