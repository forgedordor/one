package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvq implements dkvr {
    public final int a;
    private final dkvz b;

    public dkvq(dkvz dkvzVar, int i) {
        this.b = dkvzVar;
        this.a = i;
    }

    @Override // defpackage.dkvr
    public final dkvz a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkvq)) {
            return false;
        }
        dkvq dkvqVar = (dkvq) obj;
        return fdbq.f(this.b, dkvqVar.b) && this.a == dkvqVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalRichCardMedia(media=");
        sb.append(this.b);
        sb.append(", size=");
        int i = this.a;
        sb.append((Object) (i != 112 ? i != 168 ? i != 264 ? "null" : "Tall" : "Medium" : "Short"));
        sb.append(")");
        return sb.toString();
    }
}
