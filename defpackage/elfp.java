package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elfp extends elfq {
    final int a;

    public elfp(int i) {
        ejwl.h(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
    }

    @Override // defpackage.elfq
    public final Duration a(int i) {
        return b(i) ? Duration.ZERO : elfq.d;
    }

    @Override // defpackage.elfq
    public final boolean b(int i) {
        ejwl.h(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof elfp) && this.a == ((elfp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
