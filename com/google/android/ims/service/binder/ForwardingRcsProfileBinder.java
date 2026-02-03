package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.profile.RcsProfileServiceResult;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ForwardingRcsProfileBinder extends IRcsProfile.Stub implements dhfq<IRcsProfile> {
    private IRcsProfile a;
    private final Context b;

    public ForwardingRcsProfileBinder(Context context) {
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

    @Override // defpackage.dhfq
    public synchronized IRcsProfile getInterface() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public Bundle getRcsConfig() {
        return ((IRcsProfile) getDelegate()).getRcsConfig();
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public RcsProfileServiceResult getValue(int i) {
        return ((IRcsProfile) getDelegate()).getValue(i);
    }

    @Override // defpackage.dhfq
    public synchronized void set(IBinder iBinder) {
        this.a = (IRcsProfile) iBinder;
    }
}
