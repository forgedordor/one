package org.chromium.base;

import defpackage.ffxp;
import defpackage.ffxq;
import defpackage.ffyf;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.task.PostTask;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ApplicationStatus {
    public static final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public static ffxq b;
    public static ffyf c;

    static {
        DesugarCollections.synchronizedMap(new HashMap());
    }

    private ApplicationStatus() {
    }

    public static void a(ffxq ffxqVar) {
        if (c == null) {
            c = new ffyf();
        }
        c.d(ffxqVar);
    }

    public static void b() {
        synchronized (a) {
        }
    }

    public static int getStateForApplication() {
        synchronized (a) {
        }
        return 0;
    }

    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        PostTask.b(new ffxp());
    }
}
