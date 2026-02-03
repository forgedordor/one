package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkw implements dlky, dkfe {
    public final List a;
    private final String b;

    public dlkw(String str, List list) {
        this.b = str;
        this.a = list;
    }

    @Override // defpackage.dkfe
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkw)) {
            return false;
        }
        dlkw dlkwVar = (dlkw) obj;
        return fdbq.f(this.b, dlkwVar.b) && fdbq.f(this.a, dlkwVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "MultipleLines(id=" + this.b + ", lines=" + this.a + ")";
    }
}
