package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbs {
    public final int a;

    public cwbs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwbs) && this.a == ((cwbs) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ActionsArguments(callerSource=" + ((Object) cwcz.a(this.a)) + ")";
    }

    public cwbs() {
        this(2);
    }
}
