package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@fdac
/* loaded from: classes4.dex */
public final class dlvn {
    public final String[] a;

    public final boolean equals(Object obj) {
        return (obj instanceof dlvn) && fdbq.f(this.a, ((dlvn) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "MetadataProjection(names=" + Arrays.toString(this.a) + ")";
    }
}
