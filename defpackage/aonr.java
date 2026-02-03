package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aonr implements aont {
    public final String a;

    public aonr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aonr) && fdbq.f(this.a, ((aonr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostAppBelowMinimum(hostPackage=" + this.a + ")";
    }
}
