package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilg implements dilh {
    private final String a = "";

    @Override // defpackage.dilm
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dilg) && fdbq.f(this.a, ((dilg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ")";
    }
}
