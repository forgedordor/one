package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkx implements dlky, dkfe {
    public final dlkv a;
    private final String b;

    public dlkx(String str, dlkv dlkvVar) {
        str.getClass();
        this.b = str;
        this.a = dlkvVar;
    }

    @Override // defpackage.dkfe
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkx)) {
            return false;
        }
        dlkx dlkxVar = (dlkx) obj;
        return fdbq.f(this.b, dlkxVar.b) && fdbq.f(this.a, dlkxVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SingleLine(id=" + this.b + ", line=" + this.a + ")";
    }
}
