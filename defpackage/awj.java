package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awj {
    final OutputConfiguration a;
    String b;
    long c = 1;

    public awj(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awj)) {
            return false;
        }
        awj awjVar = (awj) obj;
        return Objects.equals(this.a, awjVar.a) && this.c == awjVar.c && Objects.equals(this.b, awjVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        int i = ((iHashCode << 5) - iHashCode) ^ iHashCode2;
        return ((int) (j ^ (j >>> 32))) ^ ((i << 5) - i);
    }
}
