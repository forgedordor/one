package defpackage;

import android.util.SparseArray;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efau extends IEventObserver.Stub {
    static final cczv a = cdag.p(146383903);
    private final SparseArray b;
    private final eigp c;

    public efau(SparseArray sparseArray, eigp eigpVar) {
        this.b = sparseArray;
        this.c = eigpVar;
    }

    final void a(Event event) {
        List<efav> listB;
        eieu eieuVarK;
        SparseArray sparseArray = this.b;
        int i = event.g;
        synchronized (sparseArray) {
            efat efatVar = (efat) sparseArray.get(i);
            if (efatVar != null) {
                listB = efatVar.b();
            } else {
                int i2 = ekgb.d;
                listB = ekoe.a;
            }
        }
        for (efav efavVar : listB) {
            if (((Boolean) a.e()).booleanValue()) {
                switch (event.g) {
                    case 0:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent UNKNOWN");
                        break;
                    case 1:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent AUTHENTICATION");
                        break;
                    case 2:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent FILE_TRANSFER");
                        break;
                    case 3:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent IMS");
                        break;
                    case 4:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent GROUPS");
                        break;
                    case 5:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent CHAT_SESSION");
                        break;
                    case 6:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent LOCATIONSHARING");
                        break;
                    case 7:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent PRESENCE");
                        break;
                    case 8:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent SMS");
                        break;
                    default:
                        eieuVarK = eiiy.k("EventService.ProxyObserver#notifyInProcessEvent default");
                        break;
                }
                try {
                    efavVar.b(event);
                    eieuVarK.close();
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                efavVar.b(event);
            }
        }
        if (listB.isEmpty()) {
            cqca.o("RcsClientLib", "EventService has no listeners for event %d", Integer.valueOf(event.g));
        } else if (listB.size() != 1) {
            cqca.m("RcsClientLib", "EventService has %d listeners for event %d", Integer.valueOf(listB.size()), Integer.valueOf(event.g));
        } else {
            cqca.m("RcsClientLib", "EventService has 1 listeners for event %d: %s", Integer.valueOf(event.g), ((efav) listB.get(0)).a());
        }
    }

    @Override // com.google.android.ims.rcsservice.events.IEventObserver
    public final void notifyEvent(Event event) {
        eieh eiehVarC;
        if (!((Boolean) a.e()).booleanValue()) {
            a(event);
            return;
        }
        eigp eigpVar = this.c;
        switch (event.g) {
            case 0:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent UNKNOWN", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 395);
                break;
            case 1:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent AUTHENTICATION", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 397);
                break;
            case 2:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent FILE_TRANSFER", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 399);
                break;
            case 3:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent IMS", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 401);
                break;
            case 4:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent GROUPS", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 403);
                break;
            case 5:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent CHAT_SESSION", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 405);
                break;
            case 6:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent LOCATIONSHARING", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 407);
                break;
            case 7:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent PRESENCE", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 409);
                break;
            case 8:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent SMS", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 411);
                break;
            default:
                eiehVarC = eigpVar.c("EventService.ProxyObserver#notifyEvent default", "com/google/android/rcs/client/events/EventService$ProxyObserver", "getRootTraceNamedForEventCategory", 413);
                break;
        }
        try {
            a(event);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
