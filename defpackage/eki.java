package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class eki {
    public final long a = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof eki)) {
            return false;
        }
        long j = ((eki) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "GridItemSpan(packedValue=1)";
    }
}
