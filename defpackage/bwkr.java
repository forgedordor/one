package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwkr {
    private final fcsu a;
    private final Executor b;

    public bwkr(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = new eoss(eoscVar);
    }

    final bwko a() {
        return new bwko(this.a, this.b);
    }

    public final bwkq b() {
        return a().a();
    }
}
