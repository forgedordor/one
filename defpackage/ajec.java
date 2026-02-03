package defpackage;

import j$.time.Instant;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajec {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisit");
    public final fcsu b;
    public final Set c;
    private final fdjx d;

    public ajec(fdjx fdjxVar, fcsu fcsuVar, Set set) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        set.getClass();
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.c = set;
    }

    public final eiju a(int i, Instant instant) {
        instant.getClass();
        return auvw.i(this.d, new ajeb(this, i, instant, null));
    }
}
