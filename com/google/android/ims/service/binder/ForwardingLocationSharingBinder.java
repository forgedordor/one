package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingLocationSharingBinder extends ILocationSharing.Stub implements dhfq<ILocationSharing> {
    private ILocationSharing a;
    private final Context b;

    public ForwardingLocationSharingBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.dhfq
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.dhfq
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return dhfp.a(this);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
        return ((ILocationSharing) getDelegate()).pushLocation(str, locationInformation, str2);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
        return ((ILocationSharing) getDelegate()).pushLocationToGroup(j, locationInformation, str);
    }

    @Override // defpackage.dhfq
    public synchronized void set(IBinder iBinder) {
        this.a = (ILocationSharing.Stub) iBinder;
    }

    @Override // defpackage.dhfq
    public synchronized ILocationSharing getInterface() {
        return this.a;
    }
}
