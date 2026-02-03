package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.events.IEventObserver;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingIEventBinder extends IEvent.Stub implements dhfq<IEvent> {
    private IEvent a;
    Context context;

    public ForwardingIEventBinder(Context context) {
        this.context = context;
    }

    @Override // defpackage.dhfq
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.dhfq
    public Context getContext() {
        return this.context;
    }

    public /* synthetic */ IInterface getDelegate() {
        return dhfp.a(this);
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void ping() {
        ((IEvent) getDelegate()).ping();
    }

    @Override // defpackage.dhfq
    public synchronized void set(IBinder iBinder) {
        this.a = (IEvent) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public int subscribe(int i, IEventObserver iEventObserver) {
        return ((IEvent) getDelegate()).subscribe(i, iEventObserver);
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void unsubscribe(int i, int i2) {
        ((IEvent) getDelegate()).unsubscribe(i, i2);
    }

    @Override // defpackage.dhfq
    public synchronized IEvent getInterface() {
        return this.a;
    }
}
