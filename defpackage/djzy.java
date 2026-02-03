package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzy extends djzz {
    public final String a;

    public djzy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djzy) && fdbq.f(this.a, ((djzy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Emotify(uri=" + this.a + ")";
    }
}
