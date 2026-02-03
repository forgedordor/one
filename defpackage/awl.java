package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awl {
    final OutputConfiguration a;
    long b = 1;

    public awl(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awl)) {
            return false;
        }
        awl awlVar = (awl) obj;
        return Objects.equals(this.a, awlVar.a) && this.b == awlVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((iHashCode << 5) - iHashCode);
    }
}
