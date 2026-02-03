package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxp {
    public final Integer a;

    public doxp(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doxp) && fdbq.f(this.a, ((doxp) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ShortcutsScreenArguments(autoLaunchShortcut=" + this.a + ")";
    }

    public doxp() {
        this(null);
    }
}
