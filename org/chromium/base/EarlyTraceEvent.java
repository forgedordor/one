package org.chromium.base;

import defpackage.ffxt;
import defpackage.ffyj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EarlyTraceEvent {
    static volatile int a;
    static final Object b = new Object();
    static final List c = new ArrayList();
    static final List d = new ArrayList();

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        ffyj ffyjVarB = ffyj.b();
        try {
            ffxt.a.edit().putBoolean("bg_startup_tracing", z).apply();
            ffyjVarB.close();
        } catch (Throwable th) {
            try {
                ffyjVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void a() {
    }
}
