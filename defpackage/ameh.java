package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ameh implements ajmq {
    public static ameh g(aoer aoerVar, ajlq ajlqVar, ajmw ajmwVar, long j) {
        return new alwp(aoerVar, ajlqVar, ajmwVar, Instant.ofEpochMilli(j));
    }

    public abstract ajlq a();

    public abstract ajmw b();

    @Override // defpackage.ajmc
    public final /* synthetic */ int d() {
        return 2;
    }

    public abstract Instant e();

    public abstract void f();
}
