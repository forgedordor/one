package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ForwardingTransportControlEngine extends ITransportControl.Stub implements dhfq<ITransportControl> {
    private ITransportControl a;
    private final Context b;

    public ForwardingTransportControlEngine(Context context) {
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
    public synchronized ITransportControl getInterface() {
        return this.a;
    }

    @Override // defpackage.dhfq
    public synchronized void set(IBinder iBinder) {
        this.a = (ITransportControl) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
    public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
        return ((ITransportControl) getDelegate()).useTransport(transportOptions);
    }
}
