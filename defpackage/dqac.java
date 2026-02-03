package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqac {
    public final String a;

    public dqac(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqac) && fdbq.f(this.a, ((dqac) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChipData(text=" + this.a + ")";
    }
}
