package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdim {
    private static final cqce a = cqce.g("BugleNetwork", "ForegroundServiceStarter");

    public static void a(cdil cdilVar) {
        if (!craf.e) {
            cdilVar.a();
            return;
        }
        try {
            cdilVar.a();
        } catch (ForegroundServiceStartNotAllowedException e) {
            a.s("Failed to call foreground service starter", e);
        }
    }
}
