package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgke {
    public static final cczi a = cdag.e(cdag.b, "notification_silent_interval_seconds", 1);
    private final cogw b;
    private long c;

    public cgke(cogw cogwVar) {
        this.b = cogwVar;
    }

    public final synchronized void a() {
        this.c = this.b.a();
    }

    public final synchronized boolean b() {
        return this.b.a() - this.c > ((long) (((Integer) a.e()).intValue() * 1000));
    }
}
