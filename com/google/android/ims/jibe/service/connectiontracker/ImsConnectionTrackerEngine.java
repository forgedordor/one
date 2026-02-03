package com.google.android.ims.jibe.service.connectiontracker;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.dezc;
import defpackage.dhff;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsConnectionTrackerEngine extends IImsConnectionTracker.Stub {
    private final Context a;
    private final fcsu b;

    public ImsConnectionTrackerEngine(Context context, fcsu<dezc> fcsuVar) {
        this.a = context;
        this.b = fcsuVar;
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public ImsRegistrationState getRegistrationState() throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        return ((dezc) this.b.b()).getRegistrationState();
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public boolean isRegistered() throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        return ((dezc) this.b.b()).isRegistered();
    }
}
