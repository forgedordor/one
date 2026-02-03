package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irc implements isa {
    public final int a;

    public irc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((irc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidPointerIcon(type=" + this.a + ')';
    }
}
