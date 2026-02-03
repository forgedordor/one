package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynj {
    public final boolean a;
    public final String b;
    private final boolean c = true;

    public ynj(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynj)) {
            return false;
        }
        ynj ynjVar = (ynj) obj;
        if (this.a != ynjVar.a) {
            return false;
        }
        boolean z = ynjVar.c;
        return fdbq.f(this.b, ynjVar.b);
    }

    public final int hashCode() {
        return (((yni.a(this.a) * 31) + yni.a(true)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SearchData(isCurrent=" + this.a + ", isMatched=true, query=" + this.b + ")";
    }
}
