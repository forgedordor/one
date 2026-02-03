package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzo implements einb {
    public final String a;
    public final epiv b;

    public uzo(String str, epiv epivVar) {
        this.a = str;
        this.b = epivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzo)) {
            return false;
        }
        uzo uzoVar = (uzo) obj;
        return fdbq.f(this.a, uzoVar.a) && this.b == uzoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MagicRewriteToneClickEvent(draft=" + this.a + ", tone=" + this.b + ")";
    }
}
