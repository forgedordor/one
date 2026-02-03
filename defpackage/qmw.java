package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmw implements IWorkManagerImpl {
    private final IBinder a;

    public qmw(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(7, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
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

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
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

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void setForegroundAsync(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public final void updateUniquePeriodicWorkRequest(String str, byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(iWorkManagerImplCallback);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
