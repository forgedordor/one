package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.events.EventHubProxy;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdv {
    private static final dhip c = new dhip(dfdv.class.getName());
    public final EventHubProxy a;
    public final EventHubProxy b;
    private final Context d;
    private final deyw e;

    public dfdv(Context context, deyw deywVar, eosc eoscVar) {
        this.d = context;
        this.e = deywVar;
        this.a = new EventHubProxy("ENGINE", eoscVar);
        this.b = new EventHubProxy("UI", eoscVar);
    }

    private final void e(Event event, dhjl dhjlVar) {
        Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
        intent.putExtra(RcsIntents.EXTRA_EVENT, event);
        dhjm.a(this.d, intent, dhjlVar);
        f(event, 3);
    }

    private final void f(Event event, int i) {
        int i2;
        int i3 = event.g;
        if (i3 == 2 || (i2 = event.h) == 50050) {
            return;
        }
        int iB = ewdf.b(i3);
        dhip dhipVar = c;
        if (iB == 0) {
            throw null;
        }
        dhja.l(dhipVar, "Event sent, category: %s, method: %s, code: %s", ewdf.a(iB), ewdj.a(i), Integer.valueOf(i2));
        dhja.w(1, 3, "Event sent, category: %s, method: %s, code: %s", ewdf.a(iB), ewdj.a(i), Integer.valueOf(event.h));
        ewdd ewddVar = (ewdd) ewdk.a.createBuilder();
        ewddVar.copyOnWrite();
        ewdk ewdkVar = (ewdk) ewddVar.instance;
        ewdkVar.g = i - 1;
        ewdkVar.b |= 4;
        int iB2 = ewdf.b(event.g);
        ewddVar.copyOnWrite();
        ewdk ewdkVar2 = (ewdk) ewddVar.instance;
        if (iB2 == 0) {
            throw null;
        }
        ewdkVar2.e = iB2 - 1;
        ewdkVar2.b |= 1;
        int i4 = event.h;
        ewddVar.copyOnWrite();
        ewdk ewdkVar3 = (ewdk) ewddVar.instance;
        ewdkVar3.b = 2 | ewdkVar3.b;
        ewdkVar3.f = i4;
        int iA = dfea.a(event.i);
        ewddVar.copyOnWrite();
        ewdk ewdkVar4 = (ewdk) ewddVar.instance;
        ewdkVar4.h = iA - 1;
        ewdkVar4.b |= 8;
        event.e(ewddVar);
        deyw deywVar = this.e;
        Context context = this.d;
        ewdk ewdkVar5 = (ewdk) ewddVar.build();
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewdkVar5.getClass();
        ewseVar.d = ewdkVar5;
        ewseVar.c = 12;
        deywVar.i(context, ewsdVar, ewqu.EVENT_HUB_EVENT);
    }

    public final void a(Event event, dhjl dhjlVar) {
        if (((Boolean) EventHubProxy.DD_NOT_MERGE_EVENTS.a()).booleanValue()) {
            c(event, dhjlVar);
            return;
        }
        this.a.postMergableEvent(event);
        EventHubProxy eventHubProxy = this.b;
        if (eventHubProxy.hasSubscribersForEventCategory(event.g)) {
            eventHubProxy.postMergableEvent(event);
            f(event, 2);
        } else {
            dhja.d(c, "Did not post mergable event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, dhjlVar);
        }
    }

    public final void b(Event event, dhjl dhjlVar) {
        this.a.postOverridingEvent(event);
        EventHubProxy eventHubProxy = this.b;
        if (eventHubProxy.hasSubscribersForEventCategory(event.g)) {
            eventHubProxy.postOverridingEvent(event);
            f(event, 2);
        } else {
            dhja.d(c, "Did not post overriding event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, dhjlVar);
        }
    }

    public final void c(Event event, dhjl dhjlVar) {
        EventHubProxy eventHubProxy = this.a;
        eventHubProxy.postUniqueEvent(event);
        eventHubProxy.flushQueues();
        EventHubProxy eventHubProxy2 = this.b;
        if (!eventHubProxy2.hasSubscribersForEventCategory(event.g)) {
            dhja.d(c, "Did not post unique event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, dhjlVar);
        } else {
            eventHubProxy2.postUniqueEvent(event);
            eventHubProxy2.flushQueues();
            f(event, 2);
        }
    }

    public final void d(int i) {
        this.a.unsubscribe(5, i);
    }
}
