package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqm extends dqn {
    public final long a;

    public dqm(long j) {
        this.a = j;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        ebs.d("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqm) {
            return ihs.h(this.a, ((dqm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ihr.a(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) ihs.g(this.a)) + ')';
    }
}
