package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingRcsEngineTemporaryControllerBinder extends IRcsEngineTemporaryController.Stub implements dhfq<IRcsEngineTemporaryController> {
    private IRcsEngineTemporaryController a;
    private final Context b;

    public ForwardingRcsEngineTemporaryControllerBinder(Context context) {
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
    public synchronized void set(IBinder iBinder) {
        this.a = (IRcsEngineTemporaryController) iBinder;
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStartRcsStack(String str) {
        ((IRcsEngineTemporaryController) getDelegate()).triggerStartRcsStack(str);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStopRcsStack(String str) {
        ((IRcsEngineTemporaryController) getDelegate()).triggerStopRcsStack(str);
    }

    @Override // defpackage.dhfq
    public synchronized IRcsEngineTemporaryController getInterface() {
        return this.a;
    }
}
