package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgv {
    public static final cczi a = cdag.f(cdag.b, "report_issue_global_backoff_time_ms", 604800000);
    public final cogw b;
    public final clgp c;
    public final eosc d;

    public clgv(cogw cogwVar, clgp clgpVar, eosc eoscVar) {
        this.b = cogwVar;
        this.c = clgpVar;
        this.d = eoscVar;
    }

    public final boolean a(Long l, long j) {
        return j + (l != null ? l.longValue() : 0L) <= this.b.f().toEpochMilli();
    }
}
