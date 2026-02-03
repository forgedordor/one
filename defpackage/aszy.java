package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszy implements aszw {
    final /* synthetic */ aszw a;
    final /* synthetic */ aszw b;

    public aszy(aszw aszwVar, aszw aszwVar2) {
        this.a = aszwVar;
        this.b = aszwVar2;
    }

    private static final Duration c(Duration duration, Duration duration2) {
        return duration.compareTo(duration2) < 0 ? duration : duration2;
    }

    @Override // defpackage.aszw
    public final Duration a() {
        return c(this.a.a(), this.b.a());
    }

    @Override // defpackage.aszw
    public final Duration b() {
        return c(this.a.b(), this.b.b());
    }
}
