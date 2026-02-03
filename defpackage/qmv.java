package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmv implements IListenableWorkerImpl {
    private final IBinder a;

    public qmv(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public final void getForegroundInfoAsync(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public final void interrupt(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public final void startWork(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
