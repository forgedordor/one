package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elfm extends elfo {
    public elfm(Duration duration, double d, int i) {
        super(duration, d, i);
    }

    public final String toString() {
        ejwf ejwfVar = new ejwf("exponentialBackoff");
        ejwfVar.g("firstDelayMs", this.b.toMillis());
        ejwfVar.d("multiplier", this.c);
        ejwfVar.f("tries", this.a);
        return ejwfVar.toString();
    }
}
