package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlk {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/concurrent/StalledTaskDetector");
    public final ScheduledExecutorService b;
    public final Map c = new ConcurrentHashMap();
    public final ejvr d;

    public drlk(ScheduledExecutorService scheduledExecutorService, ejvr ejvrVar) {
        this.b = scheduledExecutorService;
        this.d = ejvrVar;
    }
}
