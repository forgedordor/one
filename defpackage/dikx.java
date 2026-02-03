package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikx implements diky {
    private final String a;

    public dikx(String str) {
        this.a = str;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dikx) && fdbq.f(this.a, ((dikx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ")";
    }
}
