package defpackage;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexc {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("Etc/UTC");

    public static TimeZone a() {
        return "true".equals(fews.a("net.fortuna.ical4j.timezone.date.floating")) ? TimeZone.getDefault() : a;
    }
}
