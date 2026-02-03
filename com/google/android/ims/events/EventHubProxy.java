package com.google.android.ims.events;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.events.IEventObserver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dfdx;
import defpackage.dfdy;
import defpackage.dfdz;
import defpackage.dfeb;
import defpackage.dfec;
import defpackage.dfed;
import defpackage.dfee;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.dhce;
import defpackage.dhja;
import defpackage.dhkl;
import defpackage.ejwl;
import defpackage.eork;
import defpackage.eosc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EventHubProxy extends IEvent.Stub {
    public static final dfny<Boolean> DD_NOT_MERGE_EVENTS = dfod.a(154997142);
    private static final dfny a = dfod.a(159965913);
    private final String b;
    private final boolean d;
    ListenableFuture<?> eventFuture;
    private final List f;
    private final List g;
    private final eosc h;
    private final Runnable i;
    private dfdz j;
    private boolean c = false;
    private volatile long e = Long.MAX_VALUE;

    public EventHubProxy(String str, eosc eoscVar) {
        String[] strArr = dhce.a;
        this.f = new ArrayList(9);
        this.g = new ArrayList(9);
        this.eventFuture = null;
        this.i = new dfdx(this);
        this.j = null;
        this.b = str;
        this.h = eoscVar;
        for (int i = 0; i < 9; i++) {
            this.f.add(new dfeb());
        }
        this.d = ((Boolean) a.a()).booleanValue();
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.d) {
                this.g.add(new dfed());
            } else {
                this.g.add(new dfee());
            }
        }
    }

    private final void a(IBinder iBinder) throws RemoteException {
        dfdz dfdzVar = new dfdz(this);
        this.j = dfdzVar;
        try {
            iBinder.linkToDeath(dfdzVar, 0);
            dhja.c("Linked death recipient for %s", this.b);
        } catch (RemoteException unused) {
            dhja.q("Unable to link death recipient for %s", this.b);
            this.j = null;
        }
    }

    private final void b(int i, Event event) {
        dfeb dfebVar = (dfeb) this.f.get(i);
        dhja.c(" *** posting to %d %s observers: %s", Integer.valueOf(dfebVar.size()), this.b, event);
        dfebVar.a(event);
    }

    private final synchronized void c() {
        ListenableFuture<?> listenableFuture = this.eventFuture;
        if (listenableFuture == null || listenableFuture.isDone() || this.eventFuture.isCancelled()) {
            dhja.c("%s: Schedule posting events.", this.b);
            this.eventFuture = this.h.submit(new Runnable() { // from class: dfdw
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.postQueuedEvents();
                }
            });
        }
    }

    private final void d() {
        Runnable runnable = this.i;
        synchronized (runnable) {
            if (this.e == Long.MAX_VALUE) {
                this.e = dhkl.a().longValue() + 100;
                eosc eoscVar = this.h;
                eork.r(eoscVar.submit(runnable), new dfdy(this), eoscVar);
            }
        }
    }

    public void flushQueues() {
        Runnable runnable = this.i;
        synchronized (runnable) {
            if (this.e != Long.MAX_VALUE) {
                this.e = Long.MIN_VALUE;
                runnable.notifyAll();
            }
        }
    }

    public boolean hasSubscribersForEventCategory(int i) {
        String[] strArr = dhce.a;
        ejwl.d(i < 9, "invalid category %s", i);
        return isBound() && !((dfeb) this.f.get(i)).isEmpty();
    }

    public boolean isBound() {
        return this.c;
    }

    public boolean isSubscribed(int i, IEventObserver iEventObserver) throws RemoteException {
        boolean z;
        String[] strArr = dhce.a;
        ejwl.d(i < 9, "invalid category %s", i);
        if (this.j == null) {
            a(iEventObserver.asBinder());
            this.c = true;
        }
        int iHashCode = iEventObserver.hashCode();
        dfeb dfebVar = (dfeb) this.f.get(i);
        synchronized (dfebVar) {
            z = dfebVar.get(Integer.valueOf(iHashCode)) == iEventObserver;
        }
        return z;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void ping() {
        postMergableEvent(new Event(1, 0L, 0L));
    }

    public void postMergableEvent(Event event) {
        dfec dfecVar = (dfec) this.g.get(event.g);
        Event eventA = dfecVar.a(event.h);
        if (!this.d) {
            synchronized (dfecVar) {
                if (eventA == null) {
                    dfecVar.e(event);
                } else {
                    eventA.f();
                }
            }
        } else if (eventA == null) {
            dfecVar.e(event);
        } else {
            eventA.f();
        }
        d();
    }

    public void postOverridingEvent(Event event) {
        dfec dfecVar = (dfec) this.g.get(event.g);
        if (this.d) {
            dfecVar.d(event.h);
            dfecVar.e(event);
        } else {
            synchronized (dfecVar) {
                dfecVar.d(event.h);
                dfecVar.e(event);
            }
        }
        d();
    }

    public void postQueuedEvents() {
        int i = 0;
        while (true) {
            String[] strArr = dhce.a;
            if (i >= 9) {
                return;
            }
            ejwl.d(true, "invalid category %s", i);
            dfec dfecVar = (dfec) this.g.get(i);
            if (this.d) {
                while (true) {
                    Event event = (Event) dfecVar.c().poll();
                    if (event == null) {
                        break;
                    } else {
                        b(i, event);
                    }
                }
            } else {
                synchronized (dfecVar) {
                    Iterator it = dfecVar.b().iterator();
                    while (it.hasNext()) {
                        b(i, (Event) it.next());
                    }
                    dfecVar.b().clear();
                }
            }
            i++;
        }
    }

    public void postUniqueEvent(Event event) {
        dfec dfecVar = (dfec) this.g.get(event.g);
        if (this.d) {
            dfecVar.e(event);
        } else {
            synchronized (dfecVar) {
                dfecVar.e(event);
            }
        }
        if (((Boolean) DD_NOT_MERGE_EVENTS.a()).booleanValue()) {
            c();
        } else {
            d();
        }
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public int subscribe(int i, IEventObserver iEventObserver) throws RemoteException {
        Integer numValueOf;
        String[] strArr = dhce.a;
        ejwl.d(i < 9, "invalid category %s", i);
        if (this.j == null) {
            a(iEventObserver.asBinder());
            this.c = true;
        }
        int iHashCode = iEventObserver.hashCode();
        dfeb dfebVar = (dfeb) this.f.get(i);
        synchronized (dfebVar) {
            numValueOf = Integer.valueOf(iHashCode);
            dfebVar.put(numValueOf, iEventObserver);
        }
        dhja.k("Adding event listener %s for category %d with key %d for hub %s", iEventObserver, Integer.valueOf(i), numValueOf, this.b);
        return iHashCode;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void unsubscribe(int i, int i2) {
        Integer numValueOf;
        String[] strArr = dhce.a;
        ejwl.d(i < 9, "invalid category %s", i);
        List list = this.f;
        synchronized (((dfeb) list.get(i))) {
            dfeb dfebVar = (dfeb) list.get(i);
            numValueOf = Integer.valueOf(i2);
            dfebVar.remove(numValueOf);
        }
        dhja.k("Removing event listener %s for category %d for hub %s", numValueOf, Integer.valueOf(i), this.b);
        System.gc();
    }
}
