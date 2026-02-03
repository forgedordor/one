package com.google.android.aidl;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.sgh;
import defpackage.sgi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BaseStub extends Binder implements IInterface {
    private static sgi globalInterceptor;

    protected BaseStub(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(sgi sgiVar) {
        try {
            if (sgiVar == null) {
                throw new IllegalArgumentException("null interceptor");
            }
            if (globalInterceptor != null) {
                throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
            }
            globalInterceptor = sgiVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    protected void enforceNoDataAvail(Parcel parcel) {
        sgi sgiVar = globalInterceptor;
        if (sgiVar != null) {
            sgiVar.a();
            return;
        }
        int i = sgh.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        sgi sgiVar = globalInterceptor;
        return sgiVar == null ? dispatchTransaction(i, parcel, parcel2, i2) : sgiVar.b();
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
