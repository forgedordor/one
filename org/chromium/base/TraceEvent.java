package org.chromium.base;

import defpackage.ffxv;
import defpackage.ffxw;
import defpackage.ffyn;
import defpackage.ffyp;
import internal.J.N;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class TraceEvent implements AutoCloseable {
    public static volatile boolean a;
    public static volatile boolean b;
    public static boolean c;
    private final String d;

    private TraceEvent(String str) {
        this.d = str;
        b(str, null);
    }

    public static TraceEvent a(String str) {
        EarlyTraceEvent.a();
        if (a) {
            return new TraceEvent(str);
        }
        return null;
    }

    public static void b(String str, String str2) {
        EarlyTraceEvent.a();
        if (a) {
            N.M9XfPu17(str, str2);
        }
    }

    public static void c(long j) {
        EarlyTraceEvent.a();
        if (a) {
            N.Mw73xTww(null, j);
        }
    }

    public static void d() {
        c(0L);
    }

    public static void dumpViewHierarchy(long j, Object obj) {
        ApplicationStatus.b();
    }

    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.b) {
                EarlyTraceEvent.a();
            }
        }
        if (a != z) {
            a = z;
            ThreadUtils.b().setMessageLogging(z ? ffyn.a : null);
        }
        if (a) {
            synchronized (EarlyTraceEvent.b) {
                List<ffxw> list = EarlyTraceEvent.c;
                if (!list.isEmpty()) {
                    for (ffxw ffxwVar : list) {
                        long j = ffxwVar.a;
                        long j2 = ffxwVar.b;
                        N.MvcVeOsg(0L, 0L);
                    }
                    list.clear();
                }
                List<ffxv> list2 = EarlyTraceEvent.d;
                if (!list2.isEmpty()) {
                    for (ffxv ffxvVar : list2) {
                        long j3 = ffxvVar.a;
                        long j4 = ffxvVar.b;
                        int i = ffxvVar.c;
                        N.MbWHcONC(0L, 0L, 0);
                    }
                    list2.clear();
                }
            }
        }
        if (b) {
            ffyp.a();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        c = z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d();
    }
}
