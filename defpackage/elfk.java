package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfk extends elfo {
    public elfk(Duration duration) {
        super(duration, 1.0d, 48);
    }

    public final String toString() {
        ejwf ejwfVar = new ejwf("uniformDelay");
        ejwfVar.g("delay", this.b.toMillis());
        ejwfVar.f("tries", this.a);
        return ejwfVar.toString();
    }
}
