package com.google.android.gms.kids;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.kids.internal.ISupervisionListener;
import defpackage.dcer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class SupervisionListenerService extends Service {

    /* compiled from: PG */
    /* renamed from: com.google.android.gms.kids.SupervisionListenerService$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ISupervisionListener.Stub {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.kids.internal.ISupervisionListener
        public void onSupervisionExited() {
            SupervisionListenerService.this.a();
        }

        @Override // com.google.android.aidl.BaseStub, android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            parcel.getClass();
            if (dcer.c(SupervisionListenerService.this.getApplicationContext()).d(Binder.getCallingUid())) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            throw new RemoteException("Calling uid is not Google signed");
        }
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        throw null;
    }
}
