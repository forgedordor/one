package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszt implements fcsu {
    private final asse a;

    public aszt(asse asseVar) {
        this.a = asseVar;
    }

    @Override // defpackage.fcsu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aszw b() {
        aszs aszsVar = new aszs();
        asse asseVar = this.a;
        Object objB = asseVar.a.b();
        objB.getClass();
        Duration durationOfSeconds = Duration.ofSeconds(((Number) objB).longValue());
        durationOfSeconds.getClass();
        aszsVar.c(durationOfSeconds);
        Object objB2 = asseVar.b.b();
        objB2.getClass();
        Duration durationOfSeconds2 = Duration.ofSeconds(((Number) objB2).longValue());
        durationOfSeconds2.getClass();
        aszsVar.b(durationOfSeconds2);
        return aszsVar.a();
    }
}
