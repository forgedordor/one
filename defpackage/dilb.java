package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilb implements dilc {
    private final String a = "";

    @Override // defpackage.dilm
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dilb) && fdbq.f(this.a, ((dilb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ")";
    }
}
