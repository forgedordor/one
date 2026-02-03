package defpackage;

import com.google.android.rcs.client.events.EventService;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efaw {
    public static final efaw a = new efaw();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final void a(EventService eventService) {
        this.b.remove(eventService);
    }
}
